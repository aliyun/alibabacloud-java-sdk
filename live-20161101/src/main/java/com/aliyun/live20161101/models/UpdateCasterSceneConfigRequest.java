// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneConfigRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value from the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, find the ID on the <strong>Cloud Production Studio</strong> page. Navigate to this page by choosing <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> in the ApsaraVideo Live console.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list is its ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80787064-1c94-4dc1-85ce-9409960a****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>A list of component IDs. The components in the array are layered from bottom to top.</p>
     * <blockquote>
     * <p>N indicates the sequence number. For example, ComponentId.1 is the ID of the first component and ComponentId.2 is the ID of the second component.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;98778372-c30f-4442-85ba-2e3e4e3d****&quot;]</p>
     */
    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    /**
     * <p>The ID of the layout. If you query the layout list for the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848028.html">DescribeCasterLayouts</a> operation, use the LayoutId value from the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eeab74fb-379d-4599-a93d-86d16a05****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>242b4e2c-c30f-4442-85ba-2e3e4e3d****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static UpdateCasterSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterSceneConfigRequest self = new UpdateCasterSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCasterSceneConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public UpdateCasterSceneConfigRequest setComponentId(java.util.List<String> componentId) {
        this.componentId = componentId;
        return this;
    }
    public java.util.List<String> getComponentId() {
        return this.componentId;
    }

    public UpdateCasterSceneConfigRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public UpdateCasterSceneConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCasterSceneConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateCasterSceneConfigRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
