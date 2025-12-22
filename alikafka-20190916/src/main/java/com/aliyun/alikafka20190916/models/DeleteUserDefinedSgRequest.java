// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteUserDefinedSgRequest extends TeaModel {
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

    public static DeleteUserDefinedSgRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefinedSgRequest self = new DeleteUserDefinedSgRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefinedSgRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteUserDefinedSgRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteUserDefinedSgRequest setSgIdList(java.util.List<String> sgIdList) {
        this.sgIdList = sgIdList;
        return this;
    }
    public java.util.List<String> getSgIdList() {
        return this.sgIdList;
    }

}
