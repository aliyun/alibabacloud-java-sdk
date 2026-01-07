// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactEditResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnterpriseContactEditResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>516C2364-18B7-5BAC-9288-AAEA85EEA351</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseContactEditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactEditResponseBody self = new EnterpriseContactEditResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactEditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseContactEditResponseBody setData(EnterpriseContactEditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnterpriseContactEditResponseBodyData getData() {
        return this.data;
    }

    public EnterpriseContactEditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseContactEditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseContactEditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseContactEditResponseBodyDataErrorList extends TeaModel {
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

        public static EnterpriseContactEditResponseBodyDataErrorList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseContactEditResponseBodyDataErrorList self = new EnterpriseContactEditResponseBodyDataErrorList();
            return TeaModel.build(map, self);
        }

        public EnterpriseContactEditResponseBodyDataErrorList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public EnterpriseContactEditResponseBodyDataErrorList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public EnterpriseContactEditResponseBodyDataErrorList setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class EnterpriseContactEditResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("ErrorList")
        public java.util.List<EnterpriseContactEditResponseBodyDataErrorList> errorList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Result")
        public Boolean result;

        public static EnterpriseContactEditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseContactEditResponseBodyData self = new EnterpriseContactEditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseContactEditResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public EnterpriseContactEditResponseBodyData setErrorList(java.util.List<EnterpriseContactEditResponseBodyDataErrorList> errorList) {
            this.errorList = errorList;
            return this;
        }
        public java.util.List<EnterpriseContactEditResponseBodyDataErrorList> getErrorList() {
            return this.errorList;
        }

        public EnterpriseContactEditResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
