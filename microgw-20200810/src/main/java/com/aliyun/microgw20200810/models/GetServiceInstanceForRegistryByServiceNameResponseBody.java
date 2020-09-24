// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetServiceInstanceForRegistryByServiceNameResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.List<GetServiceInstanceForRegistryByServiceNameResponseBodyData> data;

    // message
    @NameInMap("message")
    public String message;

    public static GetServiceInstanceForRegistryByServiceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceForRegistryByServiceNameResponseBody self = new GetServiceInstanceForRegistryByServiceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceForRegistryByServiceNameResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetServiceInstanceForRegistryByServiceNameResponseBody setData(java.util.List<GetServiceInstanceForRegistryByServiceNameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetServiceInstanceForRegistryByServiceNameResponseBodyData> getData() {
        return this.data;
    }

    public GetServiceInstanceForRegistryByServiceNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetServiceInstanceForRegistryByServiceNameResponseBodyData extends TeaModel {
        // id
        @NameInMap("id")
        public Long id;

        // metaInfo
        @NameInMap("metaInfo")
        public String metaInfo;

        @NameInMap("serviceEnds")
        public java.util.List<String> serviceEnds;

        // serviceName
        @NameInMap("serviceName")
        public String serviceName;

        public static GetServiceInstanceForRegistryByServiceNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceForRegistryByServiceNameResponseBodyData self = new GetServiceInstanceForRegistryByServiceNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceForRegistryByServiceNameResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceInstanceForRegistryByServiceNameResponseBodyData setMetaInfo(String metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }
        public String getMetaInfo() {
            return this.metaInfo;
        }

        public GetServiceInstanceForRegistryByServiceNameResponseBodyData setServiceEnds(java.util.List<String> serviceEnds) {
            this.serviceEnds = serviceEnds;
            return this;
        }
        public java.util.List<String> getServiceEnds() {
            return this.serviceEnds;
        }

        public GetServiceInstanceForRegistryByServiceNameResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
