// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DeleteImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DeleteImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageResponseBody self = new DeleteImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteImageResponseBody setData(DeleteImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteImageResponseBodyData getData() {
        return this.data;
    }

    public DeleteImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteImageResponseBodyData extends TeaModel {
        @NameInMap("PicNames")
        public java.util.List<String> picNames;

        public static DeleteImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteImageResponseBodyData self = new DeleteImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteImageResponseBodyData setPicNames(java.util.List<String> picNames) {
            this.picNames = picNames;
            return this;
        }
        public java.util.List<String> getPicNames() {
            return this.picNames;
        }

    }

}
