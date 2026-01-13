// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ApplyFormalServiceCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("accountName")
    public String accountName;

    @NameInMap("address")
    public String address;

    @NameInMap("applyServiceInfos")
    public java.util.List<java.util.Map<String, ?>> applyServiceInfos;

    @NameInMap("applyType")
    public String applyType;

    @NameInMap("contactName")
    public String contactName;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("phone")
    public String phone;

    @NameInMap("productName")
    public String productName;

    @NameInMap("qps")
    public Integer qps;

    @NameInMap("sceneDesc")
    public String sceneDesc;

    @NameInMap("serviceType")
    public String serviceType;

    public static ApplyFormalServiceCmd build(java.util.Map<String, ?> map) throws Exception {
        ApplyFormalServiceCmd self = new ApplyFormalServiceCmd();
        return TeaModel.build(map, self);
    }

    public ApplyFormalServiceCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ApplyFormalServiceCmd setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ApplyFormalServiceCmd setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ApplyFormalServiceCmd setApplyServiceInfos(java.util.List<java.util.Map<String, ?>> applyServiceInfos) {
        this.applyServiceInfos = applyServiceInfos;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getApplyServiceInfos() {
        return this.applyServiceInfos;
    }

    public ApplyFormalServiceCmd setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public ApplyFormalServiceCmd setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ApplyFormalServiceCmd setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyFormalServiceCmd setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ApplyFormalServiceCmd setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ApplyFormalServiceCmd setQps(Integer qps) {
        this.qps = qps;
        return this;
    }
    public Integer getQps() {
        return this.qps;
    }

    public ApplyFormalServiceCmd setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
        return this;
    }
    public String getSceneDesc() {
        return this.sceneDesc;
    }

    public ApplyFormalServiceCmd setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
