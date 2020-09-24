// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class PullServiceInfoFromRegistryResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.List<PullServiceInfoFromRegistryResponseBodyData> data;

    // message
    @NameInMap("message")
    public String message;

    public static PullServiceInfoFromRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PullServiceInfoFromRegistryResponseBody self = new PullServiceInfoFromRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public PullServiceInfoFromRegistryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public PullServiceInfoFromRegistryResponseBody setData(java.util.List<PullServiceInfoFromRegistryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PullServiceInfoFromRegistryResponseBodyData> getData() {
        return this.data;
    }

    public PullServiceInfoFromRegistryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class PullServiceInfoFromRegistryResponseBodyData extends TeaModel {
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

        public static PullServiceInfoFromRegistryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PullServiceInfoFromRegistryResponseBodyData self = new PullServiceInfoFromRegistryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PullServiceInfoFromRegistryResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PullServiceInfoFromRegistryResponseBodyData setMetaInfo(String metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }
        public String getMetaInfo() {
            return this.metaInfo;
        }

        public PullServiceInfoFromRegistryResponseBodyData setServiceEnds(java.util.List<String> serviceEnds) {
            this.serviceEnds = serviceEnds;
            return this;
        }
        public java.util.List<String> getServiceEnds() {
            return this.serviceEnds;
        }

        public PullServiceInfoFromRegistryResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
