// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeRdsListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeRdsListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRdsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsListResponseBody self = new DescribeRdsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsListResponseBody setData(DescribeRdsListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRdsListResponseBodyData getData() {
        return this.data;
    }

    public DescribeRdsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild extends TeaModel {
        @NameInMap("ConnectUrl")
        public String connectUrl;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("ReadWeight")
        public Integer readWeight;

        @NameInMap("port")
        public Integer port;

        public static DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild self = new DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild();
            return TeaModel.build(map, self);
        }

        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildren extends TeaModel {
        @NameInMap("Child")
        public java.util.List<DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild> child;

        public static DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildren build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildren self = new DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildren();
            return TeaModel.build(map, self);
        }

        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildren setChild(java.util.List<DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild> child) {
            this.child = child;
            return this;
        }
        public java.util.List<DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildrenChild> getChild() {
            return this.child;
        }

    }

    public static class DescribeRdsListResponseBodyDataRdsInstance extends TeaModel {
        @NameInMap("ConnectUrl")
        public String connectUrl;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ReadOnlyChildren")
        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildren readOnlyChildren;

        @NameInMap("ReadWeight")
        public Integer readWeight;

        public static DescribeRdsListResponseBodyDataRdsInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsListResponseBodyDataRdsInstance self = new DescribeRdsListResponseBodyDataRdsInstance();
            return TeaModel.build(map, self);
        }

        public DescribeRdsListResponseBodyDataRdsInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeRdsListResponseBodyDataRdsInstance setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeRdsListResponseBodyDataRdsInstance setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public DescribeRdsListResponseBodyDataRdsInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRdsListResponseBodyDataRdsInstance setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeRdsListResponseBodyDataRdsInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeRdsListResponseBodyDataRdsInstance setReadOnlyChildren(DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildren readOnlyChildren) {
            this.readOnlyChildren = readOnlyChildren;
            return this;
        }
        public DescribeRdsListResponseBodyDataRdsInstanceReadOnlyChildren getReadOnlyChildren() {
            return this.readOnlyChildren;
        }

        public DescribeRdsListResponseBodyDataRdsInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

    }

    public static class DescribeRdsListResponseBodyData extends TeaModel {
        @NameInMap("RdsInstance")
        public java.util.List<DescribeRdsListResponseBodyDataRdsInstance> rdsInstance;

        public static DescribeRdsListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsListResponseBodyData self = new DescribeRdsListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRdsListResponseBodyData setRdsInstance(java.util.List<DescribeRdsListResponseBodyDataRdsInstance> rdsInstance) {
            this.rdsInstance = rdsInstance;
            return this;
        }
        public java.util.List<DescribeRdsListResponseBodyDataRdsInstance> getRdsInstance() {
            return this.rdsInstance;
        }

    }

}
