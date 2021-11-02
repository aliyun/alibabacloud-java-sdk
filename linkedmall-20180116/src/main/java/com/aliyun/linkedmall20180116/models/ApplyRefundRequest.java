// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ApplyRefundRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("ApplyReasonTextId")
    public Long applyReasonTextId;

    @NameInMap("ApplyRefundCount")
    public Integer applyRefundCount;

    @NameInMap("ApplyRefundFee")
    public Long applyRefundFee;

    @NameInMap("BizClaimType")
    public Integer bizClaimType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizUid")
    public String bizUid;

    @NameInMap("GoodsStatus")
    public Integer goodsStatus;

    @NameInMap("LeaveMessage")
    public String leaveMessage;

    @NameInMap("LeavePictureList")
    public java.util.List<ApplyRefundRequestLeavePictureList> leavePictureList;

    @NameInMap("SubLmOrderId")
    public String subLmOrderId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static ApplyRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundRequest self = new ApplyRefundRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRefundRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public ApplyRefundRequest setApplyReasonTextId(Long applyReasonTextId) {
        this.applyReasonTextId = applyReasonTextId;
        return this;
    }
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    public ApplyRefundRequest setApplyRefundCount(Integer applyRefundCount) {
        this.applyRefundCount = applyRefundCount;
        return this;
    }
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    public ApplyRefundRequest setApplyRefundFee(Long applyRefundFee) {
        this.applyRefundFee = applyRefundFee;
        return this;
    }
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
    }

    public ApplyRefundRequest setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public ApplyRefundRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ApplyRefundRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public ApplyRefundRequest setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public ApplyRefundRequest setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
        return this;
    }
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    public ApplyRefundRequest setLeavePictureList(java.util.List<ApplyRefundRequestLeavePictureList> leavePictureList) {
        this.leavePictureList = leavePictureList;
        return this;
    }
    public java.util.List<ApplyRefundRequestLeavePictureList> getLeavePictureList() {
        return this.leavePictureList;
    }

    public ApplyRefundRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public ApplyRefundRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public ApplyRefundRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static class ApplyRefundRequestLeavePictureList extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Picture")
        public String picture;

        public static ApplyRefundRequestLeavePictureList build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefundRequestLeavePictureList self = new ApplyRefundRequestLeavePictureList();
            return TeaModel.build(map, self);
        }

        public ApplyRefundRequestLeavePictureList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ApplyRefundRequestLeavePictureList setPicture(String picture) {
            this.picture = picture;
            return this;
        }
        public String getPicture() {
            return this.picture;
        }

    }

}
