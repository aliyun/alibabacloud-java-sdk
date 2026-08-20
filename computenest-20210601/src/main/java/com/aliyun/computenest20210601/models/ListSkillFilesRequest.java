// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillFilesRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListSkillFilesRequestFilter> filter;

    /**
     * <p>The number of entries per page in a paging query. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAVz7BQqj2xtiNSC3d3RAD38=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Skill ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-xxxxx</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    public static ListSkillFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillFilesRequest self = new ListSkillFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillFilesRequest setFilter(java.util.List<ListSkillFilesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListSkillFilesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListSkillFilesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSkillFilesRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public static class ListSkillFilesRequestFilter extends TeaModel {
        /**
         * <p>No supported filter names are available.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of filter values. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListSkillFilesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListSkillFilesRequestFilter self = new ListSkillFilesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListSkillFilesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillFilesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
