// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>474bdef0-d149-4695-abfb-52912d91****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The current version number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v2-1</p>
     */
    @NameInMap("FromAppVersion")
    public String fromAppVersion;

    /**
     * <p>The timeout period of the asynchronous rollback operation. Unit: seconds. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The target version number. By default, the system automatically rolls back the container version to the previous version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("ToAppVersion")
    public String toAppVersion;

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

    public RollbackApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RollbackApplicationRequest setToAppVersion(String toAppVersion) {
        this.toAppVersion = toAppVersion;
        return this;
    }
    public String getToAppVersion() {
        return this.toAppVersion;
    }

}
