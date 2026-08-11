// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenLogSyncToSLSRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1ub9grke1****</p>
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
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Simple Log Service LogStore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adbmysql-audit-log</p>
     */
    @NameInMap("TargetLogStore")
    public String targetLogStore;

    /**
     * <p>The Simple Log Service project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log-service-****-cn-shenzhen</p>
     */
    @NameInMap("TargetProject")
    public String targetProject;

    public static OpenLogSyncToSLSRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenLogSyncToSLSRequest self = new OpenLogSyncToSLSRequest();
        return TeaModel.build(map, self);
    }

    public OpenLogSyncToSLSRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public OpenLogSyncToSLSRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public OpenLogSyncToSLSRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OpenLogSyncToSLSRequest setTargetLogStore(String targetLogStore) {
        this.targetLogStore = targetLogStore;
        return this;
    }
    public String getTargetLogStore() {
        return this.targetLogStore;
    }

    public OpenLogSyncToSLSRequest setTargetProject(String targetProject) {
        this.targetProject = targetProject;
        return this;
    }
    public String getTargetProject() {
        return this.targetProject;
    }

}
