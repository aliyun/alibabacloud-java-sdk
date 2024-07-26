// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceAttributesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOperation")
    public Boolean enableOperation;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17xxxx</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static UpdateServiceInstanceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceAttributesRequest self = new UpdateServiceInstanceAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceAttributesRequest setEnableOperation(Boolean enableOperation) {
        this.enableOperation = enableOperation;
        return this;
    }
    public Boolean getEnableOperation() {
        return this.enableOperation;
    }

    public UpdateServiceInstanceAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceInstanceAttributesRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
