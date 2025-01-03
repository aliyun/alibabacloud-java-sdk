// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateQosPolicyShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("FederationId")
    public String federationId;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("FlowIds")
    public String flowIdsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("MaxIOBandWidth")
    public Long maxIOBandWidth;

    @NameInMap("MaxIOps")
    public Long maxIOps;

    @NameInMap("MaxMetaQps")
    public Long maxMetaQps;

    @NameInMap("ZoneIds")
    public String zoneIdsShrink;

    public static CreateQosPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQosPolicyShrinkRequest self = new CreateQosPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateQosPolicyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateQosPolicyShrinkRequest setFederationId(String federationId) {
        this.federationId = federationId;
        return this;
    }
    public String getFederationId() {
        return this.federationId;
    }

    public CreateQosPolicyShrinkRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateQosPolicyShrinkRequest setFlowIdsShrink(String flowIdsShrink) {
        this.flowIdsShrink = flowIdsShrink;
        return this;
    }
    public String getFlowIdsShrink() {
        return this.flowIdsShrink;
    }

    public CreateQosPolicyShrinkRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateQosPolicyShrinkRequest setMaxIOBandWidth(Long maxIOBandWidth) {
        this.maxIOBandWidth = maxIOBandWidth;
        return this;
    }
    public Long getMaxIOBandWidth() {
        return this.maxIOBandWidth;
    }

    public CreateQosPolicyShrinkRequest setMaxIOps(Long maxIOps) {
        this.maxIOps = maxIOps;
        return this;
    }
    public Long getMaxIOps() {
        return this.maxIOps;
    }

    public CreateQosPolicyShrinkRequest setMaxMetaQps(Long maxMetaQps) {
        this.maxMetaQps = maxMetaQps;
        return this;
    }
    public Long getMaxMetaQps() {
        return this.maxMetaQps;
    }

    public CreateQosPolicyShrinkRequest setZoneIdsShrink(String zoneIdsShrink) {
        this.zoneIdsShrink = zoneIdsShrink;
        return this;
    }
    public String getZoneIdsShrink() {
        return this.zoneIdsShrink;
    }

}
