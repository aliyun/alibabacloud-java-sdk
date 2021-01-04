// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyDataCenterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("DataCenterName")
    public String dataCenterName;

    public static ModifyDataCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataCenterRequest self = new ModifyDataCenterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataCenterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyDataCenterRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public ModifyDataCenterRequest setDataCenterName(String dataCenterName) {
        this.dataCenterName = dataCenterName;
        return this;
    }
    public String getDataCenterName() {
        return this.dataCenterName;
    }

}
