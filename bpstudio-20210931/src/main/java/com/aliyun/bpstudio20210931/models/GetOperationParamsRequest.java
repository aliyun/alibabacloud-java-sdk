// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetOperationParamsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rename</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static GetOperationParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationParamsRequest self = new GetOperationParamsRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationParamsRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public GetOperationParamsRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
