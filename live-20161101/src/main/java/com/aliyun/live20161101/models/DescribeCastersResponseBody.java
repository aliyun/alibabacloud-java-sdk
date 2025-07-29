// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCastersResponseBody extends TeaModel {
    /**
     * <p>The production studios.</p>
     */
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
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
        /**
         * <p>The ID of the production studio. You can specify the ID in a request to query the streaming URLs of the production studio, start the production studio, add a video resource, a layout, a component, or a playlist to the production studio, or query layouts of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        @NameInMap("CasterId")
        public String casterId;

        /**
         * <p>The name of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>liveCaster****</p>
         */
        @NameInMap("CasterName")
        public String casterName;

        /**
         * <p>The resolution in which the production studio plays videos. This parameter is returned if the subscription billing method is used. Valid values:</p>
         * <ul>
         * <li>lp_ld: low definition</li>
         * <li>lp_sd: standard definition</li>
         * <li>lp_hd: high definition</li>
         * <li>lp_ud: ultra high definition.</li>
         * <li>lp_ld_v: low definition (portrait mode)</li>
         * <li>lp_sd_v: standard definition (portrait mode)</li>
         * <li>lp_hd_v: high definition (portrait mode)</li>
         * <li>lp_ud_v: ultra high definition (portrait mode)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lp_ld</p>
         */
        @NameInMap("CasterTemplate")
        public String casterTemplate;

        /**
         * <p>Indicates whether the channel is enabled for the production studio.</p>
         * <ul>
         * <li>0: The channel is disabled.</li>
         * <li>1: The channel is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChannelEnable")
        public Integer channelEnable;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PrePaid: the subscription billing method</li>
         * <li>PostPaid: the pay-as-you-go billing method</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>53200b81-b761-4c10-842a-a0726d97****</p>
         */
        @NameInMap("ClientTokenId")
        public String clientTokenId;

        /**
         * <p>The time when the production studio was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-30 12:02:57.0</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The streaming duration. Format: hh:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>1:02:33</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The time when the production studio expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-30 12:02:57.0</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The time when the production studio was last modified. For example, the time when the production studio was last started, stopped, or modified is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-01T05:08:45Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The type of the production studio. Valid values:</p>
         * <ul>
         * <li>0: playlist mode</li>
         * <li>1: general mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NormType")
        public Integer normType;

        /**
         * <p>The time when the production studio was purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-30 12:02:57.0</p>
         */
        @NameInMap("PurchaseTime")
        public String purchaseTime;

        /**
         * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzw******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The time when the production studio was started. This parameter is returned if the production studio is in the streaming status.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-30 18:02:57.0</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the production studio. Valid values:</p>
         * <ul>
         * <li>0: idle</li>
         * <li>1: streaming</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tags.</p>
         */
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
