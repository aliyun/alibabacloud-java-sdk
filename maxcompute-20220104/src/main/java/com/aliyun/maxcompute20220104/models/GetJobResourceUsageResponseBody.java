// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetJobResourceUsageResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetJobResourceUsageResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>0A3B1E82006A23A918C70905BF08AEC7</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0b57ff7616612271051086500ea3ce</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetJobResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResourceUsageResponseBody self = new GetJobResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResourceUsageResponseBody setData(GetJobResourceUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobResourceUsageResponseBodyData getData() {
        return this.data;
    }

    public GetJobResourceUsageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetJobResourceUsageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetJobResourceUsageResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetJobResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobResourceUsageResponseBodyDataJobResourceUsageList extends TeaModel {
        /**
         * <p>The total number of used compute units (CUs).</p>
         * 
         * <strong>example:</strong>
         * <p>1185100</p>
         */
        @NameInMap("cuUsage")
        public Long cuUsage;

        /**
         * <p>The start date of the query in the format of yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-09</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The job executor.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$<a href="mailto:xxx@test.aliyunid.com">xxx@test.aliyunid.com</a></p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The total memory usage.</p>
         * 
         * <strong>example:</strong>
         * <p>15169536</p>
         */
        @NameInMap("memoryUsage")
        public Long memoryUsage;

        /**
         * <p>The quota nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>my_quota</p>
         */
        @NameInMap("quotaNickname")
        public String quotaNickname;

        public static GetJobResourceUsageResponseBodyDataJobResourceUsageList build(java.util.Map<String, ?> map) throws Exception {
            GetJobResourceUsageResponseBodyDataJobResourceUsageList self = new GetJobResourceUsageResponseBodyDataJobResourceUsageList();
            return TeaModel.build(map, self);
        }

        public GetJobResourceUsageResponseBodyDataJobResourceUsageList setCuUsage(Long cuUsage) {
            this.cuUsage = cuUsage;
            return this;
        }
        public Long getCuUsage() {
            return this.cuUsage;
        }

        public GetJobResourceUsageResponseBodyDataJobResourceUsageList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetJobResourceUsageResponseBodyDataJobResourceUsageList setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public GetJobResourceUsageResponseBodyDataJobResourceUsageList setMemoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        public GetJobResourceUsageResponseBodyDataJobResourceUsageList setQuotaNickname(String quotaNickname) {
            this.quotaNickname = quotaNickname;
            return this;
        }
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

    }

    public static class GetJobResourceUsageResponseBodyData extends TeaModel {
        /**
         * <p>The data list returned.</p>
         */
        @NameInMap("jobResourceUsageList")
        public java.util.List<GetJobResourceUsageResponseBodyDataJobResourceUsageList> jobResourceUsageList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static GetJobResourceUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobResourceUsageResponseBodyData self = new GetJobResourceUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobResourceUsageResponseBodyData setJobResourceUsageList(java.util.List<GetJobResourceUsageResponseBodyDataJobResourceUsageList> jobResourceUsageList) {
            this.jobResourceUsageList = jobResourceUsageList;
            return this;
        }
        public java.util.List<GetJobResourceUsageResponseBodyDataJobResourceUsageList> getJobResourceUsageList() {
            return this.jobResourceUsageList;
        }

        public GetJobResourceUsageResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetJobResourceUsageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetJobResourceUsageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
