// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateVideoProcessingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("FlvSeekEnd")
    public String flvSeekEnd;

    /**
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("FlvSeekStart")
    public String flvSeekStart;

    /**
     * <strong>example:</strong>
     * <p>by_byte</p>
     */
    @NameInMap("FlvVideoSeekMode")
    public String flvVideoSeekMode;

    /**
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("Mp4SeekEnd")
    public String mp4SeekEnd;

    /**
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Mp4SeekStart")
    public String mp4SeekStart;

    /**
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
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
