// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOsDownloadPathRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 架构资源uuid
    @NameInMap("OsVersionId")
    public String osVersionId;

    public static GetOsDownloadPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOsDownloadPathRequest self = new GetOsDownloadPathRequest();
        return TeaModel.build(map, self);
    }

    public GetOsDownloadPathRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOsDownloadPathRequest setOsVersionId(String osVersionId) {
        this.osVersionId = osVersionId;
        return this;
    }
    public String getOsVersionId() {
        return this.osVersionId;
    }

}
