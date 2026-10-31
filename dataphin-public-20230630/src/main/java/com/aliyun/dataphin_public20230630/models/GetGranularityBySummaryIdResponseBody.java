// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetGranularityBySummaryIdResponseBody extends TeaModel {
    /**
     * <p>The error code. OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public GetGranularityBySummaryIdResponseBodyData data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetGranularityBySummaryIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGranularityBySummaryIdResponseBody self = new GetGranularityBySummaryIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGranularityBySummaryIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGranularityBySummaryIdResponseBody setData(GetGranularityBySummaryIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGranularityBySummaryIdResponseBodyData getData() {
        return this.data;
    }

    public GetGranularityBySummaryIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGranularityBySummaryIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGranularityBySummaryIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGranularityBySummaryIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGranularityBySummaryIdResponseBodyData extends TeaModel {
        /**
         * <p>DimIds</p>
         */
        @NameInMap("DimIds")
        public java.util.List<Long> dimIds;

        /**
         * <p>GranularityId</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("GranularityId")
        public Long granularityId;

        /**
         * <p>SummaryId</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SummaryId")
        public Long summaryId;

        public static GetGranularityBySummaryIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGranularityBySummaryIdResponseBodyData self = new GetGranularityBySummaryIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGranularityBySummaryIdResponseBodyData setDimIds(java.util.List<Long> dimIds) {
            this.dimIds = dimIds;
            return this;
        }
        public java.util.List<Long> getDimIds() {
            return this.dimIds;
        }

        public GetGranularityBySummaryIdResponseBodyData setGranularityId(Long granularityId) {
            this.granularityId = granularityId;
            return this;
        }
        public Long getGranularityId() {
            return this.granularityId;
        }

        public GetGranularityBySummaryIdResponseBodyData setSummaryId(Long summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public Long getSummaryId() {
            return this.summaryId;
        }

    }

}
