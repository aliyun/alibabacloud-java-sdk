// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeShardDBsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeShardDBsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeShardDBsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardDBsResponseBody self = new DescribeShardDBsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShardDBsResponseBody setData(DescribeShardDBsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeShardDBsResponseBodyData getData() {
        return this.data;
    }

    public DescribeShardDBsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShardDBsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeShardDBsResponseBodyDataDbIntancePair extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("SubDbName")
        public String subDbName;

        public static DescribeShardDBsResponseBodyDataDbIntancePair build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardDBsResponseBodyDataDbIntancePair self = new DescribeShardDBsResponseBodyDataDbIntancePair();
            return TeaModel.build(map, self);
        }

        public DescribeShardDBsResponseBodyDataDbIntancePair setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeShardDBsResponseBodyDataDbIntancePair setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeShardDBsResponseBodyDataDbIntancePair setSubDbName(String subDbName) {
            this.subDbName = subDbName;
            return this;
        }
        public String getSubDbName() {
            return this.subDbName;
        }

    }

    public static class DescribeShardDBsResponseBodyData extends TeaModel {
        @NameInMap("DbIntancePair")
        public java.util.List<DescribeShardDBsResponseBodyDataDbIntancePair> dbIntancePair;

        public static DescribeShardDBsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardDBsResponseBodyData self = new DescribeShardDBsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeShardDBsResponseBodyData setDbIntancePair(java.util.List<DescribeShardDBsResponseBodyDataDbIntancePair> dbIntancePair) {
            this.dbIntancePair = dbIntancePair;
            return this;
        }
        public java.util.List<DescribeShardDBsResponseBodyDataDbIntancePair> getDbIntancePair() {
            return this.dbIntancePair;
        }

    }

}
