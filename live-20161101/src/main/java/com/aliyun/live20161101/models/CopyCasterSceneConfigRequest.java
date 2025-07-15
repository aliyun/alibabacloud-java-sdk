// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterSceneConfigRequest extends TeaModel {
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
     * <p>The ID of the source scene, which must be a PVW scene.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1a361f4-bee3-436d-ae6e-d38e6943****</p>
     */
    @NameInMap("FromSceneId")
    public String fromSceneId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the destination scene, which must be a PGM scene.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
     */
    @NameInMap("ToSceneId")
    public String toSceneId;

    public static CopyCasterSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterSceneConfigRequest self = new CopyCasterSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyCasterSceneConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public CopyCasterSceneConfigRequest setFromSceneId(String fromSceneId) {
        this.fromSceneId = fromSceneId;
        return this;
    }
    public String getFromSceneId() {
        return this.fromSceneId;
    }

    public CopyCasterSceneConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyCasterSceneConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CopyCasterSceneConfigRequest setToSceneId(String toSceneId) {
        this.toSceneId = toSceneId;
        return this;
    }
    public String getToSceneId() {
        return this.toSceneId;
    }

}
