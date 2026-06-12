// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillSpacesRequest extends TeaModel {
    /**
     * <p>The query filters.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListSkillSpacesRequestFilter> filter;

    /**
     * <p>The number of entries to return per page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. To retrieve the next page, set this parameter to the <code>NextToken</code> value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListSkillSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillSpacesRequest self = new ListSkillSpacesRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillSpacesRequest setFilter(java.util.List<ListSkillSpacesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListSkillSpacesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListSkillSpacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillSpacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListSkillSpacesRequestFilter extends TeaModel {
        /**
         * <p>The filter name. You can specify one or more filter names. Valid values:</p>
         * <ul>
         * <li><p><code>SkillSpaceId</code>: The SkillSpace ID. This filter performs an exact match.</p>
         * </li>
         * <li><p><code>SkillSpaceName</code>: The SkillSpace name.</p>
         * </li>
         * <li><p><code>MatchType</code>: The match type for the <code>SkillSpaceName</code> filter. Valid values: <code>exact</code>, <code>prefix</code>, and <code>fuzzy</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SkillSpaceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The filter values. You can specify 1 to 10 values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListSkillSpacesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListSkillSpacesRequestFilter self = new ListSkillSpacesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListSkillSpacesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillSpacesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
