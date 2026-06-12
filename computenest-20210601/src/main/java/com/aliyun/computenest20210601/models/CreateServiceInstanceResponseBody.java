// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud Marketplace instance.</p>
     * 
     * <strong>example:</strong>
     * <p>786***45</p>
     */
    @NameInMap("MarketInstanceId")
    public String marketInstanceId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2306175xxxxxxxx</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The status of the service instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Created</strong>: The service instance is created.</p>
     * </li>
     * <li><p><strong>Deploying</strong>: The service instance is being deployed.</p>
     * </li>
     * <li><p><strong>DeployedFailed</strong>: The service instance failed to be deployed.</p>
     * </li>
     * <li><p><strong>Deployed</strong>: The service instance is deployed.</p>
     * </li>
     * <li><p><strong>Upgrading</strong>: The service instance is being upgraded.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The service instance is being deleted.</p>
     * </li>
     * <li><p><strong>Deleted</strong>: The service instance is deleted.</p>
     * </li>
     * <li><p><strong>DeletedFailed</strong>: The service instance failed to be deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceResponseBody self = new CreateServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceResponseBody setMarketInstanceId(String marketInstanceId) {
        this.marketInstanceId = marketInstanceId;
        return this;
    }
    public String getMarketInstanceId() {
        return this.marketInstanceId;
    }

    public CreateServiceInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceInstanceResponseBody setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public CreateServiceInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
