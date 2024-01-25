// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceForDmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Long count;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Instance")
    public DescribeDBInstanceForDmsResponseBodyInstance instance;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDBInstanceForDmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceForDmsResponseBody self = new DescribeDBInstanceForDmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceForDmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDBInstanceForDmsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeDBInstanceForDmsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDBInstanceForDmsResponseBody setInstance(DescribeDBInstanceForDmsResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public DescribeDBInstanceForDmsResponseBodyInstance getInstance() {
        return this.instance;
    }

    public DescribeDBInstanceForDmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDBInstanceForDmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceForDmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDBInstanceForDmsResponseBodyInstance extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

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

        public static DescribeDBInstanceForDmsResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceForDmsResponseBodyInstance self = new DescribeDBInstanceForDmsResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceForDmsResponseBodyInstance setVpcIp(String vpcIp) {
            this.vpcIp = vpcIp;
            return this;
        }
        public String getVpcIp() {
            return this.vpcIp;
        }

    }

}
