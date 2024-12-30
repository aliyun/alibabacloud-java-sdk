// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsSlsADBJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Columns")
    public String columnsShrink;

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

    public static ModifyApsSlsADBJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsSlsADBJobShrinkRequest self = new ModifyApsSlsADBJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApsSlsADBJobShrinkRequest setColumnsShrink(String columnsShrink) {
        this.columnsShrink = columnsShrink;
        return this;
    }
    public String getColumnsShrink() {
        return this.columnsShrink;
    }

    public ModifyApsSlsADBJobShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyApsSlsADBJobShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyApsSlsADBJobShrinkRequest setDirtyDataProcessPattern(String dirtyDataProcessPattern) {
        this.dirtyDataProcessPattern = dirtyDataProcessPattern;
        return this;
    }
    public String getDirtyDataProcessPattern() {
        return this.dirtyDataProcessPattern;
    }

    public ModifyApsSlsADBJobShrinkRequest setExactlyOnce(String exactlyOnce) {
        this.exactlyOnce = exactlyOnce;
        return this;
    }
    public String getExactlyOnce() {
        return this.exactlyOnce;
    }

    public ModifyApsSlsADBJobShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyApsSlsADBJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApsSlsADBJobShrinkRequest setStartingOffsets(String startingOffsets) {
        this.startingOffsets = startingOffsets;
        return this;
    }
    public String getStartingOffsets() {
        return this.startingOffsets;
    }

    public ModifyApsSlsADBJobShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ModifyApsSlsADBJobShrinkRequest setUnixTimestampConvert(String unixTimestampConvert) {
        this.unixTimestampConvert = unixTimestampConvert;
        return this;
    }
    public String getUnixTimestampConvert() {
        return this.unixTimestampConvert;
    }

    public ModifyApsSlsADBJobShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyApsSlsADBJobShrinkRequest setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

    public ModifyApsSlsADBJobShrinkRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

}
