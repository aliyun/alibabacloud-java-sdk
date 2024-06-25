// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Customers")
    public java.util.List<ImportNumberRequestCustomers> customers;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailReturn")
    public Long failReturn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ImportNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportNumberRequest self = new ImportNumberRequest();
        return TeaModel.build(map, self);
    }

    public ImportNumberRequest setCustomers(java.util.List<ImportNumberRequestCustomers> customers) {
        this.customers = customers;
        return this;
    }
    public java.util.List<ImportNumberRequestCustomers> getCustomers() {
        return this.customers;
    }

    public ImportNumberRequest setFailReturn(Long failReturn) {
        this.failReturn = failReturn;
        return this;
    }
    public Long getFailReturn() {
        return this.failReturn;
    }

    public ImportNumberRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public ImportNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportNumberRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public static class ImportNumberRequestCustomers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://test.com">http://test.com</a></p>
         */
        @NameInMap("ClientUrl")
        public String clientUrl;

        /**
         * <strong>example:</strong>
         * <p>13541251222,18665214444</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("NumberMD5")
        public String numberMD5;

        /**
         * <strong>example:</strong>
         * <p>{&quot;testt&quot;:&quot;123&quot;}</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ImportNumberRequestCustomers build(java.util.Map<String, ?> map) throws Exception {
            ImportNumberRequestCustomers self = new ImportNumberRequestCustomers();
            return TeaModel.build(map, self);
        }

        public ImportNumberRequestCustomers setClientUrl(String clientUrl) {
            this.clientUrl = clientUrl;
            return this;
        }
        public String getClientUrl() {
            return this.clientUrl;
        }

        public ImportNumberRequestCustomers setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ImportNumberRequestCustomers setNumberMD5(String numberMD5) {
            this.numberMD5 = numberMD5;
            return this;
        }
        public String getNumberMD5() {
            return this.numberMD5;
        }

        public ImportNumberRequestCustomers setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ImportNumberRequestCustomers setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
