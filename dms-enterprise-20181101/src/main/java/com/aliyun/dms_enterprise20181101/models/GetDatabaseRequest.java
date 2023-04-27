// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseRequest extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The name of the catalog to which the database belongs.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The details of the database.</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The operation that you want to perform. Set the value to **GetDatabase**.</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The ID of the database.</p>
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
