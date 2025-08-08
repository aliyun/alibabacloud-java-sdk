// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseRequest extends TeaModel {
    /**
     * <p>The endpoint that is used to connect to the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The port that is used to connect to the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    @NameInMap("RealLoginUserUid")
    public String realLoginUserUid;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The system identifier (SID) of the database.</p>
     * <blockquote>
     * <p> The SID uniquely identifies an Oracle database. After a database is created, a SID is generated for the database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_sid</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
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

    public GetDatabaseRequest setRealLoginUserUid(String realLoginUserUid) {
        this.realLoginUserUid = realLoginUserUid;
        return this;
    }
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
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
