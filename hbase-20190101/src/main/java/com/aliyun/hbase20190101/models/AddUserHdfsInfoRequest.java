// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AddUserHdfsInfoRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ExtInfo")
    public String extInfo;

    public static AddUserHdfsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserHdfsInfoRequest self = new AddUserHdfsInfoRequest();
        return TeaModel.build(map, self);
    }

    public AddUserHdfsInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddUserHdfsInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddUserHdfsInfoRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
