// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AddHDMInstanceRequest extends TeaModel {
    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * <li><strong>PolarDBMySQL</strong></li>
     * <li><strong>PolarDBPostgreSQL</strong></li>
     * <li><strong>Redis</strong></li>
     * <li><strong>MongoDB</strong></li>
     * <li><strong>PolarDBOracle</strong></li>
     * <li><strong>PolarDBX</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("FlushAccount")
    public String flushAccount;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>yuecq--test****</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The database product to which the instance belongs. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: cloud instance.</li>
     * <li><strong>ECS</strong>: self-managed instance on ECS.</li>
     * <li><strong>IDC</strong>: self-managed instance not on a public cloud.</li>
     * </ul>
     * <blockquote>
     * <p>IDC stands for Internet Data Center.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("InstanceArea")
    public String instanceArea;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The internal endpoint of the instance to be connected.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The network type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The password of the username.</p>
     * 
     * <strong>example:</strong>
     * <p>122****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The internal network connection port of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>test****</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>VPC ID。</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5e666n89m2bx8jar****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("__context")
    public String context;

    public static AddHDMInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHDMInstanceRequest self = new AddHDMInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddHDMInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public AddHDMInstanceRequest setFlushAccount(String flushAccount) {
        this.flushAccount = flushAccount;
        return this;
    }
    public String getFlushAccount() {
        return this.flushAccount;
    }

    public AddHDMInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public AddHDMInstanceRequest setInstanceArea(String instanceArea) {
        this.instanceArea = instanceArea;
        return this;
    }
    public String getInstanceArea() {
        return this.instanceArea;
    }

    public AddHDMInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddHDMInstanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public AddHDMInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public AddHDMInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AddHDMInstanceRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public AddHDMInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddHDMInstanceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public AddHDMInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public AddHDMInstanceRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
