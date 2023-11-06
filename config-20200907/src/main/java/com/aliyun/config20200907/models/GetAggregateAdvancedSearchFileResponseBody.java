// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateAdvancedSearchFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource file.</p>
     */
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
        /**
         * <p>The download URL of the resource file.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The time when the resource file was generated. The value is a timestamp.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("ResourceInventoryGenerateTime")
        public Long resourceInventoryGenerateTime;

        /**
         * <p>The generation status of the resource file. Valid values:</p>
         * <br>
         * <p>*   CREATING: The resource file is being generated.</p>
         * <p>*   COMPLETE: The resource file is generated.</p>
         */
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
