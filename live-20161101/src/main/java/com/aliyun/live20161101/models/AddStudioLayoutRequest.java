// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddStudioLayoutRequest extends TeaModel {
    /**
     * <p>The configuration of the background resource. The value is a JSON string. For more information, see <strong>BgImageConfig</strong>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required only when you set LayoutType to studio.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Id&quot;:&quot;k12kj31****&quot;, &quot;MaterialId&quot;:&quot;f080575eb5f4427684fc0715159a****&quot; }</p>
     */
    @NameInMap("BgImageConfig")
    public String bgImageConfig;

    /**
     * <p>The ID of the production studio.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Create a virtual production studio in advance. You can create a production studio in the console or by calling the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> API operation. The production studio must be a virtual production studio.</p>
     * <ul>
     * <li><p>If you call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> API operation to create a production studio, use the returned CasterId value.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, go to the <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page. The name of the production studio in the list is its ID.</p>
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
     * <p>The configuration of the common layout. The value is a JSON string. For more information, see <strong>CommonConfig</strong>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required only when you set LayoutType to common.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ChannelId&quot;:&quot;RV01&quot; }</p>
     */
    @NameInMap("CommonConfig")
    public String commonConfig;

    /**
     * <p>The layer order settings. The value is a JSON string. For more information, see <strong>LayerOrderConfig</strong>. You can sort background materials and multimedia materials. Chroma keying layers are not supported. The earlier a material appears in the list, the lower its layer.</p>
     * 
     * <strong>example:</strong>
     * <p>[ 	{ 	&quot;Type&quot;:&quot;media&quot;, 	&quot;Id&quot;:&quot;k12kj31****&quot; 	}, 	{ 	&quot;Type&quot;:&quot;media&quot;, 	&quot;Id&quot;:&quot;k12kj31****&quot; 	} ]</p>
     */
    @NameInMap("LayerOrderConfigList")
    public String layerOrderConfigList;

    /**
     * <p>The name of the studio layout.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test layout</p>
     */
    @NameInMap("LayoutName")
    public String layoutName;

    /**
     * <p>The type of the studio layout. Valid values:</p>
     * <ul>
     * <li><p><strong>common</strong>: A common layout. If you set LayoutType to common, you must also specify CommonConfig.</p>
     * </li>
     * <li><p><strong>studio</strong>: A studio layout. If you set LayoutType to studio, you must also specify BgImageConfig and ScreenInputConfigList. The MediaInputConfigList parameter is optional.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>studio</p>
     */
    @NameInMap("LayoutType")
    public String layoutType;

    /**
     * <p>The settings for the multimedia input resource. The value is a JSON string. For more information, see <strong>MediaInputConfig</strong>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is valid and optional only when you set LayoutType to studio.</p>
     * 
     * <strong>example:</strong>
     * <p>[ 	{ 	&quot;Id&quot;:&quot;k12kj31****&quot;, 	&quot;Index&quot;:&quot;1&quot;, 	&quot;ChannelId&quot;:&quot;RV01&quot;, 	&quot;FillMode&quot;:&quot;none&quot;, 	&quot;PositionRefer&quot;:&quot;topLeft&quot;, 	&quot;WidthNormalized&quot;:&quot;0.4&quot;, 	&quot;HeightNormalized&quot;:&quot;0.4&quot;, 	&quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; 	},   { 	&quot;Id&quot;:&quot;k12kj31****&quot;, 	&quot;Index&quot;:&quot;2&quot;, 	&quot;ImageMaterialId&quot;:&quot;lkajsdfsa8fd89asd8****&quot;, 	&quot;FillMode&quot;:&quot;none&quot;, 	&quot;PositionRefer&quot;:&quot;topLeft&quot;, 	&quot;WidthNormalized&quot;:&quot;0.6&quot;, 	&quot;HeightNormalized&quot;:&quot;0.4&quot;, 	&quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; 	} ]</p>
     */
    @NameInMap("MediaInputConfigList")
    public String mediaInputConfigList;

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
     * <p>The settings for the chroma keying input. The value is a JSON string. For more information, see <strong>ScreenInputConfig</strong>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required only when you set LayoutType to studio.</p>
     * 
     * <strong>example:</strong>
     * <p>[ 	{ 	&quot;Index&quot;:&quot;1&quot;, 	&quot;ChannelId&quot;:&quot;RV01&quot;, 	&quot;Color&quot;:&quot;green&quot;, 	&quot;PositionX&quot;:&quot;0.1&quot;, 	&quot;PositionY&quot;:&quot;0.2&quot;, 	&quot;HeightNormalized&quot;:&quot;0.4&quot; 	} ]</p>
     */
    @NameInMap("ScreenInputConfigList")
    public String screenInputConfigList;

    public static AddStudioLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStudioLayoutRequest self = new AddStudioLayoutRequest();
        return TeaModel.build(map, self);
    }

    public AddStudioLayoutRequest setBgImageConfig(String bgImageConfig) {
        this.bgImageConfig = bgImageConfig;
        return this;
    }
    public String getBgImageConfig() {
        return this.bgImageConfig;
    }

    public AddStudioLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddStudioLayoutRequest setCommonConfig(String commonConfig) {
        this.commonConfig = commonConfig;
        return this;
    }
    public String getCommonConfig() {
        return this.commonConfig;
    }

    public AddStudioLayoutRequest setLayerOrderConfigList(String layerOrderConfigList) {
        this.layerOrderConfigList = layerOrderConfigList;
        return this;
    }
    public String getLayerOrderConfigList() {
        return this.layerOrderConfigList;
    }

    public AddStudioLayoutRequest setLayoutName(String layoutName) {
        this.layoutName = layoutName;
        return this;
    }
    public String getLayoutName() {
        return this.layoutName;
    }

    public AddStudioLayoutRequest setLayoutType(String layoutType) {
        this.layoutType = layoutType;
        return this;
    }
    public String getLayoutType() {
        return this.layoutType;
    }

    public AddStudioLayoutRequest setMediaInputConfigList(String mediaInputConfigList) {
        this.mediaInputConfigList = mediaInputConfigList;
        return this;
    }
    public String getMediaInputConfigList() {
        return this.mediaInputConfigList;
    }

    public AddStudioLayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddStudioLayoutRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddStudioLayoutRequest setScreenInputConfigList(String screenInputConfigList) {
        this.screenInputConfigList = screenInputConfigList;
        return this;
    }
    public String getScreenInputConfigList() {
        return this.screenInputConfigList;
    }

}
