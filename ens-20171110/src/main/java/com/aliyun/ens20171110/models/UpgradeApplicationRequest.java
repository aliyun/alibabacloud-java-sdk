// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Template")
    public String template;

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
