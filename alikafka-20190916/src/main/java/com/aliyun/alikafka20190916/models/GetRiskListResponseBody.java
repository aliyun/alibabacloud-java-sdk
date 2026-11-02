// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetRiskListResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned result.</p>
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
         * <p>The creation timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1702545932000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The metric rating. Valid values:</p>
         * <ul>
         * <li>A: Healthy.</li>
         * <li>B: Sub-healthy.</li>
         * <li>F: Poor.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("GradeType")
        public String gradeType;

        /**
         * <p>Indicates whether the instance is healthy. Valid values:</p>
         * <ul>
         * <li>true: Healthy.</li>
         * <li>false: Unhealthy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Health")
        public Boolean health;

        /**
         * <p>The instance ID.</p>
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
         * <li>0: Critical.</li>
         * <li>1: Important.</li>
         * <li>2: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelType")
        public Long levelType;

        /**
         * <p>The modification timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637719920000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The name of the risk item.</p>
         * <blockquote>
         * <p>There are 24 types of names.</p>
         * <ul>
         * <li>Detailed descriptions are provided in the following sections.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>inputIo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the user who owns the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0123123123xxx</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The infinitely nested structure. The system determines whether to nest another layer of report data based on the outer-layer fields.</p>
         */
        @NameInMap("RelationList")
        public java.util.List<String> relationList;

        /**
         * <p>The remediation suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>The topics in the related issues have fragmented sending problems. Refer to References for optimization</p>
         */
        @NameInMap("ReportTips")
        public String reportTips;

        /**
         * <p>The report type of the risk item. Valid values:</p>
         * <ul>
         * <li>topic: a specific topic that requires optimization.</li>
         * <li>group: a specific group that requires optimization.</li>
         * <li>doc: optimization is required based on the documentation.</li>
         * <li>commonBuy: the returned risk item requires operations such as specification upgrade.</li>
         * <li>mdsKey: follow the suggestions in ReportTips to fix the issue.</li>
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
         * <li>If ReportType is set to doc, ReportValue returns a document address. You can construct the link by replacing the returned ReportValue in the following URL: &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/$%7BreportValue%7D.html">https://help.aliyun.com/document_detail/${reportValue}.html</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/document_detail/$%7BreportValue%7D.html">https://www.alibabacloud.com/help/document_detail/${reportValue}.html</a></li>
         * <li>If ReportType is set to commonBuy, operations such as specification upgrade are required.</li>
         * <li>If ReportType is set to topic, check the value of reportValue. The reportValue is the topic that has issues and requires fixing.</li>
         * <li>If ReportType is set to group, check the value of reportValue. The reportValue is the group that has issues and requires fixing.</li>
         * <li>If ReportType is set to mdsKey, follow the suggestions in ReportTips to fix the issue.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReportValue")
        public String reportValue;

        /**
         * <p>The status of the risk item, which indicates whether the risk item has been fixed. Valid values:</p>
         * <ul>
         * <li>0: Pending fix.</li>
         * <li>-1: Ignored.</li>
         * <li>1: Fixed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The type of the risk item.</p>
         * <blockquote>
         * <p>There are 24 types of risk items.</p>
         * <ul>
         * <li>Detailed descriptions are provided in the following sections.</li>
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
         * <p>If ReportType is set to doc, check both the relationList field and the value field. The value field returns a number that indicates how many topics or groups in the relationList field require optimization.</p>
         * <ul>
         * <li>If ReportType is set to commonBuy, compare the Value. The Value returns a percentage.</li>
         * <li>If ReportType is set to topic, check the Value. The value is the topic that has issues and requires fixing.</li>
         * <li>If ReportType is set to group, check the Value. The value is the group that has issues and requires fixing.</li>
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
         * <p>The list of instance risk items.</p>
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
