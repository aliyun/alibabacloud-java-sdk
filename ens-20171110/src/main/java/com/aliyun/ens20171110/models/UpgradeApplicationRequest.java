// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The information template for phased update. The value must be a JSON string and contain the following information:</p>
     * <br>
     * <p>*   Version range that you want to update</p>
     * <p>*   Configuration information of the target version</p>
     * <p>*   Canary release policy for resources</p>
     * <p>*   Intelligent upgrade policy that contains information such as the time window and resource usage limit</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The timeout period for asynchronous upgrade. Unit: seconds. Default value: 300.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static UpgradeApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationRequest self = new UpgradeApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpgradeApplicationRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpgradeApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
