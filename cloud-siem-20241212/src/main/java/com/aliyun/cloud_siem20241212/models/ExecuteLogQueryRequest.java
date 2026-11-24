// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ExecuteLogQueryRequest extends TeaModel {
    /**
     * <p>The end time. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1733269771123</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to pack non-standard fields into the extend_content field. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ExtendContentPacked")
    public String extendContentPacked;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English. This parameter is actually required. If it is not provided, the service returns a 400 error. Explicitly specify zh or en.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The log query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;alert_level\&quot;:[\&quot;5\&quot;,\&quot;4\&quot;,\&quot;3\&quot;,\&quot;2\&quot;,\&quot;1\&quot;]}</p>
     */
    @NameInMap("LogCondition")
    public String logCondition;

    /**
     * <p>The name of the Simple Log Service project. This parameter is required when executing a log query.</p>
     * 
     * <strong>example:</strong>
     * <p>slsaudit-center-173326*******-cn-hangzhou</p>
     */
    @NameInMap("LogProjectName")
    public String logProjectName;

    /**
     * <p>The Simple Log Service query statement.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("LogQuery")
    public String logQuery;

    /**
     * <p>The ID of the log storage region. This parameter is actually required when you execute a log query.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LogRegionId")
    public String logRegionId;

    /**
     * <p>The name of the Simple Log Service project. This parameter is required when executing a log query.</p>
     * 
     * <strong>example:</strong>
     * <p>huawei-cn-cfw</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The ID of the user for data ingestion.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("LogUserId")
    public Long logUserId;

    /**
     * <p>The normalization schema ID. This parameter is required if packing is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>WAF_ALERT_ACTIVITY</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    /**
     * <p>The region where the data management center of Threat Analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The start time. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1733269771123</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ExecuteLogQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteLogQueryRequest self = new ExecuteLogQueryRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteLogQueryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ExecuteLogQueryRequest setExtendContentPacked(String extendContentPacked) {
        this.extendContentPacked = extendContentPacked;
        return this;
    }
    public String getExtendContentPacked() {
        return this.extendContentPacked;
    }

    public ExecuteLogQueryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecuteLogQueryRequest setLogCondition(String logCondition) {
        this.logCondition = logCondition;
        return this;
    }
    public String getLogCondition() {
        return this.logCondition;
    }

    public ExecuteLogQueryRequest setLogProjectName(String logProjectName) {
        this.logProjectName = logProjectName;
        return this;
    }
    public String getLogProjectName() {
        return this.logProjectName;
    }

    public ExecuteLogQueryRequest setLogQuery(String logQuery) {
        this.logQuery = logQuery;
        return this;
    }
    public String getLogQuery() {
        return this.logQuery;
    }

    public ExecuteLogQueryRequest setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public ExecuteLogQueryRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public ExecuteLogQueryRequest setLogUserId(Long logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public Long getLogUserId() {
        return this.logUserId;
    }

    public ExecuteLogQueryRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public ExecuteLogQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteLogQueryRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ExecuteLogQueryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
