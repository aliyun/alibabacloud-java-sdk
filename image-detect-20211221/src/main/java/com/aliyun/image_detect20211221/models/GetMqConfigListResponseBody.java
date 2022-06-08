// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetMqConfigListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Response")
    public GetMqConfigListResponseBodyResponse response;

    @NameInMap("Success")
    public Boolean success;

    public static GetMqConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqConfigListResponseBody self = new GetMqConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqConfigListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMqConfigListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMqConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqConfigListResponseBody setResponse(GetMqConfigListResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public GetMqConfigListResponseBodyResponse getResponse() {
        return this.response;
    }

    public GetMqConfigListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMqConfigListResponseBodyResponseList extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("MqAccessKey")
        public String mqAccessKey;

        @NameInMap("MqEndpoint")
        public String mqEndpoint;

        @NameInMap("MqGroupId")
        public String mqGroupId;

        @NameInMap("MqTopic")
        public String mqTopic;

        public static GetMqConfigListResponseBodyResponseList build(java.util.Map<String, ?> map) throws Exception {
            GetMqConfigListResponseBodyResponseList self = new GetMqConfigListResponseBodyResponseList();
            return TeaModel.build(map, self);
        }

        public GetMqConfigListResponseBodyResponseList setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public GetMqConfigListResponseBodyResponseList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMqConfigListResponseBodyResponseList setMqAccessKey(String mqAccessKey) {
            this.mqAccessKey = mqAccessKey;
            return this;
        }
        public String getMqAccessKey() {
            return this.mqAccessKey;
        }

        public GetMqConfigListResponseBodyResponseList setMqEndpoint(String mqEndpoint) {
            this.mqEndpoint = mqEndpoint;
            return this;
        }
        public String getMqEndpoint() {
            return this.mqEndpoint;
        }

        public GetMqConfigListResponseBodyResponseList setMqGroupId(String mqGroupId) {
            this.mqGroupId = mqGroupId;
            return this;
        }
        public String getMqGroupId() {
            return this.mqGroupId;
        }

        public GetMqConfigListResponseBodyResponseList setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

    }

    public static class GetMqConfigListResponseBodyResponse extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetMqConfigListResponseBodyResponseList> list;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetMqConfigListResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            GetMqConfigListResponseBodyResponse self = new GetMqConfigListResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public GetMqConfigListResponseBodyResponse setList(java.util.List<GetMqConfigListResponseBodyResponseList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetMqConfigListResponseBodyResponseList> getList() {
            return this.list;
        }

        public GetMqConfigListResponseBodyResponse setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public GetMqConfigListResponseBodyResponse setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetMqConfigListResponseBodyResponse setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
