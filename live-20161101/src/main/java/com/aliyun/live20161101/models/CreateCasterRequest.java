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
     * <p>The preset resolution of the production studio. If the subscription billing method is used, this parameter supports the following valid values:</p>
     * <ul>
     * <li><strong>lp_ld</strong>: low definition</li>
     * <li><strong>lp_sd</strong>: standard definition</li>
     * <li><strong>lp_hd</strong>: high definition</li>
     * <li><strong>lp_ud</strong>: ultra high definition</li>
     * <li><strong>lp_ld_v</strong>: low definition (portrait mode)</li>
     * <li><strong>lp_sd_v</strong>: standard definition (portrait mode)</li>
     * <li><strong>lp_hd_v</strong>: high definition (portrait mode)</li>
     * <li><strong>lp_ud_v</strong>: ultra high definition (portrait mode)</li>
     * </ul>
     * <blockquote>
     * <p> If the pay-as-you-go billing method is used, you must call the <a href="https://help.aliyun.com/document_detail/60271.html">SetCasterConfig</a> operation to specify the resolution.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lp_sd</p>
     */
    @NameInMap("CasterTemplate")
    public String casterTemplate;

    /**
     * <p>The billing method. Only the pay-as-you-go billing method is supported.**** Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription. This billing method is not yet supported.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
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
     * <p>You can specify a custom value for this parameter, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The expiration time of the production studio. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> This parameter is valid only if you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-08-22T12:10:10Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The type of the production studio. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: general mode</li>
     * <li><strong>6</strong>: playlist mode (for carousel playback)</li>
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
     * <p>The time when the production studio was purchased. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> This parameter is valid only if you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-08-20T12:10:10Z</p>
     */
    @NameInMap("PurchaseTime")
    public String purchaseTime;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">Resource groups</a>.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
