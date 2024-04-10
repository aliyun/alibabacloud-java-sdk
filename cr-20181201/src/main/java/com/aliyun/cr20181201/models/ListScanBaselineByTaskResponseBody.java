// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanBaselineByTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScanBaselines")
    public java.util.List<ListScanBaselineByTaskResponseBodyScanBaselines> scanBaselines;

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
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        @NameInMap("BaselineDetailAdvice")
        public String baselineDetailAdvice;

        @NameInMap("BaselineDetailDescription")
        public String baselineDetailDescription;

        @NameInMap("BaselineDetailPrompt")
        public String baselineDetailPrompt;

        @NameInMap("BaselineItemCount")
        public Integer baselineItemCount;

        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        @NameInMap("BaselineNameKey")
        public String baselineNameKey;

        @NameInMap("BaselineNameLevel")
        public String baselineNameLevel;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        @NameInMap("HighRiskItemCount")
        public Integer highRiskItemCount;

        @NameInMap("LowRiskItemCount")
        public Integer lowRiskItemCount;

        @NameInMap("MiddleRiskItemCount")
        public Integer middleRiskItemCount;

        @NameInMap("ScanTaskId")
        public String scanTaskId;

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
