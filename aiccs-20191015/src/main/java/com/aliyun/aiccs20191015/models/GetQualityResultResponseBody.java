// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityResultResponseBody extends TeaModel {
    /**
     * <p>The name of the channel type.</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("ChannelTypeName")
    public String channelTypeName;

    /**
     * <p>The status code. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The quality inspection task data.</p>
     */
    @NameInMap("Data")
    public GetQualityResultResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The channel type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Hotline.</li>
         * <li><strong>2</strong>: Online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <p>The name of the channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("ChannelTypeName")
        public String channelTypeName;

        /**
         * <p>The ID of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated skill group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The details of the quality inspection result, including the hit keywords and context chat information.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("HitDetail")
        public String hitDetail;

        /**
         * <p>Indicates whether the rule is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitStatus")
        public Boolean hitStatus;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xspace commercial service</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>Anonymous member</p>
         */
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <p>The ID of the quality inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>15977801</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The name of the quality inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated quality inspection task</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The ID of the quality inspection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>5369</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the quality inspection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated quality inspection rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The ID of the customer service representative.</p>
         * 
         * <strong>example:</strong>
         * <p>555555</p>
         */
        @NameInMap("ServicerId")
        public String servicerId;

        /**
         * <p>The name of the customer service representative.</p>
         * 
         * <strong>example:</strong>
         * <p>Liu Test</p>
         */
        @NameInMap("ServicerName")
        public String servicerName;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20928756</p>
         */
        @NameInMap("TouchId")
        public String touchId;

        /**
         * <p>The start time of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-26 12:11:06</p>
         */
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
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of data details.</p>
         */
        @NameInMap("QualityResultResponseList")
        public java.util.List<GetQualityResultResponseBodyDataQualityResultResponseList> qualityResultResponseList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>84</p>
         */
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
