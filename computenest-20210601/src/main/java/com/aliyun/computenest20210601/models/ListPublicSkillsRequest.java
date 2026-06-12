// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListPublicSkillsRequest extends TeaModel {
    /**
     * <p>A list of filters.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListPublicSkillsRequestFilter> filter;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether to return the download link for the skill package.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedDownloadUrl")
    public Boolean needDownloadUrl;

    /**
     * <p>The token to retrieve the next page of results.</p>
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
         * <p>The filter criterion. Valid values:</p>
         * <ul>
         * <li><p><code>SkillId</code>: The ID of the skill. An exact match is performed.</p>
         * </li>
         * <li><p><code>SkillName</code>: The name of the skill.</p>
         * </li>
         * <li><p><code>MatchType</code>: The match type for the <code>SkillName</code> filter. Valid values: <code>exact</code> (exact match), <code>prefix</code> (prefix match), and <code>fuzzy</code> (fuzzy match).</p>
         * </li>
         * <li><p><code>Keyword</code>: The keyword used for a fuzzy match on the skill name or skill description.</p>
         * </li>
         * <li><p><code>SkillLabels</code>: The skill labels. A fuzzy match is performed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SkillId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The filter values. You can specify 1 to 10 values.</p>
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
