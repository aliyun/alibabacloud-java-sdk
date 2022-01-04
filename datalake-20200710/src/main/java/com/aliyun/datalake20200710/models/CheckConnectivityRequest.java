// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CheckConnectivityRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("Password")
    public String password;

    @NameInMap("UserName")
    public String userName;

    public static CheckConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectivityRequest self = new CheckConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public CheckConnectivityRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CheckConnectivityRequest setDataSourceInstanceId(String dataSourceInstanceId) {
        this.dataSourceInstanceId = dataSourceInstanceId;
        return this;
    }
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    public CheckConnectivityRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CheckConnectivityRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CheckConnectivityRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
