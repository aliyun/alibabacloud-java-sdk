// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class GetServicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServicesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServicesResponseBody self = new GetServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServicesResponseBody setData(GetServicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServicesResponseBodyData getData() {
        return this.data;
    }

    public GetServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServicesResponseBodyDataDetailsDetails extends TeaModel {
        @NameInMap("Pid")
        public String pid;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceName")
        public String serviceName;

        public static GetServicesResponseBodyDataDetailsDetails build(java.util.Map<String, ?> map) throws Exception {
            GetServicesResponseBodyDataDetailsDetails self = new GetServicesResponseBodyDataDetailsDetails();
            return TeaModel.build(map, self);
        }

        public GetServicesResponseBodyDataDetailsDetails setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetServicesResponseBodyDataDetailsDetails setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetServicesResponseBodyDataDetailsDetails setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetServicesResponseBodyDataDetails extends TeaModel {
        @NameInMap("Details")
        public java.util.List<GetServicesResponseBodyDataDetailsDetails> details;

        public static GetServicesResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            GetServicesResponseBodyDataDetails self = new GetServicesResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public GetServicesResponseBodyDataDetails setDetails(java.util.List<GetServicesResponseBodyDataDetailsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<GetServicesResponseBodyDataDetailsDetails> getDetails() {
            return this.details;
        }

    }

    public static class GetServicesResponseBodyDataServices extends TeaModel {
        @NameInMap("Services")
        public java.util.List<String> services;

        public static GetServicesResponseBodyDataServices build(java.util.Map<String, ?> map) throws Exception {
            GetServicesResponseBodyDataServices self = new GetServicesResponseBodyDataServices();
            return TeaModel.build(map, self);
        }

        public GetServicesResponseBodyDataServices setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class GetServicesResponseBodyData extends TeaModel {
        @NameInMap("Details")
        public GetServicesResponseBodyDataDetails details;

        @NameInMap("Services")
        public GetServicesResponseBodyDataServices services;

        public static GetServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServicesResponseBodyData self = new GetServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServicesResponseBodyData setDetails(GetServicesResponseBodyDataDetails details) {
            this.details = details;
            return this;
        }
        public GetServicesResponseBodyDataDetails getDetails() {
            return this.details;
        }

        public GetServicesResponseBodyData setServices(GetServicesResponseBodyDataServices services) {
            this.services = services;
            return this;
        }
        public GetServicesResponseBodyDataServices getServices() {
            return this.services;
        }

    }

}
