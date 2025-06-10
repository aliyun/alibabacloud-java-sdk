// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetVideoProcessingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

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
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static GetVideoProcessingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoProcessingResponseBody self = new GetVideoProcessingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoProcessingResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetVideoProcessingResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetVideoProcessingResponseBody setFlvSeekEnd(String flvSeekEnd) {
        this.flvSeekEnd = flvSeekEnd;
        return this;
    }
    public String getFlvSeekEnd() {
        return this.flvSeekEnd;
    }

    public GetVideoProcessingResponseBody setFlvSeekStart(String flvSeekStart) {
        this.flvSeekStart = flvSeekStart;
        return this;
    }
    public String getFlvSeekStart() {
        return this.flvSeekStart;
    }

    public GetVideoProcessingResponseBody setFlvVideoSeekMode(String flvVideoSeekMode) {
        this.flvVideoSeekMode = flvVideoSeekMode;
        return this;
    }
    public String getFlvVideoSeekMode() {
        return this.flvVideoSeekMode;
    }

    public GetVideoProcessingResponseBody setMp4SeekEnd(String mp4SeekEnd) {
        this.mp4SeekEnd = mp4SeekEnd;
        return this;
    }
    public String getMp4SeekEnd() {
        return this.mp4SeekEnd;
    }

    public GetVideoProcessingResponseBody setMp4SeekStart(String mp4SeekStart) {
        this.mp4SeekStart = mp4SeekStart;
        return this;
    }
    public String getMp4SeekStart() {
        return this.mp4SeekStart;
    }

    public GetVideoProcessingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoProcessingResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetVideoProcessingResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetVideoProcessingResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetVideoProcessingResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetVideoProcessingResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public GetVideoProcessingResponseBody setVideoSeekEnable(String videoSeekEnable) {
        this.videoSeekEnable = videoSeekEnable;
        return this;
    }
    public String getVideoSeekEnable() {
        return this.videoSeekEnable;
    }

}
