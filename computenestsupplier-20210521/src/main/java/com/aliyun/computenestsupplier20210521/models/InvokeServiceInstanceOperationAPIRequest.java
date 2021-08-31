// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class InvokeServiceInstanceOperationAPIRequest extends TeaModel {
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OperationProduct")
    public String operationProduct;

    @NameInMap("OperationAction")
    public String operationAction;

    @NameInMap("OperationVersion")
    public String operationVersion;

    @NameInMap("OperationParameters")
    public String operationParameters;

    public static InvokeServiceInstanceOperationAPIRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeServiceInstanceOperationAPIRequest self = new InvokeServiceInstanceOperationAPIRequest();
        return TeaModel.build(map, self);
    }

    public InvokeServiceInstanceOperationAPIRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public InvokeServiceInstanceOperationAPIRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InvokeServiceInstanceOperationAPIRequest setOperationProduct(String operationProduct) {
        this.operationProduct = operationProduct;
        return this;
    }
    public String getOperationProduct() {
        return this.operationProduct;
    }

    public InvokeServiceInstanceOperationAPIRequest setOperationAction(String operationAction) {
        this.operationAction = operationAction;
        return this;
    }
    public String getOperationAction() {
        return this.operationAction;
    }

    public InvokeServiceInstanceOperationAPIRequest setOperationVersion(String operationVersion) {
        this.operationVersion = operationVersion;
        return this;
    }
    public String getOperationVersion() {
        return this.operationVersion;
    }

    public InvokeServiceInstanceOperationAPIRequest setOperationParameters(String operationParameters) {
        this.operationParameters = operationParameters;
        return this;
    }
    public String getOperationParameters() {
        return this.operationParameters;
    }

}
