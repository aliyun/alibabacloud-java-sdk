// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterSceneRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <p>If you create a production studio through the <a href="~~69338#doc-api-live-CreateCaster~~" title="Creates a production studio.">CreateCaster</a> interface, check the value of the CasterId parameter in the response.</p>
     * <p>If you create a production studio through the ApsaraVideo Live Console, log in to the console, then check the ID of the production studio through the following path:</p>
     * <p>Production Studios &gt; Production Studio Management</p>
     * <blockquote>
     * <p> The CasterId is reflected in the Name column on the Production Studio Management page.</p>
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
     * <p>The ID of the scene.</p>
     * <p>This operation is available only when the scene is a preview scene. For more information about the scene types, see <a href="https://help.aliyun.com/document_detail/60262.html">Query the scenes of production studios</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>242b4e2c-c30f-4442-85ba-2e3e4e3d****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static StopCasterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCasterSceneRequest self = new StopCasterSceneRequest();
        return TeaModel.build(map, self);
    }

    public StopCasterSceneRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public StopCasterSceneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopCasterSceneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopCasterSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
