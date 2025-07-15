// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddStudioLayoutRequest extends TeaModel {
    /**
     * <p>The background material configurations. The value is a JSON string. For more information, see <strong>BgImageConfig</strong>.</p>
     * <blockquote>
     * <p> This parameter is required only if you set LayoutType to studio.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Id&quot;:&quot;k12kj31****&quot;, &quot;MaterialId&quot;:&quot;f080575eb5f4427684fc0715159a****&quot; }</p>
     */
    @NameInMap("BgImageConfig")
    public String bgImageConfig;

    /**
     * <p>The ID of the production studio.</p>
     * <blockquote>
     * <p> The production studio must be a virtual studio that you create in advance. You can use the ApsaraVideo Live console or call the CreateCaster operation to create a virtual studio.</p>
     * </blockquote>
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
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The common layout configurations. The value is a JSON string. For more information, see <strong>CommonConfig</strong>.</p>
     * <blockquote>
     * <p> This parameter is required only if you set LayoutType to common.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ChannelId&quot;:&quot;RV01&quot; }</p>
     */
    @NameInMap("CommonConfig")
    public String commonConfig;

    /**
     * <p>The layer sorting configurations. The value is a JSON string. For more information, see <strong>layerOrderConfig</strong>. You can sort layers of background and multimedia materials. The chroma key layer cannot be sorted. A layer that is in the front of the code is placed behind other layers in the layout.</p>
     * 
     * <strong>example:</strong>
     * <p>[ 	{ 	&quot;Type&quot;:&quot;media&quot;, 	&quot;Id&quot;:&quot;k12kj31****&quot; 	}, 	{ 	&quot;Type&quot;:&quot;media&quot;, 	&quot;Id&quot;:&quot;k12kj31****&quot; 	} ]</p>
     */
    @NameInMap("LayerOrderConfigList")
    public String layerOrderConfigList;

    /**
     * <p>The name of the layout.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test layout</p>
     */
    @NameInMap("LayoutName")
    public String layoutName;

    /**
     * <p>The type of the layout. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: If you set this parameter to common, you must specify the CommonConfig parameter.</li>
     * <li><strong>studio</strong>: If you set this parameter to studio, you must specify the BgImageConfig and ScreenInputConfigList parameters. The MediaInputConfigList parameter is optional.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>studio</p>
     */
    @NameInMap("LayoutType")
    public String layoutType;

    /**
     * <p>The multimedia input configurations. The value is a JSON string. For more information, see <strong>MediaInputConfig</strong>.</p>
     * <blockquote>
     * <p> This parameter is optional and is valid only if you set LayoutType to studio.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[ 	{ 	&quot;Id&quot;:&quot;k12kj31****&quot;, 	&quot;Index&quot;:&quot;1&quot;, 	&quot;ChannelId&quot;:&quot;RV01&quot;, 	&quot;FillMode&quot;:&quot;none&quot;, 	&quot;PositionRefer&quot;:&quot;topLeft&quot;, 	&quot;WidthNormalized&quot;:&quot;0.4&quot;, 	&quot;HeightNormalized&quot;:&quot;0.4&quot;, 	&quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; 	},   { 	&quot;Id&quot;:&quot;k12kj31****&quot;, 	&quot;Index&quot;:&quot;2&quot;, 	&quot;ImageMaterialId&quot;:&quot;lkajsdfsa8fd89asd8****&quot;, 	&quot;FillMode&quot;:&quot;none&quot;, 	&quot;PositionRefer&quot;:&quot;topLeft&quot;, 	&quot;WidthNormalized&quot;:&quot;0.6&quot;, 	&quot;HeightNormalized&quot;:&quot;0.4&quot;, 	&quot;PositionNormalized&quot;:&quot;[0.1, 0.2]&quot; 	} ]</p>
     */
    @NameInMap("MediaInputConfigList")
    public String mediaInputConfigList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The input configurations for chroma key. The value is a JSON string. For more information, see <strong>ScreenInputConfig</strong>.</p>
     * <blockquote>
     * <p> This parameter is required only if you set LayoutType to studio.</p>
     * </blockquote>
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
