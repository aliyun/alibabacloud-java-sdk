// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateVideoProcessingRequest extends TeaModel {
    /**
     * <p>The custom FLV end parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("FlvSeekEnd")
    public String flvSeekEnd;

    /**
     * <p>The custom FLV start parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("FlvSeekStart")
    public String flvSeekStart;

    /**
     * <p>The FLV seek mode. Valid values:</p>
     * <ul>
     * <li>by_byte: seek by byte.</li>
     * <li>by_time: seek by time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>by_byte</p>
     */
    @NameInMap("FlvVideoSeekMode")
    public String flvVideoSeekMode;

    /**
     * <p>The custom MP4 end parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("Mp4SeekEnd")
    public String mp4SeekEnd;

    /**
     * <p>The custom MP4 start parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Mp4SeekStart")
    public String mp4SeekStart;

    /**
     * <p>The rule content, which uses conditional expressions to match user requests. You do not need to set this parameter when adding a global configuration. Two usage scenarios are supported:</p>
     * <ul>
     * <li>Match all incoming requests: set the value to true.</li>
     * <li>Match specified requests: set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The rule switch. You do not need to set this parameter when adding a global configuration. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. You do not need to set this parameter when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule execution order. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. The default value is version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>The video seek (drag-and-play) switch. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("VideoSeekEnable")
    public String videoSeekEnable;

    public static CreateVideoProcessingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoProcessingRequest self = new CreateVideoProcessingRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoProcessingRequest setFlvSeekEnd(String flvSeekEnd) {
        this.flvSeekEnd = flvSeekEnd;
        return this;
    }
    public String getFlvSeekEnd() {
        return this.flvSeekEnd;
    }

    public CreateVideoProcessingRequest setFlvSeekStart(String flvSeekStart) {
        this.flvSeekStart = flvSeekStart;
        return this;
    }
    public String getFlvSeekStart() {
        return this.flvSeekStart;
    }

    public CreateVideoProcessingRequest setFlvVideoSeekMode(String flvVideoSeekMode) {
        this.flvVideoSeekMode = flvVideoSeekMode;
        return this;
    }
    public String getFlvVideoSeekMode() {
        return this.flvVideoSeekMode;
    }

    public CreateVideoProcessingRequest setMp4SeekEnd(String mp4SeekEnd) {
        this.mp4SeekEnd = mp4SeekEnd;
        return this;
    }
    public String getMp4SeekEnd() {
        return this.mp4SeekEnd;
    }

    public CreateVideoProcessingRequest setMp4SeekStart(String mp4SeekStart) {
        this.mp4SeekStart = mp4SeekStart;
        return this;
    }
    public String getMp4SeekStart() {
        return this.mp4SeekStart;
    }

    public CreateVideoProcessingRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateVideoProcessingRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateVideoProcessingRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateVideoProcessingRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateVideoProcessingRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateVideoProcessingRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public CreateVideoProcessingRequest setVideoSeekEnable(String videoSeekEnable) {
        this.videoSeekEnable = videoSeekEnable;
        return this;
    }
    public String getVideoSeekEnable() {
        return this.videoSeekEnable;
    }

}
