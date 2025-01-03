// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateQosPolicyRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("FederationId")
    public String federationId;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("FlowIds")
    public java.util.List<Integer> flowIds;

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
    public java.util.List<String> zoneIds;

    public static CreateQosPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQosPolicyRequest self = new CreateQosPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateQosPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateQosPolicyRequest setFederationId(String federationId) {
        this.federationId = federationId;
        return this;
    }
    public String getFederationId() {
        return this.federationId;
    }

    public CreateQosPolicyRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateQosPolicyRequest setFlowIds(java.util.List<Integer> flowIds) {
        this.flowIds = flowIds;
        return this;
    }
    public java.util.List<Integer> getFlowIds() {
        return this.flowIds;
    }

    public CreateQosPolicyRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateQosPolicyRequest setMaxIOBandWidth(Long maxIOBandWidth) {
        this.maxIOBandWidth = maxIOBandWidth;
        return this;
    }
    public Long getMaxIOBandWidth() {
        return this.maxIOBandWidth;
    }

    public CreateQosPolicyRequest setMaxIOps(Long maxIOps) {
        this.maxIOps = maxIOps;
        return this;
    }
    public Long getMaxIOps() {
        return this.maxIOps;
    }

    public CreateQosPolicyRequest setMaxMetaQps(Long maxMetaQps) {
        this.maxMetaQps = maxMetaQps;
        return this;
    }
    public Long getMaxMetaQps() {
        return this.maxMetaQps;
    }

    public CreateQosPolicyRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

}
