// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAIStudioResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StudioConfigs")
    public DescribeLiveAIStudioResponseBodyStudioConfigs studioConfigs;

    /**
     * <p>The total number of templates.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeLiveAIStudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAIStudioResponseBody self = new DescribeLiveAIStudioResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAIStudioResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveAIStudioResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveAIStudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAIStudioResponseBody setStudioConfigs(DescribeLiveAIStudioResponseBodyStudioConfigs studioConfigs) {
        this.studioConfigs = studioConfigs;
        return this;
    }
    public DescribeLiveAIStudioResponseBodyStudioConfigs getStudioConfigs() {
        return this.studioConfigs;
    }

    public DescribeLiveAIStudioResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds extends TeaModel {
        @NameInMap("ruleId")
        public java.util.List<String> ruleId;

        public static DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds self = new DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig extends TeaModel {
        @NameInMap("BackgroundResourceId")
        public String backgroundResourceId;

        @NameInMap("BackgroundResourceUrl")
        public String backgroundResourceUrl;

        @NameInMap("BackgroundType")
        public String backgroundType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Height")
        public String height;

        @NameInMap("MattingLayout")
        public String mattingLayout;

        @NameInMap("MattingType")
        public String mattingType;

        @NameInMap("MediaLayout")
        public String mediaLayout;

        @NameInMap("MediaResourceId")
        public String mediaResourceId;

        @NameInMap("MediaResourceUrl")
        public String mediaResourceUrl;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("RuleIds")
        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds ruleIds;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Width")
        public String width;

        public static DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig self = new DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setBackgroundResourceId(String backgroundResourceId) {
            this.backgroundResourceId = backgroundResourceId;
            return this;
        }
        public String getBackgroundResourceId() {
            return this.backgroundResourceId;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setBackgroundResourceUrl(String backgroundResourceUrl) {
            this.backgroundResourceUrl = backgroundResourceUrl;
            return this;
        }
        public String getBackgroundResourceUrl() {
            return this.backgroundResourceUrl;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setBackgroundType(String backgroundType) {
            this.backgroundType = backgroundType;
            return this;
        }
        public String getBackgroundType() {
            return this.backgroundType;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setMattingLayout(String mattingLayout) {
            this.mattingLayout = mattingLayout;
            return this;
        }
        public String getMattingLayout() {
            return this.mattingLayout;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setMattingType(String mattingType) {
            this.mattingType = mattingType;
            return this;
        }
        public String getMattingType() {
            return this.mattingType;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setMediaLayout(String mediaLayout) {
            this.mediaLayout = mediaLayout;
            return this;
        }
        public String getMediaLayout() {
            return this.mediaLayout;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setMediaResourceId(String mediaResourceId) {
            this.mediaResourceId = mediaResourceId;
            return this;
        }
        public String getMediaResourceId() {
            return this.mediaResourceId;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setMediaResourceUrl(String mediaResourceUrl) {
            this.mediaResourceUrl = mediaResourceUrl;
            return this;
        }
        public String getMediaResourceUrl() {
            return this.mediaResourceUrl;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setRuleIds(DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class DescribeLiveAIStudioResponseBodyStudioConfigs extends TeaModel {
        @NameInMap("SubtitleConfig")
        public java.util.List<DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig> subtitleConfig;

        public static DescribeLiveAIStudioResponseBodyStudioConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAIStudioResponseBodyStudioConfigs self = new DescribeLiveAIStudioResponseBodyStudioConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAIStudioResponseBodyStudioConfigs setSubtitleConfig(java.util.List<DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig> subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public java.util.List<DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfig> getSubtitleConfig() {
            return this.subtitleConfig;
        }

    }

}
