// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CloseLogSyncToSLSRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp198m028ih55****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The log type. Valid values:</p>
     * <ul>
     * <li><strong>ADBMYSQL_AUDIT_LOG</strong></li>
     * <li><strong>ADBMYSQL_INSERT_LOG</strong></li>
     * </ul>
     * <p>Default value: <code>ADBMYSQL_AUDIT_LOG</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ADBMYSQL_AUDIT_LOG</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CloseLogSyncToSLSRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseLogSyncToSLSRequest self = new CloseLogSyncToSLSRequest();
        return TeaModel.build(map, self);
    }

    public CloseLogSyncToSLSRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CloseLogSyncToSLSRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public CloseLogSyncToSLSRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
