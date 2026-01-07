// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactAddResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AccountContactAddResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E4E192DF-798B-58AE-B8BF-EBC15E2E85F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AccountContactAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccountContactAddResponseBody self = new AccountContactAddResponseBody();
        return TeaModel.build(map, self);
    }

    public AccountContactAddResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AccountContactAddResponseBody setData(AccountContactAddResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AccountContactAddResponseBodyData getData() {
        return this.data;
    }

    public AccountContactAddResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AccountContactAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccountContactAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AccountContactAddResponseBodyDataErrorList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MOBILE_CODE_ILLEGAL</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>MOBILE_CODE_ILLEGAL</p>
         */
        @NameInMap("ErrorDesc")
        public String errorDesc;

        /**
         * <strong>example:</strong>
         * <p>MOBILE_VERIFY_CODE</p>
         */
        @NameInMap("Item")
        public String item;

        public static AccountContactAddResponseBodyDataErrorList build(java.util.Map<String, ?> map) throws Exception {
            AccountContactAddResponseBodyDataErrorList self = new AccountContactAddResponseBodyDataErrorList();
            return TeaModel.build(map, self);
        }

        public AccountContactAddResponseBodyDataErrorList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AccountContactAddResponseBodyDataErrorList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public AccountContactAddResponseBodyDataErrorList setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class AccountContactAddResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("ErrorList")
        public java.util.List<AccountContactAddResponseBodyDataErrorList> errorList;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Result")
        public Boolean result;

        public static AccountContactAddResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AccountContactAddResponseBodyData self = new AccountContactAddResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AccountContactAddResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public AccountContactAddResponseBodyData setErrorList(java.util.List<AccountContactAddResponseBodyDataErrorList> errorList) {
            this.errorList = errorList;
            return this;
        }
        public java.util.List<AccountContactAddResponseBodyDataErrorList> getErrorList() {
            return this.errorList;
        }

        public AccountContactAddResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
