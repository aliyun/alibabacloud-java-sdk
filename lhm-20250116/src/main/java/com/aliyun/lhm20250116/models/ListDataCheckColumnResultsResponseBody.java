// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckColumnResultsResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public java.util.List<ListDataCheckColumnResultsResponseBodyData> data;

    /**
     * <p>The error code.</p>
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
     * <p>not supported.pos 3222, line 112, column 14, token IDENTIFIER settings</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The page number that indicates the requested page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>016D6CE5-51C6-5767-A8F9-D2818FC56509</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDataCheckColumnResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckColumnResultsResponseBody self = new ListDataCheckColumnResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCheckColumnResultsResponseBody setData(java.util.List<ListDataCheckColumnResultsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataCheckColumnResultsResponseBodyData> getData() {
        return this.data;
    }

    public ListDataCheckColumnResultsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDataCheckColumnResultsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListDataCheckColumnResultsResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckColumnResultsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckColumnResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCheckColumnResultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataCheckColumnResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataCheckColumnResultsResponseBodyData extends TeaModel {
        /**
         * <p>The actual difference.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00</p>
         */
        @NameInMap("actualThreshold")
        public String actualThreshold;

        /**
         * <p>The execution result. Valid values:</p>
         * <ul>
         * <li>0: no record.</li>
         * <li>1: passed.</li>
         * <li>2: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("checkResult")
        public Integer checkResult;

        /**
         * <p>The comparison rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM</p>
         */
        @NameInMap("checkRule")
        public String checkRule;

        /**
         * <p>The alias of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>dst</p>
         */
        @NameInMap("dstAlias")
        public String dstAlias;

        /**
         * <p>The field name of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>amount</p>
         */
        @NameInMap("dstColumnName")
        public String dstColumnName;

        /**
         * <p>The field type of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>decimal(38,18)</p>
         */
        @NameInMap("dstColumnType")
        public String dstColumnType;

        /**
         * <p>The metric key of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>dst_sum_amount</p>
         */
        @NameInMap("dstMetricColumn")
        public String dstMetricColumn;

        /**
         * <p>The result value of the destination field.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.00</p>
         */
        @NameInMap("dstResult")
        public String dstResult;

        /**
         * <p>The expected threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00</p>
         */
        @NameInMap("expectThreshold")
        public String expectThreshold;

        /**
         * <p>The validation result. Valid values:</p>
         * <ul>
         * <li>0: inconsistent.</li>
         * <li>1: consistent.</li>
         * <li>2: manually repaired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isConsistent")
        public Integer isConsistent;

        /**
         * <p>The alias of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>src</p>
         */
        @NameInMap("srcAlias")
        public String srcAlias;

        /**
         * <p>The field name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>amount</p>
         */
        @NameInMap("srcColumnName")
        public String srcColumnName;

        /**
         * <p>The field type of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>decimal(38,18)</p>
         */
        @NameInMap("srcColumnType")
        public String srcColumnType;

        /**
         * <p>The metric key of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>src_sum_amount</p>
         */
        @NameInMap("srcMetricColumn")
        public String srcMetricColumn;

        /**
         * <p>The result value of the source field.</p>
         * 
         * <strong>example:</strong>
         * <p>1000.00</p>
         */
        @NameInMap("srcResult")
        public String srcResult;

        /**
         * <p>The step ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stepId")
        public Long stepId;

        public static ListDataCheckColumnResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCheckColumnResultsResponseBodyData self = new ListDataCheckColumnResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCheckColumnResultsResponseBodyData setActualThreshold(String actualThreshold) {
            this.actualThreshold = actualThreshold;
            return this;
        }
        public String getActualThreshold() {
            return this.actualThreshold;
        }

        public ListDataCheckColumnResultsResponseBodyData setCheckResult(Integer checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Integer getCheckResult() {
            return this.checkResult;
        }

        public ListDataCheckColumnResultsResponseBodyData setCheckRule(String checkRule) {
            this.checkRule = checkRule;
            return this;
        }
        public String getCheckRule() {
            return this.checkRule;
        }

        public ListDataCheckColumnResultsResponseBodyData setDstAlias(String dstAlias) {
            this.dstAlias = dstAlias;
            return this;
        }
        public String getDstAlias() {
            return this.dstAlias;
        }

        public ListDataCheckColumnResultsResponseBodyData setDstColumnName(String dstColumnName) {
            this.dstColumnName = dstColumnName;
            return this;
        }
        public String getDstColumnName() {
            return this.dstColumnName;
        }

        public ListDataCheckColumnResultsResponseBodyData setDstColumnType(String dstColumnType) {
            this.dstColumnType = dstColumnType;
            return this;
        }
        public String getDstColumnType() {
            return this.dstColumnType;
        }

        public ListDataCheckColumnResultsResponseBodyData setDstMetricColumn(String dstMetricColumn) {
            this.dstMetricColumn = dstMetricColumn;
            return this;
        }
        public String getDstMetricColumn() {
            return this.dstMetricColumn;
        }

        public ListDataCheckColumnResultsResponseBodyData setDstResult(String dstResult) {
            this.dstResult = dstResult;
            return this;
        }
        public String getDstResult() {
            return this.dstResult;
        }

        public ListDataCheckColumnResultsResponseBodyData setExpectThreshold(String expectThreshold) {
            this.expectThreshold = expectThreshold;
            return this;
        }
        public String getExpectThreshold() {
            return this.expectThreshold;
        }

        public ListDataCheckColumnResultsResponseBodyData setIsConsistent(Integer isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

        public ListDataCheckColumnResultsResponseBodyData setSrcAlias(String srcAlias) {
            this.srcAlias = srcAlias;
            return this;
        }
        public String getSrcAlias() {
            return this.srcAlias;
        }

        public ListDataCheckColumnResultsResponseBodyData setSrcColumnName(String srcColumnName) {
            this.srcColumnName = srcColumnName;
            return this;
        }
        public String getSrcColumnName() {
            return this.srcColumnName;
        }

        public ListDataCheckColumnResultsResponseBodyData setSrcColumnType(String srcColumnType) {
            this.srcColumnType = srcColumnType;
            return this;
        }
        public String getSrcColumnType() {
            return this.srcColumnType;
        }

        public ListDataCheckColumnResultsResponseBodyData setSrcMetricColumn(String srcMetricColumn) {
            this.srcMetricColumn = srcMetricColumn;
            return this;
        }
        public String getSrcMetricColumn() {
            return this.srcMetricColumn;
        }

        public ListDataCheckColumnResultsResponseBodyData setSrcResult(String srcResult) {
            this.srcResult = srcResult;
            return this;
        }
        public String getSrcResult() {
            return this.srcResult;
        }

        public ListDataCheckColumnResultsResponseBodyData setStepId(Long stepId) {
            this.stepId = stepId;
            return this;
        }
        public Long getStepId() {
            return this.stepId;
        }

    }

}
