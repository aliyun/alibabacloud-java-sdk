// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ReviewRecordResult extends TeaModel {
    @NameInMap("address")
    public String address;

    @NameInMap("applyType")
    public String applyType;

    @NameInMap("contactName")
    public String contactName;

    @NameInMap("phone")
    public String phone;

    @NameInMap("sceneDesc")
    public String sceneDesc;

    @NameInMap("scopes")
    public java.util.List<String> scopes;

    @NameInMap("serviceType")
    public String serviceType;

    public static ReviewRecordResult build(java.util.Map<String, ?> map) throws Exception {
        ReviewRecordResult self = new ReviewRecordResult();
        return TeaModel.build(map, self);
    }

    public ReviewRecordResult setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ReviewRecordResult setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public ReviewRecordResult setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ReviewRecordResult setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ReviewRecordResult setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
        return this;
    }
    public String getSceneDesc() {
        return this.sceneDesc;
    }

    public ReviewRecordResult setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public ReviewRecordResult setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
