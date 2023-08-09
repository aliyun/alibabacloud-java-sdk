// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListIntegratedServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListIntegratedServiceResponseBodyData> data;

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
        @NameInMap("ServiceCode")
        public String serviceCode;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public Boolean status;

        public static ListIntegratedServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntegratedServiceResponseBodyData self = new ListIntegratedServiceResponseBodyData();
            return TeaModel.build(map, self);
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
