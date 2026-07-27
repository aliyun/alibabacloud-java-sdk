// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgGetVisitStatRequest extends TeaModel {
    /**
     * <p>The start time in the format of &quot;2026-06-30 03:59:59&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-30 03:59:59</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The end time in the format of &quot;2026-06-30 23:59:59&quot;.</p>
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
     * <p>The node ID. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d0c72253-8eea-435b-91fc-163a90a54b33</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the project space. Example value: dsg_demo_gw.</p>
     * 
     * <strong>example:</strong>
     * <p>dsg_demo_gw</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The name of the sensitive field.</p>
     * 
     * <strong>example:</strong>
     * <p>Name.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The classification level. Example value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SensLevel")
    public String sensLevel;

    public static DsgGetVisitStatRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgGetVisitStatRequest self = new DsgGetVisitStatRequest();
        return TeaModel.build(map, self);
    }

    public DsgGetVisitStatRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public DsgGetVisitStatRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DsgGetVisitStatRequest setEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    public String getEngineName() {
        return this.engineName;
    }

    public DsgGetVisitStatRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DsgGetVisitStatRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DsgGetVisitStatRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DsgGetVisitStatRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DsgGetVisitStatRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DsgGetVisitStatRequest setSensLevel(String sensLevel) {
        this.sensLevel = sensLevel;
        return this;
    }
    public String getSensLevel() {
        return this.sensLevel;
    }

}
