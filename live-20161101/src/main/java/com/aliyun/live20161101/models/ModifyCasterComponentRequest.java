// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterComponentRequest extends TeaModel {
    /**
     * <p>The information about the subtitle component. The value must be a JSON string. This parameter contains the following fields:</p>
     * <blockquote>
     * <p> This parameter is required if you set ComponentType to caption.</p>
     * </blockquote>
     * <ul>
     * <li><strong>SizeNormalized</strong>: the normalized value of the font size. The value of this field equals the font size divided by the output height. Valid values: <code>0 to 1</code>. The maximum font size is 1,024, even if the font size calculated based on this field is greater than 1,024.</li>
     * <li><strong>BorderWidthNormalized</strong>: the normalized value of the border width. The value of this field equals the border width divided by the font size. Valid values: <code>0 to 1</code>. Default value: 0. The maximum border width is 16, even if the border width calculated based on this field is greater than 16.</li>
     * <li><strong>FontName</strong>: the font name. Default value: KaiTi. For more information about the valid values, see <strong>Fonts used in a production studio</strong>.</li>
     * <li><strong>BorderColor</strong>: the color of the text border. Valid values: 0x000000 to 0xffffff. By default, this parameter is left empty. In this case, the color of the text border is transparent.</li>
     * <li><strong>LocationId</strong>: the channel ID of the source subtitles.</li>
     * <li><strong>SourceLan</strong>: the source language of the subtitles in the video. Valid values: en (English), cn (Chinese), es (Spanish), and ru (Russian). Default value: cn.</li>
     * <li><strong>TargetLan</strong>: the target language of the subtitles in the video. If you do not specify this field, speech recognition is used. If you specify this field, translation is used. Valid values: en (English), cn (Chinese), es (Spanish), and ru (Russian).</li>
     * <li><strong>ShowSourceLan</strong>: specifies whether to display the source language. A value of true specifies that the source language is displayed. A value of false specifies that the source language is not displayed. Default value: false.</li>
     * <li><strong>Truncation</strong>: specifies whether to allow subtitle truncation. A value of true specifies that the subtitles can be truncated. A value of false specifies that the subtitles cannot be truncated. Default value: false.</li>
     * <li><strong>SourceLanPerLineWordCount</strong>: the number of words displayed in each line of the source language. This field takes effect only if you set Truncation to true. Default value: 20.</li>
     * <li><strong>TargetLanPerLineWordCount</strong>: the number of words displayed in each line of the target language. This field takes effect only if you set Truncation to true. Default value: 20.</li>
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
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the component. If the component was added by calling the <a href="https://help.aliyun.com/document_detail/2848030.html">AddCasterComponent</a> operation, check the value of the response parameter ComponentId to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>The information about the component layer, such as the size and layout, The value must be a JSON string. This parameter contains the following fields:</p>
     * <ul>
     * <li><strong>HeightNormalized</strong>: the normalized value of the height of the component layer.</li>
     * <li><strong>WidthNormalized</strong>: the normalized value of the width of the component layer.</li>
     * <li><strong>PositionNormalized</strong>: the normalized value of the position of the component layer.</li>
     * <li><strong>PositionRefer</strong>: the reference coordinates of the component layer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HeightNormalized&quot;:&quot;1&quot;,&quot;PositionRefer&quot;:&quot;topRight&quot;,&quot;WidthNormalized&quot;:&quot;0&quot;,&quot;PositionNormalized&quot;:[&quot;0.1&quot;,&quot;0.2&quot;]}</p>
     */
    @NameInMap("ComponentLayer")
    public String componentLayer;

    /**
     * <p>The name of the component. By default, the name is the ID of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>text01</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The type of the component. Valid values:</p>
     * <ul>
     * <li><strong>text</strong>: text component. The TextLayerContent parameter is required if you set ComponentType to text.</li>
     * <li><strong>image</strong>: image component. The ImageLayerContent parameter is required if you set ComponentType to image.</li>
     * <li><strong>caption</strong>: subtitle component. The CaptionLayerContent parameter is required if you set ComponentType to caption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>The display effect for the component. Valid values:</p>
     * <ul>
     * <li><strong>none</strong> (default)</li>
     * <li><strong>animateH</strong>: horizontal scrolling</li>
     * <li><strong>animateV</strong>: vertical scrolling</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>animateV</p>
     */
    @NameInMap("Effect")
    public String effect;

    /**
     * <p>The information about the image component. The value must be a JSON string.</p>
     * <blockquote>
     * <p> This parameter is required if you set ComponentType to image.</p>
     * </blockquote>
     * <p>The MaterialId field specifies the ID of the material from the media asset library.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MaterialId&quot;:&quot;6cf724c6ebfd4a59b5b3cec6f10d5ecf&quot;}</p>
     */
    @NameInMap("ImageLayerContent")
    public String imageLayerContent;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the text component. The value must be a JSON string. This parameter contains the following fields:</p>
     * <blockquote>
     * <p> This parameter is required if you set ComponentType to text.</p>
     * </blockquote>
     * <ul>
     * <li><strong>SizeNormalized</strong>: the normalized value of the font size. The value of this field equals the font size divided by the output height. Valid values: <code>0 to 1</code>. The maximum font size is 1,024, even if the font size calculated based on this field is greater than 1,024.</li>
     * <li><strong>BorderWidthNormalized</strong>: the normalized value of the border width. The value of this field equals the border width divided by the font size. Valid values: <code>0 to 1</code>. Default value: 0. The maximum border width is 16, even if the border width calculated based on this field is greater than 16.</li>
     * <li><strong>FontName</strong>: the font name. Default value: KaiTi. For more information about the valid values, see <strong>Fonts used in a production studio</strong>.</li>
     * <li><strong>BorderColor</strong>: the color of the text border. Valid values: 0x000000 to 0xffffff. By default, this parameter is left empty. In this case, the color of the text border is transparent.</li>
     * <li><strong>Text</strong>: the content of the text. By default, this parameter is left empty. In this case, the text contains no content.</li>
     * <li><strong>Color</strong>: the color of the text. The default value is 0xff0000, which indicates that the text is in red.</li>
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
