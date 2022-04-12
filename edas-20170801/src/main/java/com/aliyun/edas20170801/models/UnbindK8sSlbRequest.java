// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UnbindK8sSlbRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("SlbName")
    public String slbName;

    @NameInMap("Type")
    public String type;

    public static UnbindK8sSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindK8sSlbRequest self = new UnbindK8sSlbRequest();
        return TeaModel.build(map, self);
    }

    public UnbindK8sSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindK8sSlbRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UnbindK8sSlbRequest setSlbName(String slbName) {
        this.slbName = slbName;
        return this;
    }
    public String getSlbName() {
        return this.slbName;
    }

    public UnbindK8sSlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
