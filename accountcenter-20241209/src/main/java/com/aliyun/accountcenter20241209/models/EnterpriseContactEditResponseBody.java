// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactEditResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data result of the current category statistics.</p>
     */
    @NameInMap("Data")
    public EnterpriseContactEditResponseBodyData data;

    /**
     * <p>The result message of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>516C2364-18B7-5BAC-9288-AAEA85EEA351</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>MOBILE_CODE_ILLEGAL</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The description of the diagnosed issue.</p>
         * 
         * <strong>example:</strong>
         * <p>Mobile Code Illegal</p>
         */
        @NameInMap("ErrorDesc")
        public String errorDesc;

        /**
         * <p>The field with an exception.</p>
         * 
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
         * <p>The contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The error message reported by the backup server.</p>
         */
        @NameInMap("ErrorList")
        public java.util.List<EnterpriseContactEditResponseBodyDataErrorList> errorList;

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
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
