// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterComponentRequest extends TeaModel {
    /**
     * <p>The information about the caption layer. This parameter contains the following fields:</p>
     * <blockquote>
     * <p> This parameter is required when the ComponentType parameter is set to caption.</p>
     * </blockquote>
     * <ul>
     * <li><strong>SizeNormalized</strong>: the normalized font size. The font size is set to font_size/output_height. The value range is <code>[0,1]</code> and accurate to two decimal places. If the font size calculated by the system based on the normalization method is greater than <strong>1024</strong>, <strong>1024</strong> is used.</li>
     * <li><strong>BorderWidthNormalized</strong>: the normalized value of the text border width, which is calculated based on the size of the text, namely &quot;BorderWidth/FontSize&quot;. The value range is <code>[0,1]</code> and accurate to two decimal places. If the value calculated according to the normalization method exceeds <strong>16</strong>, <strong>16</strong> is used. The default value is <strong>0</strong>.</li>
     * <li><strong>FontName</strong>: the font name. For more information about the value, see <strong>Font description</strong>. The default font name is KaiTi.</li>
     * <li><strong>BorderColor</strong>: the color of the text border. Valid values: 0x000000 to 0xffffff. By default, this parameter is not set. In this case, the color of the text border is transparent.</li>
     * <li><strong>LocationId</strong>: the channel ID of the source subtitle.</li>
     * <li><strong>SourceLan</strong>: the source language of the audio in the source video. Valid values: en, cn, es, and ru, which indicate English, Chinese, Spanish, and Russian respectively. Default value: cn.</li>
     * <li><strong>TargetLan</strong>: the target audio language in the source video. If you do not specify this field, speech recognition is used. If you specify this field, translation is used. Valid values: en, cn, es, and ru, which indicate English, Chinese, Spanish, and Russian respectively. Default value: cn.</li>
     * <li><strong>ShowSourceLan</strong>: specifies whether to display the source language. Valid values: true: displays the source language. false: hides the source language. Default value: false.</li>
     * <li><strong>Truncation</strong>: specifies whether to allow caption truncation. Valid values: true: specifies that the caption can be truncated. false: specifies that the caption cannot be truncated. Default value: false.</li>
     * <li><strong>SourceLanPerLineWordCount</strong>: the number of words displayed in each line when the subtitle is in the source language. Default value: 20.</li>
     * <li><strong>TargetLanPerLineWordCount</strong>: the number of words displayed in each line when the subtitle is in the destination language. Default value: 20.</li>
     * <li><strong>SourceLanReservePages</strong>: the number of lines reserved when the subtitle is in the source language. This field takes effect only when the Truncation field is set to true. Default value: 2.</li>
     * <li><strong>TargetLanReservePages</strong>: the number of lines reserved when the subtitle is in the destination language. This field takes effect only when the Truncation field is set to true. Default value: 2.</li>
     * </ul>
     * <p>The value is a JSON string. Use upper camel case for field names.</p>
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
     * <p>The information about the component layer, such as the size and layout. This parameter contains the following fields:</p>
     * <ul>
     * <li><strong>HeightNormalized</strong>: the normalized value of heights for the elements in the component layer</li>
     * <li><strong>WidthNormalized</strong>: the normalized value of widths for the elements in the component layer</li>
     * <li><strong>PositionNormalized</strong>: the normalized value of the coordinates of the component layer</li>
     * <li><strong>PositionRefer</strong>: the reference coordinates of the component layer.</li>
     * </ul>
     * <p>The value is a JSON string. Use upper camel case for field names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HeightNormalized&quot;:&quot;1&quot;,&quot;PositionRefer&quot;:&quot;topRight&quot;,&quot;WidthNormalized&quot;:&quot;0&quot;,&quot;PositionNormalized&quot;:[&quot;0.1&quot;,&quot;0.2&quot;]}</p>
     */
    @NameInMap("ComponentLayer")
    public String componentLayer;

    /**
     * <p>The component name. By default, the component name is the component ID.</p>
     * 
     * <strong>example:</strong>
     * <p>text01</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The component type. Valid values:</p>
     * <ul>
     * <li><strong>text</strong>: a text component. If you set ComponentType to text, you must also specify TextLayerContent.</li>
     * <li><strong>image</strong>: an image component. If you set ComponentType to image, you must also specify ImageLayerContent.</li>
     * <li><strong>caption</strong>: a caption component. If you set ComponentType to caption, you must also specify CaptionLayerContent.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>The effect of the component. Valid values:</p>
     * <ul>
     * <li><strong>none (default)</strong></li>
     * <li><strong>animateH</strong>: horizontal scrolling</li>
     * <li><strong>animateV</strong>: vertical scrolling</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>animateH</p>
     */
    @NameInMap("Effect")
    public String effect;

    /**
     * <p>The information about the HTML5 layer.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;htmlUrl&quot;:<a href="http://caster.example.com%7D">http://caster.example.com}</a></p>
     */
    @NameInMap("HtmlLayerContent")
    public String htmlLayerContent;

    /**
     * <p>The information about the image layer. This parameter contains the following fields:</p>
     * <blockquote>
     * <p> This parameter is required when the ComponentType parameter is set to image.</p>
     * </blockquote>
     * <p>MaterialId: the ID of the asset from the media asset library. The name that you set when you upload an asset is the ID of the asset.</p>
     * <p>The value is a JSON string. Use upper camel case for field names.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MaterialId&quot;:&quot;6cf724c6ebfd4a59b5b3cec6f10d****&quot;}</p>
     */
    @NameInMap("ImageLayerContent")
    public String imageLayerContent;

    /**
     * <p>The layer stacking order of the component. Valid values:</p>
     * <ul>
     * <li>cover</li>
     * <li>background</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cover</p>
     */
    @NameInMap("LayerOrder")
    public String layerOrder;

    /**
     * <p>The location ID of the component. Each location ID can be assigned to only one component and must be in the RC[Number] format. The values specified by this parameter must be in ascending order, such as RC01 to RC99.</p>
     * <blockquote>
     * <p> If the ComponentType parameter is set to caption, the LocationId parameter specifies the location ID of the video source referenced by the component.</p>
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

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the text layer. This parameter contains the following fields:</p>
     * <blockquote>
     * <p> This parameter is available and required only when the ComponentType parameter is set to text.</p>
     * </blockquote>
     * <ul>
     * <li><strong>SizeNormalized</strong>: the normalized font size. The font size is set to font_size/output_height. The value range is <code>[0,1]</code>. If the font size calculated by the system based on the normalization method is greater than 1024, 1024 is used.</li>
     * <li><strong>BorderWidthNormalized</strong>: the normalized value of the text border width. The normalized value is calculated based on the size of the text, that is, &quot;BorderWidth/FontSize&quot;. The value range is <code>[0,1]</code>. If the value calculated based on the normalization method exceeds 16, 16 is used. The default value is 0.</li>
     * <li><strong>FontName</strong>: the font name. For more information about the value, see <strong>Font description</strong>. The default value is KaiTi.</li>
     * <li><strong>BorderColor</strong>: the color of the text border. Valid values: 0x000000 to 0xffffff. By default, this parameter is not set. In this case, the color of the text border is transparent.</li>
     * <li><strong>Text</strong>: the content of the text. By default, this parameter is not set. In this case, the text contains no content.</li>
     * <li><strong>Color</strong>: the color of the text. The default value is 0xff0000, which indicates that the text is in red.</li>
     * </ul>
     * <p>The value is a JSON string. Use upper camel case for field names.</p>
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
