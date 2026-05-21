// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListFollowerInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
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
    public java.util.List<ListFollowerInstancesResponseBodyInstanceList> instanceList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D3AE84AB-0873-5FC7-A4C4-8CF869D2FA70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListFollowerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFollowerInstancesResponseBody self = new ListFollowerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFollowerInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFollowerInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFollowerInstancesResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFollowerInstancesResponseBody setInstanceList(java.util.List<ListFollowerInstancesResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<ListFollowerInstancesResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public ListFollowerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFollowerInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListFollowerInstancesResponseBodyInstanceListTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFollowerInstancesResponseBodyInstanceListTags build(java.util.Map<String, ?> map) throws Exception {
            ListFollowerInstancesResponseBodyInstanceListTags self = new ListFollowerInstancesResponseBodyInstanceListTags();
            return TeaModel.build(map, self);
        }

        public ListFollowerInstancesResponseBodyInstanceListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFollowerInstancesResponseBodyInstanceListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFollowerInstancesResponseBodyInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>hologram_postpay_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2022-12-16T02:24:05Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>2023-05-04T16:00:00.000Z</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <strong>example:</strong>
         * <p>hgpostcn-cn-aaab9ad2d8fb</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test_instance</p>
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
        public java.util.List<ListFollowerInstancesResponseBodyInstanceListTags> tags;

        public static ListFollowerInstancesResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListFollowerInstancesResponseBodyInstanceList self = new ListFollowerInstancesResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public ListFollowerInstancesResponseBodyInstanceList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListFollowerInstancesResponseBodyInstanceList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListFollowerInstancesResponseBodyInstanceList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListFollowerInstancesResponseBodyInstanceList setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public ListFollowerInstancesResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListFollowerInstancesResponseBodyInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListFollowerInstancesResponseBodyInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListFollowerInstancesResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListFollowerInstancesResponseBodyInstanceList setTags(java.util.List<ListFollowerInstancesResponseBodyInstanceListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListFollowerInstancesResponseBodyInstanceListTags> getTags() {
            return this.tags;
        }

    }

}
