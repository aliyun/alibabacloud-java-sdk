// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppStateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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

    public static InnerGetSparkAppStateRequest build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppStateRequest self = new InnerGetSparkAppStateRequest();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppStateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InnerGetSparkAppStateRequest setTrustedCallerParentId(Long trustedCallerParentId) {
        this.trustedCallerParentId = trustedCallerParentId;
        return this;
    }
    public Long getTrustedCallerParentId() {
        return this.trustedCallerParentId;
    }

    public InnerGetSparkAppStateRequest setTrustedCallerType(String trustedCallerType) {
        this.trustedCallerType = trustedCallerType;
        return this;
    }
    public String getTrustedCallerType() {
        return this.trustedCallerType;
    }

    public InnerGetSparkAppStateRequest setTrustedCallerUid(Long trustedCallerUid) {
        this.trustedCallerUid = trustedCallerUid;
        return this;
    }
    public Long getTrustedCallerUid() {
        return this.trustedCallerUid;
    }

}
