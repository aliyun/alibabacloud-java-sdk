// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAISubtitleShrinkRequest extends TeaModel {
    /**
     * <p>The background color of the subtitles, which is an RGBA value.</p>
     * 
     * <strong>example:</strong>
     * <p>0xFF0000</p>
     */
    @NameInMap("BgColor")
    public String bgColor;

    /**
     * <p>The background size of the subtitles. Valid values: [0,1].</p>
     * 
     * <strong>example:</strong>
     * <p>0.09</p>
     */
    @NameInMap("BgWidthNormalized")
    public Float bgWidthNormalized;

    /**
     * <p>The font weight. Valid values: [0,1].</p>
     * 
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("BorderWidthNormalized")
    public Float borderWidthNormalized;

    /**
     * <p>The subtitle template that you copy. Set the value to the name of the subtitle template.</p>
     * 
     * <strong>example:</strong>
     * <p>sub01</p>
     */
    @NameInMap("CopyFrom")
    public String copyFrom;

    /**
     * <p>The custom description of the subtitle template. The description can be up to 128 characters in length and can contain letters, digits, and special characters.</p>
     * 
     * <strong>example:</strong>
     * <p>live AI subtitle template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The target language. Valid values:</p>
     * <ul>
     * <li>en-US: English </li>
     * <li>zh-CN: Chinese </li>
     * <li>es-ES: Spanish </li>
     * <li>ru-RU: Russian</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("DstLanguage")
    public String dstLanguage;

    /**
     * <p>The font color, which is an RGBA value.</p>
     * 
     * <strong>example:</strong>
     * <p>0xFFFFFF</p>
     */
    @NameInMap("FontColor")
    public String fontColor;

    /**
     * <p>The font. Valid values:</p>
     * <ul>
     * <li>KaiTi (default)</li>
     * <li>AlibabaPuHuiTi-Regular</li>
     * <li>AlibabaPuHuiTi-Bold</li>
     * <li>AlibabaPuHuiTi-Light</li>
     * <li>NotoSansHans-Regular</li>
     * <li>NotoSansHans-Bold</li>
     * <li>NotoSansHans-Light</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KaiTi</p>
     */
    @NameInMap("FontName")
    public String fontName;

    /**
     * <p>The font size. Valid values: [0,1].</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.037</p>
     */
    @NameInMap("FontSizeNormalized")
    public Float fontSizeNormalized;

    /**
     * <p>The preview height. Unit: pixels.
     * The following specifications of preview width × preview height are supported: </p>
     * <ul>
     * <li>Landscape low definition 360p (640×360) </li>
     * <li>Portrait low definition 360p (360×640)</li>
     * <li>Landscape standard definition 480p (854×480)</li>
     * <li>Portrait standard definition 480p (480×854)</li>
     * <li>Landscape high definition 720p (1280×720)</li>
     * <li>Portrait high definition 720p (720×1280)</li>
     * <li>Landscape ultra-high definition 1080p (1920×1080)</li>
     * <li>Portrait ultra-high definition 1080p (1080×1920)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("Height")
    public String height;

    /**
     * <p>The number of displayed lines.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxLines")
    public Integer maxLines;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The position of the subtitles. The value is a pair of coordinates for which the origin of the x and y axes is the lower-left corner of the screen.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PositionNormalized")
    public String positionNormalizedShrink;

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
     * <li>en-US: English </li>
     * <li>zh-CN: Chinese </li>
     * <li>ru-RU: Russian</li>
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
     * <p>The preview width. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Width")
    public String width;

    /**
     * <p>The number of words displayed per line. Valid values: integers from 1 to 500.</p>
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
