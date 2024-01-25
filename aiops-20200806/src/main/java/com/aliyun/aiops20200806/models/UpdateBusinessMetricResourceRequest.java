// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBusinessMetricResourceRequest extends TeaModel {
    @NameInMap("BusinessMetricId")
    public Long businessMetricId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ResourceList")
    public String resourceList;

    public static UpdateBusinessMetricResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessMetricResourceRequest self = new UpdateBusinessMetricResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessMetricResourceRequest setBusinessMetricId(Long businessMetricId) {
        this.businessMetricId = businessMetricId;
        return this;
    }
    public Long getBusinessMetricId() {
        return this.businessMetricId;
    }

    public UpdateBusinessMetricResourceRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateBusinessMetricResourceRequest setResourceList(String resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public String getResourceList() {
        return this.resourceList;
    }

}
