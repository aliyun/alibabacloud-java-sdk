// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateVideoProcessingRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. You can call the <a href="~~ListVideoProcessings~~">ListVideoProcessings</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The custom end parameter for FLV files.</p>
     * 
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("FlvSeekEnd")
    public String flvSeekEnd;

    /**
     * <p>The custom start parameter for FLV files.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("FlvSeekStart")
    public String flvSeekStart;

    /**
     * <p>FLV Seeking Valid values:</p>
     * <ul>
     * <li>by_byte: Seek by byte.</li>
     * <li>by_time: Seek by time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>by_byte</p>
     */
    @NameInMap("FlvVideoSeekMode")
    public String flvVideoSeekMode;

    /**
     * <p>Customize the mp4 end parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("Mp4SeekEnd")
    public String mp4SeekEnd;

    /**
     * <p>Customize the mp4 start parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Mp4SeekStart")
    public String mp4SeekStart;

    /**
     * <p>The content of the rule. A conditional expression is used to match a user request. You do not need to set this parameter when you add global configuration. Two scenarios:</p>
     * <ul>
     * <li>true: Match all incoming requests</li>
     * <li>Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;): Match the specified request</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. Valid values: You do not need to set this parameter when you add global configuration. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. You do not need to set this parameter when you add global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The order in which the rule is executed. A smaller value gives priority to the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Video seeking. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
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
