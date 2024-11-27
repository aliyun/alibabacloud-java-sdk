// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetVulSummaryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>system error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EF801DD1-D934-51B3-92D4-776CE17B184F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetVulSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulSummaryResponseBody self = new GetVulSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVulSummaryResponseBody setData(GetVulSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVulSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetVulSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVulSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVulSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVulSummaryResponseBodyDataTrendList extends TeaModel {
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DealCount")
        public Long dealCount;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FindCount")
        public Long findCount;

        public static GetVulSummaryResponseBodyDataTrendList build(java.util.Map<String, ?> map) throws Exception {
            GetVulSummaryResponseBodyDataTrendList self = new GetVulSummaryResponseBodyDataTrendList();
            return TeaModel.build(map, self);
        }

        public GetVulSummaryResponseBodyDataTrendList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetVulSummaryResponseBodyDataTrendList setDealCount(Long dealCount) {
            this.dealCount = dealCount;
            return this;
        }
        public Long getDealCount() {
            return this.dealCount;
        }

        public GetVulSummaryResponseBodyDataTrendList setFindCount(Long findCount) {
            this.findCount = findCount;
            return this;
        }
        public Long getFindCount() {
            return this.findCount;
        }

    }

    public static class GetVulSummaryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CompletedCount")
        public Long completedCount;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DealRate")
        public String dealRate;

        @NameInMap("TrendList")
        public java.util.List<GetVulSummaryResponseBodyDataTrendList> trendList;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("WaitHandleCount")
        public Long waitHandleCount;

        public static GetVulSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVulSummaryResponseBodyData self = new GetVulSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVulSummaryResponseBodyData setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public GetVulSummaryResponseBodyData setDealRate(String dealRate) {
            this.dealRate = dealRate;
            return this;
        }
        public String getDealRate() {
            return this.dealRate;
        }

        public GetVulSummaryResponseBodyData setTrendList(java.util.List<GetVulSummaryResponseBodyDataTrendList> trendList) {
            this.trendList = trendList;
            return this;
        }
        public java.util.List<GetVulSummaryResponseBodyDataTrendList> getTrendList() {
            return this.trendList;
        }

        public GetVulSummaryResponseBodyData setWaitHandleCount(Long waitHandleCount) {
            this.waitHandleCount = waitHandleCount;
            return this;
        }
        public Long getWaitHandleCount() {
            return this.waitHandleCount;
        }

    }

}
