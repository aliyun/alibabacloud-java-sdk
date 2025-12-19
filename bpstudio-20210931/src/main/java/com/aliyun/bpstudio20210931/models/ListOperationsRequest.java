// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListOperationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static ListOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationsRequest self = new ListOperationsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationsRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
