// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateSupplierInformationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OperationIp")
    public String operationIp;

    @NameInMap("OperationMfaPresent")
    public Boolean operationMfaPresent;

    public static UpdateSupplierInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSupplierInformationRequest self = new UpdateSupplierInformationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSupplierInformationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSupplierInformationRequest setOperationIp(String operationIp) {
        this.operationIp = operationIp;
        return this;
    }
    public String getOperationIp() {
        return this.operationIp;
    }

    public UpdateSupplierInformationRequest setOperationMfaPresent(Boolean operationMfaPresent) {
        this.operationMfaPresent = operationMfaPresent;
        return this;
    }
    public Boolean getOperationMfaPresent() {
        return this.operationMfaPresent;
    }

}
