// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateImageLibResponseBody extends TeaModel {
    /**
     * <p>The error code, which is consistent with the HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateImageLibResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateImageLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageLibResponseBody self = new CreateImageLibResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageLibResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateImageLibResponseBody setData(CreateImageLibResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateImageLibResponseBodyData getData() {
        return this.data;
    }

    public CreateImageLibResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateImageLibResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateImageLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageLibResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateImageLibResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the custom image library.</p>
         * 
         * <strong>example:</strong>
         * <p>138xxxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        public static CreateImageLibResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateImageLibResponseBodyData self = new CreateImageLibResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateImageLibResponseBodyData setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

    }

}
