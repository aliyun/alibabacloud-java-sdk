// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceConsumersPageResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetServiceConsumersPageResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceConsumersPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConsumersPageResponseBody self = new GetServiceConsumersPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceConsumersPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceConsumersPageResponseBody setData(GetServiceConsumersPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceConsumersPageResponseBodyData getData() {
        return this.data;
    }

    public GetServiceConsumersPageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceConsumersPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceConsumersPageResponseBodyDataContent extends TeaModel {
        @NameInMap("EdasAppName")
        public String edasAppName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("EdassAppId")
        public String edassAppId;

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

        public GetServiceConsumersPageResponseBodyDataContent setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetServiceConsumersPageResponseBodyDataContent setEdassAppId(String edassAppId) {
            this.edassAppId = edassAppId;
            return this;
        }
        public String getEdassAppId() {
            return this.edassAppId;
        }

    }

    public static class GetServiceConsumersPageResponseBodyData extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("TotalElements")
        public Integer totalElements;

        @NameInMap("Content")
        public java.util.List<GetServiceConsumersPageResponseBodyDataContent> content;

        public static GetServiceConsumersPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConsumersPageResponseBodyData self = new GetServiceConsumersPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceConsumersPageResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetServiceConsumersPageResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public GetServiceConsumersPageResponseBodyData setTotalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Integer getTotalElements() {
            return this.totalElements;
        }

        public GetServiceConsumersPageResponseBodyData setContent(java.util.List<GetServiceConsumersPageResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<GetServiceConsumersPageResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
