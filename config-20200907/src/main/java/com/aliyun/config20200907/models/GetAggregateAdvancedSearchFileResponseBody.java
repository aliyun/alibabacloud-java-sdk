// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateAdvancedSearchFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceSearch")
    public GetAggregateAdvancedSearchFileResponseBodyResourceSearch resourceSearch;

    public static GetAggregateAdvancedSearchFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateAdvancedSearchFileResponseBody self = new GetAggregateAdvancedSearchFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateAdvancedSearchFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAggregateAdvancedSearchFileResponseBody setResourceSearch(GetAggregateAdvancedSearchFileResponseBodyResourceSearch resourceSearch) {
        this.resourceSearch = resourceSearch;
        return this;
    }
    public GetAggregateAdvancedSearchFileResponseBodyResourceSearch getResourceSearch() {
        return this.resourceSearch;
    }

    public static class GetAggregateAdvancedSearchFileResponseBodyResourceSearch extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ResourceInventoryGenerateTime")
        public Long resourceInventoryGenerateTime;

        @NameInMap("Status")
        public String status;

        public static GetAggregateAdvancedSearchFileResponseBodyResourceSearch build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateAdvancedSearchFileResponseBodyResourceSearch self = new GetAggregateAdvancedSearchFileResponseBodyResourceSearch();
            return TeaModel.build(map, self);
        }

        public GetAggregateAdvancedSearchFileResponseBodyResourceSearch setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetAggregateAdvancedSearchFileResponseBodyResourceSearch setResourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
            this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
            return this;
        }
        public Long getResourceInventoryGenerateTime() {
            return this.resourceInventoryGenerateTime;
        }

        public GetAggregateAdvancedSearchFileResponseBodyResourceSearch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
