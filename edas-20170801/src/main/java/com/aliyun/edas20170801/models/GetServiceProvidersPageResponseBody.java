// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceProvidersPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetServiceProvidersPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceProvidersPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvidersPageResponseBody self = new GetServiceProvidersPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceProvidersPageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceProvidersPageResponseBody setData(GetServiceProvidersPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceProvidersPageResponseBodyData getData() {
        return this.data;
    }

    public GetServiceProvidersPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceProvidersPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceProvidersPageResponseBodyDataContent extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("SerializeType")
        public String serializeType;

        @NameInMap("Timeout")
        public String timeout;

        public static GetServiceProvidersPageResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvidersPageResponseBodyDataContent self = new GetServiceProvidersPageResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public GetServiceProvidersPageResponseBodyDataContent setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetServiceProvidersPageResponseBodyDataContent setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetServiceProvidersPageResponseBodyDataContent setSerializeType(String serializeType) {
            this.serializeType = serializeType;
            return this;
        }
        public String getSerializeType() {
            return this.serializeType;
        }

        public GetServiceProvidersPageResponseBodyDataContent setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

    public static class GetServiceProvidersPageResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<GetServiceProvidersPageResponseBodyDataContent> content;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("TotalElements")
        public Integer totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static GetServiceProvidersPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvidersPageResponseBodyData self = new GetServiceProvidersPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceProvidersPageResponseBodyData setContent(java.util.List<GetServiceProvidersPageResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<GetServiceProvidersPageResponseBodyDataContent> getContent() {
            return this.content;
        }

        public GetServiceProvidersPageResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetServiceProvidersPageResponseBodyData setTotalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Integer getTotalElements() {
            return this.totalElements;
        }

        public GetServiceProvidersPageResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
