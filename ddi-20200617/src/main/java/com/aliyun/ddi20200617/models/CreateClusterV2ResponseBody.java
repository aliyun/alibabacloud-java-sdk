// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateClusterV2ResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CoreOrderId")
    public String coreOrderId;

    @NameInMap("EmrOrderId")
    public String emrOrderId;

    @NameInMap("MasterOrderId")
    public String masterOrderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateClusterV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterV2ResponseBody self = new CreateClusterV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterV2ResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterV2ResponseBody setCoreOrderId(String coreOrderId) {
        this.coreOrderId = coreOrderId;
        return this;
    }
    public String getCoreOrderId() {
        return this.coreOrderId;
    }

    public CreateClusterV2ResponseBody setEmrOrderId(String emrOrderId) {
        this.emrOrderId = emrOrderId;
        return this;
    }
    public String getEmrOrderId() {
        return this.emrOrderId;
    }

    public CreateClusterV2ResponseBody setMasterOrderId(String masterOrderId) {
        this.masterOrderId = masterOrderId;
        return this;
    }
    public String getMasterOrderId() {
        return this.masterOrderId;
    }

    public CreateClusterV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
