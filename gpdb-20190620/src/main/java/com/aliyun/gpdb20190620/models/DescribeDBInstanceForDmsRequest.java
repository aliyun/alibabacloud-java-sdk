// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceForDmsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Host")
    public String host;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Port")
    public Long port;

    public static DescribeDBInstanceForDmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceForDmsRequest self = new DescribeDBInstanceForDmsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceForDmsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceForDmsRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeDBInstanceForDmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstanceForDmsRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

}
