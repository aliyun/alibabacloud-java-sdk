// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageDiagnoseResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetImageDiagnoseResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetImageDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageDiagnoseResponseBody self = new GetImageDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageDiagnoseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetImageDiagnoseResponseBody setData(GetImageDiagnoseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageDiagnoseResponseBodyData getData() {
        return this.data;
    }

    public GetImageDiagnoseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetImageDiagnoseResponseBodyData extends TeaModel {
        @NameInMap("Language")
        public String language;

        public static GetImageDiagnoseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageDiagnoseResponseBodyData self = new GetImageDiagnoseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageDiagnoseResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

}
