// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImages2LibResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AddImages2LibResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

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
