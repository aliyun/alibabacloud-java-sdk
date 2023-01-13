// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseRequest extends TeaModel {
    /**
     * <p>The endpoint that is used to connect to the database.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The port that is used to connect to the database.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The system identifier (SID) of the database.</p>
     * <br>
     * <p>>  The SID uniquely identifies an Oracle database. After a database is created, a SID is generated for the database.</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the ID of the tenant.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseRequest self = new GetDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetDatabaseRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public GetDatabaseRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public GetDatabaseRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public GetDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
