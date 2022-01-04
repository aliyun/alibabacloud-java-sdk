// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetaDataApiCallUsagesResponseBody extends TeaModel {
    @NameInMap("MetaDataApiCallUsages")
    public java.util.List<GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages> metaDataApiCallUsages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetMetaDataApiCallUsagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDataApiCallUsagesResponseBody self = new GetMetaDataApiCallUsagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaDataApiCallUsagesResponseBody setMetaDataApiCallUsages(java.util.List<GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages> metaDataApiCallUsages) {
        this.metaDataApiCallUsages = metaDataApiCallUsages;
        return this;
    }
    public java.util.List<GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages> getMetaDataApiCallUsages() {
        return this.metaDataApiCallUsages;
    }

    public GetMetaDataApiCallUsagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaDataApiCallUsagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaDataApiCallUsagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages extends TeaModel {
        @NameInMap("ApiCall")
        public Long apiCall;

        @NameInMap("Month")
        public String month;

        @NameInMap("QueryTime")
        public String queryTime;

        public static GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages self = new GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages();
            return TeaModel.build(map, self);
        }

        public GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages setApiCall(Long apiCall) {
            this.apiCall = apiCall;
            return this;
        }
        public Long getApiCall() {
            return this.apiCall;
        }

        public GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public GetMetaDataApiCallUsagesResponseBodyMetaDataApiCallUsages setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

    }

}
