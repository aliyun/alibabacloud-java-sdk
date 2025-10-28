// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceProvidersPageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public GetServiceProvidersPageResponseBodyData data;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The remarks of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>172.178.XX.XX</p>
         */
        @NameInMap("Iannotations")
        public String iannotations;

        /**
         * <p>The IP address of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>10.20.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The serialization type.</p>
         * 
         * <strong>example:</strong>
         * <p>hessian2</p>
         */
        @NameInMap("SerializeType")
        public String serializeType;

        /**
         * <p>The service timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        public static GetServiceProvidersPageResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvidersPageResponseBodyDataContent self = new GetServiceProvidersPageResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public GetServiceProvidersPageResponseBodyDataContent setIannotations(String iannotations) {
            this.iannotations = iannotations;
            return this;
        }
        public String getIannotations() {
            return this.iannotations;
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
        /**
         * <p>The data array returned.</p>
         */
        @NameInMap("Content")
        public java.util.List<GetServiceProvidersPageResponseBodyDataContent> content;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalElements")
        public Integer totalElements;

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
