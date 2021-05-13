// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectListRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 质检项ID
    @NameInMap("ProjectId")
    public Long projectId;

    // 质检项名称
    @NameInMap("ProjectName")
    public String projectName;

    // 质检项状态
    @NameInMap("Status")
    public Integer status;

    // PageNo
    @NameInMap("PageNo")
    public Integer pageNo;

    // PageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // 质检频率
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

    public GetQualityProjectListRequest setCheckFreqType(Long checkFreqType) {
        this.checkFreqType = checkFreqType;
        return this;
    }
    public Long getCheckFreqType() {
        return this.checkFreqType;
    }

}
