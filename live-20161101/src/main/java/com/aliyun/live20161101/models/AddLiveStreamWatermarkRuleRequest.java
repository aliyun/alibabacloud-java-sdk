// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamWatermarkRuleRequest extends TeaModel {
    /**
     * <p>The AppName of the live stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The description of the custom rule.</p>
     * 
     * <strong>example:</strong>
     * <p>my rule</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The name of the custom rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WatermarkRule****</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <p>The stream name. The following rules apply:</p>
     * <ul>
     * <li><p>To match a specific stream, enter the full stream name. For example, liveStreamA.</p>
     * </li>
     * <li><p>You can use a wildcard match. The asterisk (<code>*</code>) matches all streams.</p>
     * </li>
     * <li><p>You can perform prefix and suffix matching.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You can use only one asterisk (<code>*</code>). The asterisk must be at the beginning or end of the string. The matching items must be enclosed in parentheses (<code>()</code>) and separated by a vertical bar (<code>|</code>).</p>
     * </li>
     * <li><p>For example, <code>*(t1|t2)</code> matches all streams that end with <code>t1</code> or <code>t2</code>. <code>(abc|123)*</code> matches all streams that start with <code>abc</code> or <code>123</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStreamA</p>
     */
    @NameInMap("Stream")
    public String stream;

    /**
     * <p>The ID of the watermark template.</p>
     * <blockquote>
     * <p>Get the template ID from the response of the <a href="https://help.aliyun.com/document_detail/2848096.html">AddLiveStreamWatermark</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static AddLiveStreamWatermarkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamWatermarkRuleRequest self = new AddLiveStreamWatermarkRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamWatermarkRuleRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddLiveStreamWatermarkRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddLiveStreamWatermarkRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddLiveStreamWatermarkRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddLiveStreamWatermarkRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveStreamWatermarkRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLiveStreamWatermarkRuleRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public AddLiveStreamWatermarkRuleRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
