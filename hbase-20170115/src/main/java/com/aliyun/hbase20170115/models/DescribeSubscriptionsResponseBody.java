// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Subscriptions")
    public java.util.List<DescribeSubscriptionsResponseBodySubscriptions> subscriptions;

    public static DescribeSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionsResponseBody self = new DescribeSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionsResponseBody setSubscriptions(java.util.List<DescribeSubscriptionsResponseBodySubscriptions> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }
    public java.util.List<DescribeSubscriptionsResponseBodySubscriptions> getSubscriptions() {
        return this.subscriptions;
    }

    public static class DescribeSubscriptionsResponseBodySubscriptionsDBInstances extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Role")
        public String role;

        public static DescribeSubscriptionsResponseBodySubscriptionsDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionsResponseBodySubscriptionsDBInstances self = new DescribeSubscriptionsResponseBodySubscriptionsDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionsResponseBodySubscriptionsDBInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeSubscriptionsResponseBodySubscriptionsDBInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSubscriptionsResponseBodySubscriptionsDBInstances setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeSubscriptionsResponseBodySubscriptions extends TeaModel {
        @NameInMap("DBInstances")
        public java.util.List<DescribeSubscriptionsResponseBodySubscriptionsDBInstances> DBInstances;

        @NameInMap("Mapping")
        public String mapping;

        @NameInMap("SubscriptionDescription")
        public String subscriptionDescription;

        @NameInMap("SubscriptionId")
        public String subscriptionId;

        @NameInMap("SubscriptionStatus")
        public String subscriptionStatus;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        public static DescribeSubscriptionsResponseBodySubscriptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionsResponseBodySubscriptions self = new DescribeSubscriptionsResponseBodySubscriptions();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionsResponseBodySubscriptions setDBInstances(java.util.List<DescribeSubscriptionsResponseBodySubscriptionsDBInstances> DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }
        public java.util.List<DescribeSubscriptionsResponseBodySubscriptionsDBInstances> getDBInstances() {
            return this.DBInstances;
        }

        public DescribeSubscriptionsResponseBodySubscriptions setMapping(String mapping) {
            this.mapping = mapping;
            return this;
        }
        public String getMapping() {
            return this.mapping;
        }

        public DescribeSubscriptionsResponseBodySubscriptions setSubscriptionDescription(String subscriptionDescription) {
            this.subscriptionDescription = subscriptionDescription;
            return this;
        }
        public String getSubscriptionDescription() {
            return this.subscriptionDescription;
        }

        public DescribeSubscriptionsResponseBodySubscriptions setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public DescribeSubscriptionsResponseBodySubscriptions setSubscriptionStatus(String subscriptionStatus) {
            this.subscriptionStatus = subscriptionStatus;
            return this;
        }
        public String getSubscriptionStatus() {
            return this.subscriptionStatus;
        }

        public DescribeSubscriptionsResponseBodySubscriptions setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

    }

}
