// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required only when <strong>SourceEndpointEngineName</strong> is set to <strong>Oracle</strong>. Valid values:</p>
     * <ul>
     * <li><strong>SID</strong>: non-cluster architecture.</li>
     * <li><strong>RAC</strong>: Real Application Cluster architecture.</li>
     * </ul>
     * <blockquote>
     * <p>The type of this parameter is String, and this parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SID</p>
     */
    @NameInMap("DestinationEndpointArchitecture")
    public String destinationEndpointArchitecture;

    /**
     * <p>The name of the database to be migrated to or the name of the authentication database.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required only when <strong>DestinationEndpointEngineName</strong> is set to <strong>PostgreSQL</strong>, <strong>DRDS</strong>, or <strong>MongoDB</strong>, or when <strong>DestinationEndpointInstanceType</strong> is set to <strong>PolarDB_o</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>When <strong>DestinationEndpointEngineName</strong> is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the database to be migrated. When the value is <strong>MongoDB</strong>, specify the name of the authentication database for the database account.</li>
     * <li>When <strong>DestinationEndpointInstanceType</strong> is set to <strong>PolarDB_o</strong>, specify the name of the database to be migrated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstestdata</p>
     */
    @NameInMap("DestinationEndpointDatabaseName")
    public String destinationEndpointDatabaseName;

    /**
     * <p>The database type of the destination database. Valid values: <strong>MySQL</strong>, <strong>DRDS</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>PPAS</strong>, <strong>MongoDB</strong>, and <strong>Redis</strong>.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>DestinationEndpointInstanceType</strong> is set to <strong>RDS</strong>, <strong>DRDS</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    /**
     * <p>The endpoint of the destination database.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>DestinationEndpointInstanceType</strong> is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.88.***</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>The instance ID of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testsid</p>
     */
    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    /**
     * <p>The type of the destination instance. Valid values:</p>
     * <blockquote>
     * <ul>
     * <li><strong>ECS</strong>: self-managed database hosted on an ECS instance.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li><strong>LocalInstance</strong>: self-managed database with a public IP address.</li>
     * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
     * <li><strong>DRDS</strong>: PolarDB-X instance.</li>
     * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance.</li>
     * <li><strong>Redis</strong>: ApsaraDB for Redis instance.</li>
     * <li><strong>PetaData</strong>: HybridDB for MySQL instance.</li>
     * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster.</li>
     * <li><strong>PolarDB_o</strong>: PolarDB for PostgreSQL (Oracle-Compatible) cluster.</li>
     * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL V3.0 or V2.0.</li>
     * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDB_o</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>This parameter is required only when <strong>DestinationEndpointEngineName</strong> is set to <strong>Oracle</strong>. Valid values:</p>
     * <ul>
     * <li><strong>SID</strong>: non-cluster architecture.</li>
     * <li><strong>RAC</strong>: Real Application Cluster architecture.</li>
     * </ul>
     * <blockquote>
     * <p>The type of this parameter is String, and this parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SID</p>
     */
    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    /**
     * <p>The password of the destination database account.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    /**
     * <p>The service port of the source database.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>SourceEndpointInstanceType</strong> is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DestinationEndpointPort")
    public String destinationEndpointPort;

    /**
     * <p>The region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    /**
     * <p>The database account of the destination database.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required only when <strong>SourceEndpointEngineName</strong> is set to <strong>Oracle</strong>. Valid values:</p>
     * <ul>
     * <li><strong>SID</strong>: non-cluster architecture.</li>
     * <li><strong>RAC</strong>: Real Application Cluster architecture.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SID</p>
     */
    @NameInMap("SourceEndpointArchitecture")
    public String sourceEndpointArchitecture;

    /**
     * <p>The name of the database to be migrated or the name of the authentication database.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required only when <strong>SourceEndpointEngineName</strong> is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>, or when <strong>SourceEndpointInstanceType</strong> is set to <strong>PolarDB_o</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>When <strong>SourceEndpointEngineName</strong> is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the database to be migrated. When the value is <strong>MongoDB</strong>, specify the name of the authentication database for the database account.</li>
     * <li>When <strong>SourceEndpointInstanceType</strong> is set to <strong>PolarDB_o</strong>, specify the name of the database to be migrated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstestdata</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The database engine type of the source instance. Valid values: <strong>MySQL</strong>, <strong>TiDB</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>Oracle</strong>, <strong>MongoDB</strong>, and <strong>Redis</strong>.</p>
     * <blockquote>
     * <p>Default value: <strong>MySQL</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The endpoint of the source database.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>SourceEndpointInstanceType</strong> is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.88.***</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The instance ID of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1imrtn6fq7h****</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The type of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
     * <li><strong>LocalInstance</strong>: self-managed database with a public IP address.</li>
     * <li><strong>ECS</strong>: self-managed database hosted on an ECS instance.</li>
     * <li><strong>Express</strong>: self-managed database connected over Express Connect.</li>
     * <li><strong>dg</strong>: self-managed database connected over Database Gateway.</li>
     * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance.</li>
     * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster.</li>
     * <li><strong>PolarDB_o</strong>: PolarDB for PostgreSQL (Oracle-Compatible) cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The SID of the Oracle database.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>SourceEndpointEngineName</strong> is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testsid</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password of the source database account.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The service port of the source database.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>SourceEndpointInstanceType</strong> is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The database account of the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
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
