// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDetailsRequest extends TeaModel {
    /**
     * <p>The start time of the query range. Example: &quot;2026-06-26 00:00:00&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-26 00:00:00</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The end time of the query range. Example: &quot;2026-06-30 23:59:59&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-30 23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The engine type. Valid values:</p>
     * <ul>
     * <li>ODPS.ODPS</li>
     * <li>EMR</li>
     * <li>HOLO.POSTGRES</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS.ODPS</p>
     */
    @NameInMap("EngineName")
    public String engineName;

    /**
     * <p>The internal IP address of the ECU.</p>
     * 
     * <strong>example:</strong>
     * <p>203.107.80.20</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The region to which the IP address belongs. Example: China-Beijing-Beijing, or internal IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>China-Beijing-Beijing.</p>
     */
    @NameInMap("IpAare")
    public String ipAare;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123541234</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number. Minimum value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Maximum value: 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The project workspace name (essentially ProjectName). Example: dsg_demo_gw.</p>
     * 
     * <strong>example:</strong>
     * <p>dsg_demo_gw</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The minimum value of the export volume.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Rows")
    public Integer rows;

    /**
     * <p>The type of triggered sensitive rule. Example: Name.</p>
     * 
     * <strong>example:</strong>
     * <p>Name.</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The classification level. Example: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SensLevel")
    public String sensLevel;

    /**
     * <p>The operator account. Example: dsg_test.</p>
     * 
     * <strong>example:</strong>
     * <p>dsg_test</p>
     */
    @NameInMap("User")
    public String user;

    public static DsgQueryDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryDetailsRequest self = new DsgQueryDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DsgQueryDetailsRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public DsgQueryDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DsgQueryDetailsRequest setEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    public String getEngineName() {
        return this.engineName;
    }

    public DsgQueryDetailsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DsgQueryDetailsRequest setIpAare(String ipAare) {
        this.ipAare = ipAare;
        return this;
    }
    public String getIpAare() {
        return this.ipAare;
    }

    public DsgQueryDetailsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DsgQueryDetailsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DsgQueryDetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DsgQueryDetailsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DsgQueryDetailsRequest setRows(Integer rows) {
        this.rows = rows;
        return this;
    }
    public Integer getRows() {
        return this.rows;
    }

    public DsgQueryDetailsRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DsgQueryDetailsRequest setSensLevel(String sensLevel) {
        this.sensLevel = sensLevel;
        return this;
    }
    public String getSensLevel() {
        return this.sensLevel;
    }

    public DsgQueryDetailsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
