// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobConfigurationResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DestinationDBType")
    public String destinationDBType;

    @NameInMap("DestinationInstanceId")
    public String destinationInstanceId;

    @NameInMap("FullDataIntialization")
    public String fullDataIntialization;

    @NameInMap("SourceDBType")
    public String sourceDBType;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("StructureIntialization")
    public String structureIntialization;

    @NameInMap("SynchronousJobId")
    public String synchronousJobId;

    @NameInMap("SynchronousJobName")
    public String synchronousJobName;

    @NameInMap("SynchronousObjectList")
    public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectList synchronousObjectList;

    @NameInMap("SynchronousSpeedLimit")
    public String synchronousSpeedLimit;

    public static DescribeSynchronousJobConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobConfigurationResponseBody self = new DescribeSynchronousJobConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobConfigurationResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeSynchronousJobConfigurationResponseBody setDestinationDBType(String destinationDBType) {
        this.destinationDBType = destinationDBType;
        return this;
    }
    public String getDestinationDBType() {
        return this.destinationDBType;
    }

    public DescribeSynchronousJobConfigurationResponseBody setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public DescribeSynchronousJobConfigurationResponseBody setFullDataIntialization(String fullDataIntialization) {
        this.fullDataIntialization = fullDataIntialization;
        return this;
    }
    public String getFullDataIntialization() {
        return this.fullDataIntialization;
    }

    public DescribeSynchronousJobConfigurationResponseBody setSourceDBType(String sourceDBType) {
        this.sourceDBType = sourceDBType;
        return this;
    }
    public String getSourceDBType() {
        return this.sourceDBType;
    }

    public DescribeSynchronousJobConfigurationResponseBody setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public DescribeSynchronousJobConfigurationResponseBody setStructureIntialization(String structureIntialization) {
        this.structureIntialization = structureIntialization;
        return this;
    }
    public String getStructureIntialization() {
        return this.structureIntialization;
    }

    public DescribeSynchronousJobConfigurationResponseBody setSynchronousJobId(String synchronousJobId) {
        this.synchronousJobId = synchronousJobId;
        return this;
    }
    public String getSynchronousJobId() {
        return this.synchronousJobId;
    }

    public DescribeSynchronousJobConfigurationResponseBody setSynchronousJobName(String synchronousJobName) {
        this.synchronousJobName = synchronousJobName;
        return this;
    }
    public String getSynchronousJobName() {
        return this.synchronousJobName;
    }

    public DescribeSynchronousJobConfigurationResponseBody setSynchronousObjectList(DescribeSynchronousJobConfigurationResponseBodySynchronousObjectList synchronousObjectList) {
        this.synchronousObjectList = synchronousObjectList;
        return this;
    }
    public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectList getSynchronousObjectList() {
        return this.synchronousObjectList;
    }

    public DescribeSynchronousJobConfigurationResponseBody setSynchronousSpeedLimit(String synchronousSpeedLimit) {
        this.synchronousSpeedLimit = synchronousSpeedLimit;
        return this;
    }
    public String getSynchronousSpeedLimit() {
        return this.synchronousSpeedLimit;
    }

    public static class DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObjectTableList extends TeaModel {
        @NameInMap("Table")
        public java.util.List<String> table;

        public static DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObjectTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObjectTableList self = new DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObjectTableList();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObjectTableList setTable(java.util.List<String> table) {
            this.table = table;
            return this;
        }
        public java.util.List<String> getTable() {
            return this.table;
        }

    }

    public static class DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("TableList")
        public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObjectTableList tableList;

        @NameInMap("WholeDatabase")
        public String wholeDatabase;

        public static DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject self = new DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject setTableList(DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObjectTableList tableList) {
            this.tableList = tableList;
            return this;
        }
        public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObjectTableList getTableList() {
            return this.tableList;
        }

        public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject setWholeDatabase(String wholeDatabase) {
            this.wholeDatabase = wholeDatabase;
            return this;
        }
        public String getWholeDatabase() {
            return this.wholeDatabase;
        }

    }

    public static class DescribeSynchronousJobConfigurationResponseBodySynchronousObjectList extends TeaModel {
        @NameInMap("SynchronousObject")
        public java.util.List<DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject> synchronousObject;

        public static DescribeSynchronousJobConfigurationResponseBodySynchronousObjectList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronousJobConfigurationResponseBodySynchronousObjectList self = new DescribeSynchronousJobConfigurationResponseBodySynchronousObjectList();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronousJobConfigurationResponseBodySynchronousObjectList setSynchronousObject(java.util.List<DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject> synchronousObject) {
            this.synchronousObject = synchronousObject;
            return this;
        }
        public java.util.List<DescribeSynchronousJobConfigurationResponseBodySynchronousObjectListSynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

    }

}
