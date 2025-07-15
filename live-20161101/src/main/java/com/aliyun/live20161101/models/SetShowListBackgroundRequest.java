// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetShowListBackgroundRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the material in ApsaraVideo VOD.</p>
     * <blockquote>
     * <p> Specify either this parameter or the ResourceUrl parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>LIVE: live stream. You can add a live stream from ApsaraVideo Live or by using a third-party URL.</li>
     * <li>VOD: on-demand video. You can add an on-demand video from ApsaraVideo VOD or by using a third-party URL.</li>
     * <li>PIC: image. You can add an image from ApsaraVideo VOD or by using a third-party URL.</li>
     * </ul>
     * <blockquote>
     * <p> Set this parameter to one of the preceding values, or leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VOD</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The URL of the third-party material.</p>
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
