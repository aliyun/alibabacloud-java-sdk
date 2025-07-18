// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class OpenStructSaseUser extends TeaModel {
    @NameInMap("CreateTimeUnix")
    public Long createTimeUnix;

    @NameInMap("CustomFields")
    public java.util.List<IdpCustomField> customFields;

    @NameInMap("Departments")
    public java.util.List<OpenStructSaseDepartment> departments;

    @NameInMap("Email")
    public String email;

    @NameInMap("IdpConfigId")
    public String idpConfigId;

    @NameInMap("LeaveTimeUnix")
    public Long leaveTimeUnix;

    @NameInMap("LoginTimeUnix")
    public Long loginTimeUnix;

    @NameInMap("SaseUserId")
    public String saseUserId;

    @NameInMap("SaseUserStatus")
    public String saseUserStatus;

    @NameInMap("SyncTimeUnix")
    public Long syncTimeUnix;

    @NameInMap("Telephone")
    public String telephone;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdateTimeUnix")
    public Long updateTimeUnix;

    @NameInMap("Username")
    public String username;

    @NameInMap("WorkStatus")
    public String workStatus;

    public static OpenStructSaseUser build(java.util.Map<String, ?> map) throws Exception {
        OpenStructSaseUser self = new OpenStructSaseUser();
        return TeaModel.build(map, self);
    }

    public OpenStructSaseUser setCreateTimeUnix(Long createTimeUnix) {
        this.createTimeUnix = createTimeUnix;
        return this;
    }
    public Long getCreateTimeUnix() {
        return this.createTimeUnix;
    }

    public OpenStructSaseUser setCustomFields(java.util.List<IdpCustomField> customFields) {
        this.customFields = customFields;
        return this;
    }
    public java.util.List<IdpCustomField> getCustomFields() {
        return this.customFields;
    }

    public OpenStructSaseUser setDepartments(java.util.List<OpenStructSaseDepartment> departments) {
        this.departments = departments;
        return this;
    }
    public java.util.List<OpenStructSaseDepartment> getDepartments() {
        return this.departments;
    }

    public OpenStructSaseUser setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public OpenStructSaseUser setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public OpenStructSaseUser setLeaveTimeUnix(Long leaveTimeUnix) {
        this.leaveTimeUnix = leaveTimeUnix;
        return this;
    }
    public Long getLeaveTimeUnix() {
        return this.leaveTimeUnix;
    }

    public OpenStructSaseUser setLoginTimeUnix(Long loginTimeUnix) {
        this.loginTimeUnix = loginTimeUnix;
        return this;
    }
    public Long getLoginTimeUnix() {
        return this.loginTimeUnix;
    }

    public OpenStructSaseUser setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public OpenStructSaseUser setSaseUserStatus(String saseUserStatus) {
        this.saseUserStatus = saseUserStatus;
        return this;
    }
    public String getSaseUserStatus() {
        return this.saseUserStatus;
    }

    public OpenStructSaseUser setSyncTimeUnix(Long syncTimeUnix) {
        this.syncTimeUnix = syncTimeUnix;
        return this;
    }
    public Long getSyncTimeUnix() {
        return this.syncTimeUnix;
    }

    public OpenStructSaseUser setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public OpenStructSaseUser setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public OpenStructSaseUser setUpdateTimeUnix(Long updateTimeUnix) {
        this.updateTimeUnix = updateTimeUnix;
        return this;
    }
    public Long getUpdateTimeUnix() {
        return this.updateTimeUnix;
    }

    public OpenStructSaseUser setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public OpenStructSaseUser setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
        return this;
    }
    public String getWorkStatus() {
        return this.workStatus;
    }

}
