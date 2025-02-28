// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppWebUiAddressRequest extends TeaModel {
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

    public static InnerGetSparkAppWebUiAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppWebUiAddressRequest self = new InnerGetSparkAppWebUiAddressRequest();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppWebUiAddressRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InnerGetSparkAppWebUiAddressRequest setTrustedCallerParentId(Long trustedCallerParentId) {
        this.trustedCallerParentId = trustedCallerParentId;
        return this;
    }
    public Long getTrustedCallerParentId() {
        return this.trustedCallerParentId;
    }

    public InnerGetSparkAppWebUiAddressRequest setTrustedCallerType(String trustedCallerType) {
        this.trustedCallerType = trustedCallerType;
        return this;
    }
    public String getTrustedCallerType() {
        return this.trustedCallerType;
    }

    public InnerGetSparkAppWebUiAddressRequest setTrustedCallerUid(Long trustedCallerUid) {
        this.trustedCallerUid = trustedCallerUid;
        return this;
    }
    public Long getTrustedCallerUid() {
        return this.trustedCallerUid;
    }

}
