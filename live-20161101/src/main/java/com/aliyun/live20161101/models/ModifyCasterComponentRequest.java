// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterComponentRequest extends TeaModel {
    /**
     * <p>The properties of the caption layer. The value is a JSON string. The following properties are supported:</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required if you set ComponentType to caption.</p>
     * <ul>
     * <li><p><strong>SizeNormalized</strong>: The normalized font size. The font size is calculated using the formula: font_size/output_height. The value must be in the range of <code>[0,1]</code>. If the calculated font size is greater than 1024, the value 1024 is used.</p>
     * </li>
     * <li><p><strong>BorderWidthNormalized</strong>: The normalized width of the text border. The normalized width is calculated based on the font size using the formula: BorderWidth/FontSize. The value must be in the range of <code>[0,1]</code>. If the calculated value is greater than 16, the value 16 is used. Default value: 0.</p>
     * </li>
     * <li><p><strong>FontName</strong>: The font name. For more information about valid values, see <strong>Production studio fonts</strong>. Default value: KaiTi.</p>
     * </li>
     * <li><p><strong>BorderColor</strong>: The color of the text border. Valid values are from 0x000000 to 0xffffff. The default value is an empty string, which indicates that this parameter is not used.</p>
     * </li>
     * <li><p><strong>LocationId</strong>: The channel ID of the translation source.</p>
     * </li>
     * <li><p><strong>SourceLan</strong>: The source language of the audio in the video source. Valid values are en (English), cn (Chinese), es (Spanish), and ru (Russian). Default value: cn.</p>
     * </li>
     * <li><p><strong>TargetLan</strong>: The target language for translation. If you do not set this parameter, only speech recognition is performed. If you set this parameter, translation is also performed. Valid values are en (English), cn (Chinese), es (Spanish), and ru (Russian).</p>
     * </li>
     * <li><p><strong>ShowSourceLan</strong>: Specifies whether to display the source language. Valid values are true (display) and false (do not display). Default value: false.</p>
     * </li>
     * <li><p><strong>Truncation</strong>: Specifies whether to truncate the caption. Valid values are true (truncate) and false (do not truncate). Default value: false.</p>
     * </li>
     * <li><p><strong>SourceLanPerLineWordCount</strong>: The number of words per line for the source language. This parameter takes effect only if Truncation is set to true. Default value: 20.</p>
     * </li>
     * <li><p><strong>TargetLanPerLineWordCount</strong>: The number of words per line for the target language. This parameter takes effect only if Truncation is set to true. Default value: 20.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;BorderWidthNormalized&quot;:0.01,&quot;SizeNormalized&quot;:0.05,&quot;Color&quot;:&quot;0x000000&quot;,&quot;LocationId&quot;:&quot;RV01&quot;,&quot;SourceLan&quot;:&quot;cn&quot;,&quot;FontName&quot;:&quot;KaiTi&quot;,&quot;BorderColor&quot;:&quot;0xffffff&quot;}</p>
     */
    @NameInMap("CaptionLayerContent")
    public String captionLayerContent;

    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>The ID is returned after you call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation.</p>
     * </li>
     * <li><p>If you create a production studio in the LIVE console, go to the <strong>LIVE</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to find the ID.</p>
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
     * <p>The component ID. The ID is returned after you call the <a href="https://help.aliyun.com/document_detail/2848030.html">AddCasterComponent</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>The size and layout of the layer. The value is a JSON string. The following properties are supported:</p>
     * <ul>
     * <li><p><strong>HeightNormalized</strong>: The normalized height.</p>
     * </li>
     * <li><p><strong>WidthNormalized</strong>: The normalized width.</p>
     * </li>
     * <li><p><strong>PositionNormalized</strong>: The normalized position of the layer.</p>
     * </li>
     * <li><p><strong>PositionRefer</strong>: The reference point for the position of the layer.</p>
     * </li>
     * </ul>
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
     * <p>The type of the component. Valid values:</p>
     * <ul>
     * <li><p><strong>text</strong>: A text component. The TextLayerContent parameter is required only if you set ComponentType to text.</p>
     * </li>
     * <li><p><strong>image</strong>: An image component. The ImageLayerContent parameter is required only if you set ComponentType to image.</p>
     * </li>
     * <li><p><strong>caption</strong>: A translation caption component. The CaptionLayerContent parameter is required only if you set ComponentType to caption.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>The display effect of the component. Valid values:</p>
     * <ul>
     * <li><p><strong>none</strong> (default): no effect.</p>
     * </li>
     * <li><p><strong>animateH</strong>: horizontal scroll.</p>
     * </li>
     * <li><p><strong>animateV</strong>: vertical scroll.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>animateV</p>
     */
    @NameInMap("Effect")
    public String effect;

    /**
     * <p>The properties of the image layer. The value is a JSON string.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required if you set ComponentType to image.</p>
     * <p>MaterialId is the ID of the material in the media asset library.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MaterialId&quot;:&quot;6cf724c6ebfd4a59b5b3cec6f10d5ecf&quot;}</p>
     */
    @NameInMap("ImageLayerContent")
    public String imageLayerContent;

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
     * <p>The properties of the text layer. The value is a JSON string. The following properties are supported:</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required if you set ComponentType to text.</p>
     * <ul>
     * <li><p><strong>SizeNormalized</strong>: The normalized font size. The font size is calculated using the formula: font_size/output_height. The value must be in the range of <code>[0,1]</code>. If the calculated font size is greater than 1024, the value 1024 is used.</p>
     * </li>
     * <li><p><strong>BorderWidthNormalized</strong>: The normalized width of the text border. The normalized width is calculated based on the font size using the formula: BorderWidth/FontSize. The value must be in the range of <code>[0,1]</code>. If the calculated value is greater than 16, the value 16 is used. Default value: 0.</p>
     * </li>
     * <li><p><strong>FontName</strong>: The font name. For more information about valid values, see <strong>Production studio fonts</strong>. Default value: KaiTi.</p>
     * </li>
     * <li><p><strong>BorderColor</strong>: The color of the text border. Valid values are from 0x000000 to 0xffffff. The default value is an empty string, which indicates that this parameter is not used.</p>
     * </li>
     * <li><p><strong>Text</strong>: The text content. The default value is an empty string.</p>
     * </li>
     * <li><p><strong>Color</strong>: The color of the text. Default value: 0xff0000, which is red.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;BorderWidthNormalized&quot;:&quot;1&quot;,&quot;SizeNormalized&quot;:&quot;0.2&quot;,&quot;Color&quot;:&quot;0x000000&quot;,&quot;FontName&quot;:&quot;KaiTi&quot;,&quot;BorderColor&quot;:&quot;0x000000&quot;,&quot;Text&quot;:&quot;hello world!&quot;}</p>
     */
    @NameInMap("TextLayerContent")
    public String textLayerContent;

    public static ModifyCasterComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterComponentRequest self = new ModifyCasterComponentRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCasterComponentRequest setCaptionLayerContent(String captionLayerContent) {
        this.captionLayerContent = captionLayerContent;
        return this;
    }
    public String getCaptionLayerContent() {
        return this.captionLayerContent;
    }

    public ModifyCasterComponentRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterComponentRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public ModifyCasterComponentRequest setComponentLayer(String componentLayer) {
        this.componentLayer = componentLayer;
        return this;
    }
    public String getComponentLayer() {
        return this.componentLayer;
    }

    public ModifyCasterComponentRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ModifyCasterComponentRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public ModifyCasterComponentRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public ModifyCasterComponentRequest setImageLayerContent(String imageLayerContent) {
        this.imageLayerContent = imageLayerContent;
        return this;
    }
    public String getImageLayerContent() {
        return this.imageLayerContent;
    }

    public ModifyCasterComponentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCasterComponentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCasterComponentRequest setTextLayerContent(String textLayerContent) {
        this.textLayerContent = textLayerContent;
        return this;
    }
    public String getTextLayerContent() {
        return this.textLayerContent;
    }

}
