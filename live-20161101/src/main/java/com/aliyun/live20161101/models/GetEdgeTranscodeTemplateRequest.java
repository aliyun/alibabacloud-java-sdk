// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEdgeTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the data center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3b-4d18-395c-8106-ff21a6</strong></strong></strong></p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287666</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetEdgeTranscodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeTranscodeTemplateRequest self = new GetEdgeTranscodeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeTranscodeTemplateRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetEdgeTranscodeTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetEdgeTranscodeTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEdgeTranscodeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
