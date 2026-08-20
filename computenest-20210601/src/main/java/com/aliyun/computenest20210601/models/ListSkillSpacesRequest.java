// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillSpacesRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListSkillSpacesRequestFilter> filter;

    /**
     * <p>The number of entries per page in a paging query. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the value of NextToken that was returned in the previous API call.</p>
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
         * <p>The filter name. You can specify one or more names for the query. Valid values:</p>
         * <ul>
         * <li><p>SkillSpaceId: the SkillSpace ID. Exact match.</p>
         * </li>
         * <li><p>SkillSpaceName: the SkillSpace name.</p>
         * </li>
         * <li><p>MatchType: the match type that controls the matching behavior of SkillSpace. Valid values: exact, prefix, and fuzzy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SkillSpaceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of filter values. Valid values of N: 1 to 10.</p>
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
