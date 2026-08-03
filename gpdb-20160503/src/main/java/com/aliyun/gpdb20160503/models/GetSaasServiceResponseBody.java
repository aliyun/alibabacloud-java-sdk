// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSaasServiceResponseBody extends TeaModel {
    /**
     * <p>The compute resource of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cu")
    public String cu;

    /**
     * <p>The billing type. Valid values:</p>
     * <ul>
     * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
     * <li><strong>PREPAY</strong>: subscription</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If this parameter is not specified, the default value is pay-as-you-go.</li>
     * <li>In subscription billing mode, a discount is available when you purchase a duration of one year or longer. Select a billing type as needed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID where the service resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>agdb-xxxxx</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><strong>drama</strong></li>
     * <li><strong>memroy</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>drama</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The service status. Valid values:</p>
     * <ul>
     * <li><strong>creating</strong>: Being created.</li>
     * <li><strong>active</strong>: Running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>creating</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The workspace ID where the service resides.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetSaasServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSaasServiceResponseBody self = new GetSaasServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSaasServiceResponseBody setCu(String cu) {
        this.cu = cu;
        return this;
    }
    public String getCu() {
        return this.cu;
    }

    public GetSaasServiceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetSaasServiceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSaasServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSaasServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetSaasServiceResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetSaasServiceResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetSaasServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSaasServiceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
