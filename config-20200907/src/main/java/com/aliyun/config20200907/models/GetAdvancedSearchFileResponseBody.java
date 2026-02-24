// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAdvancedSearchFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceSearch")
    public GetAdvancedSearchFileResponseBodyResourceSearch resourceSearch;

    public static GetAdvancedSearchFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedSearchFileResponseBody self = new GetAdvancedSearchFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdvancedSearchFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdvancedSearchFileResponseBody setResourceSearch(GetAdvancedSearchFileResponseBodyResourceSearch resourceSearch) {
        this.resourceSearch = resourceSearch;
        return this;
    }
    public GetAdvancedSearchFileResponseBodyResourceSearch getResourceSearch() {
        return this.resourceSearch;
    }

    public static class GetAdvancedSearchFileResponseBodyResourceSearch extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ResourceInventoryGenerateTime")
        public Long resourceInventoryGenerateTime;

        @NameInMap("Status")
        public String status;

        public static GetAdvancedSearchFileResponseBodyResourceSearch build(java.util.Map<String, ?> map) throws Exception {
            GetAdvancedSearchFileResponseBodyResourceSearch self = new GetAdvancedSearchFileResponseBodyResourceSearch();
            return TeaModel.build(map, self);
        }

        public GetAdvancedSearchFileResponseBodyResourceSearch setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetAdvancedSearchFileResponseBodyResourceSearch setResourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
            this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
            return this;
        }
        public Long getResourceInventoryGenerateTime() {
            return this.resourceInventoryGenerateTime;
        }

        public GetAdvancedSearchFileResponseBodyResourceSearch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
