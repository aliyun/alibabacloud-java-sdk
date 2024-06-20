// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetVisitorLoginDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4c51c9116c36537cb850dc1081d745df</p>
     */
    @NameInMap("ChatDeviceId")
    public String chatDeviceId;

    /**
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>9XYGTGWtq2wFi_Bpg7aUnIoYi_vG_rO3b<em><strong>YtsxbHRHrYHlz1LDBLJAyZcLxieRQR4h_6AnWvTjJeNU5jgxzO</strong></em>**bHwej7WgWrmA</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fcd020fe-d8e4-40e5-8c77-1a272a174a7d</p>
     */
    @NameInMap("VisitorId")
    public String visitorId;

    public static GetVisitorLoginDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVisitorLoginDetailsRequest self = new GetVisitorLoginDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetVisitorLoginDetailsRequest setChatDeviceId(String chatDeviceId) {
        this.chatDeviceId = chatDeviceId;
        return this;
    }
    public String getChatDeviceId() {
        return this.chatDeviceId;
    }

    public GetVisitorLoginDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetVisitorLoginDetailsRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetVisitorLoginDetailsRequest setVisitorId(String visitorId) {
        this.visitorId = visitorId;
        return this;
    }
    public String getVisitorId() {
        return this.visitorId;
    }

}
