// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSceneConfigRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80787064-1c94-4dc1-85ce-9409960a****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The IDs of the components. Components in the scene are listed from the bottom to the top in an array.</p>
     * <blockquote>
     * <p> N indicates a sequence number. Examples:\
     * ComponentId.1 indicates the ID of the first component.\
     * ComponentId.2 indicates the ID of the second component.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[ &quot;a2b8e671-2fe5-4642-a2ec-bf931826****&quot;, &quot;a2b8e671-2fe5-4642-a2ec-28374657****&quot;]</p>
     */
    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    /**
     * <p>The ID of the layout. If you call the <a href="https://help.aliyun.com/document_detail/60260.html">DescribeCasterLayouts</a> operation to query the layouts of the production studio, check the value of the response parameter LayoutId to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0c6da077-f037-49e8-8440-3be13393****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("OwnerId")
    public Long ownerId;

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
