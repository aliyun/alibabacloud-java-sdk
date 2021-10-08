// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListConfirmAuthorizationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Status")
    public String status;

    @NameInMap("Message")
    public String message;

    @NameInMap("List")
    public java.util.List<ListConfirmAuthorizationResponseBodyList> list;

    public static ListConfirmAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfirmAuthorizationResponseBody self = new ListConfirmAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfirmAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfirmAuthorizationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListConfirmAuthorizationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListConfirmAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConfirmAuthorizationResponseBody setList(java.util.List<ListConfirmAuthorizationResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListConfirmAuthorizationResponseBodyList> getList() {
        return this.list;
    }

    public static class ListConfirmAuthorizationResponseBodyList extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("uid")
        public Long uid;

        public static ListConfirmAuthorizationResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListConfirmAuthorizationResponseBodyList self = new ListConfirmAuthorizationResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListConfirmAuthorizationResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConfirmAuthorizationResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListConfirmAuthorizationResponseBodyList setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

}
