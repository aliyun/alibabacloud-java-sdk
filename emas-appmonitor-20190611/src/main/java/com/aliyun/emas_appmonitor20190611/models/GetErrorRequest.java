// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetErrorRequest extends TeaModel {
    /**
     * <p>appKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233588686</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <strong>example:</strong>
     * <p>h5Resource</p>
     */
    @NameInMap("BizModule")
    public String bizModule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1739808000000</p>
     */
    @NameInMap("ClientTime")
    public Long clientTime;

    /**
     * <strong>example:</strong>
     * <p>233588686</p>
     */
    @NameInMap("Did")
    public String did;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <strong>example:</strong>
     * <p>abcf4a4b-158c-4a0b-b81c-262785d84c4f</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetErrorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErrorRequest self = new GetErrorRequest();
        return TeaModel.build(map, self);
    }

    public GetErrorRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetErrorRequest setBizModule(String bizModule) {
        this.bizModule = bizModule;
        return this;
    }
    public String getBizModule() {
        return this.bizModule;
    }

    public GetErrorRequest setClientTime(Long clientTime) {
        this.clientTime = clientTime;
        return this;
    }
    public Long getClientTime() {
        return this.clientTime;
    }

    public GetErrorRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public GetErrorRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public GetErrorRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetErrorRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
