// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineagesRequest extends TeaModel {
    @NameInMap("FilterQuery")
    public GetTableColumnLineagesRequestFilterQuery filterQuery;

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

    public static GetTableColumnLineagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnLineagesRequest self = new GetTableColumnLineagesRequest();
        return TeaModel.build(map, self);
    }

    public GetTableColumnLineagesRequest setFilterQuery(GetTableColumnLineagesRequestFilterQuery filterQuery) {
        this.filterQuery = filterQuery;
        return this;
    }
    public GetTableColumnLineagesRequestFilterQuery getFilterQuery() {
        return this.filterQuery;
    }

    public GetTableColumnLineagesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetTableColumnLineagesRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static class GetTableColumnLineagesRequestFilterQuery extends TeaModel {
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

        public static GetTableColumnLineagesRequestFilterQuery build(java.util.Map<String, ?> map) throws Exception {
            GetTableColumnLineagesRequestFilterQuery self = new GetTableColumnLineagesRequestFilterQuery();
            return TeaModel.build(map, self);
        }

        public GetTableColumnLineagesRequestFilterQuery setNeedDownstream(Boolean needDownstream) {
            this.needDownstream = needDownstream;
            return this;
        }
        public Boolean getNeedDownstream() {
            return this.needDownstream;
        }

        public GetTableColumnLineagesRequestFilterQuery setNeedNotExistObject(Boolean needNotExistObject) {
            this.needNotExistObject = needNotExistObject;
            return this;
        }
        public Boolean getNeedNotExistObject() {
            return this.needNotExistObject;
        }

        public GetTableColumnLineagesRequestFilterQuery setNeedUpstream(Boolean needUpstream) {
            this.needUpstream = needUpstream;
            return this;
        }
        public Boolean getNeedUpstream() {
            return this.needUpstream;
        }

        public GetTableColumnLineagesRequestFilterQuery setNodeEnv(String nodeEnv) {
            this.nodeEnv = nodeEnv;
            return this;
        }
        public String getNodeEnv() {
            return this.nodeEnv;
        }

        public GetTableColumnLineagesRequestFilterQuery setNodeIdList(java.util.List<String> nodeIdList) {
            this.nodeIdList = nodeIdList;
            return this;
        }
        public java.util.List<String> getNodeIdList() {
            return this.nodeIdList;
        }

    }

}
