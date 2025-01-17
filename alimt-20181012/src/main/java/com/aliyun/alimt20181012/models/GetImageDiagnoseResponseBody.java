// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageDiagnoseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetImageDiagnoseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DC2DCCC9-C3DF-4F59-8D8E-78185729F16D</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
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
