// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamWatermarkRuleRequest extends TeaModel {
    /**
     * <p>The AppName of the live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the watermark rule.</p>
     * <blockquote>
     * <p>Get this ID from the response of the <a href="https://help.aliyun.com/document_detail/2848100.html">AddLiveStreamWatermarkRule</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The stream name. The following rules apply:</p>
     * <ul>
     * <li><p>To match a specific stream, enter the full stream name. Example: liveStreamA.</p>
     * </li>
     * <li><p>Use a wildcard for matching. The asterisk (\*) matches all streams.</p>
     * </li>
     * <li><p>You can match by prefix or suffix.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>For wildcard matching, use only one asterisk (\*) at the beginning or end of the string. Enclose matching items in parentheses. Separate multiple matching items with a vertical bar (|).</p>
     * </li>
     * <li><p>Example: <code>*(t1|t2)</code> matches all streams ending with <code>t1</code> or <code>t2</code>. <code>(abc|123)*</code> matches all streams starting with <code>abc</code> or <code>123</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>liveStreamA</p>
     */
    @NameInMap("Stream")
    public String stream;

    public static DeleteLiveStreamWatermarkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamWatermarkRuleRequest self = new DeleteLiveStreamWatermarkRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamWatermarkRuleRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DeleteLiveStreamWatermarkRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteLiveStreamWatermarkRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveStreamWatermarkRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLiveStreamWatermarkRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DeleteLiveStreamWatermarkRuleRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
