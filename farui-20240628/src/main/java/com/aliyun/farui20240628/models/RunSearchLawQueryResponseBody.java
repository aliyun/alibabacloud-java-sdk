// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunSearchLawQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public RunSearchLawQueryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Long httpStatusCode;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>05062567-EB51-50F6-AF56-0BE44955848D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RunSearchLawQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSearchLawQueryResponseBody self = new RunSearchLawQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSearchLawQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunSearchLawQueryResponseBody setData(RunSearchLawQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunSearchLawQueryResponseBodyData getData() {
        return this.data;
    }

    public RunSearchLawQueryResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunSearchLawQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunSearchLawQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunSearchLawQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunSearchLawQueryResponseBodyDataLawResultLawDomain extends TeaModel {
        @NameInMap("abolitionBasis")
        public String abolitionBasis;

        @NameInMap("implementYearMonthDate")
        public String implementYearMonthDate;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("invalidBasis")
        public String invalidBasis;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("issuingNo")
        public String issuingNo;

        @NameInMap("issuingOrgan")
        public String issuingOrgan;

        /**
         * <strong>example:</strong>
         * <p>b2274825c8c3bc2343ca73680243ddc8</p>
         */
        @NameInMap("lawId")
        public String lawId;

        /**
         * <strong>example:</strong>
         * <p>ccc209683be1509676174fd6890f24b8</p>
         */
        @NameInMap("lawItemId")
        public String lawItemId;

        @NameInMap("lawName")
        public String lawName;

        @NameInMap("lawOrder")
        public String lawOrder;

        @NameInMap("lawSourceContent")
        public String lawSourceContent;

        @NameInMap("lawTitle")
        public String lawTitle;

        /**
         * <strong>example:</strong>
         * <p>&quot;[]&quot;</p>
         */
        @NameInMap("modifyBasis")
        public String modifyBasis;

        @NameInMap("potencyLevel")
        public String potencyLevel;

        @NameInMap("releaseYearMonthDate")
        public String releaseYearMonthDate;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("thematicClassify")
        public String thematicClassify;

        @NameInMap("timeliness")
        public String timeliness;

        public static RunSearchLawQueryResponseBodyDataLawResultLawDomain build(java.util.Map<String, ?> map) throws Exception {
            RunSearchLawQueryResponseBodyDataLawResultLawDomain self = new RunSearchLawQueryResponseBodyDataLawResultLawDomain();
            return TeaModel.build(map, self);
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setAbolitionBasis(String abolitionBasis) {
            this.abolitionBasis = abolitionBasis;
            return this;
        }
        public String getAbolitionBasis() {
            return this.abolitionBasis;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setImplementYearMonthDate(String implementYearMonthDate) {
            this.implementYearMonthDate = implementYearMonthDate;
            return this;
        }
        public String getImplementYearMonthDate() {
            return this.implementYearMonthDate;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setInvalidBasis(String invalidBasis) {
            this.invalidBasis = invalidBasis;
            return this;
        }
        public String getInvalidBasis() {
            return this.invalidBasis;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setIssuingNo(String issuingNo) {
            this.issuingNo = issuingNo;
            return this;
        }
        public String getIssuingNo() {
            return this.issuingNo;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setIssuingOrgan(String issuingOrgan) {
            this.issuingOrgan = issuingOrgan;
            return this;
        }
        public String getIssuingOrgan() {
            return this.issuingOrgan;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setLawId(String lawId) {
            this.lawId = lawId;
            return this;
        }
        public String getLawId() {
            return this.lawId;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setLawItemId(String lawItemId) {
            this.lawItemId = lawItemId;
            return this;
        }
        public String getLawItemId() {
            return this.lawItemId;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setLawName(String lawName) {
            this.lawName = lawName;
            return this;
        }
        public String getLawName() {
            return this.lawName;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setLawOrder(String lawOrder) {
            this.lawOrder = lawOrder;
            return this;
        }
        public String getLawOrder() {
            return this.lawOrder;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setLawSourceContent(String lawSourceContent) {
            this.lawSourceContent = lawSourceContent;
            return this;
        }
        public String getLawSourceContent() {
            return this.lawSourceContent;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setLawTitle(String lawTitle) {
            this.lawTitle = lawTitle;
            return this;
        }
        public String getLawTitle() {
            return this.lawTitle;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setModifyBasis(String modifyBasis) {
            this.modifyBasis = modifyBasis;
            return this;
        }
        public String getModifyBasis() {
            return this.modifyBasis;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setPotencyLevel(String potencyLevel) {
            this.potencyLevel = potencyLevel;
            return this;
        }
        public String getPotencyLevel() {
            return this.potencyLevel;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setReleaseYearMonthDate(String releaseYearMonthDate) {
            this.releaseYearMonthDate = releaseYearMonthDate;
            return this;
        }
        public String getReleaseYearMonthDate() {
            return this.releaseYearMonthDate;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setThematicClassify(String thematicClassify) {
            this.thematicClassify = thematicClassify;
            return this;
        }
        public String getThematicClassify() {
            return this.thematicClassify;
        }

        public RunSearchLawQueryResponseBodyDataLawResultLawDomain setTimeliness(String timeliness) {
            this.timeliness = timeliness;
            return this;
        }
        public String getTimeliness() {
            return this.timeliness;
        }

    }

    public static class RunSearchLawQueryResponseBodyDataLawResult extends TeaModel {
        @NameInMap("lawDomain")
        public RunSearchLawQueryResponseBodyDataLawResultLawDomain lawDomain;

        /**
         * <strong>example:</strong>
         * <p>0.0050</p>
         */
        @NameInMap("similarity")
        public String similarity;

        public static RunSearchLawQueryResponseBodyDataLawResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchLawQueryResponseBodyDataLawResult self = new RunSearchLawQueryResponseBodyDataLawResult();
            return TeaModel.build(map, self);
        }

        public RunSearchLawQueryResponseBodyDataLawResult setLawDomain(RunSearchLawQueryResponseBodyDataLawResultLawDomain lawDomain) {
            this.lawDomain = lawDomain;
            return this;
        }
        public RunSearchLawQueryResponseBodyDataLawResultLawDomain getLawDomain() {
            return this.lawDomain;
        }

        public RunSearchLawQueryResponseBodyDataLawResult setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class RunSearchLawQueryResponseBodyDataSortKeyAndDirection extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("releaseYearMonthDate")
        public String releaseYearMonthDate;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("similarity")
        public String similarity;

        public static RunSearchLawQueryResponseBodyDataSortKeyAndDirection build(java.util.Map<String, ?> map) throws Exception {
            RunSearchLawQueryResponseBodyDataSortKeyAndDirection self = new RunSearchLawQueryResponseBodyDataSortKeyAndDirection();
            return TeaModel.build(map, self);
        }

        public RunSearchLawQueryResponseBodyDataSortKeyAndDirection setReleaseYearMonthDate(String releaseYearMonthDate) {
            this.releaseYearMonthDate = releaseYearMonthDate;
            return this;
        }
        public String getReleaseYearMonthDate() {
            return this.releaseYearMonthDate;
        }

        public RunSearchLawQueryResponseBodyDataSortKeyAndDirection setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class RunSearchLawQueryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Integer currentPage;

        @NameInMap("lawResult")
        public java.util.List<RunSearchLawQueryResponseBodyDataLawResult> lawResult;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("query")
        public String query;

        @NameInMap("queryKeywords")
        public java.util.List<String> queryKeywords;

        @NameInMap("sortKeyAndDirection")
        public RunSearchLawQueryResponseBodyDataSortKeyAndDirection sortKeyAndDirection;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static RunSearchLawQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunSearchLawQueryResponseBodyData self = new RunSearchLawQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunSearchLawQueryResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public RunSearchLawQueryResponseBodyData setLawResult(java.util.List<RunSearchLawQueryResponseBodyDataLawResult> lawResult) {
            this.lawResult = lawResult;
            return this;
        }
        public java.util.List<RunSearchLawQueryResponseBodyDataLawResult> getLawResult() {
            return this.lawResult;
        }

        public RunSearchLawQueryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public RunSearchLawQueryResponseBodyData setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public RunSearchLawQueryResponseBodyData setQueryKeywords(java.util.List<String> queryKeywords) {
            this.queryKeywords = queryKeywords;
            return this;
        }
        public java.util.List<String> getQueryKeywords() {
            return this.queryKeywords;
        }

        public RunSearchLawQueryResponseBodyData setSortKeyAndDirection(RunSearchLawQueryResponseBodyDataSortKeyAndDirection sortKeyAndDirection) {
            this.sortKeyAndDirection = sortKeyAndDirection;
            return this;
        }
        public RunSearchLawQueryResponseBodyDataSortKeyAndDirection getSortKeyAndDirection() {
            return this.sortKeyAndDirection;
        }

        public RunSearchLawQueryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
