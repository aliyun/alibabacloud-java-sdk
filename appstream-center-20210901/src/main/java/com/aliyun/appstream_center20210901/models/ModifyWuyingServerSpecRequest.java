// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyWuyingServerSpecRequest extends TeaModel {
    /**
     * <p>The status of the workstation after the specification change is complete.</p>
     * <ul>
     * <li><code>stopped</code>: Shuts down the workstation after the specification change is complete.</li>
     * </ul>
     * <p>This option is applicable to Enterprise Edition or container workstations that support this setting.</p>
     * 
     * <strong>example:</strong>
     * <p>stopped</p>
     */
    @NameInMap("AfterStatus")
    public String afterStatus;

    /**
     * <p>The product type of the target workstation, which must be consistent with the actual type of the resource. For Enterprise Edition workstations, use <code>WuyingServer</code>. If this parameter is omitted, <code>WuyingServer</code> is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The ID of the promotion, which is used to identify a promotional event or coupon.</p>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The ID of the target workstation specification. This parameter is required when you call the operation. Select a specification that is available in the region where the workstation is located and compatible with existing resources.</p>
     * <p><strong>Limits:</strong> Conversion between CPU specifications and GPU specifications is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.proworkstation_flagship_elite_ne.96c384g.192g4x</p>
     */
    @NameInMap("ServerInstanceType")
    public String serverInstanceType;

    /**
     * <p>The ID of the workstation whose specifications you want to modify. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0bw2f11****dial</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static ModifyWuyingServerSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWuyingServerSpecRequest self = new ModifyWuyingServerSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWuyingServerSpecRequest setAfterStatus(String afterStatus) {
        this.afterStatus = afterStatus;
        return this;
    }
    public String getAfterStatus() {
        return this.afterStatus;
    }

    public ModifyWuyingServerSpecRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyWuyingServerSpecRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ModifyWuyingServerSpecRequest setServerInstanceType(String serverInstanceType) {
        this.serverInstanceType = serverInstanceType;
        return this;
    }
    public String getServerInstanceType() {
        return this.serverInstanceType;
    }

    public ModifyWuyingServerSpecRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
