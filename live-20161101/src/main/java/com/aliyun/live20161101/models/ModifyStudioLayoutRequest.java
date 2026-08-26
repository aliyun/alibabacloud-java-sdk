// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyStudioLayoutRequest extends TeaModel {
    /**
     * <p>The configuration of the background resource. This parameter is a JSON string. For more information, see <strong>BgImageConfig</strong>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required only when LayoutType is set to studio.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Id&quot;:&quot;k12kj31****&quot;, &quot;MaterialId&quot;:&quot;f080575eb5f4427684fc0715159a****&quot; }</p>
     */
    @NameInMap("BgImageConfig")
    public String bgImageConfig;

    /**
     * <p>The ID of the production studio. &gt;Notice: The production studio must be created in advance and must be of the virtual studio type.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value returned in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, go to the <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The configuration of the common layout. This parameter is a JSON string. For more information, see <strong>CommonConfig</strong>. &gt;Notice: This parameter is required only when LayoutType is set to common.</p>
     * 
     * <strong>example:</strong>
     * <p>{  &quot;ChannelId&quot;:&quot;RV01&quot; }</p>
     */
    @NameInMap("CommonConfig")
    public String commonConfig;

    /**
     * <p>The layer order settings. This parameter is a JSON string. For more information, see <strong>layerOrderConfig</strong>. You can sort background and multimedia materials. Chroma keying layers are not supported. The earlier an item appears in the list, the lower its layer.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;Type&quot;:&quot;media&quot;, &quot;Id&quot;:&quot;k12kj31****&quot; }, { &quot;Type&quot;:&quot;media&quot;, &quot;Id&quot;:&quot;k12kj31****&quot; } ]</p>
     */
    @NameInMap("LayerOrderConfigList")
    public String layerOrderConfigList;

    /**
     * <p>The ID of the layout. If you add a layout for a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848062.html">AddStudioLayout</a> operation, use the LayoutId value returned in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    /**
     * <p>The name of the production studio layout.</p>
     * 
     * <strong>example:</strong>
     * <p>Test layout</p>
     */
    @NameInMap("LayoutName")
    public String layoutName;

    /**
     * <p>The settings for the multimedia input resource. This parameter is a JSON string. For more information, see <strong>MediaInputConfig</strong>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is valid and optional only when LayoutType is set to studio.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;Id&quot;:&quot;k12kj31****&quot;, &quot;Index&quot;:&quot;1&quot;, &quot;ChannelId&quot;:&quot;RV01&quot;, &quot;FillMode&quot;:&quot;none&quot;, &quot;PositionRefer&quot;:&quot;topLeft&quot;, &quot;WidthNormalized&quot;:&quot;0.4&quot;, &quot;HeightNormalized&quot;:&quot;0.4&quot;, &quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; }, { &quot;Id&quot;:&quot;k12kj31****&quot;, &quot;Index&quot;:&quot;2&quot;, &quot;ImageMaterialId&quot;:&quot;lkajsdfsa8fd89asd8****&quot;, &quot;FillMode&quot;:&quot;none&quot;, &quot;PositionRefer&quot;:&quot;topLeft&quot;, &quot;WidthNormalized&quot;:&quot;0.6&quot;, &quot;HeightNormalized&quot;:&quot;0.4&quot;, &quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; } ]</p>
     */
    @NameInMap("MediaInputConfigList")
    public String mediaInputConfigList;

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
     * <p>The settings for the chroma keying input. This parameter is a JSON string. For more information, see <strong>ScreenInputConfig</strong>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required only when LayoutType is set to studio.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;Index&quot;:&quot;1&quot;, &quot;ChannelId&quot;:&quot;RV01&quot;, &quot;Color&quot;:&quot;green&quot;, &quot;PositionX&quot;:&quot;0.1&quot;, &quot;PositionY&quot;:&quot;0.2&quot;, &quot;HeightNormalized&quot;:&quot;0.4&quot; } ]</p>
     */
    @NameInMap("ScreenInputConfigList")
    public String screenInputConfigList;

    public static ModifyStudioLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStudioLayoutRequest self = new ModifyStudioLayoutRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStudioLayoutRequest setBgImageConfig(String bgImageConfig) {
        this.bgImageConfig = bgImageConfig;
        return this;
    }
    public String getBgImageConfig() {
        return this.bgImageConfig;
    }

    public ModifyStudioLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyStudioLayoutRequest setCommonConfig(String commonConfig) {
        this.commonConfig = commonConfig;
        return this;
    }
    public String getCommonConfig() {
        return this.commonConfig;
    }

    public ModifyStudioLayoutRequest setLayerOrderConfigList(String layerOrderConfigList) {
        this.layerOrderConfigList = layerOrderConfigList;
        return this;
    }
    public String getLayerOrderConfigList() {
        return this.layerOrderConfigList;
    }

    public ModifyStudioLayoutRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public ModifyStudioLayoutRequest setLayoutName(String layoutName) {
        this.layoutName = layoutName;
        return this;
    }
    public String getLayoutName() {
        return this.layoutName;
    }

    public ModifyStudioLayoutRequest setMediaInputConfigList(String mediaInputConfigList) {
        this.mediaInputConfigList = mediaInputConfigList;
        return this;
    }
    public String getMediaInputConfigList() {
        return this.mediaInputConfigList;
    }

    public ModifyStudioLayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyStudioLayoutRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyStudioLayoutRequest setScreenInputConfigList(String screenInputConfigList) {
        this.screenInputConfigList = screenInputConfigList;
        return this;
    }
    public String getScreenInputConfigList() {
        return this.screenInputConfigList;
    }

}
