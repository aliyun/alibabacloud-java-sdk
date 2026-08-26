// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCasterRequest extends TeaModel {
    /**
     * <p>The name of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>liveCaster****</p>
     */
    @NameInMap("CasterName")
    public String casterName;

    /**
     * <p>The preset resolution of the production studio. This parameter is available only for the subscription billing method. Valid values:</p>
     * <ul>
     * <li><p><strong>lp_ld</strong>: low definition.</p>
     * </li>
     * <li><p><strong>lp_sd</strong>: standard definition.</p>
     * </li>
     * <li><p><strong>lp_hd</strong>: high definition.</p>
     * </li>
     * <li><p><strong>lp_ud</strong>: ultra-high definition.</p>
     * </li>
     * <li><p><strong>lp_ld_v</strong>: vertical low definition.</p>
     * </li>
     * <li><p><strong>lp_sd_v</strong>: vertical standard definition.</p>
     * </li>
     * <li><p><strong>lp_hd_v</strong>: vertical high definition.</p>
     * </li>
     * <li><p><strong>lp_ud_v</strong>: vertical ultra-high definition.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you use the pay-as-you-go billing method, call the <a href="https://help.aliyun.com/document_detail/60271.html">SetCasterConfig</a> operation to set the resolution.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lp_sd</p>
     */
    @NameInMap("CasterTemplate")
    public String casterTemplate;

    /**
     * <p>The billing method. Only <strong>PostPaid</strong> is supported. Valid values:</p>
     * <ul>
     * <li><p><strong>PrePaid</strong>: subscription (not supported).</p>
     * </li>
     * <li><p><strong>PostPaid</strong>: pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a token on your client and ensure that the token is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The expiration time of the production studio. The time is in the \<code>yyyy-MM-ddTHH:mm:ssZ\\</code> format and is displayed in UTC.</p>
     * <blockquote>
     * <p>This parameter is available only if you set <strong>ChargeType</strong> to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-08-22T12:10:10Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The type of the production studio. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p><strong>1</strong>: Standard.</p>
     * </li>
     * <li><p><strong>3</strong>: Lightweight Carousel.</p>
     * </li>
     * <li><p><strong>4</strong>: Virtual Studio.</p>
     * </li>
     * <li><p><strong>6</strong>: Carousel (New Playlist).</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p><strong>1</strong>: Standard.</p>
     * </li>
     * <li><p><strong>6</strong>: Carousel (New Playlist).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NormType")
    public Integer normType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The purchase time of the production studio. The time is in the \<code>yyyy-MM-ddTHH:mm:ssZ\\</code> format and is displayed in UTC.</p>
     * <blockquote>
     * <p>This parameter is available only if you set <strong>ChargeType</strong> to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-08-20T12:10:10Z</p>
     */
    @NameInMap("PurchaseTime")
    public String purchaseTime;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. For more information, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzw******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCasterRequestTag> tag;

    public static CreateCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasterRequest self = new CreateCasterRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasterRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public CreateCasterRequest setCasterTemplate(String casterTemplate) {
        this.casterTemplate = casterTemplate;
        return this;
    }
    public String getCasterTemplate() {
        return this.casterTemplate;
    }

    public CreateCasterRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateCasterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCasterRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateCasterRequest setNormType(Integer normType) {
        this.normType = normType;
        return this;
    }
    public Integer getNormType() {
        return this.normType;
    }

    public CreateCasterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCasterRequest setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
        return this;
    }
    public String getPurchaseTime() {
        return this.purchaseTime;
    }

    public CreateCasterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCasterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCasterRequest setTag(java.util.List<CreateCasterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCasterRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateCasterRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCasterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCasterRequestTag self = new CreateCasterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCasterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCasterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
