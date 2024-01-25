// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesForDmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Long count;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Instances")
    public java.util.List<DescribeDBInstancesForDmsResponseBodyInstances> instances;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDBInstancesForDmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesForDmsResponseBody self = new DescribeDBInstancesForDmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesForDmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDBInstancesForDmsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeDBInstancesForDmsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDBInstancesForDmsResponseBody setInstances(java.util.List<DescribeDBInstancesForDmsResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeDBInstancesForDmsResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeDBInstancesForDmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDBInstancesForDmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesForDmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDBInstancesForDmsResponseBodyInstances extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>BID。</p>
         */
        @NameInMap("Bid")
        public String bid;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcIp")
        public String vpcIp;

        public static DescribeDBInstancesForDmsResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesForDmsResponseBodyInstances self = new DescribeDBInstancesForDmsResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesForDmsResponseBodyInstances setVpcIp(String vpcIp) {
            this.vpcIp = vpcIp;
            return this;
        }
        public String getVpcIp() {
            return this.vpcIp;
        }

    }

}
