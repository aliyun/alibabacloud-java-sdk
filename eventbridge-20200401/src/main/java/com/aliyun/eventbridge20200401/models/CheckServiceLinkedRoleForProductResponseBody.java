// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForProductResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CheckServiceLinkedRoleForProductResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckServiceLinkedRoleForProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForProductResponseBody self = new CheckServiceLinkedRoleForProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckServiceLinkedRoleForProductResponseBody setData(CheckServiceLinkedRoleForProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckServiceLinkedRoleForProductResponseBodyData getData() {
        return this.data;
    }

    public CheckServiceLinkedRoleForProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckServiceLinkedRoleForProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleForProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckServiceLinkedRoleForProductResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the service-linked role exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckPass")
        public Boolean checkPass;

        /**
         * <p>The name of the service-linked role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForEventBridgeConnectVPC</p>
         */
        @NameInMap("StsRoleName")
        public String stsRoleName;

        public static CheckServiceLinkedRoleForProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceLinkedRoleForProductResponseBodyData self = new CheckServiceLinkedRoleForProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckServiceLinkedRoleForProductResponseBodyData setCheckPass(Boolean checkPass) {
            this.checkPass = checkPass;
            return this;
        }
        public Boolean getCheckPass() {
            return this.checkPass;
        }

        public CheckServiceLinkedRoleForProductResponseBodyData setStsRoleName(String stsRoleName) {
            this.stsRoleName = stsRoleName;
            return this;
        }
        public String getStsRoleName() {
            return this.stsRoleName;
        }

    }

}
