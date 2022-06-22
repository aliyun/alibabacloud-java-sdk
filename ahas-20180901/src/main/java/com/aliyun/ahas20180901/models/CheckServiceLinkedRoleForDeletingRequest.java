// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DeletionTaskId")
    public String deletionTaskId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SPIRegionId")
    public String SPIRegionId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static CheckServiceLinkedRoleForDeletingRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForDeletingRequest self = new CheckServiceLinkedRoleForDeletingRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForDeletingRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CheckServiceLinkedRoleForDeletingRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CheckServiceLinkedRoleForDeletingRequest setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
        return this;
    }
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    public CheckServiceLinkedRoleForDeletingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckServiceLinkedRoleForDeletingRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CheckServiceLinkedRoleForDeletingRequest setSPIRegionId(String SPIRegionId) {
        this.SPIRegionId = SPIRegionId;
        return this;
    }
    public String getSPIRegionId() {
        return this.SPIRegionId;
    }

    public CheckServiceLinkedRoleForDeletingRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
