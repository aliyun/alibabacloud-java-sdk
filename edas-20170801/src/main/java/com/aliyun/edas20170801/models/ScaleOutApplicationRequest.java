// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleOutApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EcuInfo")
    public String ecuInfo;

    @NameInMap("DeployGroup")
    public String deployGroup;

    public static ScaleOutApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutApplicationRequest self = new ScaleOutApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ScaleOutApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ScaleOutApplicationRequest setEcuInfo(String ecuInfo) {
        this.ecuInfo = ecuInfo;
        return this;
    }
    public String getEcuInfo() {
        return this.ecuInfo;
    }

    public ScaleOutApplicationRequest setDeployGroup(String deployGroup) {
        this.deployGroup = deployGroup;
        return this;
    }
    public String getDeployGroup() {
        return this.deployGroup;
    }

}
