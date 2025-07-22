// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AllocateCostCenterResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>640403</p>
     */
    @NameInMap("CostCenterId")
    public Long costCenterId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>1529600453335198</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    /**
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateCostCenterResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostCenterResourceResponseBody self = new AllocateCostCenterResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateCostCenterResourceResponseBody setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public AllocateCostCenterResourceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public AllocateCostCenterResourceResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public AllocateCostCenterResourceResponseBody setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public AllocateCostCenterResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
