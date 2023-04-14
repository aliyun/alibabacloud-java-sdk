// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupUserSaveRequest extends TeaModel {
    @NameInMap("job_no")
    public String jobNo;

    @NameInMap("leave_status")
    public Integer leaveStatus;

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

    public GroupUserSaveRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public GroupUserSaveRequest setLeaveStatus(Integer leaveStatus) {
        this.leaveStatus = leaveStatus;
        return this;
    }
    public Integer getLeaveStatus() {
        return this.leaveStatus;
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

    public static class GroupUserSaveRequestSubCorpIdList extends TeaModel {
        @NameInMap("depart_ids")
        public java.util.List<String> departIds;

        @NameInMap("manager_user_id")
        public String managerUserId;

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

        public GroupUserSaveRequestSubCorpIdList setManagerUserId(String managerUserId) {
            this.managerUserId = managerUserId;
            return this;
        }
        public String getManagerUserId() {
            return this.managerUserId;
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
