// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRegisterAccountResponseBody extends TeaModel {
    @NameInMap("AccountInfo")
    public EnterpriseRegisterAccountResponseBodyAccountInfo accountInfo;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>The operation is not allowed. Channel state (RELEASED) does not meet expectations (ANSWERED).</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BDFCF081-7BCD-52D5-9D82-0F58D96EFD92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseRegisterAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRegisterAccountResponseBody self = new EnterpriseRegisterAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseRegisterAccountResponseBody setAccountInfo(EnterpriseRegisterAccountResponseBodyAccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public EnterpriseRegisterAccountResponseBodyAccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    public EnterpriseRegisterAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseRegisterAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseRegisterAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseRegisterAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseRegisterAccountResponseBodyAccountInfo extends TeaModel {
        @NameInMap("EnterpriseLicenseNo")
        public String enterpriseLicenseNo;

        /**
         * <strong>example:</strong>
         * <p>海南屿可网络科技有限公司</p>
         */
        @NameInMap("EnterpriseName")
        public String enterpriseName;

        /**
         * <strong>example:</strong>
         * <p>195529</p>
         */
        @NameInMap("LoginId")
        public String loginId;

        /**
         * <strong>example:</strong>
         * <p>5190216604405754</p>
         */
        @NameInMap("Pk")
        public String pk;

        public static EnterpriseRegisterAccountResponseBodyAccountInfo build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseRegisterAccountResponseBodyAccountInfo self = new EnterpriseRegisterAccountResponseBodyAccountInfo();
            return TeaModel.build(map, self);
        }

        public EnterpriseRegisterAccountResponseBodyAccountInfo setEnterpriseLicenseNo(String enterpriseLicenseNo) {
            this.enterpriseLicenseNo = enterpriseLicenseNo;
            return this;
        }
        public String getEnterpriseLicenseNo() {
            return this.enterpriseLicenseNo;
        }

        public EnterpriseRegisterAccountResponseBodyAccountInfo setEnterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        public EnterpriseRegisterAccountResponseBodyAccountInfo setLoginId(String loginId) {
            this.loginId = loginId;
            return this;
        }
        public String getLoginId() {
            return this.loginId;
        }

        public EnterpriseRegisterAccountResponseBodyAccountInfo setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
