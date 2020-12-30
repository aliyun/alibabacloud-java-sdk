// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class OpenBackupRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static OpenBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenBackupRequest self = new OpenBackupRequest();
        return TeaModel.build(map, self);
    }

    public OpenBackupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
