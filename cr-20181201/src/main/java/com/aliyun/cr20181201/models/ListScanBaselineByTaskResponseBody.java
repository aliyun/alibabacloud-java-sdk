// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanBaselineByTaskResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the API request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: successful</li>
     * <li><code>false</code>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number.</p>
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
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5259118F-79E2-57E9-9AEA-551586F4FAED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scanned baseline risks.</p>
     */
    @NameInMap("ScanBaselines")
    public java.util.List<ListScanBaselineByTaskResponseBodyScanBaselines> scanBaselines;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListScanBaselineByTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScanBaselineByTaskResponseBody self = new ListScanBaselineByTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScanBaselineByTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListScanBaselineByTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListScanBaselineByTaskResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListScanBaselineByTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScanBaselineByTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScanBaselineByTaskResponseBody setScanBaselines(java.util.List<ListScanBaselineByTaskResponseBodyScanBaselines> scanBaselines) {
        this.scanBaselines = scanBaselines;
        return this;
    }
    public java.util.List<ListScanBaselineByTaskResponseBodyScanBaselines> getScanBaselines() {
        return this.scanBaselines;
    }

    public ListScanBaselineByTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListScanBaselineByTaskResponseBodyScanBaselines extends TeaModel {
        /**
         * <p>The category to which the baseline risk belongs.</p>
         */
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        /**
         * <p>Suggestions about how to fix the baseline risk.</p>
         */
        @NameInMap("BaselineDetailAdvice")
        public String baselineDetailAdvice;

        /**
         * <p>The description of the baseline risk.</p>
         */
        @NameInMap("BaselineDetailDescription")
        public String baselineDetailDescription;

        /**
         * <p>The path and content of the baseline risk.</p>
         * 
         * <strong>example:</strong>
         * <p>usr/local/www/project/environments/dev/common/config/paramsxxx</p>
         */
        @NameInMap("BaselineDetailPrompt")
        public String baselineDetailPrompt;

        /**
         * <p>The number of baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BaselineItemCount")
        public Integer baselineItemCount;

        /**
         * <p>The name of the baseline risk.</p>
         */
        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        /**
         * <p>The key of the baseline name.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_leak</p>
         */
        @NameInMap("BaselineNameKey")
        public String baselineNameKey;

        /**
         * <p>The severity of the baseline risk.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("BaselineNameLevel")
        public String baselineNameLevel;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1695090008000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time of the first scan.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-10 15:33:26</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>High risk quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HighRiskItemCount")
        public Integer highRiskItemCount;

        /**
         * <p>Low risk quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LowRiskItemCount")
        public Integer lowRiskItemCount;

        /**
         * <p>Medium risk quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MiddleRiskItemCount")
        public Integer middleRiskItemCount;

        /**
         * <p>The ID of the image scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>2328fcaa-f28a-405d-a357-asdvfrew23</p>
         */
        @NameInMap("ScanTaskId")
        public String scanTaskId;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1684220824226</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListScanBaselineByTaskResponseBodyScanBaselines build(java.util.Map<String, ?> map) throws Exception {
            ListScanBaselineByTaskResponseBodyScanBaselines self = new ListScanBaselineByTaskResponseBodyScanBaselines();
            return TeaModel.build(map, self);
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setBaselineClassAlias(String baselineClassAlias) {
            this.baselineClassAlias = baselineClassAlias;
            return this;
        }
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setBaselineDetailAdvice(String baselineDetailAdvice) {
            this.baselineDetailAdvice = baselineDetailAdvice;
            return this;
        }
        public String getBaselineDetailAdvice() {
            return this.baselineDetailAdvice;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setBaselineDetailDescription(String baselineDetailDescription) {
            this.baselineDetailDescription = baselineDetailDescription;
            return this;
        }
        public String getBaselineDetailDescription() {
            return this.baselineDetailDescription;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setBaselineDetailPrompt(String baselineDetailPrompt) {
            this.baselineDetailPrompt = baselineDetailPrompt;
            return this;
        }
        public String getBaselineDetailPrompt() {
            return this.baselineDetailPrompt;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setBaselineItemCount(Integer baselineItemCount) {
            this.baselineItemCount = baselineItemCount;
            return this;
        }
        public Integer getBaselineItemCount() {
            return this.baselineItemCount;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setBaselineNameAlias(String baselineNameAlias) {
            this.baselineNameAlias = baselineNameAlias;
            return this;
        }
        public String getBaselineNameAlias() {
            return this.baselineNameAlias;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setBaselineNameKey(String baselineNameKey) {
            this.baselineNameKey = baselineNameKey;
            return this;
        }
        public String getBaselineNameKey() {
            return this.baselineNameKey;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setBaselineNameLevel(String baselineNameLevel) {
            this.baselineNameLevel = baselineNameLevel;
            return this;
        }
        public String getBaselineNameLevel() {
            return this.baselineNameLevel;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setHighRiskItemCount(Integer highRiskItemCount) {
            this.highRiskItemCount = highRiskItemCount;
            return this;
        }
        public Integer getHighRiskItemCount() {
            return this.highRiskItemCount;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setLowRiskItemCount(Integer lowRiskItemCount) {
            this.lowRiskItemCount = lowRiskItemCount;
            return this;
        }
        public Integer getLowRiskItemCount() {
            return this.lowRiskItemCount;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setMiddleRiskItemCount(Integer middleRiskItemCount) {
            this.middleRiskItemCount = middleRiskItemCount;
            return this;
        }
        public Integer getMiddleRiskItemCount() {
            return this.middleRiskItemCount;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setScanTaskId(String scanTaskId) {
            this.scanTaskId = scanTaskId;
            return this;
        }
        public String getScanTaskId() {
            return this.scanTaskId;
        }

        public ListScanBaselineByTaskResponseBodyScanBaselines setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
