// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListBindDmAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBindDmAccountResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>xxx-xx**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListBindDmAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindDmAccountResponseBody self = new ListBindDmAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindDmAccountResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListBindDmAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBindDmAccountResponseBody setData(java.util.List<ListBindDmAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBindDmAccountResponseBodyData> getData() {
        return this.data;
    }

    public ListBindDmAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBindDmAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBindDmAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBindDmAccountResponseBodyDataExtendAttr extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xx@xx.com">xx@xx.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>batch</p>
         */
        @NameInMap("SendType")
        public String sendType;

        public static ListBindDmAccountResponseBodyDataExtendAttr build(java.util.Map<String, ?> map) throws Exception {
            ListBindDmAccountResponseBodyDataExtendAttr self = new ListBindDmAccountResponseBodyDataExtendAttr();
            return TeaModel.build(map, self);
        }

        public ListBindDmAccountResponseBodyDataExtendAttr setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListBindDmAccountResponseBodyDataExtendAttr setSendType(String sendType) {
            this.sendType = sendType;
            return this;
        }
        public String getSendType() {
            return this.sendType;
        }

    }

    public static class ListBindDmAccountResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xx@xx.com">xx@xx.com</a></p>
         */
        @NameInMap("AccountCode")
        public String accountCode;

        @NameInMap("ExtendAttr")
        public ListBindDmAccountResponseBodyDataExtendAttr extendAttr;

        /**
         * <strong>example:</strong>
         * <p>cams-*</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ins</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static ListBindDmAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBindDmAccountResponseBodyData self = new ListBindDmAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBindDmAccountResponseBodyData setAccountCode(String accountCode) {
            this.accountCode = accountCode;
            return this;
        }
        public String getAccountCode() {
            return this.accountCode;
        }

        public ListBindDmAccountResponseBodyData setExtendAttr(ListBindDmAccountResponseBodyDataExtendAttr extendAttr) {
            this.extendAttr = extendAttr;
            return this;
        }
        public ListBindDmAccountResponseBodyDataExtendAttr getExtendAttr() {
            return this.extendAttr;
        }

        public ListBindDmAccountResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListBindDmAccountResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
