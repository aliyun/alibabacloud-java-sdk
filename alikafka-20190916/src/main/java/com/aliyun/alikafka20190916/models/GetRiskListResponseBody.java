// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetRiskListResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetRiskListResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06084011-E093-46F3-A51F-4B19A8AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRiskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRiskListResponseBody self = new GetRiskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRiskListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetRiskListResponseBody setData(GetRiskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRiskListResponseBodyData getData() {
        return this.data;
    }

    public GetRiskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRiskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRiskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRiskListResponseBodyDataRiskList extends TeaModel {
        /**
         * <p>The timestamp when the threat was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1702545932000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The metric rating. Valid values:</p>
         * <ul>
         * <li><p>A: Healthy.</p>
         * </li>
         * <li><p>B: Suboptimal.</p>
         * </li>
         * <li><p>F: Poor.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("GradeType")
        public String gradeType;

        /**
         * <p>Indicates whether the instance is healthy.
         * This is a Boolean parameter. Valid values:</p>
         * <ul>
         * <li><p>true: The instance is healthy.</p>
         * </li>
         * <li><p>false: The instance is unhealthy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Health")
        public Boolean health;

        /**
         * <p>The list of instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-m7r1tzxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The timestamp of the last alert. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683270264</p>
         */
        @NameInMap("LastAlarmTime")
        public Long lastAlarmTime;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p>0: Urgent.</p>
         * </li>
         * <li><p>1: Important.</p>
         * </li>
         * <li><p>2: Normal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelType")
        public Long levelType;

        /**
         * <p>The timestamp when the threat was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637719920000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The name of the threat item.</p>
         * <blockquote>
         * <p>There are 24 types of names.</p>
         * <ul>
         * <li>For more information, see the supplementary notes at the end of this document.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>inputIo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>0123123123xxx</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>A cascading structure. The system determines whether to nest another layer of report data based on the values of outer fields.</p>
         */
        @NameInMap("RelationList")
        public java.util.List<String> relationList;

        /**
         * <p>The recommended fix.</p>
         * 
         * <strong>example:</strong>
         * <p>相关问题里的Topic存在碎片化发送问题，请参考文档进行优化</p>
         */
        @NameInMap("ReportTips")
        public String reportTips;

        /**
         * <p>The report type of the threat item. Valid values:</p>
         * <ul>
         * <li><p>topic: Optimization is required for a specific topic.</p>
         * </li>
         * <li><p>group: Optimization is required for a specific group.</p>
         * </li>
         * <li><p>doc: Optimization must be performed based on a document.</p>
         * </li>
         * <li><p>commonBuy: An upgrade or a similar operation is required for the returned threat item.</p>
         * </li>
         * <li><p>mdsKey: You only need to fix the threat based on the suggestions in ReportTips.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>doc</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>The value of the report.</p>
         * <blockquote>
         * <ul>
         * <li><p>If ReportType is doc, ReportValue returns the document ID. You can construct the URL to the document by replacing the ${reportValue} variable in the following URL with the returned value: &lt;props=&quot;china&quot;&gt;https\://help.aliyun.com/document_detail/${reportValue}.html&lt;props=&quot;intl&quot;&gt;https\://www\.alibabacloud.com/help/document_detail/${reportValue}.html</p>
         * </li>
         * <li><p>If ReportType is commonBuy, an upgrade or a similar operation is required.</p>
         * </li>
         * <li><p>If ReportType is topic, the value of ReportValue is the name of the topic that needs to be fixed.</p>
         * </li>
         * <li><p>If ReportType is group, the value of ReportValue is the name of the group that needs to be fixed.</p>
         * </li>
         * <li><p>If ReportType is mdsKey, you only need to fix the threat based on the suggestions in ReportTips.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReportValue")
        public String reportValue;

        /**
         * <p>The status of the threat item. This parameter indicates whether the threat has been fixed. Valid values:</p>
         * <ul>
         * <li><p>0: To be fixed.</p>
         * </li>
         * <li><p>-1: Ignored.</p>
         * </li>
         * <li><p>1: Fixed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The type of the threat item.</p>
         * <blockquote>
         * <p>There are 24 types of threats.</p>
         * <ul>
         * <li>For more information, see the supplementary notes at the end of this document.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>inputIo</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value calculated by the system.</p>
         * <blockquote>
         * <p>If ReportType is doc, check the relationList and value fields. The value field returns a number that indicates the number of topics or groups in the <code>relationList</code> field that require optimization.</p>
         * <ul>
         * <li><p>When ReportType is commonBuy, check the value of Value. The value is a percentage.</p>
         * </li>
         * <li><p>When ReportType is topic, check the value of Value. The value identifies the Topic that needs to be fixed.</p>
         * </li>
         * <li><p>When ReportType is group, check the value of Value. The value identifies the Group that needs to be fixed.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetRiskListResponseBodyDataRiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRiskListResponseBodyDataRiskList self = new GetRiskListResponseBodyDataRiskList();
            return TeaModel.build(map, self);
        }

        public GetRiskListResponseBodyDataRiskList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRiskListResponseBodyDataRiskList setGradeType(String gradeType) {
            this.gradeType = gradeType;
            return this;
        }
        public String getGradeType() {
            return this.gradeType;
        }

        public GetRiskListResponseBodyDataRiskList setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public GetRiskListResponseBodyDataRiskList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRiskListResponseBodyDataRiskList setLastAlarmTime(Long lastAlarmTime) {
            this.lastAlarmTime = lastAlarmTime;
            return this;
        }
        public Long getLastAlarmTime() {
            return this.lastAlarmTime;
        }

        public GetRiskListResponseBodyDataRiskList setLevelType(Long levelType) {
            this.levelType = levelType;
            return this;
        }
        public Long getLevelType() {
            return this.levelType;
        }

        public GetRiskListResponseBodyDataRiskList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetRiskListResponseBodyDataRiskList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRiskListResponseBodyDataRiskList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetRiskListResponseBodyDataRiskList setRelationList(java.util.List<String> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<String> getRelationList() {
            return this.relationList;
        }

        public GetRiskListResponseBodyDataRiskList setReportTips(String reportTips) {
            this.reportTips = reportTips;
            return this;
        }
        public String getReportTips() {
            return this.reportTips;
        }

        public GetRiskListResponseBodyDataRiskList setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public GetRiskListResponseBodyDataRiskList setReportValue(String reportValue) {
            this.reportValue = reportValue;
            return this;
        }
        public String getReportValue() {
            return this.reportValue;
        }

        public GetRiskListResponseBodyDataRiskList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetRiskListResponseBodyDataRiskList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRiskListResponseBodyDataRiskList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRiskListResponseBodyData extends TeaModel {
        /**
         * <p>The list of threat items for the instance.</p>
         */
        @NameInMap("RiskList")
        public java.util.List<GetRiskListResponseBodyDataRiskList> riskList;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetRiskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRiskListResponseBodyData self = new GetRiskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRiskListResponseBodyData setRiskList(java.util.List<GetRiskListResponseBodyDataRiskList> riskList) {
            this.riskList = riskList;
            return this;
        }
        public java.util.List<GetRiskListResponseBodyDataRiskList> getRiskList() {
            return this.riskList;
        }

        public GetRiskListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
