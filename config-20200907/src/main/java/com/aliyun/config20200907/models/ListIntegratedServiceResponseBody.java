// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListIntegratedServiceResponseBody extends TeaModel {
    /**
     * <p>The information about the integrated services.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListIntegratedServiceResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>86DB52A5-0C25-505A-96D5-9BAE1EFA00B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListIntegratedServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegratedServiceResponseBody self = new ListIntegratedServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegratedServiceResponseBody setData(java.util.List<ListIntegratedServiceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIntegratedServiceResponseBodyData> getData() {
        return this.data;
    }

    public ListIntegratedServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntegratedServiceResponseBodyData extends TeaModel {
        /**
         * <p>The event type for cross-account integration. Supported event types:</p>
         * <ul>
         * <li>NonCompliantNotification: non-compliance events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NonCompliantNotification</p>
         */
        @NameInMap("AggregatorDeliveryDataType")
        public String aggregatorDeliveryDataType;

        /**
         * <p>The event types for the integration. Separate multiple types with commas (,). Supported event types:</p>
         * <ul>
         * <li><p>ConfigurationItemChangeNotification: resource change events.</p>
         * </li>
         * <li><p>NonCompliantNotification: non-compliance events.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NonCompliantNotification</p>
         */
        @NameInMap("IntegratedTypes")
        public String integratedTypes;

        /**
         * <p>The identifier of the integrable Alibaba Cloud service. Valid values:</p>
         * <ul>
         * <li><p>eventbridge: EventBridge.</p>
         * </li>
         * <li><p>cms: Cloud Monitor.</p>
         * </li>
         * <li><p>bpstudio: Cloud Architect Design Tools.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The name of the integrated service.</p>
         * 
         * <strong>example:</strong>
         * <p>云监控</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The integration status of the Alibaba Cloud service. Valid values:</p>
         * <ul>
         * <li><p>true: The service is integrated.</p>
         * </li>
         * <li><p>false: The service is not integrated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static ListIntegratedServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntegratedServiceResponseBodyData self = new ListIntegratedServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntegratedServiceResponseBodyData setAggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
            this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
            return this;
        }
        public String getAggregatorDeliveryDataType() {
            return this.aggregatorDeliveryDataType;
        }

        public ListIntegratedServiceResponseBodyData setIntegratedTypes(String integratedTypes) {
            this.integratedTypes = integratedTypes;
            return this;
        }
        public String getIntegratedTypes() {
            return this.integratedTypes;
        }

        public ListIntegratedServiceResponseBodyData setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListIntegratedServiceResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListIntegratedServiceResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
