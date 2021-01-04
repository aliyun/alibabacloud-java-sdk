// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeDataCenterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    public static DescribeDataCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCenterRequest self = new DescribeDataCenterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCenterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeDataCenterRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

}
