// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterComponentRequest extends TeaModel {
    /**
     * <p>The properties of the layer element. The properties are described as follows:</p>
     * <blockquote>
     * <p>Notice: This parameter is required when ComponentType is set to caption.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>SizeNormalized</strong>: The normalized font size. This value is calculated as font size / output height. The value must be in the <code>[0,1]</code> range and accurate to two decimal places. If the font size calculated from the normalized value is greater than <strong>1024</strong>, the font size is set to <strong>1024</strong>.</p>
     * </li>
     * <li><p><strong>BorderWidthNormalized</strong>: The normalized width of the text border. This value is calculated based on the font size: BorderWidth / FontSize. The value must be in the <code>[0,1]</code> range and accurate to two decimal places. If the width calculated from the normalized value is greater than <strong>16</strong>, the width is set to <strong>16</strong>. The default value is <strong>0</strong>.</p>
     * </li>
     * <li><p><strong>FontName</strong>: The font name. For valid values, see <strong>Production studio fonts</strong>. The default font is KaiTi.</p>
     * </li>
     * <li><p><strong>BorderColor</strong>: The color of the text border. The value must be a hexadecimal color code that ranges from 0x000000 to 0xffffff. The default value is an empty string (&quot;&quot;), which indicates that no border color is set.</p>
     * </li>
     * <li><p><strong>LocationId</strong>: The channel ID of the translation source.</p>
     * </li>
     * <li><p><strong>SourceLan</strong>: The original audio language of the video source. Valid values: en (English), cn (Chinese), es (Spanish), and ru (Russian). The default value is cn.</p>
     * </li>
     * <li><p><strong>TargetLan</strong>: The target audio language for the video source. If you do not set this parameter, only speech recognition is performed. If you set this parameter, the audio is translated. Valid values: en (English), cn (Chinese), es (Spanish), and ru (Russian).</p>
     * </li>
     * <li><p><strong>ShowSourceLan</strong>: Specifies whether to display the source language. Valid values: true and false. The default value is false.</p>
     * </li>
     * <li><p><strong>Truncation</strong>: Specifies whether captions can be truncated. Valid values: true and false. The default value is false.</p>
     * </li>
     * <li><p><strong>SourceLanPerLineWordCount</strong>: The maximum number of words per line for the source language captions. The default value is 20.</p>
     * </li>
     * <li><p><strong>TargetLanPerLineWordCount</strong>: The maximum number of words per line for the target language captions. The default value is 20.</p>
     * </li>
     * <li><p><strong>SourceLanReservePages</strong>: The number of lines to reserve for the source language captions. This parameter takes effect only when Truncation is set to true. The default value is 2.</p>
     * </li>
     * <li><p><strong>TargetLanReservePages</strong>: The number of lines to reserve for the target language captions. This parameter takes effect only when Truncation is set to true. The default value is 2.</p>
     * </li>
     * </ul>
     * <p>The value must be a JSON-formatted string. Parameter names must be in upper-camel case.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;BorderWidthNormalized&quot;:0.01,&quot;SizeNormalized&quot;:0.05,&quot;Color&quot;:&quot;0x000000&quot;,&quot;LocationId&quot;:&quot;RV01&quot;,&quot;SourceLan&quot;:&quot;cn&quot;,&quot;FontName&quot;:&quot;KaiTi&quot;,&quot;BorderColor&quot;:&quot;0xffffff&quot;}</p>
     */
    @NameInMap("CaptionLayerContent")
    public String captionLayerContent;

    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, find the ID in the CasterId parameter of the response.</p>
     * </li>
     * <li><p>If you create the production studio in the LIVE console, go to the <strong>LIVE Console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The size, layout, and other information about the component layer. The elements are described as follows:</p>
     * <ul>
     * <li><p><strong>HeightNormalized</strong>: The normalized height.</p>
     * </li>
     * <li><p><strong>WidthNormalized</strong>: The normalized width.</p>
     * </li>
     * <li><p><strong>PositionNormalized</strong>: The normalized position of the layer element.</p>
     * </li>
     * <li><p><strong>PositionRefer</strong>: The reference coordinates for the element\&quot;s position.</p>
     * </li>
     * </ul>
     * <p>The value is a JSON-formatted string. Parameter names must be in upper-camel case.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HeightNormalized&quot;:&quot;1&quot;,&quot;PositionRefer&quot;:&quot;topRight&quot;,&quot;WidthNormalized&quot;:&quot;0&quot;,&quot;PositionNormalized&quot;:[&quot;0.1&quot;,&quot;0.2&quot;]}</p>
     */
    @NameInMap("ComponentLayer")
    public String componentLayer;

    /**
     * <p>The name of the component. The default value is the component ID.</p>
     * 
     * <strong>example:</strong>
     * <p>text01</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The type of component. Valid values:</p>
     * <ul>
     * <li><p><strong>text</strong>: A text component. If you set this parameter to text, you must also set the TextLayerContent parameter.</p>
     * </li>
     * <li><p><strong>image</strong>: An image component. If you set this parameter to image, you must also set the ImageLayerContent parameter.</p>
     * </li>
     * <li><p><strong>caption</strong>: A caption component. If you set this parameter to caption, you must also set the CaptionLayerContent parameter.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>The display effect of the component. Valid values:</p>
     * <ul>
     * <li><p><strong>none</strong> (default): No effect.</p>
     * </li>
     * <li><p><strong>animateH</strong>: Scrolls horizontally.</p>
     * </li>
     * <li><p><strong>animateV</strong>: Scrolls vertically.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>animateH</p>
     */
    @NameInMap("Effect")
    public String effect;

    /**
     * <p>The configuration of the H5 component.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;htmlUrl&quot;:<a href="http://caster.example.com%7D">http://caster.example.com}</a></p>
     */
    @NameInMap("HtmlLayerContent")
    public String htmlLayerContent;

    /**
     * <p>The properties of the layer element. The properties are described as follows:</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required when ComponentType is set to image.</p>
     * <p>MaterialId: The ID of the media asset. The name that you specify when you upload a media asset is used as the ID of the media asset.</p>
     * <p>The value must be a JSON-formatted string. Parameter names must be in upper-camel case.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MaterialId&quot;:&quot;6cf724c6ebfd4a59b5b3cec6f10d****&quot;}</p>
     */
    @NameInMap("ImageLayerContent")
    public String imageLayerContent;

    /**
     * <p>The layer order of the component.</p>
     * <ul>
     * <li><p>cover: The component is in the foreground.</p>
     * </li>
     * <li><p>background: The component is in the background.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cover</p>
     */
    @NameInMap("LayerOrder")
    public String layerOrder;

    /**
     * <p>Specifies the position of the component. Each position can hold only one component. The format must be RC01 to RC99.</p>
     * <blockquote>
     * <p>If the component type is caption, this parameter specifies the location of the referenced video source.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RC01</p>
     */
    @NameInMap("LocationId")
    public String locationId;

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
     * <p>The properties of the layer element. The properties are described as follows:</p>
     * <blockquote>
     * <p>Notice: This parameter is required only when ComponentType is set to text.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>SizeNormalized</strong>: The normalized font size. This value is calculated as font size / output height. The value must be in the <code>[0,1]</code> range. If the font size calculated from the normalized value is greater than 1024, the font size is set to 1024.</p>
     * </li>
     * <li><p><strong>BorderWidthNormalized</strong>: The normalized width of the text border. This value is calculated based on the font size: BorderWidth / FontSize. The value must be in the <code>[0,1]</code> range. If the width calculated from the normalized value is greater than 16, the width is set to 16. The default value is 0.</p>
     * </li>
     * <li><p><strong>FontName</strong>: The font name. For valid values, see <strong>Production studio fonts</strong>. The default font is KaiTi.</p>
     * </li>
     * <li><p><strong>BorderColor</strong>: The color of the text border. The value must be a hexadecimal color code that ranges from 0x000000 to 0xffffff. The default value is an empty string (&quot;&quot;), which indicates that no border color is set.</p>
     * </li>
     * <li><p><strong>Text</strong>: The text content. The default value is an empty string (&quot;&quot;).</p>
     * </li>
     * <li><p><strong>Color</strong>: The text color. The default value is 0xff0000, which represents red.</p>
     * </li>
     * </ul>
     * <p>The value must be a JSON-formatted string. Parameter names must be in upper-camel case.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;BorderWidthNormalized&quot;:&quot;1&quot;,&quot;SizeNormalized&quot;:&quot;0.2&quot;,&quot;Color&quot;:&quot;0x000000&quot;,&quot;FontName&quot;:&quot;KaiTi&quot;,&quot;BorderColor&quot;:&quot;0x000000&quot;,&quot;Text&quot;:&quot;hello world!&quot;}</p>
     */
    @NameInMap("TextLayerContent")
    public String textLayerContent;

    public static AddCasterComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterComponentRequest self = new AddCasterComponentRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterComponentRequest setCaptionLayerContent(String captionLayerContent) {
        this.captionLayerContent = captionLayerContent;
        return this;
    }
    public String getCaptionLayerContent() {
        return this.captionLayerContent;
    }

    public AddCasterComponentRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterComponentRequest setComponentLayer(String componentLayer) {
        this.componentLayer = componentLayer;
        return this;
    }
    public String getComponentLayer() {
        return this.componentLayer;
    }

    public AddCasterComponentRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public AddCasterComponentRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public AddCasterComponentRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public AddCasterComponentRequest setHtmlLayerContent(String htmlLayerContent) {
        this.htmlLayerContent = htmlLayerContent;
        return this;
    }
    public String getHtmlLayerContent() {
        return this.htmlLayerContent;
    }

    public AddCasterComponentRequest setImageLayerContent(String imageLayerContent) {
        this.imageLayerContent = imageLayerContent;
        return this;
    }
    public String getImageLayerContent() {
        return this.imageLayerContent;
    }

    public AddCasterComponentRequest setLayerOrder(String layerOrder) {
        this.layerOrder = layerOrder;
        return this;
    }
    public String getLayerOrder() {
        return this.layerOrder;
    }

    public AddCasterComponentRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

    public AddCasterComponentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterComponentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddCasterComponentRequest setTextLayerContent(String textLayerContent) {
        this.textLayerContent = textLayerContent;
        return this;
    }
    public String getTextLayerContent() {
        return this.textLayerContent;
    }

}
