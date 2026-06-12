// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    /**
     * <p>The filters for querying Skills.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListSkillsRequestFilter> filter;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether to return the download URL of the Skill package.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedDownloadUrl")
    public Boolean needDownloadUrl;

    /**
     * <p>The token for the next page of results. Leave this parameter empty for the first request. For subsequent requests, use the <code>NextToken</code> value from the previous response.</p>
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
         * <p>The filter name. Valid values:</p>
         * <ul>
         * <li><p><code>SkillId</code>: The Skill ID. An exact match is performed.</p>
         * </li>
         * <li><p><code>SkillSpaceId</code>: The ID of the SkillSpace. An exact match is performed.</p>
         * </li>
         * <li><p><code>SkillName</code>: The Skill name.</p>
         * </li>
         * <li><p><code>MatchType</code>: The match type for <code>SkillName</code>. Valid values: <code>exact</code> (exact match), <code>prefix</code> (prefix match), and <code>fuzzy</code> (fuzzy match).</p>
         * </li>
         * <li><p><code>SkillType</code>: The Skill type. Valid values: <code>official</code> and <code>custom</code>.</p>
         * </li>
         * <li><p><code>Keyword</code>: The keyword for a fuzzy match on the Skill name or Skill description.</p>
         * </li>
         * <li><p><code>SkillLabels</code>: The Skill labels. A fuzzy match is performed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SkillId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The filter values. You can specify a maximum of 10 values.</p>
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
