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

    public static class IsvUserSaveRequestUserListCertList extends TeaModel {
        @NameInMap("cert_expired_time")
        public String certExpiredTime;

        @NameInMap("cert_nation")
        public String certNation;

        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("nationality")
        public String nationality;

        public static IsvUserSaveRequestUserListCertList build(java.util.Map<String, ?> map) throws Exception {
            IsvUserSaveRequestUserListCertList self = new IsvUserSaveRequestUserListCertList();
            return TeaModel.build(map, self);
        }

        public IsvUserSaveRequestUserListCertList setCertExpiredTime(String certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }
        public String getCertExpiredTime() {
            return this.certExpiredTime;
        }

        public IsvUserSaveRequestUserListCertList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public IsvUserSaveRequestUserListCertList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IsvUserSaveRequestUserListCertList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IsvUserSaveRequestUserListCertList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

    }

    public static class IsvUserSaveRequestUserList extends TeaModel {
        @NameInMap("base_city_code")
        public String baseCityCode;

        @NameInMap("birthday")
        public String birthday;

        @NameInMap("cert_list")
        public java.util.List<IsvUserSaveRequestUserListCertList> certList;

        @NameInMap("depart_id")
        public Long departId;

        @NameInMap("email")
        public String email;

        @NameInMap("gender")
        public String gender;

        @NameInMap("is_admin")
        public Boolean isAdmin;

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

        public IsvUserSaveRequestUserList setBaseCityCode(String baseCityCode) {
            this.baseCityCode = baseCityCode;
            return this;
        }
        public String getBaseCityCode() {
            return this.baseCityCode;
        }

        public IsvUserSaveRequestUserList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public IsvUserSaveRequestUserList setCertList(java.util.List<IsvUserSaveRequestUserListCertList> certList) {
            this.certList = certList;
            return this;
        }
        public java.util.List<IsvUserSaveRequestUserListCertList> getCertList() {
            return this.certList;
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

        public IsvUserSaveRequestUserList setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public IsvUserSaveRequestUserList setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
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

        public IsvUserSaveRequestUserList setManagerUserId(String managerUserId) {
            this.managerUserId = managerUserId;
            return this;
        }
        public String getManagerUserId() {
            return this.managerUserId;
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
