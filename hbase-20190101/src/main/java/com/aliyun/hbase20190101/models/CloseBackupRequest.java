// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CloseBackupRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static CloseBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseBackupRequest self = new CloseBackupRequest();
        return TeaModel.build(map, self);
    }

    public CloseBackupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
