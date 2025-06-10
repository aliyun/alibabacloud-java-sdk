// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateVideoProcessingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

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
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
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
     * <p>on</p>
     */
    @NameInMap("VideoSeekEnable")
    public String videoSeekEnable;

    public static UpdateVideoProcessingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoProcessingRequest self = new UpdateVideoProcessingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoProcessingRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateVideoProcessingRequest setFlvSeekEnd(String flvSeekEnd) {
        this.flvSeekEnd = flvSeekEnd;
        return this;
    }
    public String getFlvSeekEnd() {
        return this.flvSeekEnd;
    }

    public UpdateVideoProcessingRequest setFlvSeekStart(String flvSeekStart) {
        this.flvSeekStart = flvSeekStart;
        return this;
    }
    public String getFlvSeekStart() {
        return this.flvSeekStart;
    }

    public UpdateVideoProcessingRequest setFlvVideoSeekMode(String flvVideoSeekMode) {
        this.flvVideoSeekMode = flvVideoSeekMode;
        return this;
    }
    public String getFlvVideoSeekMode() {
        return this.flvVideoSeekMode;
    }

    public UpdateVideoProcessingRequest setMp4SeekEnd(String mp4SeekEnd) {
        this.mp4SeekEnd = mp4SeekEnd;
        return this;
    }
    public String getMp4SeekEnd() {
        return this.mp4SeekEnd;
    }

    public UpdateVideoProcessingRequest setMp4SeekStart(String mp4SeekStart) {
        this.mp4SeekStart = mp4SeekStart;
        return this;
    }
    public String getMp4SeekStart() {
        return this.mp4SeekStart;
    }

    public UpdateVideoProcessingRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateVideoProcessingRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateVideoProcessingRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateVideoProcessingRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateVideoProcessingRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateVideoProcessingRequest setVideoSeekEnable(String videoSeekEnable) {
        this.videoSeekEnable = videoSeekEnable;
        return this;
    }
    public String getVideoSeekEnable() {
        return this.videoSeekEnable;
    }

}
