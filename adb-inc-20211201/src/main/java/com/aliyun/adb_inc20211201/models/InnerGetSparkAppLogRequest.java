// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("LogLength")
    public Long logLength;

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

    public static InnerGetSparkAppLogRequest build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppLogRequest self = new InnerGetSparkAppLogRequest();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppLogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InnerGetSparkAppLogRequest setLogLength(Long logLength) {
        this.logLength = logLength;
        return this;
    }
    public Long getLogLength() {
        return this.logLength;
    }

    public InnerGetSparkAppLogRequest setTrustedCallerParentId(Long trustedCallerParentId) {
        this.trustedCallerParentId = trustedCallerParentId;
        return this;
    }
    public Long getTrustedCallerParentId() {
        return this.trustedCallerParentId;
    }

    public InnerGetSparkAppLogRequest setTrustedCallerType(String trustedCallerType) {
        this.trustedCallerType = trustedCallerType;
        return this;
    }
    public String getTrustedCallerType() {
        return this.trustedCallerType;
    }

    public InnerGetSparkAppLogRequest setTrustedCallerUid(Long trustedCallerUid) {
        this.trustedCallerUid = trustedCallerUid;
        return this;
    }
    public Long getTrustedCallerUid() {
        return this.trustedCallerUid;
    }

}
