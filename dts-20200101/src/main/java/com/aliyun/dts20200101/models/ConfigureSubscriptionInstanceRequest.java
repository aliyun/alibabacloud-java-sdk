// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionInstanceRequest extends TeaModel {
    @NameInMap("SourceEndpoint")
    public ConfigureSubscriptionInstanceRequestSourceEndpoint sourceEndpoint;

    @NameInMap("SubscriptionDataType")
    public ConfigureSubscriptionInstanceRequestSubscriptionDataType subscriptionDataType;

    @NameInMap("SubscriptionInstance")
    public ConfigureSubscriptionInstanceRequestSubscriptionInstance subscriptionInstance;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because it will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
     * <p>The ID of the change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/49442.html">DescribeSubscriptionInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtshp8n2ze4r5x****</p>
     */
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    /**
     * <p>The name of the change tracking instance.</p>
     * <blockquote>
     * <p>Specify a descriptive name for easy identification. The name does not need to be unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL订阅</p>
     */
    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    /**
     * <p>The network type of the change tracking instance. The only valid value is <strong>vpc</strong>, which indicates a virtual private cloud (VPC).</p>
     * <blockquote>
     * <ul>
     * <li>If you specify this parameter, the change tracking instance is defined as the new version. You must also correctly set the <strong>SubscriptionInstance.VPCId</strong> and <strong>SubscriptionInstance.VSwitchID</strong> parameters. If you do not specify this parameter, the change tracking instance is defined as the legacy version.</li>
     * <li>The legacy version supports change tracking for self-managed MySQL, ApsaraDB RDS for MySQL, and DRDS. The new version supports change tracking for self-managed MySQL, ApsaraDB RDS for MySQL, PolarDB for MySQL, and Oracle.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("SubscriptionInstanceNetworkType")
    public String subscriptionInstanceNetworkType;

    /**
     * <p>The objects to be subscribed to. The value is a JSON string that supports regular expressions. For more information, see <a href="https://help.aliyun.com/document_detail/141902.html">Subscription object configuration</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{     &quot;DBName&quot;: &quot;dtstestdata&quot; }]</p>
     */
    @NameInMap("SubscriptionObject")
    public String subscriptionObject;

    public static ConfigureSubscriptionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionInstanceRequest self = new ConfigureSubscriptionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionInstanceRequest setSourceEndpoint(ConfigureSubscriptionInstanceRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public ConfigureSubscriptionInstanceRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionDataType(ConfigureSubscriptionInstanceRequestSubscriptionDataType subscriptionDataType) {
        this.subscriptionDataType = subscriptionDataType;
        return this;
    }
    public ConfigureSubscriptionInstanceRequestSubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionInstance(ConfigureSubscriptionInstanceRequestSubscriptionInstance subscriptionInstance) {
        this.subscriptionInstance = subscriptionInstance;
        return this;
    }
    public ConfigureSubscriptionInstanceRequestSubscriptionInstance getSubscriptionInstance() {
        return this.subscriptionInstance;
    }

    public ConfigureSubscriptionInstanceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfigureSubscriptionInstanceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSubscriptionInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSubscriptionInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
        return this;
    }
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
        this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
        return this;
    }
    public String getSubscriptionInstanceNetworkType() {
        return this.subscriptionInstanceNetworkType;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionObject(String subscriptionObject) {
        this.subscriptionObject = subscriptionObject;
        return this;
    }
    public String getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public static class ConfigureSubscriptionInstanceRequestSourceEndpoint extends TeaModel {
        /**
         * <p>待订阅的数据库名称。</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>源数据库的连接地址。</p>
         * <blockquote>
         * <p>当源数据库为自建数据库时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>源实例ID。</p>
         * <blockquote>
         * <p>源数据库的实例类型为RDS MySQL、PolarDB-X 1.0、PolarDB MySQL时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1zc3iyqe3qw****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>源数据库的实例类型，取值：</p>
         * <ul>
         * <li><strong>RDS</strong>：RDS MySQL。</li>
         * <li><strong>PolarDB</strong>：PolarDB MySQL。</li>
         * <li><strong>LocalInstance</strong>：有公网IP的自建数据库。</li>
         * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
         * <li><strong>Express</strong>：通过专线接入的自建数据库。</li>
         * <li><strong>CEN</strong>：通过云企业网CEN接入的自建数据库。</li>
         * <li><strong>dg</strong>：通过数据库网关接入的自建数据库。</li>
         * </ul>
         * <blockquote>
         * <p>支持自建数据库的数据库类型为MySQL、Oracle，您需要提前调用<a href="https://help.aliyun.com/document_detail/49436.html">CreateSubscriptionInstance</a>设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Oracle数据库的SID信息。</p>
         * <blockquote>
         * <p>当源数据库为自建Oracle时，且Oracle数据库为非RAC实例时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>源实例所属的阿里云账号ID。</p>
         * <blockquote>
         * <p>仅在配置跨阿里云账号的数据订阅时本参数才可用，且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>源实例的数据库账号密码。</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>源数据库的服务端口。</p>
         * <blockquote>
         * <p>当源数据库为自建数据库时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>源实例的授权角色。当源实例与配置订阅任务所属阿里云账号不同时，需传入该参数，来指定源实例的授权角色，以允许配置订阅任务所属阿里云账号访问源实例的实例信息。</p>
         * <blockquote>
         * <p>角色所需的权限及授权方式，请参见<a href="https://help.aliyun.com/document_detail/48468.html">跨阿里云账号数据迁移或同步时如何配置RAM授权</a>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>源实例的数据库账号。</p>
         * <blockquote>
         * <p>订阅不同的数据库所需的权限有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/145715.html">DTS数据订阅方案概览</a>中对应的配置案例。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstestaccount</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ConfigureSubscriptionInstanceRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSubscriptionInstanceRequestSourceEndpoint self = new ConfigureSubscriptionInstanceRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ConfigureSubscriptionInstanceRequestSubscriptionDataType extends TeaModel {
        /**
         * <p>是否订阅DDL类型的数据，取值：</p>
         * <ul>
         * <li><strong>true</strong>：是，为默认值。</li>
         * <li><strong>false</strong>：否。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DDL")
        public Boolean DDL;

        /**
         * <p>是否订阅DML类型的数据，取值：</p>
         * <ul>
         * <li><strong>true</strong>：是，为默认值。</li>
         * <li><strong>false</strong>：否。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DML")
        public Boolean DML;

        public static ConfigureSubscriptionInstanceRequestSubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSubscriptionInstanceRequestSubscriptionDataType self = new ConfigureSubscriptionInstanceRequestSubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public ConfigureSubscriptionInstanceRequestSubscriptionDataType setDDL(Boolean DDL) {
            this.DDL = DDL;
            return this;
        }
        public Boolean getDDL() {
            return this.DDL;
        }

        public ConfigureSubscriptionInstanceRequestSubscriptionDataType setDML(Boolean DML) {
            this.DML = DML;
            return this;
        }
        public Boolean getDML() {
            return this.DML;
        }

    }

    public static class ConfigureSubscriptionInstanceRequestSubscriptionInstance extends TeaModel {
        /**
         * <p>订阅实例的专有网络ID。</p>
         * <blockquote>
         * <p>当<strong>SubscriptionInstanceNetworkType</strong>取值为<strong>vpc</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vwnn14rqpyiczj****</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>订阅实例的虚拟交换机ID。</p>
         * <blockquote>
         * <p>当<strong>SubscriptionInstanceNetworkType</strong>取值为<strong>vpc</strong>时，本参数才可用且必须传入。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10df3mxae6lpmku****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static ConfigureSubscriptionInstanceRequestSubscriptionInstance build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSubscriptionInstanceRequestSubscriptionInstance self = new ConfigureSubscriptionInstanceRequestSubscriptionInstance();
            return TeaModel.build(map, self);
        }

        public ConfigureSubscriptionInstanceRequestSubscriptionInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public ConfigureSubscriptionInstanceRequestSubscriptionInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
