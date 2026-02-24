// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateIntegratedServiceStatusRequest extends TeaModel {
    @NameInMap("AggregatorDeliveryDataType")
    public String aggregatorDeliveryDataType;

    @NameInMap("IntegratedTypes")
    public String integratedTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cadt</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static UpdateIntegratedServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegratedServiceStatusRequest self = new UpdateIntegratedServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntegratedServiceStatusRequest setAggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
        this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
        return this;
    }
    public String getAggregatorDeliveryDataType() {
        return this.aggregatorDeliveryDataType;
    }

    public UpdateIntegratedServiceStatusRequest setIntegratedTypes(String integratedTypes) {
        this.integratedTypes = integratedTypes;
        return this;
    }
    public String getIntegratedTypes() {
        return this.integratedTypes;
    }

    public UpdateIntegratedServiceStatusRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public UpdateIntegratedServiceStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
