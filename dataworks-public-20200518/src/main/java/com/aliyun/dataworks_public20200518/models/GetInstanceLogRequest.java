// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceLogRequest extends TeaModel {
    /**
     * <p>The historical record number of the instance. You can call the ListInstanceHistory operation to query the ID.</p>
     */
    @NameInMap("InstanceHistoryId")
    public Long instanceHistoryId;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static GetInstanceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLogRequest self = new GetInstanceLogRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceLogRequest setInstanceHistoryId(Long instanceHistoryId) {
        this.instanceHistoryId = instanceHistoryId;
        return this;
    }
    public Long getInstanceHistoryId() {
        return this.instanceHistoryId;
    }

    public GetInstanceLogRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceLogRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
