// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ForeignInstance extends TeaModel {
    /**
     * <p>The name of the data link.</p>
     * 
     * <strong>example:</strong>
     * <p>dbl_mysql_2337</p>
     */
    @NameInMap("DataLinkName")
    public String dataLinkName;

    /**
     * <p>The endpoint that is used to connect to the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The source of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC_OWN:</strong> a self-managed database instance that is deployed on the Internet.</li>
     * <li><strong>RDS</strong>: an ApsaraDB RDS instance.</li>
     * <li><strong>ECS_OWN</strong>: a self-managed database that is hosted on an Elastic Compute Service (ECS) instance.</li>
     * <li><strong>VPC_IDC</strong>: a self-managed database instance that is deployed in the data center over a virtual private cloud (VPC).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The port number that is used to connect to the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>7890</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The information of the properties.</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, String> properties;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The system identifier (SID) of the database.</p>
     * <blockquote>
     * <p> The SID uniquely identifies an Oracle database. After a database is created, a SID is generated for the database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HXE</p>
     */
    @NameInMap("Sid")
    public String sid;

    public static ForeignInstance build(java.util.Map<String, ?> map) throws Exception {
        ForeignInstance self = new ForeignInstance();
        return TeaModel.build(map, self);
    }

    public ForeignInstance setDataLinkName(String dataLinkName) {
        this.dataLinkName = dataLinkName;
        return this;
    }
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    public ForeignInstance setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ForeignInstance setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public ForeignInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ForeignInstance setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ForeignInstance setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

    public ForeignInstance setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ForeignInstance setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

}
