// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceForDmsRequest extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("Port")
    public Long port;

    public static DescribeDBInstanceForDmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceForDmsRequest self = new DescribeDBInstanceForDmsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceForDmsRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeDBInstanceForDmsRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

}
