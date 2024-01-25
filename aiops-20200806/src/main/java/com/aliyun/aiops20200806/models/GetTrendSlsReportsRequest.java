// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetTrendSlsReportsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("Uid")
    public Long uid;

    public static GetTrendSlsReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrendSlsReportsRequest self = new GetTrendSlsReportsRequest();
        return TeaModel.build(map, self);
    }

    public GetTrendSlsReportsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTrendSlsReportsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetTrendSlsReportsRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public GetTrendSlsReportsRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
