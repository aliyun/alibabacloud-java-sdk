// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("FromAppVersion")
    @Validation(required = true)
    public String fromAppVersion;

    @NameInMap("ToAppVersion")
    public String toAppVersion;

    @NameInMap("Timeout")
    public Integer timeout;

    public static RollbackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationRequest self = new RollbackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RollbackApplicationRequest setFromAppVersion(String fromAppVersion) {
        this.fromAppVersion = fromAppVersion;
        return this;
    }
    public String getFromAppVersion() {
        return this.fromAppVersion;
    }

    public RollbackApplicationRequest setToAppVersion(String toAppVersion) {
        this.toAppVersion = toAppVersion;
        return this;
    }
    public String getToAppVersion() {
        return this.toAppVersion;
    }

    public RollbackApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
