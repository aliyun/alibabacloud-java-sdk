// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateIntegratedServiceStatusRequest extends TeaModel {
    /**
     * <p>The type of the event that is integrated across accounts. Valid values:</p>
     * <ul>
     * <li>NonCompliantNotification: non-compliance event</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NonCompliantNotification</p>
     */
    @NameInMap("AggregatorDeliveryDataType")
    public String aggregatorDeliveryDataType;

    /**
     * <p>The types of the integrated events. Separate multiple event types with commas (,). Valid values:</p>
     * <ul>
     * <li>ConfigurationItemChangeNotification: resource change event</li>
     * <li>NonCompliantNotification: non-compliance event</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NonCompliantNotification</p>
     */
    @NameInMap("IntegratedTypes")
    public String integratedTypes;

    /**
     * <p>The identity of the cloud service that is integrated with Cloud Config. Valid values:</p>
     * <ul>
     * <li>eventbridge: EventBridge</li>
     * <li>cms: CloudMonitor</li>
     * <li>bpstudio: Cloud Architect Design Tools</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cadt</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Specifies whether you want the product to be integrated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
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
