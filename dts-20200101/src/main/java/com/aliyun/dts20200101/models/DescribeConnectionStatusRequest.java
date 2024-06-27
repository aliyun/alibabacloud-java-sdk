// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusRequest extends TeaModel {
    /**
     * <p>You must specify this parameter only if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>Oracle</strong>. Valid values:</p>
     * <ul>
     * <li><strong>SID</strong>: non-RAC architecture</li>
     * <li><strong>RAC</strong>: Real Application Cluster (RAC) architecture</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is optional. The data type of this parameter is String.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SID</p>
     */
    @NameInMap("DestinationEndpointArchitecture")
    public String destinationEndpointArchitecture;

    /**
     * <p>The name of the destination database or the authentication database.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You must specify this parameter if the <strong>DestinationEndpointEngineName</strong> parameter is set to <strong>PostgreSQL</strong>, <strong>DRDS</strong>, or <strong>MongoDB</strong>. You must also specify this parameter if the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>PolarDB_o</strong>.</li>
     * <li>If the <strong>DestinationEndpointEngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the destination database. If the DestinationEndpointEngineName parameter is set to <strong>MongoDB</strong>, specify the name of the authentication database.</li>
     * <li>If the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>PolarDB_o</strong>, specify the name of the destination database.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstestdata</p>
     */
    @NameInMap("DestinationEndpointDatabaseName")
    public String destinationEndpointDatabaseName;

    /**
     * <p>The engine type of the destination database. Valid values: <strong>MySQL</strong>, <strong>DRDS</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>PPAS</strong>, <strong>MongoDB</strong>, and <strong>Redis</strong>.</p>
     * <blockquote>
     * <p> You must specify this parameter only if the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>DRDS</strong>, <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
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
     * <p> You must specify this parameter only if the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.88.***</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>The ID of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testsid</p>
     */
    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    /**
     * <p>The instance type of the destination database. Valid values:</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><strong>ECS</strong>: self-managed database that is hosted on Elastic Compute Service (ECS)</li>
     * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
     * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
     * <li><strong>DRDS</strong>: PolarDB-X instance</li>
     * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
     * <li><strong>Redis</strong>: ApsaraDB for Redis instance</li>
     * <li><strong>PetaData</strong>: HybridDB for MySQL instance</li>
     * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster</li>
     * <li><strong>PolarDB_o</strong>: PolarDB for Oracle cluster</li>
     * <li><strong>AnalyticDB</strong>: AnalyticDB for MySQL cluster V3.0 or V2.0</li>
     * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDB_o</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>You must specify this parameter only if the <strong>DestinationEndpointEngineName</strong> parameter is set to <strong>Oracle</strong>. Valid values:</p>
     * <ul>
     * <li><strong>SID</strong>: non-RAC architecture</li>
     * <li><strong>RAC</strong>: RAC architecture</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is optional. The data type of this parameter is String.</p>
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
     * <p>The service port number of the source database.</p>
     * <blockquote>
     * <p> You must specify this parameter only if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DestinationEndpointPort")
    public String destinationEndpointPort;

    /**
     * <p>The ID of the region where the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    /**
     * <p>The database account of the destination database.</p>
     * <blockquote>
     * <p> The permissions that are required for database accounts vary with the migration or synchronization scenario. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a> and <a href="https://help.aliyun.com/document_detail/130744.html">Overview of data synchronization scenarios</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>You must specify this parameter only if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>Oracle</strong>. Valid values:</p>
     * <ul>
     * <li><strong>SID</strong>: non-RAC architecture</li>
     * <li><strong>RAC</strong>: RAC architecture</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SID</p>
     */
    @NameInMap("SourceEndpointArchitecture")
    public String sourceEndpointArchitecture;

    /**
     * <p>The name of the source database or the authentication database.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You must specify this parameter if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>. You must also specify this parameter if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>PolarDB_o</strong>.</li>
     * <li>If the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>DRDS</strong>, specify the name of the source database. If the SourceEndpointEngineName parameter is set to <strong>MongoDB</strong>, specify the name of the authentication database.</li>
     * <li>If the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>PolarDB_o</strong>, specify the name of the source database.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstestdata</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The engine type of the source database. Valid values: <strong>MySQL</strong>, <strong>TiDB</strong>, <strong>SQLServer</strong>, <strong>PostgreSQL</strong>, <strong>Oracle</strong>, <strong>MongoDB</strong>, and <strong>Redis</strong>.</p>
     * <blockquote>
     * <p> Default value: <strong>MySQL</strong>.</p>
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
     * <p> You must specify this parameter only if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>LocalInstance</strong> or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.88.***</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The ID of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1imrtn6fq7h****</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The type of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
     * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
     * <li><strong>ECS</strong>: self-managed database that is hosted on ECS</li>
     * <li><strong>Express</strong>: self-managed database that is connected over Express Connect</li>
     * <li><strong>dg</strong>: self-managed database that is connected over Database Gateway</li>
     * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
     * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster</li>
     * <li><strong>PolarDB_o</strong>: PolarDB for Oracle cluster</li>
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
     * <p> You must specify this parameter only if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
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
     * <p>The service port number of the source database.</p>
     * <blockquote>
     * <p> You must specify this parameter only if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>ECS</strong>, <strong>LocalInstance</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The ID of the region where the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The database account of the source database.</p>
     * <blockquote>
     * <p> The permissions that are required for database accounts vary with the migration or synchronization scenario. For more information, see <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a> and <a href="https://help.aliyun.com/document_detail/130744.html">Overview of data synchronization scenarios</a>.</p>
     * </blockquote>
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
