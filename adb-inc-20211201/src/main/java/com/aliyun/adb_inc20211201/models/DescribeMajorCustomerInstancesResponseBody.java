// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeMajorCustomerInstancesResponseBody extends TeaModel {
    @NameInMap("MajorCustomerInstances")
    public java.util.List<DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances> majorCustomerInstances;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMajorCustomerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorCustomerInstancesResponseBody self = new DescribeMajorCustomerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMajorCustomerInstancesResponseBody setMajorCustomerInstances(java.util.List<DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances> majorCustomerInstances) {
        this.majorCustomerInstances = majorCustomerInstances;
        return this;
    }
    public java.util.List<DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances> getMajorCustomerInstances() {
        return this.majorCustomerInstances;
    }

    public DescribeMajorCustomerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances extends TeaModel {
        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("DbVersion")
        public String dbVersion;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("GcLevel")
        public String gcLevel;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ranking")
        public Long ranking;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances self = new DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances();
            return TeaModel.build(map, self);
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setGcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }
        public String getGcLevel() {
            return this.gcLevel;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setRanking(Long ranking) {
            this.ranking = ranking;
            return this;
        }
        public Long getRanking() {
            return this.ranking;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeMajorCustomerInstancesResponseBodyMajorCustomerInstances setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
