// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetStepResultOverviewResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetStepResultOverviewResponseBodyData data;

    /**
     * <p>The fault message code.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>not supported.pos 10960, line 327, column 26, token IDENTIFIER settings</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>512AF06E-3B95-5932-81D8-717B15143359</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetStepResultOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStepResultOverviewResponseBody self = new GetStepResultOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStepResultOverviewResponseBody setData(GetStepResultOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStepResultOverviewResponseBodyData getData() {
        return this.data;
    }

    public GetStepResultOverviewResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetStepResultOverviewResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetStepResultOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStepResultOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStepResultOverviewResponseBodyData extends TeaModel {
        /**
         * <p>The number of validated fields.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("checkColumnCount")
        public Long checkColumnCount;

        /**
         * <p>The metric name of the target.</p>
         * 
         * <strong>example:</strong>
         * <p>amount</p>
         */
        @NameInMap("dstMetricName")
        public String dstMetricName;

        /**
         * <p>Indicates whether the source and target are consistent. Valid values:</p>
         * <ul>
         * <li>0: Inconsistent.</li>
         * <li>1: Consistent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isConsistent")
        public Integer isConsistent;

        /**
         * <p>The number of validated metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("metricColumnCount")
        public Long metricColumnCount;

        /**
         * <p>The number of metrics that passed validation.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("metricPassColumnCount")
        public Long metricPassColumnCount;

        /**
         * <p>The number of fields that passed validation.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("passColumnCount")
        public Long passColumnCount;

        /**
         * <p>The unique ID of the validation result.</p>
         * 
         * <strong>example:</strong>
         * <p>30001</p>
         */
        @NameInMap("resultId")
        public String resultId;

        /**
         * <p>The partition name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("sourcePtName")
        public String sourcePtName;

        /**
         * <p>The table name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("sourceTable")
        public String sourceTable;

        /**
         * <p>The metric name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>amount</p>
         */
        @NameInMap("srcMetricName")
        public String srcMetricName;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>0: Created.</li>
         * <li>1: Running.</li>
         * <li>2: Completed.</li>
         * <li>3: Stopped.</li>
         * <li>4: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>The partition name of the target.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20260116</p>
         */
        @NameInMap("targetPtName")
        public String targetPtName;

        /**
         * <p>The table name of the target.</p>
         * 
         * <strong>example:</strong>
         * <p>table_demo</p>
         */
        @NameInMap("targetTable")
        public String targetTable;

        public static GetStepResultOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStepResultOverviewResponseBodyData self = new GetStepResultOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStepResultOverviewResponseBodyData setCheckColumnCount(Long checkColumnCount) {
            this.checkColumnCount = checkColumnCount;
            return this;
        }
        public Long getCheckColumnCount() {
            return this.checkColumnCount;
        }

        public GetStepResultOverviewResponseBodyData setDstMetricName(String dstMetricName) {
            this.dstMetricName = dstMetricName;
            return this;
        }
        public String getDstMetricName() {
            return this.dstMetricName;
        }

        public GetStepResultOverviewResponseBodyData setIsConsistent(Integer isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

        public GetStepResultOverviewResponseBodyData setMetricColumnCount(Long metricColumnCount) {
            this.metricColumnCount = metricColumnCount;
            return this;
        }
        public Long getMetricColumnCount() {
            return this.metricColumnCount;
        }

        public GetStepResultOverviewResponseBodyData setMetricPassColumnCount(Long metricPassColumnCount) {
            this.metricPassColumnCount = metricPassColumnCount;
            return this;
        }
        public Long getMetricPassColumnCount() {
            return this.metricPassColumnCount;
        }

        public GetStepResultOverviewResponseBodyData setPassColumnCount(Long passColumnCount) {
            this.passColumnCount = passColumnCount;
            return this;
        }
        public Long getPassColumnCount() {
            return this.passColumnCount;
        }

        public GetStepResultOverviewResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public GetStepResultOverviewResponseBodyData setSourcePtName(String sourcePtName) {
            this.sourcePtName = sourcePtName;
            return this;
        }
        public String getSourcePtName() {
            return this.sourcePtName;
        }

        public GetStepResultOverviewResponseBodyData setSourceTable(String sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }
        public String getSourceTable() {
            return this.sourceTable;
        }

        public GetStepResultOverviewResponseBodyData setSrcMetricName(String srcMetricName) {
            this.srcMetricName = srcMetricName;
            return this;
        }
        public String getSrcMetricName() {
            return this.srcMetricName;
        }

        public GetStepResultOverviewResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetStepResultOverviewResponseBodyData setTargetPtName(String targetPtName) {
            this.targetPtName = targetPtName;
            return this;
        }
        public String getTargetPtName() {
            return this.targetPtName;
        }

        public GetStepResultOverviewResponseBodyData setTargetTable(String targetTable) {
            this.targetTable = targetTable;
            return this;
        }
        public String getTargetTable() {
            return this.targetTable;
        }

    }

}
