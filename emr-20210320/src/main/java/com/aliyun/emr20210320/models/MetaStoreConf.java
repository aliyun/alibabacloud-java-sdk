// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class MetaStoreConf extends TeaModel {
    @NameInMap("DbPassword")
    public String dbPassword;

    @NameInMap("DbUrl")
    public String dbUrl;

    @NameInMap("DbUserName")
    public String dbUserName;

    public static MetaStoreConf build(java.util.Map<String, ?> map) throws Exception {
        MetaStoreConf self = new MetaStoreConf();
        return TeaModel.build(map, self);
    }

    public MetaStoreConf setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public MetaStoreConf setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
        return this;
    }
    public String getDbUrl() {
        return this.dbUrl;
    }

    public MetaStoreConf setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }
    public String getDbUserName() {
        return this.dbUserName;
    }

}
