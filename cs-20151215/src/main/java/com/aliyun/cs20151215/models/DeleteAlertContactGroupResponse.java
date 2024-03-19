// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<DeleteAlertContactGroupResponseBody> body;

    public static DeleteAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactGroupResponse self = new DeleteAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertContactGroupResponse setBody(java.util.List<DeleteAlertContactGroupResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DeleteAlertContactGroupResponseBody> getBody() {
        return this.body;
    }

    public static class DeleteAlertContactGroupResponseBody extends TeaModel {
        @NameInMap("status")
        public Boolean status;

        @NameInMap("msg")
        public String msg;

        @NameInMap("contact_group_id")
        public String contactGroupId;

        public static DeleteAlertContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlertContactGroupResponseBody self = new DeleteAlertContactGroupResponseBody();
            return TeaModel.build(map, self);
        }

        public DeleteAlertContactGroupResponseBody setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DeleteAlertContactGroupResponseBody setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DeleteAlertContactGroupResponseBody setContactGroupId(String contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }
        public String getContactGroupId() {
            return this.contactGroupId;
        }

    }

}
