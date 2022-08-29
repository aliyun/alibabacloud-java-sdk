// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobClassifyTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListCsccJobClassifyTypesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccJobClassifyTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobClassifyTypesResponseBody self = new ListCsccJobClassifyTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccJobClassifyTypesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccJobClassifyTypesResponseBody setData(java.util.List<ListCsccJobClassifyTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCsccJobClassifyTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListCsccJobClassifyTypesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccJobClassifyTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccJobClassifyTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccJobClassifyTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccJobClassifyTypesResponseBodyData extends TeaModel {
        @NameInMap("JobClassifyType")
        public Integer jobClassifyType;

        @NameInMap("JobClassifyTypeName")
        public String jobClassifyTypeName;

        @NameInMap("Order")
        public Integer order;

        public static ListCsccJobClassifyTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccJobClassifyTypesResponseBodyData self = new ListCsccJobClassifyTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccJobClassifyTypesResponseBodyData setJobClassifyType(Integer jobClassifyType) {
            this.jobClassifyType = jobClassifyType;
            return this;
        }
        public Integer getJobClassifyType() {
            return this.jobClassifyType;
        }

        public ListCsccJobClassifyTypesResponseBodyData setJobClassifyTypeName(String jobClassifyTypeName) {
            this.jobClassifyTypeName = jobClassifyTypeName;
            return this;
        }
        public String getJobClassifyTypeName() {
            return this.jobClassifyTypeName;
        }

        public ListCsccJobClassifyTypesResponseBodyData setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

    }

}
