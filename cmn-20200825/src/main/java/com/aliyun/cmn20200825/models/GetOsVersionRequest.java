// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOsVersionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("OsVersionId")
    public String osVersionId;

    public static GetOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOsVersionRequest self = new GetOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetOsVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOsVersionRequest setOsVersionId(String osVersionId) {
        this.osVersionId = osVersionId;
        return this;
    }
    public String getOsVersionId() {
        return this.osVersionId;
    }

}
