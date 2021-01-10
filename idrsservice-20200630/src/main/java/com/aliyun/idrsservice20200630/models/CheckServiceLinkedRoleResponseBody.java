// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CheckServiceLinkedRoleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static CheckServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponseBody self = new CheckServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleResponseBody setData(CheckServiceLinkedRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckServiceLinkedRoleResponseBodyData getData() {
        return this.data;
    }

    public CheckServiceLinkedRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CheckServiceLinkedRoleResponseBodyData extends TeaModel {
        @NameInMap("HasRole")
        public Boolean hasRole;

        public static CheckServiceLinkedRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceLinkedRoleResponseBodyData self = new CheckServiceLinkedRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckServiceLinkedRoleResponseBodyData setHasRole(Boolean hasRole) {
            this.hasRole = hasRole;
            return this;
        }
        public Boolean getHasRole() {
            return this.hasRole;
        }

    }

}
