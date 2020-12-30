// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateClusterWithTemplateResponseBody extends TeaModel {
    @NameInMap("MasterOrderId")
    public String masterOrderId;

    @NameInMap("CoreOrderId")
    public String coreOrderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EmrOrderId")
    public String emrOrderId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static CreateClusterWithTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterWithTemplateResponseBody self = new CreateClusterWithTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterWithTemplateResponseBody setMasterOrderId(String masterOrderId) {
        this.masterOrderId = masterOrderId;
        return this;
    }
    public String getMasterOrderId() {
        return this.masterOrderId;
    }

    public CreateClusterWithTemplateResponseBody setCoreOrderId(String coreOrderId) {
        this.coreOrderId = coreOrderId;
        return this;
    }
    public String getCoreOrderId() {
        return this.coreOrderId;
    }

    public CreateClusterWithTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClusterWithTemplateResponseBody setEmrOrderId(String emrOrderId) {
        this.emrOrderId = emrOrderId;
        return this;
    }
    public String getEmrOrderId() {
        return this.emrOrderId;
    }

    public CreateClusterWithTemplateResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
