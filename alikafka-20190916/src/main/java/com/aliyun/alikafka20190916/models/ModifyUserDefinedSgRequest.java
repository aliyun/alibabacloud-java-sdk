// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyUserDefinedSgRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SgIdList")
    public java.util.List<String> sgIdList;

    public static ModifyUserDefinedSgRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserDefinedSgRequest self = new ModifyUserDefinedSgRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserDefinedSgRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserDefinedSgRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserDefinedSgRequest setSgIdList(java.util.List<String> sgIdList) {
        this.sgIdList = sgIdList;
        return this;
    }
    public java.util.List<String> getSgIdList() {
        return this.sgIdList;
    }

}
