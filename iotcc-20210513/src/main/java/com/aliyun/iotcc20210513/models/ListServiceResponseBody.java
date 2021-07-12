// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Services")
    public java.util.List<ListServiceResponseBodyServices> services;

    public static ListServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceResponseBody self = new ListServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListServiceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceResponseBody setServices(java.util.List<ListServiceResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListServiceResponseBodyServices> getServices() {
        return this.services;
    }

    public static class ListServiceResponseBodyServices extends TeaModel {
        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServiceDescription")
        public String serviceDescription;

        public static ListServiceResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListServiceResponseBodyServices self = new ListServiceResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListServiceResponseBodyServices setIoTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        public ListServiceResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceResponseBodyServices setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListServiceResponseBodyServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServiceResponseBodyServices setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }
        public String getServiceDescription() {
            return this.serviceDescription;
        }

    }

}
