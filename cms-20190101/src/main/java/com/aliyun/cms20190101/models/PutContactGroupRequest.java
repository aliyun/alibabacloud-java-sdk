// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("ContactNames")
    public java.util.List<String> contactNames;

    @NameInMap("Describe")
    public String describe;

    @NameInMap("EnableSubscribed")
    public Boolean enableSubscribed;

    public static PutContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        PutContactGroupRequest self = new PutContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public PutContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public PutContactGroupRequest setContactNames(java.util.List<String> contactNames) {
        this.contactNames = contactNames;
        return this;
    }
    public java.util.List<String> getContactNames() {
        return this.contactNames;
    }

    public PutContactGroupRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public PutContactGroupRequest setEnableSubscribed(Boolean enableSubscribed) {
        this.enableSubscribed = enableSubscribed;
        return this;
    }
    public Boolean getEnableSubscribed() {
        return this.enableSubscribed;
    }

}
