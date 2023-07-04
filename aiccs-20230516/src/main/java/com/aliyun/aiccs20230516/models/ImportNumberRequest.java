// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberRequest extends TeaModel {
    @NameInMap("Customers")
    public java.util.List<ImportNumberRequestCustomers> customers;

    @NameInMap("FailReturn")
    public Long failReturn;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
        @NameInMap("ClientUrl")
        public String clientUrl;

        @NameInMap("Number")
        public String number;

        @NameInMap("NumberMD5")
        public String numberMD5;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

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
