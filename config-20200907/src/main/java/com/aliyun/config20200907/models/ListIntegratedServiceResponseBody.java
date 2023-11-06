// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListIntegratedServiceResponseBody extends TeaModel {
    /**
     * <p>The information about the cloud service that can be integrated.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListIntegratedServiceResponseBodyData> data;

    /**
     * <p>The request ID.</p>
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
        @NameInMap("IntegratedTypes")
        public String integratedTypes;

        /**
         * <p>The identifier of the cloud service. Valid values:</p>
         * <br>
         * <p>*   eventbridge: event bus</p>
         * <p>*   cms: CloudMonitor</p>
         * <p>*   bpstudio: Cloud Architect Design Tools (CADT)</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The name of the cloud service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The integration status of the cloud service. Valid values:</p>
         * <br>
         * <p>*   1: The cloud service is integrated.</p>
         * <p>*   0: The cloud service is not integrated.</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static ListIntegratedServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntegratedServiceResponseBodyData self = new ListIntegratedServiceResponseBodyData();
            return TeaModel.build(map, self);
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
