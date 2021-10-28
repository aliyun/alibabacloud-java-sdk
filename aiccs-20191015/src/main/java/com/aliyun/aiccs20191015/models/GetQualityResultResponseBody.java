// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityResultResponseBody extends TeaModel {
    @NameInMap("ChannelTypeName")
    public String channelTypeName;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQualityResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQualityResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityResultResponseBody self = new GetQualityResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityResultResponseBody setChannelTypeName(String channelTypeName) {
        this.channelTypeName = channelTypeName;
        return this;
    }
    public String getChannelTypeName() {
        return this.channelTypeName;
    }

    public GetQualityResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityResultResponseBody setData(GetQualityResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityResultResponseBodyData getData() {
        return this.data;
    }

    public GetQualityResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityResultResponseBodyDataQualityResultResponseList extends TeaModel {
        @NameInMap("ChannelType")
        public String channelType;

        @NameInMap("ChannelTypeName")
        public String channelTypeName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("HitDetail")
        public String hitDetail;

        @NameInMap("HitStatus")
        public Boolean hitStatus;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("ServicerId")
        public String servicerId;

        @NameInMap("ServicerName")
        public String servicerName;

        @NameInMap("TouchId")
        public String touchId;

        @NameInMap("TouchStartTime")
        public String touchStartTime;

        public static GetQualityResultResponseBodyDataQualityResultResponseList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityResultResponseBodyDataQualityResultResponseList self = new GetQualityResultResponseBodyDataQualityResultResponseList();
            return TeaModel.build(map, self);
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setChannelTypeName(String channelTypeName) {
            this.channelTypeName = channelTypeName;
            return this;
        }
        public String getChannelTypeName() {
            return this.channelTypeName;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setHitDetail(String hitDetail) {
            this.hitDetail = hitDetail;
            return this;
        }
        public String getHitDetail() {
            return this.hitDetail;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setHitStatus(Boolean hitStatus) {
            this.hitStatus = hitStatus;
            return this;
        }
        public Boolean getHitStatus() {
            return this.hitStatus;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setServicerId(String servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public String getServicerId() {
            return this.servicerId;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setTouchId(String touchId) {
            this.touchId = touchId;
            return this;
        }
        public String getTouchId() {
            return this.touchId;
        }

        public GetQualityResultResponseBodyDataQualityResultResponseList setTouchStartTime(String touchStartTime) {
            this.touchStartTime = touchStartTime;
            return this;
        }
        public String getTouchStartTime() {
            return this.touchStartTime;
        }

    }

    public static class GetQualityResultResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("QualityResultResponseList")
        public java.util.List<GetQualityResultResponseBodyDataQualityResultResponseList> qualityResultResponseList;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetQualityResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityResultResponseBodyData self = new GetQualityResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityResultResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQualityResultResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQualityResultResponseBodyData setQualityResultResponseList(java.util.List<GetQualityResultResponseBodyDataQualityResultResponseList> qualityResultResponseList) {
            this.qualityResultResponseList = qualityResultResponseList;
            return this;
        }
        public java.util.List<GetQualityResultResponseBodyDataQualityResultResponseList> getQualityResultResponseList() {
            return this.qualityResultResponseList;
        }

        public GetQualityResultResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
