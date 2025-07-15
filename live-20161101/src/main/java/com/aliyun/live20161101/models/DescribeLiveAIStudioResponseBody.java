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

    /**
     * <p>The virtual studio templates.</p>
     */
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
        /**
         * <p>The ID of the background material.</p>
         * 
         * <strong>example:</strong>
         * <p>d0eb493192c771efba644531858c0102</p>
         */
        @NameInMap("BackgroundResourceId")
        public String backgroundResourceId;

        /**
         * <p>The URL of the background material. Make sure that the URL is accessible over the Internet. Either this parameter or the BackgroundResourceId parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://testbucket.xx.com/2.jpg">https://testbucket.xx.com/2.jpg</a></p>
         */
        @NameInMap("BackgroundResourceUrl")
        public String backgroundResourceUrl;

        /**
         * <p>The type of the background material. Valid values:</p>
         * <ul>
         * <li>VOD: a video in ApsaraVideo VOD</li>
         * <li>PIC: an image</li>
         * <li>LIVE: a live stream</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VOD</p>
         */
        @NameInMap("BackgroundType")
        public String backgroundType;

        /**
         * <p>The custom description.</p>
         * 
         * <strong>example:</strong>
         * <p>user defined description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The preview height. Unit: pixels.</p>
         * <p>The following preview specifications (width × height) are supported:</p>
         * <ul>
         * <li>Landscape low definition 360p (640×360)</li>
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
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The layout information of the multimedia material.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;positionY\&quot;:\&quot;0.0\&quot;,\&quot;positionX\&quot;:\&quot;0.0\&quot;,\&quot;heightNormalized\&quot;:\&quot;0.5\&quot;}&quot;</p>
         */
        @NameInMap("MattingLayout")
        public String mattingLayout;

        /**
         * <p>The type of chroma key that is performed on ingested streams. Valid values:</p>
         * <ul>
         * <li>green: green-key chroma key</li>
         * <li>blue: blue-screen chroma key</li>
         * <li>complex: background replacement</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>complex</p>
         */
        @NameInMap("MattingType")
        public String mattingType;

        /**
         * <p>LIVE, live streaming</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;positionY\&quot;:\&quot;0.0\&quot;,\&quot;positionX\&quot;:\&quot;0.0\&quot;,\&quot;heightNormalized\&quot;:\&quot;0.5\&quot;}&quot;</p>
         */
        @NameInMap("MediaLayout")
        public String mediaLayout;

        /**
         * <p>The ID of the multimedia material in ApsaraVideo VOD.</p>
         * 
         * <strong>example:</strong>
         * <p>d0eb493192c771efba644531858c0102</p>
         */
        @NameInMap("MediaResourceId")
        public String mediaResourceId;

        /**
         * <p>The URL of the multimedia material.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://testbucket.xx.com/2.jpg">https://testbucket.xx.com/2.jpg</a></p>
         */
        @NameInMap("MediaResourceUrl")
        public String mediaResourceUrl;

        /**
         * <p>The type of the multimedia material. Valid values:</p>
         * <ul>
         * <li>VOD: a video in ApsaraVideo VOD</li>
         * <li>PIC: an image</li>
         * <li>LIVE: a live stream</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VOD</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The IDs of the bound rules.</p>
         */
        @NameInMap("RuleIds")
        public DescribeLiveAIStudioResponseBodyStudioConfigsSubtitleConfigRuleIds ruleIds;

        /**
         * <p>The ID of the virtual studio template.</p>
         * 
         * <strong>example:</strong>
         * <p>24654384-f5ac-40ea-823b-74e85a61dd9f</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the virtual studio template. The name is the same as the value of the StudioName parameter that was specified when you called the CreateLiveAiStudio operation to create the virtual studio template.</p>
         * 
         * <strong>example:</strong>
         * <p>studio1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The preview width.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
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
