// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAISubtitleRequest extends TeaModel {
    /**
     * <p>The background color of the subtitles. Color format: RGBA.</p>
     * 
     * <strong>example:</strong>
     * <p>0xFF0000</p>
     */
    @NameInMap("BgColor")
    public String bgColor;

    /**
     * <p>The size of the background box. Valid values: [0,1].</p>
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
     * <p>The description of the subtitle template. The description can be up to 128 characters in length and can contain letters, digits, and special characters.</p>
     * 
     * <strong>example:</strong>
     * <p>live AI subtitle template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The target language. Valid values:</p>
     * <ul>
     * <li>en-US: English</li>
     * <li>zh-CN: Chinese</li>
     * <li>es-ES: Spanish</li>
     * <li>ru-RU: Russian</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("DstLanguage")
    public String dstLanguage;

    /**
     * <p>The font color. Color format: RGBA.</p>
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
     * 
     * <strong>example:</strong>
     * <p>0.037</p>
     */
    @NameInMap("FontSizeNormalized")
    public Float fontSizeNormalized;

    /**
     * <p>The height of the preview. Unit: pixels.</p>
     * <p>The following preview specifications (width x height) are supported:</p>
     * <ul>
     * <li>360p (640 x 360)</li>
     * <li>360p (360 x 640)</li>
     * <li>480p (854 x 480)</li>
     * <li>480p (480 x 854)</li>
     * <li>720p (1280 x 720)</li>
     * <li>720p (720 x 1280)</li>
     * <li>1080p (1920 x 1080)</li>
     * <li>1080p (1080 x 1920)</li>
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
     * <p>The position of the subtitles relative to the lower-left corner of the screen. The value is a pair of coordinates.</p>
     */
    @NameInMap("PositionNormalized")
    public java.util.List<Float> positionNormalized;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to display the source language. Valid values: true and false. Default value: false.</p>
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
     * <li>ru-RU: Russian</li>
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
     * <p>The name of the subtitle template. The name can contain digits, letters, and hyphens (-) but cannot start with a hyphen (-).</p>
     * 
     * <strong>example:</strong>
     * <p>live AI subtitle template</p>
     */
    @NameInMap("SubtitleName")
    public String subtitleName;

    /**
     * <p>The width of the preview. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Width")
    public String width;

    /**
     * <p>The number of characters per line. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WordPerLine")
    public Integer wordPerLine;

    public static UpdateLiveAISubtitleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAISubtitleRequest self = new UpdateLiveAISubtitleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAISubtitleRequest setBgColor(String bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public String getBgColor() {
        return this.bgColor;
    }

    public UpdateLiveAISubtitleRequest setBgWidthNormalized(Float bgWidthNormalized) {
        this.bgWidthNormalized = bgWidthNormalized;
        return this;
    }
    public Float getBgWidthNormalized() {
        return this.bgWidthNormalized;
    }

    public UpdateLiveAISubtitleRequest setBorderWidthNormalized(Float borderWidthNormalized) {
        this.borderWidthNormalized = borderWidthNormalized;
        return this;
    }
    public Float getBorderWidthNormalized() {
        return this.borderWidthNormalized;
    }

    public UpdateLiveAISubtitleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLiveAISubtitleRequest setDstLanguage(String dstLanguage) {
        this.dstLanguage = dstLanguage;
        return this;
    }
    public String getDstLanguage() {
        return this.dstLanguage;
    }

    public UpdateLiveAISubtitleRequest setFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }
    public String getFontColor() {
        return this.fontColor;
    }

    public UpdateLiveAISubtitleRequest setFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }
    public String getFontName() {
        return this.fontName;
    }

    public UpdateLiveAISubtitleRequest setFontSizeNormalized(Float fontSizeNormalized) {
        this.fontSizeNormalized = fontSizeNormalized;
        return this;
    }
    public Float getFontSizeNormalized() {
        return this.fontSizeNormalized;
    }

    public UpdateLiveAISubtitleRequest setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public UpdateLiveAISubtitleRequest setMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
        return this;
    }
    public Integer getMaxLines() {
        return this.maxLines;
    }

    public UpdateLiveAISubtitleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveAISubtitleRequest setPositionNormalized(java.util.List<Float> positionNormalized) {
        this.positionNormalized = positionNormalized;
        return this;
    }
    public java.util.List<Float> getPositionNormalized() {
        return this.positionNormalized;
    }

    public UpdateLiveAISubtitleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveAISubtitleRequest setShowSourceLan(Boolean showSourceLan) {
        this.showSourceLan = showSourceLan;
        return this;
    }
    public Boolean getShowSourceLan() {
        return this.showSourceLan;
    }

    public UpdateLiveAISubtitleRequest setSrcLanguage(String srcLanguage) {
        this.srcLanguage = srcLanguage;
        return this;
    }
    public String getSrcLanguage() {
        return this.srcLanguage;
    }

    public UpdateLiveAISubtitleRequest setSubtitleId(String subtitleId) {
        this.subtitleId = subtitleId;
        return this;
    }
    public String getSubtitleId() {
        return this.subtitleId;
    }

    public UpdateLiveAISubtitleRequest setSubtitleName(String subtitleName) {
        this.subtitleName = subtitleName;
        return this;
    }
    public String getSubtitleName() {
        return this.subtitleName;
    }

    public UpdateLiveAISubtitleRequest setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public UpdateLiveAISubtitleRequest setWordPerLine(Integer wordPerLine) {
        this.wordPerLine = wordPerLine;
        return this;
    }
    public Integer getWordPerLine() {
        return this.wordPerLine;
    }

}
