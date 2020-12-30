// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteUserHdfsInfoRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("NameService")
    public String nameService;

    public static DeleteUserHdfsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserHdfsInfoRequest self = new DeleteUserHdfsInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserHdfsInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteUserHdfsInfoRequest setNameService(String nameService) {
        this.nameService = nameService;
        return this;
    }
    public String getNameService() {
        return this.nameService;
    }

}
