// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("BuildRecordId")
    public String buildRecordId;

    public static GetRepoBuildRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordRequest self = new GetRepoBuildRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoBuildRecordRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

}
