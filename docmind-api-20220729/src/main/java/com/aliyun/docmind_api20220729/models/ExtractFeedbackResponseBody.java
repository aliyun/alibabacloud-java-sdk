// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class ExtractFeedbackResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExtractFeedbackResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ExtractFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractFeedbackResponseBody self = new ExtractFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractFeedbackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExtractFeedbackResponseBody setData(ExtractFeedbackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtractFeedbackResponseBodyData getData() {
        return this.data;
    }

    public ExtractFeedbackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExtractFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExtractFeedbackResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static ExtractFeedbackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtractFeedbackResponseBodyData self = new ExtractFeedbackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtractFeedbackResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
