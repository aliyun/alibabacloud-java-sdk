// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectListResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Data
    @NameInMap("Data")
    public GetQualityProjectListResponseBodyData data;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityProjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectListResponseBody self = new GetQualityProjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityProjectListResponseBody setData(GetQualityProjectListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityProjectListResponseBodyData getData() {
        return this.data;
    }

    public GetQualityProjectListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityProjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityProjectListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityProjectListResponseBodyDataQualityProjectList extends TeaModel {
        // 质检任务频率
        @NameInMap("CheckFreqType")
        public Integer checkFreqType;

        // CreateTime
        @NameInMap("CreateTime")
        public String createTime;

        // 技能组分组列表
        @NameInMap("DepList")
        public java.util.List<Long> depList;

        // 技能组列表
        @NameInMap("GroupList")
        public java.util.List<Long> groupList;

        // 质检任务Id
        @NameInMap("Id")
        public Long id;

        // 修改时间
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 质检任务名称
        @NameInMap("ProjectName")
        public String projectName;

        // 质检规则列表
        @NameInMap("QualityRuleIds")
        public java.util.List<Long> qualityRuleIds;

        // 质检任务类型
        @NameInMap("QualityType")
        public Integer qualityType;

        // 坐席列表
        @NameInMap("ServicerList")
        public java.util.List<Long> servicerList;

        // 质检任务状态
        @NameInMap("Status")
        public Integer status;

        // 版本
        @NameInMap("Version")
        public Integer version;

        public static GetQualityProjectListResponseBodyDataQualityProjectList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectListResponseBodyDataQualityProjectList self = new GetQualityProjectListResponseBodyDataQualityProjectList();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setCheckFreqType(Integer checkFreqType) {
            this.checkFreqType = checkFreqType;
            return this;
        }
        public Integer getCheckFreqType() {
            return this.checkFreqType;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setDepList(java.util.List<Long> depList) {
            this.depList = depList;
            return this;
        }
        public java.util.List<Long> getDepList() {
            return this.depList;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setGroupList(java.util.List<Long> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<Long> getGroupList() {
            return this.groupList;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setQualityRuleIds(java.util.List<Long> qualityRuleIds) {
            this.qualityRuleIds = qualityRuleIds;
            return this;
        }
        public java.util.List<Long> getQualityRuleIds() {
            return this.qualityRuleIds;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setQualityType(Integer qualityType) {
            this.qualityType = qualityType;
            return this;
        }
        public Integer getQualityType() {
            return this.qualityType;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setServicerList(java.util.List<Long> servicerList) {
            this.servicerList = servicerList;
            return this;
        }
        public java.util.List<Long> getServicerList() {
            return this.servicerList;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetQualityProjectListResponseBodyData extends TeaModel {
        // PageNo
        @NameInMap("PageNo")
        public Integer pageNo;

        // PageSize
        @NameInMap("PageSize")
        public Integer pageSize;

        // 质检项列表
        @NameInMap("QualityProjectList")
        public java.util.List<GetQualityProjectListResponseBodyDataQualityProjectList> qualityProjectList;

        // Total
        @NameInMap("Total")
        public Long total;

        public static GetQualityProjectListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectListResponseBodyData self = new GetQualityProjectListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQualityProjectListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQualityProjectListResponseBodyData setQualityProjectList(java.util.List<GetQualityProjectListResponseBodyDataQualityProjectList> qualityProjectList) {
            this.qualityProjectList = qualityProjectList;
            return this;
        }
        public java.util.List<GetQualityProjectListResponseBodyDataQualityProjectList> getQualityProjectList() {
            return this.qualityProjectList;
        }

        public GetQualityProjectListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
