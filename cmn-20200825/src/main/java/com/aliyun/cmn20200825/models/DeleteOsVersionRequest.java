// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteOsVersionRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("OsVersionId")
    public String osVersionId;

    public static DeleteOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOsVersionRequest self = new DeleteOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOsVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteOsVersionRequest setOsVersionId(String osVersionId) {
        this.osVersionId = osVersionId;
        return this;
    }
    public String getOsVersionId() {
        return this.osVersionId;
    }

}
