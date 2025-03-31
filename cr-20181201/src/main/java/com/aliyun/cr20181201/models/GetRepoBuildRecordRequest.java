// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordRequest extends TeaModel {
    /**
     * <p>The ID of the image building record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a78ec6fb-16ea-4649-93b7-f52afba7d****</p>
     */
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRepoBuildRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordRequest self = new GetRepoBuildRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public GetRepoBuildRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
