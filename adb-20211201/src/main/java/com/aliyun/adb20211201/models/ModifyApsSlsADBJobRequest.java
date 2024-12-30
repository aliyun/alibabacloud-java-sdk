// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsSlsADBJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Columns")
    public java.util.List<ModifyApsSlsADBJobRequestColumns> columns;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-*******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>dbName</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>STOP</p>
     */
    @NameInMap("DirtyDataProcessPattern")
    public String dirtyDataProcessPattern;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExactlyOnce")
    public String exactlyOnce;

    /**
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>end_cursor</p>
     */
    @NameInMap("StartingOffsets")
    public String startingOffsets;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("UnixTimestampConvert")
    public String unixTimestampConvert;

    /**
     * <strong>example:</strong>
     * <p>user-name</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-******</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    /**
     * <strong>example:</strong>
     * <p>test-name</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    public static ModifyApsSlsADBJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsSlsADBJobRequest self = new ModifyApsSlsADBJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApsSlsADBJobRequest setColumns(java.util.List<ModifyApsSlsADBJobRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<ModifyApsSlsADBJobRequestColumns> getColumns() {
        return this.columns;
    }

    public ModifyApsSlsADBJobRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyApsSlsADBJobRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyApsSlsADBJobRequest setDirtyDataProcessPattern(String dirtyDataProcessPattern) {
        this.dirtyDataProcessPattern = dirtyDataProcessPattern;
        return this;
    }
    public String getDirtyDataProcessPattern() {
        return this.dirtyDataProcessPattern;
    }

    public ModifyApsSlsADBJobRequest setExactlyOnce(String exactlyOnce) {
        this.exactlyOnce = exactlyOnce;
        return this;
    }
    public String getExactlyOnce() {
        return this.exactlyOnce;
    }

    public ModifyApsSlsADBJobRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyApsSlsADBJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApsSlsADBJobRequest setStartingOffsets(String startingOffsets) {
        this.startingOffsets = startingOffsets;
        return this;
    }
    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    public ModifyApsSlsADBJobRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ModifyApsSlsADBJobRequest setUnixTimestampConvert(String unixTimestampConvert) {
        this.unixTimestampConvert = unixTimestampConvert;
        return this;
    }
    public String getUnixTimestampConvert() {
        return this.unixTimestampConvert;
    }

    public ModifyApsSlsADBJobRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyApsSlsADBJobRequest setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

    public ModifyApsSlsADBJobRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

    public static class ModifyApsSlsADBJobRequestColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>map_name</p>
         */
        @NameInMap("MapName")
        public String mapName;

        /**
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("MapType")
        public String mapType;

        /**
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyApsSlsADBJobRequestColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyApsSlsADBJobRequestColumns self = new ModifyApsSlsADBJobRequestColumns();
            return TeaModel.build(map, self);
        }

        public ModifyApsSlsADBJobRequestColumns setMapName(String mapName) {
            this.mapName = mapName;
            return this;
        }
        public String getMapName() {
            return this.mapName;
        }

        public ModifyApsSlsADBJobRequestColumns setMapType(String mapType) {
            this.mapType = mapType;
            return this;
        }
        public String getMapType() {
            return this.mapType;
        }

        public ModifyApsSlsADBJobRequestColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyApsSlsADBJobRequestColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
