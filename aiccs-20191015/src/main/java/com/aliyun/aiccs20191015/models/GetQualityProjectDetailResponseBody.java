// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectDetailResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Data
    @NameInMap("Data")
    public GetQualityProjectDetailResponseBodyData data;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public String success;

    public static GetQualityProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectDetailResponseBody self = new GetQualityProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityProjectDetailResponseBody setData(GetQualityProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public GetQualityProjectDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityProjectDetailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQualityProjectDetailResponseBodyData extends TeaModel {
        // 质检周期
        @NameInMap("CheckFreqType")
        public Integer checkFreqType;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 技能组分组
        @NameInMap("DepList")
        public java.util.List<Long> depList;

        // 技能组列表
        @NameInMap("GroupList")
        public java.util.List<Long> groupList;

        // 质检任务ID
        @NameInMap("Id")
        public Long id;

        // 修改时间
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 质检任务名称
        @NameInMap("ProjectName")
        public String projectName;

        // 质检规则ID
        @NameInMap("QualityRuleIds")
        public java.util.List<Long> qualityRuleIds;

        // 质检类型
        @NameInMap("QualityType")
        public Integer qualityType;

        // 坐席列表
        @NameInMap("ServicerList")
        public java.util.List<Long> servicerList;

        // 质检任务状态
        @NameInMap("Status")
        public Integer status;

        // Version
        @NameInMap("Version")
        public Integer version;

        public static GetQualityProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectDetailResponseBodyData self = new GetQualityProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectDetailResponseBodyData setCheckFreqType(Integer checkFreqType) {
            this.checkFreqType = checkFreqType;
            return this;
        }
        public Integer getCheckFreqType() {
            return this.checkFreqType;
        }

        public GetQualityProjectDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityProjectDetailResponseBodyData setDepList(java.util.List<Long> depList) {
            this.depList = depList;
            return this;
        }
        public java.util.List<Long> getDepList() {
            return this.depList;
        }

        public GetQualityProjectDetailResponseBodyData setGroupList(java.util.List<Long> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<Long> getGroupList() {
            return this.groupList;
        }

        public GetQualityProjectDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityProjectDetailResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityProjectDetailResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityProjectDetailResponseBodyData setQualityRuleIds(java.util.List<Long> qualityRuleIds) {
            this.qualityRuleIds = qualityRuleIds;
            return this;
        }
        public java.util.List<Long> getQualityRuleIds() {
            return this.qualityRuleIds;
        }

        public GetQualityProjectDetailResponseBodyData setQualityType(Integer qualityType) {
            this.qualityType = qualityType;
            return this;
        }
        public Integer getQualityType() {
            return this.qualityType;
        }

        public GetQualityProjectDetailResponseBodyData setServicerList(java.util.List<Long> servicerList) {
            this.servicerList = servicerList;
            return this;
        }
        public java.util.List<Long> getServicerList() {
            return this.servicerList;
        }

        public GetQualityProjectDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetQualityProjectDetailResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
