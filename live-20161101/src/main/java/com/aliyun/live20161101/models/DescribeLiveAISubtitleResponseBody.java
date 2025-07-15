// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAISubtitleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64- af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the subtitle templates.</p>
     */
    @NameInMap("SubtitleConfigs")
    public DescribeLiveAISubtitleResponseBodySubtitleConfigs subtitleConfigs;

    public static DescribeLiveAISubtitleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAISubtitleResponseBody self = new DescribeLiveAISubtitleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAISubtitleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAISubtitleResponseBody setSubtitleConfigs(DescribeLiveAISubtitleResponseBodySubtitleConfigs subtitleConfigs) {
        this.subtitleConfigs = subtitleConfigs;
        return this;
    }
    public DescribeLiveAISubtitleResponseBodySubtitleConfigs getSubtitleConfigs() {
        return this.subtitleConfigs;
    }

    public static class DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized extends TeaModel {
        @NameInMap("Position")
        public java.util.List<Float> position;

        public static DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized self = new DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized setPosition(java.util.List<Float> position) {
            this.position = position;
            return this;
        }
        public java.util.List<Float> getPosition() {
            return this.position;
        }

    }

    public static class DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer extends TeaModel {
        @NameInMap("RulesId")
        public java.util.List<String> rulesId;

        public static DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer self = new DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer setRulesId(java.util.List<String> rulesId) {
            this.rulesId = rulesId;
            return this;
        }
        public java.util.List<String> getRulesId() {
            return this.rulesId;
        }

    }

    public static class DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig extends TeaModel {
        /**
         * <p>The background color of the subtitles.</p>
         * 
         * <strong>example:</strong>
         * <p>0xFF0000</p>
         */
        @NameInMap("BgColor")
        public String bgColor;

        /**
         * <p>The size of the background image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.09</p>
         */
        @NameInMap("BgWidthNormalized")
        public Float bgWidthNormalized;

        /**
         * <p>The font weight.</p>
         * 
         * <strong>example:</strong>
         * <p>0.05</p>
         */
        @NameInMap("BorderWidthNormalized")
        public Float borderWidthNormalized;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>live AI subtitle template</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The language to which the subtitles are translated.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("DstLanguage")
        public String dstLanguage;

        /**
         * <p>The font color.</p>
         * 
         * <strong>example:</strong>
         * <p>0xFFFFFF</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font.</p>
         * 
         * <strong>example:</strong>
         * <p>AlibabaPuHuiTi-Regular</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>0.037</p>
         */
        @NameInMap("FontSizeNormalized")
        public String fontSizeNormalized;

        /**
         * <p>The height of the preview image.</p>
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

        /**
         * <p>The position of the subtitles.</p>
         */
        @NameInMap("PositionNormalized")
        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized positionNormalized;

        /**
         * <p>The ID of the subtitle rule.</p>
         */
        @NameInMap("RulesRefer")
        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer rulesRefer;

        /**
         * <p>Indicates whether the source language of the subtitle is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowSourceLan")
        public Integer showSourceLan;

        /**
         * <p>The source language of the subtitles.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("SrcLanguage")
        public String srcLanguage;

        /**
         * <p>The ID of the subtitle template.</p>
         * 
         * <strong>example:</strong>
         * <p>597991f3-6ef9-4100-9238-82951de1****</p>
         */
        @NameInMap("SubtitleId")
        public String subtitleId;

        /**
         * <p>The name of the subtitle template.</p>
         * 
         * <strong>example:</strong>
         * <p>sub1</p>
         */
        @NameInMap("SubtitleName")
        public String subtitleName;

        /**
         * <p>The width of the preview image.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The number of words per line.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WordPerline")
        public Integer wordPerline;

        public static DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig self = new DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setBgWidthNormalized(Float bgWidthNormalized) {
            this.bgWidthNormalized = bgWidthNormalized;
            return this;
        }
        public Float getBgWidthNormalized() {
            return this.bgWidthNormalized;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setBorderWidthNormalized(Float borderWidthNormalized) {
            this.borderWidthNormalized = borderWidthNormalized;
            return this;
        }
        public Float getBorderWidthNormalized() {
            return this.borderWidthNormalized;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setDstLanguage(String dstLanguage) {
            this.dstLanguage = dstLanguage;
            return this;
        }
        public String getDstLanguage() {
            return this.dstLanguage;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setFontSizeNormalized(String fontSizeNormalized) {
            this.fontSizeNormalized = fontSizeNormalized;
            return this;
        }
        public String getFontSizeNormalized() {
            return this.fontSizeNormalized;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setMaxLines(Integer maxLines) {
            this.maxLines = maxLines;
            return this;
        }
        public Integer getMaxLines() {
            return this.maxLines;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setPositionNormalized(DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized positionNormalized) {
            this.positionNormalized = positionNormalized;
            return this;
        }
        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized getPositionNormalized() {
            return this.positionNormalized;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setRulesRefer(DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer rulesRefer) {
            this.rulesRefer = rulesRefer;
            return this;
        }
        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer getRulesRefer() {
            return this.rulesRefer;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setShowSourceLan(Integer showSourceLan) {
            this.showSourceLan = showSourceLan;
            return this;
        }
        public Integer getShowSourceLan() {
            return this.showSourceLan;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setSrcLanguage(String srcLanguage) {
            this.srcLanguage = srcLanguage;
            return this;
        }
        public String getSrcLanguage() {
            return this.srcLanguage;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setSubtitleId(String subtitleId) {
            this.subtitleId = subtitleId;
            return this;
        }
        public String getSubtitleId() {
            return this.subtitleId;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setSubtitleName(String subtitleName) {
            this.subtitleName = subtitleName;
            return this;
        }
        public String getSubtitleName() {
            return this.subtitleName;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig setWordPerline(Integer wordPerline) {
            this.wordPerline = wordPerline;
            return this;
        }
        public Integer getWordPerline() {
            return this.wordPerline;
        }

    }

    public static class DescribeLiveAISubtitleResponseBodySubtitleConfigs extends TeaModel {
        @NameInMap("SubtitleConfig")
        public java.util.List<DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig> subtitleConfig;

        public static DescribeLiveAISubtitleResponseBodySubtitleConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAISubtitleResponseBodySubtitleConfigs self = new DescribeLiveAISubtitleResponseBodySubtitleConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAISubtitleResponseBodySubtitleConfigs setSubtitleConfig(java.util.List<DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig> subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public java.util.List<DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfig> getSubtitleConfig() {
            return this.subtitleConfig;
        }

    }

}
