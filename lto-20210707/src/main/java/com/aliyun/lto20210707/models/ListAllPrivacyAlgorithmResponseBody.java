// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllPrivacyAlgorithmResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllPrivacyAlgorithmResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllPrivacyAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllPrivacyAlgorithmResponseBody self = new ListAllPrivacyAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllPrivacyAlgorithmResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllPrivacyAlgorithmResponseBody setData(java.util.List<ListAllPrivacyAlgorithmResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllPrivacyAlgorithmResponseBodyData> getData() {
        return this.data;
    }

    public ListAllPrivacyAlgorithmResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllPrivacyAlgorithmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllPrivacyAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllPrivacyAlgorithmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllPrivacyAlgorithmResponseBodyData extends TeaModel {
        @NameInMap("AlgImplList")
        public java.util.List<String> algImplList;

        @NameInMap("AlgType")
        public String algType;

        public static ListAllPrivacyAlgorithmResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllPrivacyAlgorithmResponseBodyData self = new ListAllPrivacyAlgorithmResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllPrivacyAlgorithmResponseBodyData setAlgImplList(java.util.List<String> algImplList) {
            this.algImplList = algImplList;
            return this;
        }
        public java.util.List<String> getAlgImplList() {
            return this.algImplList;
        }

        public ListAllPrivacyAlgorithmResponseBodyData setAlgType(String algType) {
            this.algType = algType;
            return this;
        }
        public String getAlgType() {
            return this.algType;
        }

    }

}
