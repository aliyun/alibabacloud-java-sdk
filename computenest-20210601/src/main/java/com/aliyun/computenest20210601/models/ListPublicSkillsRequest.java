// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListPublicSkillsRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListPublicSkillsRequestFilter> filter;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether to include the download URL of the skill package.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedDownloadUrl")
    public Boolean needDownloadUrl;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListPublicSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicSkillsRequest self = new ListPublicSkillsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicSkillsRequest setFilter(java.util.List<ListPublicSkillsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListPublicSkillsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListPublicSkillsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicSkillsRequest setNeedDownloadUrl(Boolean needDownloadUrl) {
        this.needDownloadUrl = needDownloadUrl;
        return this;
    }
    public Boolean getNeedDownloadUrl() {
        return this.needDownloadUrl;
    }

    public ListPublicSkillsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListPublicSkillsRequestFilter extends TeaModel {
        /**
         * <p>The filter name. You can specify one or more names for the query. Valid values:</p>
         * <ul>
         * <li><p>SkillId: the skill ID. Exact match.</p>
         * </li>
         * <li><p>SkillName: the skill name.</p>
         * </li>
         * <li><p>MatchType: the match type that controls how SkillName is matched. Valid values: exact, prefix, and fuzzy.</p>
         * </li>
         * <li><p>Keyword: keyword match for the skill name or skill description. Fuzzy match.</p>
         * </li>
         * <li><p>SkillLabels: the skill label set. Fuzzy match.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SkillId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of filter values. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListPublicSkillsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListPublicSkillsRequestFilter self = new ListPublicSkillsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListPublicSkillsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPublicSkillsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
