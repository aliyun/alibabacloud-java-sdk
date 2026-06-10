// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillSpacesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListSkillSpacesRequestFilter> filter;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
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
         * <strong>example:</strong>
         * <p>SkillSpaceId</p>
         */
        @NameInMap("Name")
        public String name;

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
