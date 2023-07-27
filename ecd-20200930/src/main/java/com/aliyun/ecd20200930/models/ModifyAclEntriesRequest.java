// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyAclEntriesRequest extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceId")
    public java.util.List<String> sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    public static ModifyAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAclEntriesRequest self = new ModifyAclEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAclEntriesRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifyAclEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAclEntriesRequest setSourceId(java.util.List<String> sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    public ModifyAclEntriesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
