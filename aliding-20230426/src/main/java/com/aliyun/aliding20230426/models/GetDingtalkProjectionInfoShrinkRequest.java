// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkProjectionInfoShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

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

    public static GetDingtalkProjectionInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkProjectionInfoShrinkRequest self = new GetDingtalkProjectionInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkProjectionInfoShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetDingtalkProjectionInfoShrinkRequest setClient(String client) {
        this.client = client;
        return this;
    }
    public String getClient() {
        return this.client;
    }

    public GetDingtalkProjectionInfoShrinkRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public GetDingtalkProjectionInfoShrinkRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDingtalkProjectionInfoShrinkRequest setPubWorkNo(String pubWorkNo) {
        this.pubWorkNo = pubWorkNo;
        return this;
    }
    public String getPubWorkNo() {
        return this.pubWorkNo;
    }

    public GetDingtalkProjectionInfoShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public GetDingtalkProjectionInfoShrinkRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public GetDingtalkProjectionInfoShrinkRequest setSubUid(String subUid) {
        this.subUid = subUid;
        return this;
    }
    public String getSubUid() {
        return this.subUid;
    }

}
