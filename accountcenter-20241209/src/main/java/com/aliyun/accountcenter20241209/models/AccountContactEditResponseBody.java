// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactEditResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AccountContactEditResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
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

    public static AccountContactEditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccountContactEditResponseBody self = new AccountContactEditResponseBody();
        return TeaModel.build(map, self);
    }

    public AccountContactEditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AccountContactEditResponseBody setData(AccountContactEditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AccountContactEditResponseBodyData getData() {
        return this.data;
    }

    public AccountContactEditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AccountContactEditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccountContactEditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AccountContactEditResponseBodyDataErrorList extends TeaModel {
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

        public static AccountContactEditResponseBodyDataErrorList build(java.util.Map<String, ?> map) throws Exception {
            AccountContactEditResponseBodyDataErrorList self = new AccountContactEditResponseBodyDataErrorList();
            return TeaModel.build(map, self);
        }

        public AccountContactEditResponseBodyDataErrorList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AccountContactEditResponseBodyDataErrorList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public AccountContactEditResponseBodyDataErrorList setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class AccountContactEditResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("ErrorList")
        public java.util.List<AccountContactEditResponseBodyDataErrorList> errorList;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;TeamDesktops\&quot;: [], \&quot;PrivateDesktops\&quot;: [], \&quot;UnallocatedTeamDesktops\&quot;: []}</p>
         */
        @NameInMap("Result")
        public Boolean result;

        public static AccountContactEditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AccountContactEditResponseBodyData self = new AccountContactEditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AccountContactEditResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public AccountContactEditResponseBodyData setErrorList(java.util.List<AccountContactEditResponseBodyDataErrorList> errorList) {
            this.errorList = errorList;
            return this;
        }
        public java.util.List<AccountContactEditResponseBodyDataErrorList> getErrorList() {
            return this.errorList;
        }

        public AccountContactEditResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
