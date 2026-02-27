// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertContactResponseBody body;

    public static DeleteAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactResponse self = new DeleteAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertContactResponse setBody(DeleteAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertContactResponseBody getBody() {
        return this.body;
    }

    public static class DeleteAlertContactResponseBodyResult extends TeaModel {
        @NameInMap("status")
        public Boolean status;

        @NameInMap("msg")
        public String msg;

        @NameInMap("contact_id")
        public String contactId;

        public static DeleteAlertContactResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlertContactResponseBodyResult self = new DeleteAlertContactResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteAlertContactResponseBodyResult setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DeleteAlertContactResponseBodyResult setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DeleteAlertContactResponseBodyResult setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

    }

    public static class DeleteAlertContactResponseBody extends TeaModel {
        @NameInMap("result")
        public java.util.List<DeleteAlertContactResponseBodyResult> result;

        public static DeleteAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlertContactResponseBody self = new DeleteAlertContactResponseBody();
            return TeaModel.build(map, self);
        }

        public DeleteAlertContactResponseBody setResult(java.util.List<DeleteAlertContactResponseBodyResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DeleteAlertContactResponseBodyResult> getResult() {
            return this.result;
        }

    }

}
