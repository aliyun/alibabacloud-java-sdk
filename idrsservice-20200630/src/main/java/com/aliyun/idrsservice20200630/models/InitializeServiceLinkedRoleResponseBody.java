// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class InitializeServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InitializeServiceLinkedRoleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static InitializeServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeServiceLinkedRoleResponseBody self = new InitializeServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeServiceLinkedRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitializeServiceLinkedRoleResponseBody setData(InitializeServiceLinkedRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitializeServiceLinkedRoleResponseBodyData getData() {
        return this.data;
    }

    public InitializeServiceLinkedRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitializeServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InitializeServiceLinkedRoleResponseBodyData extends TeaModel {
        @NameInMap("CreateSuccess")
        public Boolean createSuccess;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static InitializeServiceLinkedRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitializeServiceLinkedRoleResponseBodyData self = new InitializeServiceLinkedRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitializeServiceLinkedRoleResponseBodyData setCreateSuccess(Boolean createSuccess) {
            this.createSuccess = createSuccess;
            return this;
        }
        public Boolean getCreateSuccess() {
            return this.createSuccess;
        }

        public InitializeServiceLinkedRoleResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

}
