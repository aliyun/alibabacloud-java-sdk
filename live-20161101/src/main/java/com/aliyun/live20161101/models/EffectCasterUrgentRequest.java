// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterUrgentRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you created a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the returned CasterId value.</p>
     * </li>
     * <li><p>If you created a production studio in the ApsaraVideo Live console, go to the <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to obtain the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80787064-1c94-4dc1-85ce-9409960a****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

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
     * <p>The ID of the scene. This parameter is valid only for PGM scenes.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2848039.html">DescribeCasterScenes</a> operation to query the scene ID of the production studio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>242b4e2c-c30f-4442-85ba-2e3e4e3d****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static EffectCasterUrgentRequest build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterUrgentRequest self = new EffectCasterUrgentRequest();
        return TeaModel.build(map, self);
    }

    public EffectCasterUrgentRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public EffectCasterUrgentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EffectCasterUrgentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EffectCasterUrgentRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
