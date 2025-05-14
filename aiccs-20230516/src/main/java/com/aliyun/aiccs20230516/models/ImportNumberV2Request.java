// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberV2Request extends TeaModel {
    @NameInMap("Customers")
    public java.util.List<ImportNumberV2RequestCustomers> customers;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailReturn")
    public Long failReturn;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ImportNumberV2Request build(java.util.Map<String, ?> map) throws Exception {
        ImportNumberV2Request self = new ImportNumberV2Request();
        return TeaModel.build(map, self);
    }

    public ImportNumberV2Request setCustomers(java.util.List<ImportNumberV2RequestCustomers> customers) {
        this.customers = customers;
        return this;
    }
    public java.util.List<ImportNumberV2RequestCustomers> getCustomers() {
        return this.customers;
    }

    public ImportNumberV2Request setFailReturn(Long failReturn) {
        this.failReturn = failReturn;
        return this;
    }
    public Long getFailReturn() {
        return this.failReturn;
    }

    public ImportNumberV2Request setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public ImportNumberV2Request setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportNumberV2Request setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportNumberV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportNumberV2Request setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public static class ImportNumberV2RequestCustomers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ClientUrl")
        public String clientUrl;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("NumberMD5")
        public String numberMD5;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ImportNumberV2RequestCustomers build(java.util.Map<String, ?> map) throws Exception {
            ImportNumberV2RequestCustomers self = new ImportNumberV2RequestCustomers();
            return TeaModel.build(map, self);
        }

        public ImportNumberV2RequestCustomers setClientUrl(String clientUrl) {
            this.clientUrl = clientUrl;
            return this;
        }
        public String getClientUrl() {
            return this.clientUrl;
        }

        public ImportNumberV2RequestCustomers setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ImportNumberV2RequestCustomers setNumberMD5(String numberMD5) {
            this.numberMD5 = numberMD5;
            return this;
        }
        public String getNumberMD5() {
            return this.numberMD5;
        }

        public ImportNumberV2RequestCustomers setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ImportNumberV2RequestCustomers setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
