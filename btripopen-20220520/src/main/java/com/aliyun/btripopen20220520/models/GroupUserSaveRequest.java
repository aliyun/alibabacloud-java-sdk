// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupUserSaveRequest extends TeaModel {
    @NameInMap("base_city_code")
    public String baseCityCode;

    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_list")
    public java.util.List<GroupUserSaveRequestCertList> certList;

    @NameInMap("gender")
    public String gender;

    @NameInMap("job_no")
    public String jobNo;

    @NameInMap("phone")
    public String phone;

    @NameInMap("real_name_en")
    public String realNameEn;

    @NameInMap("sub_corp_id_list")
    public java.util.List<GroupUserSaveRequestSubCorpIdList> subCorpIdList;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static GroupUserSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupUserSaveRequest self = new GroupUserSaveRequest();
        return TeaModel.build(map, self);
    }

    public GroupUserSaveRequest setBaseCityCode(String baseCityCode) {
        this.baseCityCode = baseCityCode;
        return this;
    }
    public String getBaseCityCode() {
        return this.baseCityCode;
    }

    public GroupUserSaveRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public GroupUserSaveRequest setCertList(java.util.List<GroupUserSaveRequestCertList> certList) {
        this.certList = certList;
        return this;
    }
    public java.util.List<GroupUserSaveRequestCertList> getCertList() {
        return this.certList;
    }

    public GroupUserSaveRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public GroupUserSaveRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public GroupUserSaveRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GroupUserSaveRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public GroupUserSaveRequest setSubCorpIdList(java.util.List<GroupUserSaveRequestSubCorpIdList> subCorpIdList) {
        this.subCorpIdList = subCorpIdList;
        return this;
    }
    public java.util.List<GroupUserSaveRequestSubCorpIdList> getSubCorpIdList() {
        return this.subCorpIdList;
    }

    public GroupUserSaveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GroupUserSaveRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class GroupUserSaveRequestCertList extends TeaModel {
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

        public static GroupUserSaveRequestCertList build(java.util.Map<String, ?> map) throws Exception {
            GroupUserSaveRequestCertList self = new GroupUserSaveRequestCertList();
            return TeaModel.build(map, self);
        }

        public GroupUserSaveRequestCertList setCertExpiredTime(String certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }
        public String getCertExpiredTime() {
            return this.certExpiredTime;
        }

        public GroupUserSaveRequestCertList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public GroupUserSaveRequestCertList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public GroupUserSaveRequestCertList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public GroupUserSaveRequestCertList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

    }

    public static class GroupUserSaveRequestSubCorpIdList extends TeaModel {
        @NameInMap("depart_ids")
        public java.util.List<String> departIds;

        @NameInMap("email")
        public String email;

        @NameInMap("leave_status")
        public Integer leaveStatus;

        @NameInMap("manager_user_id")
        public String managerUserId;

        @NameInMap("position_level")
        public String positionLevel;

        @NameInMap("sub_corp_id")
        public String subCorpId;

        public static GroupUserSaveRequestSubCorpIdList build(java.util.Map<String, ?> map) throws Exception {
            GroupUserSaveRequestSubCorpIdList self = new GroupUserSaveRequestSubCorpIdList();
            return TeaModel.build(map, self);
        }

        public GroupUserSaveRequestSubCorpIdList setDepartIds(java.util.List<String> departIds) {
            this.departIds = departIds;
            return this;
        }
        public java.util.List<String> getDepartIds() {
            return this.departIds;
        }

        public GroupUserSaveRequestSubCorpIdList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GroupUserSaveRequestSubCorpIdList setLeaveStatus(Integer leaveStatus) {
            this.leaveStatus = leaveStatus;
            return this;
        }
        public Integer getLeaveStatus() {
            return this.leaveStatus;
        }

        public GroupUserSaveRequestSubCorpIdList setManagerUserId(String managerUserId) {
            this.managerUserId = managerUserId;
            return this;
        }
        public String getManagerUserId() {
            return this.managerUserId;
        }

        public GroupUserSaveRequestSubCorpIdList setPositionLevel(String positionLevel) {
            this.positionLevel = positionLevel;
            return this;
        }
        public String getPositionLevel() {
            return this.positionLevel;
        }

        public GroupUserSaveRequestSubCorpIdList setSubCorpId(String subCorpId) {
            this.subCorpId = subCorpId;
            return this;
        }
        public String getSubCorpId() {
            return this.subCorpId;
        }

    }

}
