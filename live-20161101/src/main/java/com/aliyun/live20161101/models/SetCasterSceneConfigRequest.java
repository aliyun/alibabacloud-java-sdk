// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSceneConfigRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId parameter returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, go to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studios</strong> &gt; <strong>China Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the production studio list on the China Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80787064-1c94-4dc1-85ce-9409960a****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The list of component IDs. The components are arranged in bottom-to-top order within the array.</p>
     * <blockquote>
     * <p>N indicates the sequence number. For example:<br>ComponentId.1 indicates the first component ID.<br>ComponentId.2 indicates the second component ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[ &quot;a2b8e671-2fe5-4642-a2ec-bf931826****&quot;, &quot;a2b8e671-2fe5-4642-a2ec-28374657****&quot;]</p>
     */
    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    /**
     * <p>The layout ID. If you call the <a href="https://help.aliyun.com/document_detail/2848028.html">DescribeCasterLayouts</a> operation to query the layout list of a production studio, check the LayoutId parameter returned by the DescribeCasterLayouts operation.</p>
     * 
     * <strong>example:</strong>
     * <p>0c6da077-f037-49e8-8440-3be13393****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

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
     * <p>The scene ID. The scene must have been started by calling StartCasterScene. Otherwise, the IncorrectSceneStatus error is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>242b4e2c-c30f-4442-85ba-2e3e4e3d****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static SetCasterSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterSceneConfigRequest self = new SetCasterSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterSceneConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterSceneConfigRequest setComponentId(java.util.List<String> componentId) {
        this.componentId = componentId;
        return this;
    }
    public java.util.List<String> getComponentId() {
        return this.componentId;
    }

    public SetCasterSceneConfigRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public SetCasterSceneConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCasterSceneConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetCasterSceneConfigRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
