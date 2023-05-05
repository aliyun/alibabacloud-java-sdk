// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyApproveRequest extends TeaModel {
    @NameInMap("apply_id")
    public String applyId;

    @NameInMap("note")
    public String note;

    @NameInMap("operate_time")
    public String operateTime;

    @NameInMap("status")
    public Integer status;

    /**
     * <p>子企业Id</p>
     */
    @NameInMap("sub_corp_id")
    public String subCorpId;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static ApplyApproveRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyApproveRequest self = new ApplyApproveRequest();
        return TeaModel.build(map, self);
    }

    public ApplyApproveRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public ApplyApproveRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public ApplyApproveRequest setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

    public ApplyApproveRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ApplyApproveRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public ApplyApproveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyApproveRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
