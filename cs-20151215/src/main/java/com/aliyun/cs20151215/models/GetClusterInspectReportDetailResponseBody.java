// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterInspectReportDetailResponseBody extends TeaModel {
    /**
     * <p>The results.</p>
     */
    @NameInMap("checkItemResults")
    public java.util.List<GetClusterInspectReportDetailResponseBodyCheckItemResults> checkItemResults;

    /**
     * <p>The completion time of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-18T19:41:12.778433+08:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The token that is used to display the returned tags on multiple pages.</p>
     * 
     * <strong>example:</strong>
     * <p>AK8uQQrxgFK8sbARvnCj6w9R3kPme4I3</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>782df89346054a0000562063a****</p>
     */
    @NameInMap("reportId")
    public String reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49511F2D-D56A-5C24-B9AE-C8491E09B***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The start time of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-18T19:40:16.778333+08:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The status of the inspection report. Valid values:</p>
     * <ul>
     * <li>completed: The inspection report is generated.</li>
     * <li>running: The inspection report is generating.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Overview of inspection reports.</p>
     */
    @NameInMap("summary")
    public GetClusterInspectReportDetailResponseBodySummary summary;

    public static GetClusterInspectReportDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInspectReportDetailResponseBody self = new GetClusterInspectReportDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterInspectReportDetailResponseBody setCheckItemResults(java.util.List<GetClusterInspectReportDetailResponseBodyCheckItemResults> checkItemResults) {
        this.checkItemResults = checkItemResults;
        return this;
    }
    public java.util.List<GetClusterInspectReportDetailResponseBodyCheckItemResults> getCheckItemResults() {
        return this.checkItemResults;
    }

    public GetClusterInspectReportDetailResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetClusterInspectReportDetailResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetClusterInspectReportDetailResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetClusterInspectReportDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterInspectReportDetailResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetClusterInspectReportDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetClusterInspectReportDetailResponseBody setSummary(GetClusterInspectReportDetailResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public GetClusterInspectReportDetailResponseBodySummary getSummary() {
        return this.summary;
    }

    public static class GetClusterInspectReportDetailResponseBodyCheckItemResults extends TeaModel {
        /**
         * <p>The category of the inspection item. Valid values:</p>
         * <ul>
         * <li>security: Security compliance</li>
         * <li>performance: Performance efficiency</li>
         * <li>stability: Business stability</li>
         * <li>limitation: Service limits</li>
         * <li>cost: Cost optimization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stability</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The unique identifier of the inspection item.</p>
         * 
         * <strong>example:</strong>
         * <p>APIServerClbInstanceStatus</p>
         */
        @NameInMap("checkItemUid")
        public String checkItemUid;

        /**
         * <p>The description of the inspection item.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The fixing suggestion.</p>
         */
        @NameInMap("fix")
        public String fix;

        /**
         * <p>The level of the inspection item. Valid values:</p>
         * <ul>
         * <li>advice: Suggestions</li>
         * <li>warning: Low severity</li>
         * <li>error: Medium severity</li>
         * <li>critical: High severity</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>critical</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The name of the inspection item.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The inspection results. Valid values:</p>
         * <ul>
         * <li>true: The inspection item is abnormal.</li>
         * <li>false: The inspection item is normal.</li>
         * <li>disable: The inspection item is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The resource type of the inspection object.</p>
         * 
         * <strong>example:</strong>
         * <p>CLB</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <p>The inspection objects.</p>
         */
        @NameInMap("targets")
        public java.util.List<String> targets;

        public static GetClusterInspectReportDetailResponseBodyCheckItemResults build(java.util.Map<String, ?> map) throws Exception {
            GetClusterInspectReportDetailResponseBodyCheckItemResults self = new GetClusterInspectReportDetailResponseBodyCheckItemResults();
            return TeaModel.build(map, self);
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setCheckItemUid(String checkItemUid) {
            this.checkItemUid = checkItemUid;
            return this;
        }
        public String getCheckItemUid() {
            return this.checkItemUid;
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setFix(String fix) {
            this.fix = fix;
            return this;
        }
        public String getFix() {
            return this.fix;
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetClusterInspectReportDetailResponseBodyCheckItemResults setTargets(java.util.List<String> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<String> getTargets() {
            return this.targets;
        }

    }

    public static class GetClusterInspectReportDetailResponseBodySummary extends TeaModel {
        /**
         * <p>The number of check items whose inspection result is advice.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("adviceCount")
        public Integer adviceCount;

        /**
         * <p>Check the status code of the inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The number of check items whose inspection result is error.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("errorCount")
        public Integer errorCount;

        /**
         * <p>The number of check items whose inspection result is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("normalCount")
        public Integer normalCount;

        /**
         * <p>The number of check items whose inspection result is warning.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("warnCount")
        public Integer warnCount;

        public static GetClusterInspectReportDetailResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            GetClusterInspectReportDetailResponseBodySummary self = new GetClusterInspectReportDetailResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public GetClusterInspectReportDetailResponseBodySummary setAdviceCount(Integer adviceCount) {
            this.adviceCount = adviceCount;
            return this;
        }
        public Integer getAdviceCount() {
            return this.adviceCount;
        }

        public GetClusterInspectReportDetailResponseBodySummary setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetClusterInspectReportDetailResponseBodySummary setErrorCount(Integer errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Integer getErrorCount() {
            return this.errorCount;
        }

        public GetClusterInspectReportDetailResponseBodySummary setNormalCount(Integer normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Integer getNormalCount() {
            return this.normalCount;
        }

        public GetClusterInspectReportDetailResponseBodySummary setWarnCount(Integer warnCount) {
            this.warnCount = warnCount;
            return this;
        }
        public Integer getWarnCount() {
            return this.warnCount;
        }

    }

}
