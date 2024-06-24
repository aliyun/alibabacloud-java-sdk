// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class SyncSingleUserRequest extends TeaModel {
    @NameInMap("email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("job_no")
    public String jobNo;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("leave_status")
    public Integer leaveStatus;

    /**
     * <strong>example:</strong>
     * <p>72369</p>
     */
    @NameInMap("manager_user_id")
    public String managerUserId;

    /**
     * <strong>example:</strong>
     * <p>16392740204</p>
     */
    @NameInMap("phone")
    public String phone;

    @NameInMap("position")
    public String position;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("position_level")
    public String positionLevel;

    /**
     * <strong>example:</strong>
     * <p>ce/shi</p>
     */
    @NameInMap("real_name_en")
    public String realNameEn;

    @NameInMap("third_depart_id_list")
    public java.util.List<String> thirdDepartIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>573263</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     */
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
