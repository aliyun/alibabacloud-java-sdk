// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetStandardStatisticsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetStandardStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardStatisticsResponseBody self = new GetStandardStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStandardStatisticsResponseBody setData(GetStandardStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStandardStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetStandardStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStandardStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStandardStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStandardStatisticsResponseBodyDataStandardTypeCountList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StandardType")
        public String standardType;

        public static GetStandardStatisticsResponseBodyDataStandardTypeCountList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardStatisticsResponseBodyDataStandardTypeCountList self = new GetStandardStatisticsResponseBodyDataStandardTypeCountList();
            return TeaModel.build(map, self);
        }

        public GetStandardStatisticsResponseBodyDataStandardTypeCountList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetStandardStatisticsResponseBodyDataStandardTypeCountList setStandardType(String standardType) {
            this.standardType = standardType;
            return this;
        }
        public String getStandardType() {
            return this.standardType;
        }

    }

    public static class GetStandardStatisticsResponseBodyData extends TeaModel {
        @NameInMap("StandardTypeCountList")
        public java.util.List<GetStandardStatisticsResponseBodyDataStandardTypeCountList> standardTypeCountList;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetStandardStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStandardStatisticsResponseBodyData self = new GetStandardStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStandardStatisticsResponseBodyData setStandardTypeCountList(java.util.List<GetStandardStatisticsResponseBodyDataStandardTypeCountList> standardTypeCountList) {
            this.standardTypeCountList = standardTypeCountList;
            return this;
        }
        public java.util.List<GetStandardStatisticsResponseBodyDataStandardTypeCountList> getStandardTypeCountList() {
            return this.standardTypeCountList;
        }

        public GetStandardStatisticsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
