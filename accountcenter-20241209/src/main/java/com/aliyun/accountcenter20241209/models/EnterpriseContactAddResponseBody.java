// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactAddResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnterpriseContactAddResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>40EA3ECB-2167-5A8E-9327-F7E59E508FA8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseContactAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactAddResponseBody self = new EnterpriseContactAddResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactAddResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseContactAddResponseBody setData(EnterpriseContactAddResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnterpriseContactAddResponseBodyData getData() {
        return this.data;
    }

    public EnterpriseContactAddResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseContactAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseContactAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseContactAddResponseBodyDataErrorList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MOBILE_CODE_ILLEGAL</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>Mobile Code Illegal</p>
         */
        @NameInMap("ErrorDesc")
        public String errorDesc;

        /**
         * <strong>example:</strong>
         * <p>MOBILE_VERIFY_CODE</p>
         */
        @NameInMap("Item")
        public String item;

        public static EnterpriseContactAddResponseBodyDataErrorList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseContactAddResponseBodyDataErrorList self = new EnterpriseContactAddResponseBodyDataErrorList();
            return TeaModel.build(map, self);
        }

        public EnterpriseContactAddResponseBodyDataErrorList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public EnterpriseContactAddResponseBodyDataErrorList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public EnterpriseContactAddResponseBodyDataErrorList setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class EnterpriseContactAddResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("ErrorList")
        public java.util.List<EnterpriseContactAddResponseBodyDataErrorList> errorList;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Result")
        public Boolean result;

        public static EnterpriseContactAddResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseContactAddResponseBodyData self = new EnterpriseContactAddResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseContactAddResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public EnterpriseContactAddResponseBodyData setErrorList(java.util.List<EnterpriseContactAddResponseBodyDataErrorList> errorList) {
            this.errorList = errorList;
            return this;
        }
        public java.util.List<EnterpriseContactAddResponseBodyDataErrorList> getErrorList() {
            return this.errorList;
        }

        public EnterpriseContactAddResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
