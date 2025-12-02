// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImages2LibResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddImages2LibResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddImages2LibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImages2LibResponseBody self = new AddImages2LibResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImages2LibResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddImages2LibResponseBody setData(AddImages2LibResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddImages2LibResponseBodyData getData() {
        return this.data;
    }

    public AddImages2LibResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddImages2LibResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AddImages2LibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddImages2LibResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddImages2LibResponseBodyData extends TeaModel {
        /**
         * <p>The id of the uploaded image.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("ImgId")
        public String imgId;

        public static AddImages2LibResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddImages2LibResponseBodyData self = new AddImages2LibResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddImages2LibResponseBodyData setImgId(String imgId) {
            this.imgId = imgId;
            return this;
        }
        public String getImgId() {
            return this.imgId;
        }

    }

}
