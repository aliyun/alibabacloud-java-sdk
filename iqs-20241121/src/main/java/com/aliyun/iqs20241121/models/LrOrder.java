// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class LrOrder extends TeaModel {
    @NameInMap("accountCredentials")
    public java.util.List<AccountCredentialDTO> accountCredentials;

    @NameInMap("aliUid")
    public String aliUid;

    @NameInMap("commodityCode")
    public String commodityCode;

    @NameInMap("commodityId")
    public String commodityId;

    @NameInMap("commoditySpec")
    public String commoditySpec;

    @NameInMap("customerName")
    public String customerName;

    @NameInMap("eventTime")
    public String eventTime;

    @NameInMap("expirationTime")
    public String expirationTime;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("orderCategory")
    public String orderCategory;

    @NameInMap("orderId")
    public Long orderId;

    @NameInMap("qps")
    public Integer qps;

    @NameInMap("status")
    public String status;

    public static LrOrder build(java.util.Map<String, ?> map) throws Exception {
        LrOrder self = new LrOrder();
        return TeaModel.build(map, self);
    }

    public LrOrder setAccountCredentials(java.util.List<AccountCredentialDTO> accountCredentials) {
        this.accountCredentials = accountCredentials;
        return this;
    }
    public java.util.List<AccountCredentialDTO> getAccountCredentials() {
        return this.accountCredentials;
    }

    public LrOrder setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public LrOrder setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public LrOrder setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }
    public String getCommodityId() {
        return this.commodityId;
    }

    public LrOrder setCommoditySpec(String commoditySpec) {
        this.commoditySpec = commoditySpec;
        return this;
    }
    public String getCommoditySpec() {
        return this.commoditySpec;
    }

    public LrOrder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public LrOrder setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public LrOrder setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public String getExpirationTime() {
        return this.expirationTime;
    }

    public LrOrder setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public LrOrder setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public LrOrder setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LrOrder setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
        return this;
    }
    public String getOrderCategory() {
        return this.orderCategory;
    }

    public LrOrder setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public LrOrder setQps(Integer qps) {
        this.qps = qps;
        return this;
    }
    public Integer getQps() {
        return this.qps;
    }

    public LrOrder setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
