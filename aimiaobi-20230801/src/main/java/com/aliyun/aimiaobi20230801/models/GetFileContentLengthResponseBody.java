// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetFileContentLengthResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetFileContentLengthResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DD656AF9-0839-521A-A3D2-F320009F9C87</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFileContentLengthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileContentLengthResponseBody self = new GetFileContentLengthResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileContentLengthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFileContentLengthResponseBody setData(GetFileContentLengthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileContentLengthResponseBodyData getData() {
        return this.data;
    }

    public GetFileContentLengthResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileContentLengthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFileContentLengthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileContentLengthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileContentLengthResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("WordNum")
        public Long wordNum;

        public static GetFileContentLengthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileContentLengthResponseBodyData self = new GetFileContentLengthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileContentLengthResponseBodyData setWordNum(Long wordNum) {
            this.wordNum = wordNum;
            return this;
        }
        public Long getWordNum() {
            return this.wordNum;
        }

    }

}
