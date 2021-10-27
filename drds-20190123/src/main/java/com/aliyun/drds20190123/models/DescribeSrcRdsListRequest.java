// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeSrcRdsListRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("PartitionMapping")
    public java.util.List<DescribeSrcRdsListRequestPartitionMapping> partitionMapping;

    public static DescribeSrcRdsListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSrcRdsListRequest self = new DescribeSrcRdsListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSrcRdsListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeSrcRdsListRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeSrcRdsListRequest setPartitionMapping(java.util.List<DescribeSrcRdsListRequestPartitionMapping> partitionMapping) {
        this.partitionMapping = partitionMapping;
        return this;
    }
    public java.util.List<DescribeSrcRdsListRequestPartitionMapping> getPartitionMapping() {
        return this.partitionMapping;
    }

    public static class DescribeSrcRdsListRequestPartitionMapping extends TeaModel {
        @NameInMap("DbShardValue")
        public String dbShardValue;

        @NameInMap("HotDbName")
        public String hotDbName;

        @NameInMap("HotTableName")
        public String hotTableName;

        @NameInMap("LogicTable")
        public String logicTable;

        @NameInMap("TbShardValue")
        public String tbShardValue;

        public static DescribeSrcRdsListRequestPartitionMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeSrcRdsListRequestPartitionMapping self = new DescribeSrcRdsListRequestPartitionMapping();
            return TeaModel.build(map, self);
        }

        public DescribeSrcRdsListRequestPartitionMapping setDbShardValue(String dbShardValue) {
            this.dbShardValue = dbShardValue;
            return this;
        }
        public String getDbShardValue() {
            return this.dbShardValue;
        }

        public DescribeSrcRdsListRequestPartitionMapping setHotDbName(String hotDbName) {
            this.hotDbName = hotDbName;
            return this;
        }
        public String getHotDbName() {
            return this.hotDbName;
        }

        public DescribeSrcRdsListRequestPartitionMapping setHotTableName(String hotTableName) {
            this.hotTableName = hotTableName;
            return this;
        }
        public String getHotTableName() {
            return this.hotTableName;
        }

        public DescribeSrcRdsListRequestPartitionMapping setLogicTable(String logicTable) {
            this.logicTable = logicTable;
            return this;
        }
        public String getLogicTable() {
            return this.logicTable;
        }

        public DescribeSrcRdsListRequestPartitionMapping setTbShardValue(String tbShardValue) {
            this.tbShardValue = tbShardValue;
            return this;
        }
        public String getTbShardValue() {
            return this.tbShardValue;
        }

    }

}
