// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCastersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("CasterList")
    @Validation(required = true)
    public DescribeCastersResponseCasterList casterList;

    public static DescribeCastersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCastersResponse self = new DescribeCastersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCastersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCastersResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCastersResponse setCasterList(DescribeCastersResponseCasterList casterList) {
        this.casterList = casterList;
        return this;
    }
    public DescribeCastersResponseCasterList getCasterList() {
        return this.casterList;
    }

    public static class DescribeCastersResponseCasterListCaster extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("NormType")
        @Validation(required = true)
        public Integer normType;

        @NameInMap("CasterId")
        @Validation(required = true)
        public String casterId;

        @NameInMap("CasterName")
        @Validation(required = true)
        public String casterName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("PurchaseTime")
        @Validation(required = true)
        public String purchaseTime;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("CasterTemplate")
        @Validation(required = true)
        public String casterTemplate;

        @NameInMap("ChannelEnable")
        @Validation(required = true)
        public Integer channelEnable;

        public static DescribeCastersResponseCasterListCaster build(java.util.Map<String, ?> map) throws Exception {
            DescribeCastersResponseCasterListCaster self = new DescribeCastersResponseCasterListCaster();
            return TeaModel.build(map, self);
        }

        public DescribeCastersResponseCasterListCaster setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCastersResponseCasterListCaster setNormType(Integer normType) {
            this.normType = normType;
            return this;
        }
        public Integer getNormType() {
            return this.normType;
        }

        public DescribeCastersResponseCasterListCaster setCasterId(String casterId) {
            this.casterId = casterId;
            return this;
        }
        public String getCasterId() {
            return this.casterId;
        }

        public DescribeCastersResponseCasterListCaster setCasterName(String casterName) {
            this.casterName = casterName;
            return this;
        }
        public String getCasterName() {
            return this.casterName;
        }

        public DescribeCastersResponseCasterListCaster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCastersResponseCasterListCaster setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCastersResponseCasterListCaster setPurchaseTime(String purchaseTime) {
            this.purchaseTime = purchaseTime;
            return this;
        }
        public String getPurchaseTime() {
            return this.purchaseTime;
        }

        public DescribeCastersResponseCasterListCaster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeCastersResponseCasterListCaster setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeCastersResponseCasterListCaster setCasterTemplate(String casterTemplate) {
            this.casterTemplate = casterTemplate;
            return this;
        }
        public String getCasterTemplate() {
            return this.casterTemplate;
        }

        public DescribeCastersResponseCasterListCaster setChannelEnable(Integer channelEnable) {
            this.channelEnable = channelEnable;
            return this;
        }
        public Integer getChannelEnable() {
            return this.channelEnable;
        }

    }

    public static class DescribeCastersResponseCasterList extends TeaModel {
        @NameInMap("Caster")
        @Validation(required = true)
        public java.util.List<DescribeCastersResponseCasterListCaster> caster;

        public static DescribeCastersResponseCasterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCastersResponseCasterList self = new DescribeCastersResponseCasterList();
            return TeaModel.build(map, self);
        }

        public DescribeCastersResponseCasterList setCaster(java.util.List<DescribeCastersResponseCasterListCaster> caster) {
            this.caster = caster;
            return this;
        }
        public java.util.List<DescribeCastersResponseCasterListCaster> getCaster() {
            return this.caster;
        }

    }

}
