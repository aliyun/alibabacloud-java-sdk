// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class UpdateTaskCustomerRequest extends TeaModel {
    /**
     * <p>外呼客户</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Customers")
    public java.util.List<UpdateTaskCustomerRequestCustomers> customers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>任务ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static UpdateTaskCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskCustomerRequest self = new UpdateTaskCustomerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskCustomerRequest setCustomers(java.util.List<UpdateTaskCustomerRequestCustomers> customers) {
        this.customers = customers;
        return this;
    }
    public java.util.List<UpdateTaskCustomerRequestCustomers> getCustomers() {
        return this.customers;
    }

    public UpdateTaskCustomerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTaskCustomerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTaskCustomerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTaskCustomerRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public static class UpdateTaskCustomerRequestCustomers extends TeaModel {
        /**
         * <p>是否取消外呼 0否，1是</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Cancel")
        public Long cancel;

        /**
         * <p>电话号码</p>
         * 
         * <strong>example:</strong>
         * <p>13661109390</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>需根据具体任务参数要求传输</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;:&quot;234&quot;}</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>用户自定义标签</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static UpdateTaskCustomerRequestCustomers build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskCustomerRequestCustomers self = new UpdateTaskCustomerRequestCustomers();
            return TeaModel.build(map, self);
        }

        public UpdateTaskCustomerRequestCustomers setCancel(Long cancel) {
            this.cancel = cancel;
            return this;
        }
        public Long getCancel() {
            return this.cancel;
        }

        public UpdateTaskCustomerRequestCustomers setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public UpdateTaskCustomerRequestCustomers setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public UpdateTaskCustomerRequestCustomers setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
