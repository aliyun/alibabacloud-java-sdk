// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetQualityProjectDetailResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public String success;

    public static GetQualityProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectDetailResponseBody self = new GetQualityProjectDetailResponseBody();
        return TeaModel.build(map, self);
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

    public GetQualityProjectDetailResponseBody setData(GetQualityProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public GetQualityProjectDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityProjectDetailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQualityProjectDetailResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("QualityType")
        public Integer qualityType;

        @NameInMap("QualityRuleIds")
        public java.util.List<Long> qualityRuleIds;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("CheckFreqType")
        public Integer checkFreqType;

        @NameInMap("DepList")
        public java.util.List<Long> depList;

        @NameInMap("ServicerList")
        public java.util.List<Long> servicerList;

        @NameInMap("Version")
        public Integer version;

        @NameInMap("GroupList")
        public java.util.List<Long> groupList;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static GetQualityProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectDetailResponseBodyData self = new GetQualityProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetQualityProjectDetailResponseBodyData setQualityType(Integer qualityType) {
            this.qualityType = qualityType;
            return this;
        }
        public Integer getQualityType() {
            return this.qualityType;
        }

        public GetQualityProjectDetailResponseBodyData setQualityRuleIds(java.util.List<Long> qualityRuleIds) {
            this.qualityRuleIds = qualityRuleIds;
            return this;
        }
        public java.util.List<Long> getQualityRuleIds() {
            return this.qualityRuleIds;
        }

        public GetQualityProjectDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityProjectDetailResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityProjectDetailResponseBodyData setCheckFreqType(Integer checkFreqType) {
            this.checkFreqType = checkFreqType;
            return this;
        }
        public Integer getCheckFreqType() {
            return this.checkFreqType;
        }

        public GetQualityProjectDetailResponseBodyData setDepList(java.util.List<Long> depList) {
            this.depList = depList;
            return this;
        }
        public java.util.List<Long> getDepList() {
            return this.depList;
        }

        public GetQualityProjectDetailResponseBodyData setServicerList(java.util.List<Long> servicerList) {
            this.servicerList = servicerList;
            return this;
        }
        public java.util.List<Long> getServicerList() {
            return this.servicerList;
        }

        public GetQualityProjectDetailResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
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

    }

}
