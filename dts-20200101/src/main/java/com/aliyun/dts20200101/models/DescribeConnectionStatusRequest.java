// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusRequest extends TeaModel {
    /**
     * <p>You must specify this parameter only if the **SourceEndpointEngineName** parameter is set to **Oracle**. Valid values:</p>
     * <br>
     * <p>*   **SID**: non-RAC architecture</p>
     * <p>*   **RAC**: Real Application Cluster (RAC) architecture</p>
     * <br>
     * <p>>  This parameter is optional. The data type of this parameter is String.</p>
     */
    @NameInMap("DestinationEndpointArchitecture")
    public String destinationEndpointArchitecture;

    /**
     * <p>The name of the destination database or the authentication database.</p>
     * <br>
     * <p>> </p>
     * <p>*   You must specify this parameter if the **DestinationEndpointEngineName** parameter is set to **PostgreSQL**, **DRDS**, or **MongoDB**. You must also specify this parameter if the **DestinationEndpointInstanceType** parameter is set to **PolarDB_o**.</p>
     * <p>*   If the **DestinationEndpointEngineName** parameter is set to **PostgreSQL** or **DRDS**, specify the name of the destination database. If the DestinationEndpointEngineName parameter is set to **MongoDB**, specify the name of the authentication database.</p>
     * <p>*   If the **DestinationEndpointInstanceType** parameter is set to **PolarDB_o**, specify the name of the destination database.</p>
     */
    @NameInMap("DestinationEndpointDatabaseName")
    public String destinationEndpointDatabaseName;

    /**
     * <p>The engine type of the destination database. Valid values: **MySQL**, **DRDS**, **SQLServer**, **PostgreSQL**, **PPAS**, **MongoDB**, and **Redis**.</p>
     * <br>
     * <p>>  You must specify this parameter only if the **DestinationEndpointInstanceType** parameter is set to **RDS**, **DRDS**, **ECS**, **LocalInstance**, or **Express**.</p>
     */
    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    /**
     * <p>The endpoint of the destination database.</p>
     * <br>
     * <p>>  You must specify this parameter only if the **DestinationEndpointInstanceType** parameter is set to **LocalInstance** or **Express**.</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>The ID of the destination instance.</p>
     */
    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    /**
     * <p>The instance type of the destination database. Valid values:</p>
     * <br>
     * <p>> </p>
     * <p>*   **ECS**: self-managed database that is hosted on Elastic Compute Service (ECS)</p>
     * <p>*   **LocalInstance**: self-managed database with a public IP address</p>
     * <p>*   **RDS**: ApsaraDB RDS instance</p>
     * <p>*   **DRDS**: PolarDB-X instance</p>
     * <p>*   **MongoDB**: ApsaraDB for MongoDB instance</p>
     * <p>*   **Redis**: ApsaraDB for Redis instance</p>
     * <p>*   **PetaData**: HybridDB for MySQL instance</p>
     * <p>*   **POLARDB**: PolarDB for MySQL cluster</p>
     * <p>*   **PolarDB_o**: PolarDB for Oracle cluster</p>
     * <p>*   **AnalyticDB**: AnalyticDB for MySQL cluster V3.0 or V2.0</p>
     * <p>*   **Greenplum**: AnalyticDB for PostgreSQL instance</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>You must specify this parameter only if the **DestinationEndpointEngineName** parameter is set to **Oracle**. Valid values:</p>
     * <br>
     * <p>*   **SID**: non-RAC architecture</p>
     * <p>*   **RAC**: RAC architecture</p>
     * <br>
     * <p>>  This parameter is optional. The data type of this parameter is String.</p>
     */
    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    /**
     * <p>The password of the destination database account.</p>
     */
    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    /**
     * <p>The service port number of the source database.</p>
     * <br>
     * <p>>  You must specify this parameter only if the **SourceEndpointInstanceType** parameter is set to **ECS**, **LocalInstance**, or **Express**.</p>
     */
    @NameInMap("DestinationEndpointPort")
    public String destinationEndpointPort;

    /**
     * <p>The ID of the region where the destination instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    /**
     * <p>The database account of the destination database.</p>
     * <br>
     * <p>>  The permissions that are required for database accounts vary with the migration or synchronization scenario. For more information, see [Overview of data migration scenarios](https://help.aliyun.com/document_detail/26618.html) and [Overview of data synchronization scenarios](https://help.aliyun.com/document_detail/130744.html).</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>You must specify this parameter only if the **SourceEndpointEngineName** parameter is set to **Oracle**. Valid values:</p>
     * <br>
     * <p>*   **SID**: non-RAC architecture</p>
     * <p>*   **RAC**: RAC architecture</p>
     * <br>
     * <p>>  This parameter is optional.</p>
     */
    @NameInMap("SourceEndpointArchitecture")
    public String sourceEndpointArchitecture;

    /**
     * <p>The name of the source database or the authentication database.</p>
     * <br>
     * <p>> </p>
     * <p>*   You must specify this parameter if the **SourceEndpointEngineName** parameter is set to **PostgreSQL** or **MongoDB**. You must also specify this parameter if the **SourceEndpointInstanceType** parameter is set to **PolarDB_o**.</p>
     * <p>*   If the **SourceEndpointEngineName** parameter is set to **PostgreSQL** or **DRDS**, specify the name of the source database. If the SourceEndpointEngineName parameter is set to **MongoDB**, specify the name of the authentication database.</p>
     * <p>*   If the **SourceEndpointInstanceType** parameter is set to **PolarDB_o**, specify the name of the source database.</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The engine type of the source database. Valid values: **MySQL**, **TiDB**, **SQLServer**, **PostgreSQL**, **Oracle**, **MongoDB**, and **Redis**.</p>
     * <br>
     * <p>>  Default value: **MySQL**.</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The endpoint of the source database.</p>
     * <br>
     * <p>>  You must specify this parameter only if the **SourceEndpointInstanceType** parameter is set to **LocalInstance** or **Express**.</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The ID of the source instance.</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The type of the source instance. Valid values:</p>
     * <br>
     * <p>*   **RDS**: ApsaraDB RDS instance</p>
     * <p>*   **LocalInstance**: self-managed database with a public IP address</p>
     * <p>*   **ECS**: self-managed database that is hosted on ECS</p>
     * <p>*   **Express**: self-managed database that is connected over Express Connect</p>
     * <p>*   **dg**: self-managed database that is connected over Database Gateway</p>
     * <p>*   **MongoDB**: ApsaraDB for MongoDB instance</p>
     * <p>*   **POLARDB**: PolarDB for MySQL cluster</p>
     * <p>*   **PolarDB_o**: PolarDB for Oracle cluster</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The SID of the Oracle database.</p>
     * <br>
     * <p>>  You must specify this parameter only if the **SourceEndpointEngineName** parameter is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password of the source database account.</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The service port number of the source database.</p>
     * <br>
     * <p>>  You must specify this parameter only if the **SourceEndpointInstanceType** parameter is set to **ECS**, **LocalInstance**, or **Express**.</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The ID of the region where the source instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The database account of the source database.</p>
     * <br>
     * <p>>  The permissions that are required for database accounts vary with the migration or synchronization scenario. For more information, see [Overview of data migration scenarios](https://help.aliyun.com/document_detail/26618.html) and [Overview of data synchronization scenarios](https://help.aliyun.com/document_detail/130744.html).</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    public static DescribeConnectionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectionStatusRequest self = new DescribeConnectionStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConnectionStatusRequest setDestinationEndpointArchitecture(String destinationEndpointArchitecture) {
        this.destinationEndpointArchitecture = destinationEndpointArchitecture;
        return this;
    }
    public String getDestinationEndpointArchitecture() {
        return this.destinationEndpointArchitecture;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
        this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
        return this;
    }
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointEngineName(String destinationEndpointEngineName) {
        this.destinationEndpointEngineName = destinationEndpointEngineName;
        return this;
    }
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointIP(String destinationEndpointIP) {
        this.destinationEndpointIP = destinationEndpointIP;
        return this;
    }
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
        this.destinationEndpointInstanceID = destinationEndpointInstanceID;
        return this;
    }
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
        this.destinationEndpointInstanceType = destinationEndpointInstanceType;
        return this;
    }
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
        this.destinationEndpointOracleSID = destinationEndpointOracleSID;
        return this;
    }
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointPassword(String destinationEndpointPassword) {
        this.destinationEndpointPassword = destinationEndpointPassword;
        return this;
    }
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointPort(String destinationEndpointPort) {
        this.destinationEndpointPort = destinationEndpointPort;
        return this;
    }
    public String getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointRegion(String destinationEndpointRegion) {
        this.destinationEndpointRegion = destinationEndpointRegion;
        return this;
    }
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointUserName(String destinationEndpointUserName) {
        this.destinationEndpointUserName = destinationEndpointUserName;
        return this;
    }
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    public DescribeConnectionStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeConnectionStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeConnectionStatusRequest setSourceEndpointArchitecture(String sourceEndpointArchitecture) {
        this.sourceEndpointArchitecture = sourceEndpointArchitecture;
        return this;
    }
    public String getSourceEndpointArchitecture() {
        return this.sourceEndpointArchitecture;
    }

    public DescribeConnectionStatusRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public DescribeConnectionStatusRequest setSourceEndpointEngineName(String sourceEndpointEngineName) {
        this.sourceEndpointEngineName = sourceEndpointEngineName;
        return this;
    }
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    public DescribeConnectionStatusRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public DescribeConnectionStatusRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public DescribeConnectionStatusRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public DescribeConnectionStatusRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public DescribeConnectionStatusRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public DescribeConnectionStatusRequest setSourceEndpointPort(String sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public DescribeConnectionStatusRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public DescribeConnectionStatusRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

}
