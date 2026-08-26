// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAISubtitleShrinkRequest extends TeaModel {
    /**
     * <p>The background color of the subtitle. Specify the value in RGBA format.</p>
     * 
     * <strong>example:</strong>
     * <p>0xFF0000</p>
     */
    @NameInMap("BgColor")
    public String bgColor;

    /**
     * <p>The background size of the subtitle. Valid values: [0, 1].</p>
     * 
     * <strong>example:</strong>
     * <p>0.09</p>
     */
    @NameInMap("BgWidthNormalized")
    public Float bgWidthNormalized;

    /**
     * <p>The font weight. Valid values: [0, 1].</p>
     * 
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("BorderWidthNormalized")
    public Float borderWidthNormalized;

    /**
     * <p>The subtitle template to copy from. Set this parameter to the value of SubtitleName.</p>
     * 
     * <strong>example:</strong>
     * <p>sub01</p>
     */
    @NameInMap("CopyFrom")
    public String copyFrom;

    /**
     * <p>The custom description of the subtitle. The description can contain Chinese characters, letters, digits, and special characters, and can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>live AI subtitle template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The target language for translation. Valid values:</p>
     * <ul>
     * <li>English: en-US</li>
     * <li>Chinese: zh-CN</li>
     * <li>Spanish: es-ES</li>
     * <li>Russian: ru-RU.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("DstLanguage")
    public String dstLanguage;

    /**
     * <p>The font color. Specify the value in RGBA format.</p>
     * 
     * <strong>example:</strong>
     * <p>0xFFFFFF</p>
     */
    @NameInMap("FontColor")
    public String fontColor;

    /**
     * <p>The font. Valid values:</p>
     * <ul>
     * <li>KaiTi: KaiTi (default)</li>
     * <li>AlibabaPuHuiTi-Regular: Alibaba PuHuiTi Regular</li>
     * <li>AlibabaPuHuiTi-Bold: Alibaba PuHuiTi Bold</li>
     * <li>AlibabaPuHuiTi-Light: Alibaba PuHuiTi Light</li>
     * <li>NotoSansHans-Regular: Noto Sans SC Regular</li>
     * <li>NotoSansHans-Bold: Noto Sans SC Bold</li>
     * <li>NotoSansHans-Light: Noto Sans SC Light.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KaiTi</p>
     */
    @NameInMap("FontName")
    public String fontName;

    /**
     * <p>The font size. Valid values: [0, 1].</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.037</p>
     */
    @NameInMap("FontSizeNormalized")
    public Float fontSizeNormalized;

    /**
     * <p>The height of the preview screen. Unit: px.</p>
     * <p>The width × height of the preview screen supports only the following specifications:          </p>
     * <ul>
     * <li>Landscape low definition 360P: 640 × 360 </li>
     * <li>Portrait low definition 360P: 360 × 640</li>
     * <li>Landscape standard definition 480P: 854 × 480</li>
     * <li>Portrait standard definition 480P: 480 × 854</li>
     * <li>Landscape high definition 720P: 1280 × 720</li>
     * <li>Portrait high definition 720P: 720 × 1280</li>
     * <li>Landscape ultra-high definition 1080P: 1920 × 1080</li>
     * <li>Portrait ultra-high definition 1080P: 1080 × 1920.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("Height")
    public String height;

    /**
     * <p>The number of lines to display.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxLines")
    public Integer maxLines;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The position of the subtitle. The value is the x,y coordinates with the bottom-left corner of the screen as the origin.</p>
     * <blockquote>
     * <p>The x and y values must be normalized. The actual values are multiplied by the video height. For example, if the video height is 720p and PositionNormalized is set to [0.1, 0.5], the actual position of the subtitle is x = 72 and y = 360.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[0.32,0.27]</p>
     */
    @NameInMap("PositionNormalized")
    public String positionNormalizedShrink;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to display the source language. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowSourceLan")
    public Boolean showSourceLan;

    /**
     * <p>The source language. Valid values:</p>
     * <ul>
     * <li>English: en-US</li>
     * <li>Chinese: zh-CN</li>
     * <li>Russian: ru-RU.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("SrcLanguage")
    public String srcLanguage;

    /**
     * <p>The name of the subtitle template. The name can contain only digits, letters, and hyphens (-). The name cannot start with a hyphen.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sub01</p>
     */
    @NameInMap("SubtitleName")
    public String subtitleName;

    /**
     * <p>The width of the preview screen. Unit: px.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Width")
    public String width;

    /**
     * <p>The number of characters per line. Valid values: integers in the range of [1, 500].</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WordPerLine")
    public Integer wordPerLine;

    public static AddLiveAISubtitleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAISubtitleShrinkRequest self = new AddLiveAISubtitleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAISubtitleShrinkRequest setBgColor(String bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public String getBgColor() {
        return this.bgColor;
    }

    public AddLiveAISubtitleShrinkRequest setBgWidthNormalized(Float bgWidthNormalized) {
        this.bgWidthNormalized = bgWidthNormalized;
        return this;
    }
    public Float getBgWidthNormalized() {
        return this.bgWidthNormalized;
    }

    public AddLiveAISubtitleShrinkRequest setBorderWidthNormalized(Float borderWidthNormalized) {
        this.borderWidthNormalized = borderWidthNormalized;
        return this;
    }
    public Float getBorderWidthNormalized() {
        return this.borderWidthNormalized;
    }

    public AddLiveAISubtitleShrinkRequest setCopyFrom(String copyFrom) {
        this.copyFrom = copyFrom;
        return this;
    }
    public String getCopyFrom() {
        return this.copyFrom;
    }

    public AddLiveAISubtitleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddLiveAISubtitleShrinkRequest setDstLanguage(String dstLanguage) {
        this.dstLanguage = dstLanguage;
        return this;
    }
    public String getDstLanguage() {
        return this.dstLanguage;
    }

    public AddLiveAISubtitleShrinkRequest setFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }
    public String getFontColor() {
        return this.fontColor;
    }

    public AddLiveAISubtitleShrinkRequest setFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }
    public String getFontName() {
        return this.fontName;
    }

    public AddLiveAISubtitleShrinkRequest setFontSizeNormalized(Float fontSizeNormalized) {
        this.fontSizeNormalized = fontSizeNormalized;
        return this;
    }
    public Float getFontSizeNormalized() {
        return this.fontSizeNormalized;
    }

    public AddLiveAISubtitleShrinkRequest setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public AddLiveAISubtitleShrinkRequest setMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
        return this;
    }
    public Integer getMaxLines() {
        return this.maxLines;
    }

    public AddLiveAISubtitleShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveAISubtitleShrinkRequest setPositionNormalizedShrink(String positionNormalizedShrink) {
        this.positionNormalizedShrink = positionNormalizedShrink;
        return this;
    }
    public String getPositionNormalizedShrink() {
        return this.positionNormalizedShrink;
    }

    public AddLiveAISubtitleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLiveAISubtitleShrinkRequest setShowSourceLan(Boolean showSourceLan) {
        this.showSourceLan = showSourceLan;
        return this;
    }
    public Boolean getShowSourceLan() {
        return this.showSourceLan;
    }

    public AddLiveAISubtitleShrinkRequest setSrcLanguage(String srcLanguage) {
        this.srcLanguage = srcLanguage;
        return this;
    }
    public String getSrcLanguage() {
        return this.srcLanguage;
    }

    public AddLiveAISubtitleShrinkRequest setSubtitleName(String subtitleName) {
        this.subtitleName = subtitleName;
        return this;
    }
    public String getSubtitleName() {
        return this.subtitleName;
    }

    public AddLiveAISubtitleShrinkRequest setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public AddLiveAISubtitleShrinkRequest setWordPerLine(Integer wordPerLine) {
        this.wordPerLine = wordPerLine;
        return this;
    }
    public Integer getWordPerLine() {
        return this.wordPerLine;
    }

}
