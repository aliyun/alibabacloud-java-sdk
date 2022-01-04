// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetEtlResourceUsagesResponseBody extends TeaModel {
    @NameInMap("EtlResourceUsages")
    public java.util.List<GetEtlResourceUsagesResponseBodyEtlResourceUsages> etlResourceUsages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public String totalCount;

    public static GetEtlResourceUsagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEtlResourceUsagesResponseBody self = new GetEtlResourceUsagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEtlResourceUsagesResponseBody setEtlResourceUsages(java.util.List<GetEtlResourceUsagesResponseBodyEtlResourceUsages> etlResourceUsages) {
        this.etlResourceUsages = etlResourceUsages;
        return this;
    }
    public java.util.List<GetEtlResourceUsagesResponseBodyEtlResourceUsages> getEtlResourceUsages() {
        return this.etlResourceUsages;
    }

    public GetEtlResourceUsagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEtlResourceUsagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEtlResourceUsagesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class GetEtlResourceUsagesResponseBodyEtlResourceUsages extends TeaModel {
        @NameInMap("CuUsage")
        public Long cuUsage;

        @NameInMap("Month")
        public String month;

        @NameInMap("QueryTime")
        public String queryTime;

        public static GetEtlResourceUsagesResponseBodyEtlResourceUsages build(java.util.Map<String, ?> map) throws Exception {
            GetEtlResourceUsagesResponseBodyEtlResourceUsages self = new GetEtlResourceUsagesResponseBodyEtlResourceUsages();
            return TeaModel.build(map, self);
        }

        public GetEtlResourceUsagesResponseBodyEtlResourceUsages setCuUsage(Long cuUsage) {
            this.cuUsage = cuUsage;
            return this;
        }
        public Long getCuUsage() {
            return this.cuUsage;
        }

        public GetEtlResourceUsagesResponseBodyEtlResourceUsages setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public GetEtlResourceUsagesResponseBodyEtlResourceUsages setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

    }

}
