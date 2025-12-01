// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateGetDBListFromAgentTaskRequest extends TeaModel {
    /**
     * <p>The ID of the backup gateway. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the ID.</p>
     * <blockquote>
     * <p> This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>160813</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of the database. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>MSSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>MariaDB</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>DRDS</strong></li>
     * <li><strong>MongoDB</strong></li>
     * <li><strong>Redis</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The URL that is used to access the database.</p>
     * 
     * <strong>example:</strong>
     * <p>123.0.0.1</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The port that is used to connect to the database.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    /**
     * <p>The region in which the backup gateway resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    public static CreateGetDBListFromAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGetDBListFromAgentTaskRequest self = new CreateGetDBListFromAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateGetDBListFromAgentTaskRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public CreateGetDBListFromAgentTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGetDBListFromAgentTaskRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public CreateGetDBListFromAgentTaskRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateGetDBListFromAgentTaskRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public CreateGetDBListFromAgentTaskRequest setSourceEndpointPort(Integer sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public CreateGetDBListFromAgentTaskRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

}
