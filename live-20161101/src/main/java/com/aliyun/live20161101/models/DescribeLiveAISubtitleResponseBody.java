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
        @NameInMap("BgColor")
        public String bgColor;

        @NameInMap("BgWidthNormalized")
        public Float bgWidthNormalized;

        @NameInMap("BorderWidthNormalized")
        public Float borderWidthNormalized;

        @NameInMap("Description")
        public String description;

        @NameInMap("DstLanguage")
        public String dstLanguage;

        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("FontSizeNormalized")
        public String fontSizeNormalized;

        @NameInMap("Height")
        public String height;

        @NameInMap("MaxLines")
        public Integer maxLines;

        @NameInMap("PositionNormalized")
        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigPositionNormalized positionNormalized;

        @NameInMap("RulesRefer")
        public DescribeLiveAISubtitleResponseBodySubtitleConfigsSubtitleConfigRulesRefer rulesRefer;

        @NameInMap("ShowSourceLan")
        public Integer showSourceLan;

        @NameInMap("SrcLanguage")
        public String srcLanguage;

        @NameInMap("SubtitleId")
        public String subtitleId;

        @NameInMap("SubtitleName")
        public String subtitleName;

        @NameInMap("Width")
        public String width;

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
