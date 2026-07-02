// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListSkillsRequestFilter> filter;

    /**
     * <p>The maximum number of entries to return in this request.</p>
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
     * <p>NextToken</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsRequest self = new ListSkillsRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillsRequest setFilter(java.util.List<ListSkillsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListSkillsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListSkillsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillsRequest setNeedDownloadUrl(Boolean needDownloadUrl) {
        this.needDownloadUrl = needDownloadUrl;
        return this;
    }
    public Boolean getNeedDownloadUrl() {
        return this.needDownloadUrl;
    }

    public ListSkillsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListSkillsRequestFilter extends TeaModel {
        /**
         * <p>The filter name. You can specify one or more names for the query. Valid values:</p>
         * <ul>
         * <li><p>SkillId: the skill ID. Exact match.</p>
         * </li>
         * <li><p>SkillSpaceId: the SkillSpace ID. Exact match.</p>
         * </li>
         * <li><p>SkillName: the skill name.</p>
         * </li>
         * <li><p>MatchType: the match type that controls how SkillName is matched. Valid values: exact, prefix, and fuzzy.</p>
         * </li>
         * <li><p>SkillType: the skill type. Valid values: official and custom.</p>
         * </li>
         * <li><p>Keyword: keyword match for the skill name or skill description. Fuzzy match.</p>
         * </li>
         * <li><p>SkillLabels: the skill labels. Fuzzy match.</p>
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

        public static ListSkillsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsRequestFilter self = new ListSkillsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListSkillsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
