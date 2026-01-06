// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkProjectionInfoRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetDingtalkProjectionInfoRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("client")
    public String client;

    /**
     * <strong>example:</strong>
     * <p>1640998800000</p>
     */
    @NameInMap("endTs")
    public Long endTs;

    /**
     * <strong>example:</strong>
     * <p>21001</p>
     */
    @NameInMap("orgId")
    public String orgId;

    /**
     * <strong>example:</strong>
     * <p>342342</p>
     */
    @NameInMap("pubWorkNo")
    public String pubWorkNo;

    /**
     * <strong>example:</strong>
     * <p>room001</p>
     */
    @NameInMap("roomId")
    public String roomId;

    /**
     * <strong>example:</strong>
     * <p>1640995200000</p>
     */
    @NameInMap("startTs")
    public Long startTs;

    /**
     * <strong>example:</strong>
     * <p>user456</p>
     */
    @NameInMap("subUid")
    public String subUid;

    public static GetDingtalkProjectionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkProjectionInfoRequest self = new GetDingtalkProjectionInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkProjectionInfoRequest setTenantContext(GetDingtalkProjectionInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDingtalkProjectionInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDingtalkProjectionInfoRequest setClient(String client) {
        this.client = client;
        return this;
    }
    public String getClient() {
        return this.client;
    }

    public GetDingtalkProjectionInfoRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public GetDingtalkProjectionInfoRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDingtalkProjectionInfoRequest setPubWorkNo(String pubWorkNo) {
        this.pubWorkNo = pubWorkNo;
        return this;
    }
    public String getPubWorkNo() {
        return this.pubWorkNo;
    }

    public GetDingtalkProjectionInfoRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public GetDingtalkProjectionInfoRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public GetDingtalkProjectionInfoRequest setSubUid(String subUid) {
        this.subUid = subUid;
        return this;
    }
    public String getSubUid() {
        return this.subUid;
    }

    public static class GetDingtalkProjectionInfoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDingtalkProjectionInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkProjectionInfoRequestTenantContext self = new GetDingtalkProjectionInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkProjectionInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
