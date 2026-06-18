// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectListRequest extends TeaModel {
    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The current page. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Page size. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Quality inspection job ID (supports fuzzy search).</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Quality inspection job name (supports fuzzy search).</p>
     * 
     * <strong>example:</strong>
     * <p>质检</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Quality inspection job status. Valid values:  </p>
     * <ul>
     * <li><strong>0</strong>: Start  </li>
     * <li><strong>1</strong>: Shutdown</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The check frequency type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Periodic quality inspection</li>
     * <li><strong>4</strong>: Temporary quality inspection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("checkFreqType")
    public Long checkFreqType;

    public static GetQualityProjectListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectListRequest self = new GetQualityProjectListRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQualityProjectListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetQualityProjectListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetQualityProjectListRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetQualityProjectListRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetQualityProjectListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetQualityProjectListRequest setCheckFreqType(Long checkFreqType) {
        this.checkFreqType = checkFreqType;
        return this;
    }
    public Long getCheckFreqType() {
        return this.checkFreqType;
    }

}
