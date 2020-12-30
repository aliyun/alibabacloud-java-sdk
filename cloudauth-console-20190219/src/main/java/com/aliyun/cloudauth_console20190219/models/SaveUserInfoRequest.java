// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveUserInfoRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("UserGroupId")
    public Long userGroupId;

    @NameInMap("Birthday")
    public Long birthday;

    @NameInMap("ImageBase64")
    public String imageBase64;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Sex")
    public Integer sex;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("CertificateNo")
    public String certificateNo;

    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("CertificateType")
    public String certificateType;

    @NameInMap("ProjectId")
    public String projectId;

    public static SaveUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveUserInfoRequest self = new SaveUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public SaveUserInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public SaveUserInfoRequest setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    public SaveUserInfoRequest setBirthday(Long birthday) {
        this.birthday = birthday;
        return this;
    }
    public Long getBirthday() {
        return this.birthday;
    }

    public SaveUserInfoRequest setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
    public String getImageBase64() {
        return this.imageBase64;
    }

    public SaveUserInfoRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public SaveUserInfoRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SaveUserInfoRequest setSex(Integer sex) {
        this.sex = sex;
        return this;
    }
    public Integer getSex() {
        return this.sex;
    }

    public SaveUserInfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SaveUserInfoRequest setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }
    public String getCertificateNo() {
        return this.certificateNo;
    }

    public SaveUserInfoRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public SaveUserInfoRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public SaveUserInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
