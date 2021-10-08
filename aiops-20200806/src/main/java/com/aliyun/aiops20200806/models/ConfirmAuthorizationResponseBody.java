// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ConfirmAuthorizationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Status")
    public String status;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public String data;

    public static ConfirmAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAuthorizationResponseBody self = new ConfirmAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmAuthorizationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ConfirmAuthorizationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ConfirmAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfirmAuthorizationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
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
