// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamWatermarkRuleRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the watermark rule.</p>
     * <blockquote>
     * <p> You can obtain the rule ID by checking the value of the RuleId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/2848100.html">AddLiveStreamWatermarkRule</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the stream. The following matching rules apply:</p>
     * <ul>
     * <li>A stream name can be exactly matched, Example: liveStreamA.</li>
     * <li>Fuzzy match is also supported. The use of an asterisk (<code>*</code>) allows all approximate matches to be found.</li>
     * <li>You can place the asterisk before or after an approximate string.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Fuzzy match: Only one asterisk (<code>*</code>) before or after an approximate string is allowed. The approximate string must be enclosed in <code>()</code>. Separate multiple strings with vertical bars (<code>|</code>).</p>
     * </li>
     * <li><p>For example, <code>*(t1|t2)</code> matches all streams whose name has the <code>t1</code> or <code>t2</code> suffix, and <code>(abc|123)*</code> matches all streams whose name has the <code>abc</code> or <code>123</code> prefix.</p>
     * </li>
     * </ul>
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
