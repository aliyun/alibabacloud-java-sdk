// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ExportHttpApiResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The API definition.</p>
     */
    @NameInMap("data")
    public ExportHttpApiResponseBodyData data;

    /**
     * <p>The response message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4BACB05C-3FE2-588F-9148-700C5C026B74</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ExportHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportHttpApiResponseBody self = new ExportHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportHttpApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportHttpApiResponseBody setData(ExportHttpApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportHttpApiResponseBodyData getData() {
        return this.data;
    }

    public ExportHttpApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExportHttpApiResponseBodyData extends TeaModel {
        /**
         * <p>The Base64-encoded API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>b3BlbmFwaTogMy4wLjAKaW5mbzoKICAgIHRpdGxlOiBkZW1vCiAgICBkZXNjcmlwdGlvbjogdGhpc2lzZGVtbwogICAgdmVyc2lvbjogIiIKcGF0aHM6CiAgICAvdXNlci97dXNlcklkfToKICAgICAgICBnZXQ6CiAgICAgICAgICAgIHN1bW1hcnk6IOiOt+WPlueUqOaIt+S/oeaBrwogICAgICAgICAgICBkZXNjcmlwdGlvbjog6I635Y+W55So5oi35L+h5oGvCiAgICAgICAgICAgIG9wZXJhdGlvbklkOiBHZXRVc2VySW5mbwogICAgICAgICAgICByZXNwb25zZXM6CiAgICAgICAgICAgICAgICAiMjAwIjoKICAgICAgICAgICAgICAgICAgICBkZXNjcmlwdGlvbjog5oiQ5YqfCiAgICAgICAgICAgICAgICAgICAgY29udGVudDoKICAgICAgICAgICAgICAgICAgICAgICAgYXBwbGljYXRpb24vanNvbjtjaGFyc2V0PXV0Zi04OgogICAgICAgICAgICAgICAgICAgICAgICAgICAgc2NoZW1hOiBudWxsCnNlcnZlcnM6CiAgICAtIHVybDogaHR0cDovL2FwaS5leGFtcGxlLmNvbS92MQo=</p>
         */
        @NameInMap("specContentBase64")
        public String specContentBase64;

        public static ExportHttpApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportHttpApiResponseBodyData self = new ExportHttpApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportHttpApiResponseBodyData setSpecContentBase64(String specContentBase64) {
            this.specContentBase64 = specContentBase64;
            return this;
        }
        public String getSpecContentBase64() {
            return this.specContentBase64;
        }

    }

}
