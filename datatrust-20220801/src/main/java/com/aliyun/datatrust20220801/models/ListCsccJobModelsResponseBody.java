// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobModelsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListCsccJobModelsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccJobModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobModelsResponseBody self = new ListCsccJobModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccJobModelsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccJobModelsResponseBody setData(java.util.List<ListCsccJobModelsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCsccJobModelsResponseBodyData> getData() {
        return this.data;
    }

    public ListCsccJobModelsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccJobModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccJobModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccJobModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccJobModelsResponseBodyData extends TeaModel {
        @NameInMap("ModeName")
        public String modeName;

        @NameInMap("ModeType")
        public Integer modeType;

        public static ListCsccJobModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccJobModelsResponseBodyData self = new ListCsccJobModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccJobModelsResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public ListCsccJobModelsResponseBodyData setModeType(Integer modeType) {
            this.modeType = modeType;
            return this;
        }
        public Integer getModeType() {
            return this.modeType;
        }

    }

}
