// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDeductionInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    // 渠道模型
    @NameInMap("PayChannelModels")
    public java.util.List<GetDeductionInfoResponseBodyPayChannelModels> payChannelModels;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    public static GetDeductionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeductionInfoResponseBody self = new GetDeductionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeductionInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetDeductionInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeductionInfoResponseBody setPayChannelModels(java.util.List<GetDeductionInfoResponseBodyPayChannelModels> payChannelModels) {
        this.payChannelModels = payChannelModels;
        return this;
    }
    public java.util.List<GetDeductionInfoResponseBodyPayChannelModels> getPayChannelModels() {
        return this.payChannelModels;
    }

    public GetDeductionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeductionInfoResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public static class GetDeductionInfoResponseBodyPayChannelModels extends TeaModel {
        @NameInMap("AgreementNo")
        public String agreementNo;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Deletion")
        public Integer deletion;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InvalidTime")
        public String invalidTime;

        @NameInMap("IsSign")
        public Integer isSign;

        @NameInMap("PayChannel")
        public String payChannel;

        @NameInMap("PayUserId")
        public String payUserId;

        @NameInMap("SignModifyTime")
        public String signModifyTime;

        @NameInMap("SignTime")
        public String signTime;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TransactionType")
        public String transactionType;

        @NameInMap("ValidTime")
        public String validTime;

        public static GetDeductionInfoResponseBodyPayChannelModels build(java.util.Map<String, ?> map) throws Exception {
            GetDeductionInfoResponseBodyPayChannelModels self = new GetDeductionInfoResponseBodyPayChannelModels();
            return TeaModel.build(map, self);
        }

        public GetDeductionInfoResponseBodyPayChannelModels setAgreementNo(String agreementNo) {
            this.agreementNo = agreementNo;
            return this;
        }
        public String getAgreementNo() {
            return this.agreementNo;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setDeletion(Integer deletion) {
            this.deletion = deletion;
            return this;
        }
        public Integer getDeletion() {
            return this.deletion;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setInvalidTime(String invalidTime) {
            this.invalidTime = invalidTime;
            return this;
        }
        public String getInvalidTime() {
            return this.invalidTime;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setIsSign(Integer isSign) {
            this.isSign = isSign;
            return this;
        }
        public Integer getIsSign() {
            return this.isSign;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setPayChannel(String payChannel) {
            this.payChannel = payChannel;
            return this;
        }
        public String getPayChannel() {
            return this.payChannel;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setPayUserId(String payUserId) {
            this.payUserId = payUserId;
            return this;
        }
        public String getPayUserId() {
            return this.payUserId;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setSignModifyTime(String signModifyTime) {
            this.signModifyTime = signModifyTime;
            return this;
        }
        public String getSignModifyTime() {
            return this.signModifyTime;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setSignTime(String signTime) {
            this.signTime = signTime;
            return this;
        }
        public String getSignTime() {
            return this.signTime;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public String getTransactionType() {
            return this.transactionType;
        }

        public GetDeductionInfoResponseBodyPayChannelModels setValidTime(String validTime) {
            this.validTime = validTime;
            return this;
        }
        public String getValidTime() {
            return this.validTime;
        }

    }

}
