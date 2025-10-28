// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceConsumersPageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public GetServiceConsumersPageResponseBodyData data;

    /**
     * <p>The message that is returned for the request.</p>
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

    public static GetServiceConsumersPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConsumersPageResponseBody self = new GetServiceConsumersPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceConsumersPageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceConsumersPageResponseBody setData(GetServiceConsumersPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceConsumersPageResponseBodyData getData() {
        return this.data;
    }

    public GetServiceConsumersPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceConsumersPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceConsumersPageResponseBodyDataContent extends TeaModel {
        /**
         * <p>The name of the service consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-lq-cartservice</p>
         */
        @NameInMap("EdasAppName")
        public String edasAppName;

        /**
         * <p>The ID of the service consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>efbda488-7b33-432f-a40d-<strong><strong>0047</strong></strong></p>
         */
        @NameInMap("EdassAppId")
        public String edassAppId;

        /**
         * <p>The IP address of the service consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>10.20.x.xx</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static GetServiceConsumersPageResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConsumersPageResponseBodyDataContent self = new GetServiceConsumersPageResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public GetServiceConsumersPageResponseBodyDataContent setEdasAppName(String edasAppName) {
            this.edasAppName = edasAppName;
            return this;
        }
        public String getEdasAppName() {
            return this.edasAppName;
        }

        public GetServiceConsumersPageResponseBodyDataContent setEdassAppId(String edassAppId) {
            this.edassAppId = edassAppId;
            return this;
        }
        public String getEdassAppId() {
            return this.edassAppId;
        }

        public GetServiceConsumersPageResponseBodyDataContent setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class GetServiceConsumersPageResponseBodyData extends TeaModel {
        /**
         * <p>The data array that is returned.</p>
         */
        @NameInMap("Content")
        public java.util.List<GetServiceConsumersPageResponseBodyDataContent> content;

        /**
         * <p>The number of entries to return on each page.</p>
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
         * <p>3</p>
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

        public static GetServiceConsumersPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConsumersPageResponseBodyData self = new GetServiceConsumersPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceConsumersPageResponseBodyData setContent(java.util.List<GetServiceConsumersPageResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<GetServiceConsumersPageResponseBodyDataContent> getContent() {
            return this.content;
        }

        public GetServiceConsumersPageResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetServiceConsumersPageResponseBodyData setTotalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Integer getTotalElements() {
            return this.totalElements;
        }

        public GetServiceConsumersPageResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
