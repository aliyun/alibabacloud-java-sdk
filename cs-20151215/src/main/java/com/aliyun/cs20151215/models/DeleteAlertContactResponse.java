// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<DeleteAlertContactResponseBody> body;

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

    public DeleteAlertContactResponse setBody(java.util.List<DeleteAlertContactResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DeleteAlertContactResponseBody> getBody() {
        return this.body;
    }

    public static class DeleteAlertContactResponseBody extends TeaModel {
        @NameInMap("status")
        public Boolean status;

        @NameInMap("msg")
        public String msg;

        @NameInMap("contact_id")
        public String contactId;

        public static DeleteAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlertContactResponseBody self = new DeleteAlertContactResponseBody();
            return TeaModel.build(map, self);
        }

        public DeleteAlertContactResponseBody setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DeleteAlertContactResponseBody setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DeleteAlertContactResponseBody setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

    }

}
