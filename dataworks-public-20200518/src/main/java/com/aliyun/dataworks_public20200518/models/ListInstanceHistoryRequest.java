// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the ListInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV. By default, data of instances in the production environment is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static ListInstanceHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHistoryRequest self = new ListInstanceHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceHistoryRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceHistoryRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
