// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetBaselineSummaryResponseBody extends TeaModel {
    /**
     * <p>Interface response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public GetBaselineSummaryResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67D61738-5E38-5164-947A-34E3850D493A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Values: true: success; false: failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBaselineSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineSummaryResponseBody self = new GetBaselineSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBaselineSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBaselineSummaryResponseBody setData(GetBaselineSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBaselineSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetBaselineSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaselineSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBaselineSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaselineSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBaselineSummaryResponseBodyDataTrendDTOList extends TeaModel {
        /**
         * <p>Date point.</p>
         * 
         * <strong>example:</strong>
         * <p>202408或者20240801</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Number of processed items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DealCount")
        public Long dealCount;

        /**
         * <p>Number of discovered items.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("FindCount")
        public Long findCount;

        public static GetBaselineSummaryResponseBodyDataTrendDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineSummaryResponseBodyDataTrendDTOList self = new GetBaselineSummaryResponseBodyDataTrendDTOList();
            return TeaModel.build(map, self);
        }

        public GetBaselineSummaryResponseBodyDataTrendDTOList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetBaselineSummaryResponseBodyDataTrendDTOList setDealCount(Long dealCount) {
            this.dealCount = dealCount;
            return this;
        }
        public Long getDealCount() {
            return this.dealCount;
        }

        public GetBaselineSummaryResponseBodyDataTrendDTOList setFindCount(Long findCount) {
            this.findCount = findCount;
            return this;
        }
        public Long getFindCount() {
            return this.findCount;
        }

    }

    public static class GetBaselineSummaryResponseBodyData extends TeaModel {
        /**
         * <p>Collection of baseline statistical data.</p>
         */
        @NameInMap("TrendDTOList")
        public java.util.List<GetBaselineSummaryResponseBodyDataTrendDTOList> trendDTOList;

        public static GetBaselineSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineSummaryResponseBodyData self = new GetBaselineSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBaselineSummaryResponseBodyData setTrendDTOList(java.util.List<GetBaselineSummaryResponseBodyDataTrendDTOList> trendDTOList) {
            this.trendDTOList = trendDTOList;
            return this;
        }
        public java.util.List<GetBaselineSummaryResponseBodyDataTrendDTOList> getTrendDTOList() {
            return this.trendDTOList;
        }

    }

}
