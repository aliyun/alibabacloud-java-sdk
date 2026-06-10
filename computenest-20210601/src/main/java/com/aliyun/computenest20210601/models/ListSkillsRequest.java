// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListSkillsRequestFilter> filter;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
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
         * <strong>example:</strong>
         * <p>SkillId</p>
         */
        @NameInMap("Name")
        public String name;

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
