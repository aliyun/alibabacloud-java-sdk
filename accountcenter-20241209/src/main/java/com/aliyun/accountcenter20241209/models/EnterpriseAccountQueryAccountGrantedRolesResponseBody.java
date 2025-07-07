// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountQueryAccountGrantedRolesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<EnterpriseAccountQueryAccountGrantedRolesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseAccountQueryAccountGrantedRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountQueryAccountGrantedRolesResponseBody self = new EnterpriseAccountQueryAccountGrantedRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountQueryAccountGrantedRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseAccountQueryAccountGrantedRolesResponseBody setData(java.util.List<EnterpriseAccountQueryAccountGrantedRolesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EnterpriseAccountQueryAccountGrantedRolesResponseBodyData> getData() {
        return this.data;
    }

    public EnterpriseAccountQueryAccountGrantedRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseAccountQueryAccountGrantedRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountQueryAccountGrantedRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseAccountQueryAccountGrantedRolesResponseBodyData extends TeaModel {
        @NameInMap("BizRoleCode")
        public String bizRoleCode;

        @NameInMap("BizRoleName")
        public String bizRoleName;

        public static EnterpriseAccountQueryAccountGrantedRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseAccountQueryAccountGrantedRolesResponseBodyData self = new EnterpriseAccountQueryAccountGrantedRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseAccountQueryAccountGrantedRolesResponseBodyData setBizRoleCode(String bizRoleCode) {
            this.bizRoleCode = bizRoleCode;
            return this;
        }
        public String getBizRoleCode() {
            return this.bizRoleCode;
        }

        public EnterpriseAccountQueryAccountGrantedRolesResponseBodyData setBizRoleName(String bizRoleName) {
            this.bizRoleName = bizRoleName;
            return this;
        }
        public String getBizRoleName() {
            return this.bizRoleName;
        }

    }

}
