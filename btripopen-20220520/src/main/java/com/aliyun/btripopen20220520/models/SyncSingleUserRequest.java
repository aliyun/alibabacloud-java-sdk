// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class SyncSingleUserRequest extends TeaModel {
    @NameInMap("email")
    public String email;

    @NameInMap("job_no")
    public String jobNo;

    @NameInMap("leave_status")
    public Integer leaveStatus;

    @NameInMap("manager_user_id")
    public String managerUserId;

    @NameInMap("phone")
    public String phone;

    @NameInMap("position")
    public String position;

    @NameInMap("position_level")
    public String positionLevel;

    @NameInMap("real_name_en")
    public String realNameEn;

    @NameInMap("third_depart_id_list")
    public java.util.List<String> thirdDepartIdList;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static SyncSingleUserRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSingleUserRequest self = new SyncSingleUserRequest();
        return TeaModel.build(map, self);
    }

    public SyncSingleUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SyncSingleUserRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public SyncSingleUserRequest setLeaveStatus(Integer leaveStatus) {
        this.leaveStatus = leaveStatus;
        return this;
    }
    public Integer getLeaveStatus() {
        return this.leaveStatus;
    }

    public SyncSingleUserRequest setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
        return this;
    }
    public String getManagerUserId() {
        return this.managerUserId;
    }

    public SyncSingleUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SyncSingleUserRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public SyncSingleUserRequest setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
        return this;
    }
    public String getPositionLevel() {
        return this.positionLevel;
    }

    public SyncSingleUserRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public SyncSingleUserRequest setThirdDepartIdList(java.util.List<String> thirdDepartIdList) {
        this.thirdDepartIdList = thirdDepartIdList;
        return this;
    }
    public java.util.List<String> getThirdDepartIdList() {
        return this.thirdDepartIdList;
    }

    public SyncSingleUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SyncSingleUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
