// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateUserInfoRequest extends TeaModel {
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

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("CertificateNo")
    public String certificateNo;

    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("CertificateType")
    public String certificateType;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("OverwriteImg")
    public Boolean overwriteImg;

    public static UpdateUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserInfoRequest self = new UpdateUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateUserInfoRequest setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    public UpdateUserInfoRequest setBirthday(Long birthday) {
        this.birthday = birthday;
        return this;
    }
    public Long getBirthday() {
        return this.birthday;
    }

    public UpdateUserInfoRequest setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
    public String getImageBase64() {
        return this.imageBase64;
    }

    public UpdateUserInfoRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateUserInfoRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public UpdateUserInfoRequest setSex(Integer sex) {
        this.sex = sex;
        return this;
    }
    public Integer getSex() {
        return this.sex;
    }

    public UpdateUserInfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateUserInfoRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public UpdateUserInfoRequest setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }
    public String getCertificateNo() {
        return this.certificateNo;
    }

    public UpdateUserInfoRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public UpdateUserInfoRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public UpdateUserInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateUserInfoRequest setOverwriteImg(Boolean overwriteImg) {
        this.overwriteImg = overwriteImg;
        return this;
    }
    public Boolean getOverwriteImg() {
        return this.overwriteImg;
    }

}
