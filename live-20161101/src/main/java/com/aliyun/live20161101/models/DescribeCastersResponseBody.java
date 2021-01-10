// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCastersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("CasterList")
    public DescribeCastersResponseBodyCasterList casterList;

    public static DescribeCastersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCastersResponseBody self = new DescribeCastersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCastersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCastersResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCastersResponseBody setCasterList(DescribeCastersResponseBodyCasterList casterList) {
        this.casterList = casterList;
        return this;
    }
    public DescribeCastersResponseBodyCasterList getCasterList() {
        return this.casterList;
    }

    public static class DescribeCastersResponseBodyCasterListCaster extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("PurchaseTime")
        public String purchaseTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CasterTemplate")
        public String casterTemplate;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CasterName")
        public String casterName;

        @NameInMap("NormType")
        public Integer normType;

        @NameInMap("CasterId")
        public String casterId;

        @NameInMap("ChannelEnable")
        public Integer channelEnable;

        public static DescribeCastersResponseBodyCasterListCaster build(java.util.Map<String, ?> map) throws Exception {
            DescribeCastersResponseBodyCasterListCaster self = new DescribeCastersResponseBodyCasterListCaster();
            return TeaModel.build(map, self);
        }

        public DescribeCastersResponseBodyCasterListCaster setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCastersResponseBodyCasterListCaster setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCastersResponseBodyCasterListCaster setPurchaseTime(String purchaseTime) {
            this.purchaseTime = purchaseTime;
            return this;
        }
        public String getPurchaseTime() {
            return this.purchaseTime;
        }

        public DescribeCastersResponseBodyCasterListCaster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeCastersResponseBodyCasterListCaster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCastersResponseBodyCasterListCaster setCasterTemplate(String casterTemplate) {
            this.casterTemplate = casterTemplate;
            return this;
        }
        public String getCasterTemplate() {
            return this.casterTemplate;
        }

        public DescribeCastersResponseBodyCasterListCaster setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeCastersResponseBodyCasterListCaster setCasterName(String casterName) {
            this.casterName = casterName;
            return this;
        }
        public String getCasterName() {
            return this.casterName;
        }

        public DescribeCastersResponseBodyCasterListCaster setNormType(Integer normType) {
            this.normType = normType;
            return this;
        }
        public Integer getNormType() {
            return this.normType;
        }

        public DescribeCastersResponseBodyCasterListCaster setCasterId(String casterId) {
            this.casterId = casterId;
            return this;
        }
        public String getCasterId() {
            return this.casterId;
        }

        public DescribeCastersResponseBodyCasterListCaster setChannelEnable(Integer channelEnable) {
            this.channelEnable = channelEnable;
            return this;
        }
        public Integer getChannelEnable() {
            return this.channelEnable;
        }

    }

    public static class DescribeCastersResponseBodyCasterList extends TeaModel {
        @NameInMap("Caster")
        public java.util.List<DescribeCastersResponseBodyCasterListCaster> caster;

        public static DescribeCastersResponseBodyCasterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCastersResponseBodyCasterList self = new DescribeCastersResponseBodyCasterList();
            return TeaModel.build(map, self);
        }

        public DescribeCastersResponseBodyCasterList setCaster(java.util.List<DescribeCastersResponseBodyCasterListCaster> caster) {
            this.caster = caster;
            return this;
        }
        public java.util.List<DescribeCastersResponseBodyCasterListCaster> getCaster() {
            return this.caster;
        }

    }

}
