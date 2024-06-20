// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetUploadAudioDataParamsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUploadAudioDataParamsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>03C67DAD-EB26-41D8-949D-9B0C470FB716</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUploadAudioDataParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadAudioDataParamsResponseBody self = new GetUploadAudioDataParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadAudioDataParamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUploadAudioDataParamsResponseBody setData(GetUploadAudioDataParamsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUploadAudioDataParamsResponseBodyData getData() {
        return this.data;
    }

    public GetUploadAudioDataParamsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUploadAudioDataParamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUploadAudioDataParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUploadAudioDataParamsResponseBodyData extends TeaModel {
        @NameInMap("ParamsStr")
        public String paramsStr;

        public static GetUploadAudioDataParamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUploadAudioDataParamsResponseBodyData self = new GetUploadAudioDataParamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUploadAudioDataParamsResponseBodyData setParamsStr(String paramsStr) {
            this.paramsStr = paramsStr;
            return this;
        }
        public String getParamsStr() {
            return this.paramsStr;
        }

    }

}
