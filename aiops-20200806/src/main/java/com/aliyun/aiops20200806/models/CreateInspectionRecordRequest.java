// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateInspectionRecordRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ResourceId")
    public String resourceId;

    public static CreateInspectionRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionRecordRequest self = new CreateInspectionRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateInspectionRecordRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public CreateInspectionRecordRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateInspectionRecordRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
