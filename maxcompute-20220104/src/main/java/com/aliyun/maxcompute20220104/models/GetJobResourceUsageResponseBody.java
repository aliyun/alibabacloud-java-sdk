// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetJobResourceUsageResponseBody extends TeaModel {
    @NameInMap("data")
    public GetJobResourceUsageResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

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
        @NameInMap("cuUsage")
        public Long cuUsage;

        @NameInMap("date")
        public String date;

        @NameInMap("jobOwner")
        public String jobOwner;

        @NameInMap("memoryUsage")
        public Long memoryUsage;

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
        @NameInMap("jobResourceUsageList")
        public java.util.List<GetJobResourceUsageResponseBodyDataJobResourceUsageList> jobResourceUsageList;

        @NameInMap("pageNumber")
        public Long pageNumber;

        @NameInMap("pageSize")
        public Long pageSize;

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
