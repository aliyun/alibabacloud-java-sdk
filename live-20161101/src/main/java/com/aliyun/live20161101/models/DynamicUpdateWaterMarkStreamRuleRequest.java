// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DynamicUpdateWaterMarkStreamRuleRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
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
     * <p>pull.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stream that contains the watermark.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("Stream")
    public String stream;

    /**
     * <p>The watermark template ID. You can call the <a href="https://help.aliyun.com/document_detail/2848102.html">DescribeLiveStreamWatermarks</a> operation to obtain available watermark template IDs.</p>
     * <blockquote>
     * <p> The TemplateId parameter is used to replace the watermark template ID during live streaming.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>749b7594-86d6-37b1-513b-e1e19845****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DynamicUpdateWaterMarkStreamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DynamicUpdateWaterMarkStreamRuleRequest self = new DynamicUpdateWaterMarkStreamRuleRequest();
        return TeaModel.build(map, self);
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
