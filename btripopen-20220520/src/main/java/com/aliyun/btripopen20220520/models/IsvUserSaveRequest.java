// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IsvUserSaveRequest extends TeaModel {
    @NameInMap("user_list")
    public java.util.List<IsvUserSaveRequestUserList> userList;

    public static IsvUserSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        IsvUserSaveRequest self = new IsvUserSaveRequest();
        return TeaModel.build(map, self);
    }

    public IsvUserSaveRequest setUserList(java.util.List<IsvUserSaveRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<IsvUserSaveRequestUserList> getUserList() {
        return this.userList;
    }

    public static class IsvUserSaveRequestUserList extends TeaModel {
        @NameInMap("depart_id")
        public Long departId;

        @NameInMap("email")
        public String email;

        @NameInMap("job_no")
        public String jobNo;

        @NameInMap("leave_status")
        public Integer leaveStatus;

        @NameInMap("phone")
        public String phone;

        @NameInMap("position")
        public String position;

        @NameInMap("position_level")
        public String positionLevel;

        @NameInMap("real_name_en")
        public String realNameEn;

        @NameInMap("third_depart_id")
        public String thirdDepartId;

        @NameInMap("third_depart_id_list")
        public java.util.List<String> thirdDepartIdList;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static IsvUserSaveRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            IsvUserSaveRequestUserList self = new IsvUserSaveRequestUserList();
            return TeaModel.build(map, self);
        }

        public IsvUserSaveRequestUserList setDepartId(Long departId) {
            this.departId = departId;
            return this;
        }
        public Long getDepartId() {
            return this.departId;
        }

        public IsvUserSaveRequestUserList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public IsvUserSaveRequestUserList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IsvUserSaveRequestUserList setLeaveStatus(Integer leaveStatus) {
            this.leaveStatus = leaveStatus;
            return this;
        }
        public Integer getLeaveStatus() {
            return this.leaveStatus;
        }

        public IsvUserSaveRequestUserList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public IsvUserSaveRequestUserList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public IsvUserSaveRequestUserList setPositionLevel(String positionLevel) {
            this.positionLevel = positionLevel;
            return this;
        }
        public String getPositionLevel() {
            return this.positionLevel;
        }

        public IsvUserSaveRequestUserList setRealNameEn(String realNameEn) {
            this.realNameEn = realNameEn;
            return this;
        }
        public String getRealNameEn() {
            return this.realNameEn;
        }

        public IsvUserSaveRequestUserList setThirdDepartId(String thirdDepartId) {
            this.thirdDepartId = thirdDepartId;
            return this;
        }
        public String getThirdDepartId() {
            return this.thirdDepartId;
        }

        public IsvUserSaveRequestUserList setThirdDepartIdList(java.util.List<String> thirdDepartIdList) {
            this.thirdDepartIdList = thirdDepartIdList;
            return this;
        }
        public java.util.List<String> getThirdDepartIdList() {
            return this.thirdDepartIdList;
        }

        public IsvUserSaveRequestUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IsvUserSaveRequestUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
