// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyQosPolicyRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QosPolicyId")
    public String qosPolicyId;

    public static ModifyQosPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosPolicyRequest self = new ModifyQosPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQosPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyQosPolicyRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ModifyQosPolicyRequest setMaxIOBandWidth(Long maxIOBandWidth) {
        this.maxIOBandWidth = maxIOBandWidth;
        return this;
    }
    public Long getMaxIOBandWidth() {
        return this.maxIOBandWidth;
    }

    public ModifyQosPolicyRequest setMaxIOps(Long maxIOps) {
        this.maxIOps = maxIOps;
        return this;
    }
    public Long getMaxIOps() {
        return this.maxIOps;
    }

    public ModifyQosPolicyRequest setMaxMetaQps(Long maxMetaQps) {
        this.maxMetaQps = maxMetaQps;
        return this;
    }
    public Long getMaxMetaQps() {
        return this.maxMetaQps;
    }

    public ModifyQosPolicyRequest setQosPolicyId(String qosPolicyId) {
        this.qosPolicyId = qosPolicyId;
        return this;
    }
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

}
