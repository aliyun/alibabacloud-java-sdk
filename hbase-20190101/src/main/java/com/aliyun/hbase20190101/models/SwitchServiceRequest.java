// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class SwitchServiceRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Operate")
    public String operate;

    @NameInMap("ServiceName")
    public String serviceName;

    public static SwitchServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchServiceRequest self = new SwitchServiceRequest();
        return TeaModel.build(map, self);
    }

    public SwitchServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SwitchServiceRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public SwitchServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
