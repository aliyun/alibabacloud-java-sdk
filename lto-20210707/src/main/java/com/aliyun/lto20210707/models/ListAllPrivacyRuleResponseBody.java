// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllPrivacyRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllPrivacyRuleResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllPrivacyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllPrivacyRuleResponseBody self = new ListAllPrivacyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllPrivacyRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllPrivacyRuleResponseBody setData(java.util.List<ListAllPrivacyRuleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllPrivacyRuleResponseBodyData> getData() {
        return this.data;
    }

    public ListAllPrivacyRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllPrivacyRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllPrivacyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllPrivacyRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllPrivacyRuleResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PrivacyRuleId")
        public String privacyRuleId;

        public static ListAllPrivacyRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllPrivacyRuleResponseBodyData self = new ListAllPrivacyRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllPrivacyRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllPrivacyRuleResponseBodyData setPrivacyRuleId(String privacyRuleId) {
            this.privacyRuleId = privacyRuleId;
            return this;
        }
        public String getPrivacyRuleId() {
            return this.privacyRuleId;
        }

    }

}
