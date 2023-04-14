// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupUserSaveShrinkRequest extends TeaModel {
    @NameInMap("job_no")
    public String jobNo;

    @NameInMap("leave_status")
    public Integer leaveStatus;

    @NameInMap("phone")
    public String phone;

    @NameInMap("real_name_en")
    public String realNameEn;

    @NameInMap("sub_corp_id_list")
    public String subCorpIdListShrink;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static GroupUserSaveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupUserSaveShrinkRequest self = new GroupUserSaveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GroupUserSaveShrinkRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public GroupUserSaveShrinkRequest setLeaveStatus(Integer leaveStatus) {
        this.leaveStatus = leaveStatus;
        return this;
    }
    public Integer getLeaveStatus() {
        return this.leaveStatus;
    }

    public GroupUserSaveShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GroupUserSaveShrinkRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public GroupUserSaveShrinkRequest setSubCorpIdListShrink(String subCorpIdListShrink) {
        this.subCorpIdListShrink = subCorpIdListShrink;
        return this;
    }
    public String getSubCorpIdListShrink() {
        return this.subCorpIdListShrink;
    }

    public GroupUserSaveShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GroupUserSaveShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
