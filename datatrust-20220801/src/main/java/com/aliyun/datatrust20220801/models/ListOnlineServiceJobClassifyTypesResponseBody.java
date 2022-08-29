// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListOnlineServiceJobClassifyTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListOnlineServiceJobClassifyTypesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOnlineServiceJobClassifyTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineServiceJobClassifyTypesResponseBody self = new ListOnlineServiceJobClassifyTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOnlineServiceJobClassifyTypesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListOnlineServiceJobClassifyTypesResponseBody setData(java.util.List<ListOnlineServiceJobClassifyTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOnlineServiceJobClassifyTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListOnlineServiceJobClassifyTypesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOnlineServiceJobClassifyTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOnlineServiceJobClassifyTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOnlineServiceJobClassifyTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOnlineServiceJobClassifyTypesResponseBodyData extends TeaModel {
        @NameInMap("JobClassifyType")
        public Integer jobClassifyType;

        @NameInMap("JobClassifyTypeName")
        public String jobClassifyTypeName;

        @NameInMap("Order")
        public Integer order;

        public static ListOnlineServiceJobClassifyTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOnlineServiceJobClassifyTypesResponseBodyData self = new ListOnlineServiceJobClassifyTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOnlineServiceJobClassifyTypesResponseBodyData setJobClassifyType(Integer jobClassifyType) {
            this.jobClassifyType = jobClassifyType;
            return this;
        }
        public Integer getJobClassifyType() {
            return this.jobClassifyType;
        }

        public ListOnlineServiceJobClassifyTypesResponseBodyData setJobClassifyTypeName(String jobClassifyTypeName) {
            this.jobClassifyTypeName = jobClassifyTypeName;
            return this;
        }
        public String getJobClassifyTypeName() {
            return this.jobClassifyTypeName;
        }

        public ListOnlineServiceJobClassifyTypesResponseBodyData setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

    }

}
