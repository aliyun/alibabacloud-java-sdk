// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCastersResponseBody extends TeaModel {
    @NameInMap("CasterList")
    public DescribeCastersResponseBodyCasterList casterList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64- af62-20e91b9676b3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of production studios.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeCastersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCastersResponseBody self = new DescribeCastersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCastersResponseBody setCasterList(DescribeCastersResponseBodyCasterList casterList) {
        this.casterList = casterList;
        return this;
    }
    public DescribeCastersResponseBodyCasterList getCasterList() {
        return this.casterList;
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

    public static class DescribeCastersResponseBodyCasterListCasterTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeCastersResponseBodyCasterListCasterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCastersResponseBodyCasterListCasterTagsTag self = new DescribeCastersResponseBodyCasterListCasterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCastersResponseBodyCasterListCasterTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeCastersResponseBodyCasterListCasterTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeCastersResponseBodyCasterListCasterTags extends TeaModel {
        @NameInMap("tag")
        public java.util.List<DescribeCastersResponseBodyCasterListCasterTagsTag> tag;

        public static DescribeCastersResponseBodyCasterListCasterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCastersResponseBodyCasterListCasterTags self = new DescribeCastersResponseBodyCasterListCasterTags();
            return TeaModel.build(map, self);
        }

        public DescribeCastersResponseBodyCasterListCasterTags setTag(java.util.List<DescribeCastersResponseBodyCasterListCasterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCastersResponseBodyCasterListCasterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCastersResponseBodyCasterListCaster extends TeaModel {
        @NameInMap("CasterId")
        public String casterId;

        @NameInMap("CasterName")
        public String casterName;

        @NameInMap("CasterTemplate")
        public String casterTemplate;

        @NameInMap("ChannelEnable")
        public Integer channelEnable;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ClientTokenId")
        public String clientTokenId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("NormType")
        public Integer normType;

        @NameInMap("PurchaseTime")
        public String purchaseTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Tags")
        public DescribeCastersResponseBodyCasterListCasterTags tags;

        public static DescribeCastersResponseBodyCasterListCaster build(java.util.Map<String, ?> map) throws Exception {
            DescribeCastersResponseBodyCasterListCaster self = new DescribeCastersResponseBodyCasterListCaster();
            return TeaModel.build(map, self);
        }

        public DescribeCastersResponseBodyCasterListCaster setCasterId(String casterId) {
            this.casterId = casterId;
            return this;
        }
        public String getCasterId() {
            return this.casterId;
        }

        public DescribeCastersResponseBodyCasterListCaster setCasterName(String casterName) {
            this.casterName = casterName;
            return this;
        }
        public String getCasterName() {
            return this.casterName;
        }

        public DescribeCastersResponseBodyCasterListCaster setCasterTemplate(String casterTemplate) {
            this.casterTemplate = casterTemplate;
            return this;
        }
        public String getCasterTemplate() {
            return this.casterTemplate;
        }

        public DescribeCastersResponseBodyCasterListCaster setChannelEnable(Integer channelEnable) {
            this.channelEnable = channelEnable;
            return this;
        }
        public Integer getChannelEnable() {
            return this.channelEnable;
        }

        public DescribeCastersResponseBodyCasterListCaster setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeCastersResponseBodyCasterListCaster setClientTokenId(String clientTokenId) {
            this.clientTokenId = clientTokenId;
            return this;
        }
        public String getClientTokenId() {
            return this.clientTokenId;
        }

        public DescribeCastersResponseBodyCasterListCaster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCastersResponseBodyCasterListCaster setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribeCastersResponseBodyCasterListCaster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeCastersResponseBodyCasterListCaster setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public DescribeCastersResponseBodyCasterListCaster setNormType(Integer normType) {
            this.normType = normType;
            return this;
        }
        public Integer getNormType() {
            return this.normType;
        }

        public DescribeCastersResponseBodyCasterListCaster setPurchaseTime(String purchaseTime) {
            this.purchaseTime = purchaseTime;
            return this;
        }
        public String getPurchaseTime() {
            return this.purchaseTime;
        }

        public DescribeCastersResponseBodyCasterListCaster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCastersResponseBodyCasterListCaster setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCastersResponseBodyCasterListCaster setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCastersResponseBodyCasterListCaster setTags(DescribeCastersResponseBodyCasterListCasterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCastersResponseBodyCasterListCasterTags getTags() {
            return this.tags;
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
