// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CheckConnectionRequest extends TeaModel {
    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("Password")
    public String password;

    @NameInMap("UserName")
    public String userName;

    public static CheckConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectionRequest self = new CheckConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CheckConnectionRequest setDataSourceInstanceId(String dataSourceInstanceId) {
        this.dataSourceInstanceId = dataSourceInstanceId;
        return this;
    }
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    public CheckConnectionRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CheckConnectionRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CheckConnectionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
