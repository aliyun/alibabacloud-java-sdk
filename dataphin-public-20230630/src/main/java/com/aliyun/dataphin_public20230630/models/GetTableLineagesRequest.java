// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableLineagesRequest extends TeaModel {
    @NameInMap("FilterQuery")
    public GetTableLineagesRequestFilterQuery filterQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1121</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    public static GetTableLineagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableLineagesRequest self = new GetTableLineagesRequest();
        return TeaModel.build(map, self);
    }

    public GetTableLineagesRequest setFilterQuery(GetTableLineagesRequestFilterQuery filterQuery) {
        this.filterQuery = filterQuery;
        return this;
    }
    public GetTableLineagesRequestFilterQuery getFilterQuery() {
        return this.filterQuery;
    }

    public GetTableLineagesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetTableLineagesRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static class GetTableLineagesRequestFilterQuery extends TeaModel {
        @NameInMap("NeedDownstream")
        public Boolean needDownstream;

        @NameInMap("NeedNotExistObject")
        public Boolean needNotExistObject;

        @NameInMap("NeedUpstream")
        public Boolean needUpstream;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("NodeEnv")
        public String nodeEnv;

        @NameInMap("NodeIdList")
        public java.util.List<String> nodeIdList;

        public static GetTableLineagesRequestFilterQuery build(java.util.Map<String, ?> map) throws Exception {
            GetTableLineagesRequestFilterQuery self = new GetTableLineagesRequestFilterQuery();
            return TeaModel.build(map, self);
        }

        public GetTableLineagesRequestFilterQuery setNeedDownstream(Boolean needDownstream) {
            this.needDownstream = needDownstream;
            return this;
        }
        public Boolean getNeedDownstream() {
            return this.needDownstream;
        }

        public GetTableLineagesRequestFilterQuery setNeedNotExistObject(Boolean needNotExistObject) {
            this.needNotExistObject = needNotExistObject;
            return this;
        }
        public Boolean getNeedNotExistObject() {
            return this.needNotExistObject;
        }

        public GetTableLineagesRequestFilterQuery setNeedUpstream(Boolean needUpstream) {
            this.needUpstream = needUpstream;
            return this;
        }
        public Boolean getNeedUpstream() {
            return this.needUpstream;
        }

        public GetTableLineagesRequestFilterQuery setNodeEnv(String nodeEnv) {
            this.nodeEnv = nodeEnv;
            return this;
        }
        public String getNodeEnv() {
            return this.nodeEnv;
        }

        public GetTableLineagesRequestFilterQuery setNodeIdList(java.util.List<String> nodeIdList) {
            this.nodeIdList = nodeIdList;
            return this;
        }
        public java.util.List<String> getNodeIdList() {
            return this.nodeIdList;
        }

    }

}
