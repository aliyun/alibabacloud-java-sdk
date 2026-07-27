// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgGetVisitDetailRequest extends TeaModel {
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
     * <p>The keyword of the table or project name. DataWorks supports fuzzy match. You can enter a keyword to query table or project names that contain the keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>ods</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The project name (ProjectName is easier to understand). Example: dsg_demo_gw.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dsg_demo_gw</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The name of the sensitive field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Name.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The sensitivity level. Example: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SensLevel")
    public String sensLevel;

    public static DsgGetVisitDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgGetVisitDetailRequest self = new DsgGetVisitDetailRequest();
        return TeaModel.build(map, self);
    }

    public DsgGetVisitDetailRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public DsgGetVisitDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DsgGetVisitDetailRequest setEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    public String getEngineName() {
        return this.engineName;
    }

    public DsgGetVisitDetailRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DsgGetVisitDetailRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DsgGetVisitDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DsgGetVisitDetailRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DsgGetVisitDetailRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DsgGetVisitDetailRequest setSensLevel(String sensLevel) {
        this.sensLevel = sensLevel;
        return this;
    }
    public String getSensLevel() {
        return this.sensLevel;
    }

}
