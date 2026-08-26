// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAISubtitleShrinkRequest extends TeaModel {
    /**
     * <p>The background color of the subtitle. The value is in RGBA format.</p>
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
     * <p>The custom description of the subtitle. The description can contain Chinese characters, letters, digits, and special characters, and cannot exceed 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>live AI subtitle template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The target language for translation. Valid values:</p>
     * <ul>
     * <li>en-US: English</li>
     * <li>zh-CN: Chinese</li>
     * <li>es-ES: Spanish</li>
     * <li>ru-RU: Russian.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("DstLanguage")
    public String dstLanguage;

    /**
     * <p>The font color. The value is in RGBA format.</p>
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
     * <li>NotoSansHans-Regular: Noto Sans Hans Regular</li>
     * <li>NotoSansHans-Bold: Noto Sans Hans Bold</li>
     * <li>NotoSansHans-Light: Noto Sans Hans Light.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KaiTi</p>
     */
    @NameInMap("FontName")
    public String fontName;

    /**
     * <p>The font size. Valid values: [0, 1].</p>
     * 
     * <strong>example:</strong>
     * <p>0.037</p>
     */
    @NameInMap("FontSizeNormalized")
    public Float fontSizeNormalized;

    /**
     * <p>The height of the preview screen. Unit: px.</p>
     * <p>The width × height of the preview screen supports only the following specifications:</p>
     * <ul>
     * <li>Landscape low definition 360P: 640×360</li>
     * <li>Portrait low definition 360P: 360×640</li>
     * <li>Landscape standard definition 480P: 854×480</li>
     * <li>Portrait standard definition 480P: 480×854</li>
     * <li>Landscape high definition 720P: 1280×720</li>
     * <li>Portrait high definition 720P: 720×1280</li>
     * <li>Landscape ultra-high definition 1080P: 1920×1080</li>
     * <li>Portrait ultra-high definition 1080P: 1080×1920.</li>
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
     * <p>The position of the subtitle, specified as x and y coordinates with the bottom-left corner of the screen as the origin.</p>
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
     * <li>en-US: English</li>
     * <li>zh-CN: Chinese</li>
     * <li>ru-RU: Russian.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("SrcLanguage")
    public String srcLanguage;

    /**
     * <p>The ID of the subtitle template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>597991f3-6ef9-4100-9238-82951de1****</p>
     */
    @NameInMap("SubtitleId")
    public String subtitleId;

    /**
     * <p>The name of the subtitle template. The name can contain only digits, letters, and hyphens (-). The name cannot start with a hyphen.</p>
     * 
     * <strong>example:</strong>
     * <p>live AI subtitle template</p>
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
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WordPerLine")
    public Integer wordPerLine;

    public static UpdateLiveAISubtitleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAISubtitleShrinkRequest self = new UpdateLiveAISubtitleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAISubtitleShrinkRequest setBgColor(String bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public String getBgColor() {
        return this.bgColor;
    }

    public UpdateLiveAISubtitleShrinkRequest setBgWidthNormalized(Float bgWidthNormalized) {
        this.bgWidthNormalized = bgWidthNormalized;
        return this;
    }
    public Float getBgWidthNormalized() {
        return this.bgWidthNormalized;
    }

    public UpdateLiveAISubtitleShrinkRequest setBorderWidthNormalized(Float borderWidthNormalized) {
        this.borderWidthNormalized = borderWidthNormalized;
        return this;
    }
    public Float getBorderWidthNormalized() {
        return this.borderWidthNormalized;
    }

    public UpdateLiveAISubtitleShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLiveAISubtitleShrinkRequest setDstLanguage(String dstLanguage) {
        this.dstLanguage = dstLanguage;
        return this;
    }
    public String getDstLanguage() {
        return this.dstLanguage;
    }

    public UpdateLiveAISubtitleShrinkRequest setFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }
    public String getFontColor() {
        return this.fontColor;
    }

    public UpdateLiveAISubtitleShrinkRequest setFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }
    public String getFontName() {
        return this.fontName;
    }

    public UpdateLiveAISubtitleShrinkRequest setFontSizeNormalized(Float fontSizeNormalized) {
        this.fontSizeNormalized = fontSizeNormalized;
        return this;
    }
    public Float getFontSizeNormalized() {
        return this.fontSizeNormalized;
    }

    public UpdateLiveAISubtitleShrinkRequest setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public UpdateLiveAISubtitleShrinkRequest setMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
        return this;
    }
    public Integer getMaxLines() {
        return this.maxLines;
    }

    public UpdateLiveAISubtitleShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveAISubtitleShrinkRequest setPositionNormalizedShrink(String positionNormalizedShrink) {
        this.positionNormalizedShrink = positionNormalizedShrink;
        return this;
    }
    public String getPositionNormalizedShrink() {
        return this.positionNormalizedShrink;
    }

    public UpdateLiveAISubtitleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveAISubtitleShrinkRequest setShowSourceLan(Boolean showSourceLan) {
        this.showSourceLan = showSourceLan;
        return this;
    }
    public Boolean getShowSourceLan() {
        return this.showSourceLan;
    }

    public UpdateLiveAISubtitleShrinkRequest setSrcLanguage(String srcLanguage) {
        this.srcLanguage = srcLanguage;
        return this;
    }
    public String getSrcLanguage() {
        return this.srcLanguage;
    }

    public UpdateLiveAISubtitleShrinkRequest setSubtitleId(String subtitleId) {
        this.subtitleId = subtitleId;
        return this;
    }
    public String getSubtitleId() {
        return this.subtitleId;
    }

    public UpdateLiveAISubtitleShrinkRequest setSubtitleName(String subtitleName) {
        this.subtitleName = subtitleName;
        return this;
    }
    public String getSubtitleName() {
        return this.subtitleName;
    }

    public UpdateLiveAISubtitleShrinkRequest setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public UpdateLiveAISubtitleShrinkRequest setWordPerLine(Integer wordPerLine) {
        this.wordPerLine = wordPerLine;
        return this;
    }
    public Integer getWordPerLine() {
        return this.wordPerLine;
    }

}
