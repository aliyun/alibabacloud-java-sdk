// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CatalogConnection extends TeaModel {
    @NameInMap("JdbcPassword")
    public String jdbcPassword;

    @NameInMap("JdbcUri")
    public String jdbcUri;

    @NameInMap("JdbcUserName")
    public String jdbcUserName;

    @NameInMap("ThriftUri")
    public String thriftUri;

    /**
     * <strong>example:</strong>
     * <p>CONN-607A0053D874****</p>
     */
    @NameInMap("VpcConnectionId")
    public String vpcConnectionId;

    public static CatalogConnection build(java.util.Map<String, ?> map) throws Exception {
        CatalogConnection self = new CatalogConnection();
        return TeaModel.build(map, self);
    }

    public CatalogConnection setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
        return this;
    }
    public String getJdbcPassword() {
        return this.jdbcPassword;
    }

    public CatalogConnection setJdbcUri(String jdbcUri) {
        this.jdbcUri = jdbcUri;
        return this;
    }
    public String getJdbcUri() {
        return this.jdbcUri;
    }

    public CatalogConnection setJdbcUserName(String jdbcUserName) {
        this.jdbcUserName = jdbcUserName;
        return this;
    }
    public String getJdbcUserName() {
        return this.jdbcUserName;
    }

    public CatalogConnection setThriftUri(String thriftUri) {
        this.thriftUri = thriftUri;
        return this;
    }
    public String getThriftUri() {
        return this.thriftUri;
    }

    public CatalogConnection setVpcConnectionId(String vpcConnectionId) {
        this.vpcConnectionId = vpcConnectionId;
        return this;
    }
    public String getVpcConnectionId() {
        return this.vpcConnectionId;
    }

}
