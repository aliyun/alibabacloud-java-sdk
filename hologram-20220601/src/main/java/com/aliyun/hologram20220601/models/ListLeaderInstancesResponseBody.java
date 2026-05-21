// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListLeaderInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Internal server error.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("InstanceList")
    public java.util.List<ListLeaderInstancesResponseBodyInstanceList> instanceList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5600196E-78E2-50F2-B2A1-C44D3B665438</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListLeaderInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLeaderInstancesResponseBody self = new ListLeaderInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLeaderInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLeaderInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLeaderInstancesResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLeaderInstancesResponseBody setInstanceList(java.util.List<ListLeaderInstancesResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<ListLeaderInstancesResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public ListLeaderInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLeaderInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListLeaderInstancesResponseBodyInstanceListTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListLeaderInstancesResponseBodyInstanceListTags build(java.util.Map<String, ?> map) throws Exception {
            ListLeaderInstancesResponseBodyInstanceListTags self = new ListLeaderInstancesResponseBodyInstanceListTags();
            return TeaModel.build(map, self);
        }

        public ListLeaderInstancesResponseBodyInstanceListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLeaderInstancesResponseBodyInstanceListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLeaderInstancesResponseBodyInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BindingCode")
        public String bindingCode;

        /**
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>hologram_combo_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2022-07-25T02:15:35Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>2022-07-25T02:15:35Z</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <strong>example:</strong>
         * <p>hgpostcn-cn-tl32vsdir00h</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>user_defined_name</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Tags")
        public java.util.List<ListLeaderInstancesResponseBodyInstanceListTags> tags;

        public static ListLeaderInstancesResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListLeaderInstancesResponseBodyInstanceList self = new ListLeaderInstancesResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public ListLeaderInstancesResponseBodyInstanceList setBindingCode(String bindingCode) {
            this.bindingCode = bindingCode;
            return this;
        }
        public String getBindingCode() {
            return this.bindingCode;
        }

        public ListLeaderInstancesResponseBodyInstanceList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListLeaderInstancesResponseBodyInstanceList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListLeaderInstancesResponseBodyInstanceList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListLeaderInstancesResponseBodyInstanceList setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public ListLeaderInstancesResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListLeaderInstancesResponseBodyInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListLeaderInstancesResponseBodyInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListLeaderInstancesResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListLeaderInstancesResponseBodyInstanceList setTags(java.util.List<ListLeaderInstancesResponseBodyInstanceListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListLeaderInstancesResponseBodyInstanceListTags> getTags() {
            return this.tags;
        }

    }

}
