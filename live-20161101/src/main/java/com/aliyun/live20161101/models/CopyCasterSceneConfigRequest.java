// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterSceneConfigRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value that is returned in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, go to the <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page. The ID of the production studio is in the <strong>Instance ID/Name</strong> column.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the list on the Cloud Production Studio page of the ApsaraVideo Live console is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the source scene. The scene must be a PVW scene.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1a361f4-bee3-436d-ae6e-d38e6943****</p>
     */
    @NameInMap("FromSceneId")
    public String fromSceneId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the destination scene. The scene must be a PGM scene.</p>
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
