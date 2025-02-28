// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerKillSparkAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202112291908la01960012372</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TrustedCallerParentId")
    public Long trustedCallerParentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TrustedCallerType")
    public String trustedCallerType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TrustedCallerUid")
    public Long trustedCallerUid;

    public static InnerKillSparkAppRequest build(java.util.Map<String, ?> map) throws Exception {
        InnerKillSparkAppRequest self = new InnerKillSparkAppRequest();
        return TeaModel.build(map, self);
    }

    public InnerKillSparkAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InnerKillSparkAppRequest setTrustedCallerParentId(Long trustedCallerParentId) {
        this.trustedCallerParentId = trustedCallerParentId;
        return this;
    }
    public Long getTrustedCallerParentId() {
        return this.trustedCallerParentId;
    }

    public InnerKillSparkAppRequest setTrustedCallerType(String trustedCallerType) {
        this.trustedCallerType = trustedCallerType;
        return this;
    }
    public String getTrustedCallerType() {
        return this.trustedCallerType;
    }

    public InnerKillSparkAppRequest setTrustedCallerUid(Long trustedCallerUid) {
        this.trustedCallerUid = trustedCallerUid;
        return this;
    }
    public Long getTrustedCallerUid() {
        return this.trustedCallerUid;
    }

}
