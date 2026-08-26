// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetShowListBackgroundRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId value returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, navigate to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studios</strong> &gt; <strong>Cloud Production Studio</strong> to view the production studio name.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the production studio list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The video-on-demand material ID.</p>
     * <blockquote>
     * <p>Specify either this parameter or ResourceUrl.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The material type. Valid values:</p>
     * <ul>
     * <li><p>LIVE: live streaming material. Supports live streaming materials and third-party URLs.</p>
     * </li>
     * <li><p>VOD: video-on-demand material. Supports video-on-demand materials and third-party URLs.</p>
     * </li>
     * <li><p>PIC: image material. Supports video-on-demand materials and third-party URLs.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Specify one of the three values or leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VOD</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The URL of the external material.</p>
     */
    @NameInMap("ResourceUrl")
    public String resourceUrl;

    public static SetShowListBackgroundRequest build(java.util.Map<String, ?> map) throws Exception {
        SetShowListBackgroundRequest self = new SetShowListBackgroundRequest();
        return TeaModel.build(map, self);
    }

    public SetShowListBackgroundRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetShowListBackgroundRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public SetShowListBackgroundRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetShowListBackgroundRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetShowListBackgroundRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public SetShowListBackgroundRequest setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }
    public String getResourceUrl() {
        return this.resourceUrl;
    }

}
