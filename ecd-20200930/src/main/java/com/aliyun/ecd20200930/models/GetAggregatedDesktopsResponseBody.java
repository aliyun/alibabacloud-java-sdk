// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetAggregatedDesktopsResponseBody extends TeaModel {
    /**
     * <p>The list of aggregation field information.</p>
     * <blockquote>
     * <p>Notice: When you use an aggregate query, only aggregation results are returned. The list of matched metadata is not returned.</p>
     * </blockquote>
     */
    @NameInMap("Aggregations")
    public GetAggregatedDesktopsResponseBodyAggregations aggregations;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3147E094-C1F7-5001-8F04-C8CEE75D6552</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregatedDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatedDesktopsResponseBody self = new GetAggregatedDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregatedDesktopsResponseBody setAggregations(GetAggregatedDesktopsResponseBodyAggregations aggregations) {
        this.aggregations = aggregations;
        return this;
    }
    public GetAggregatedDesktopsResponseBodyAggregations getAggregations() {
        return this.aggregations;
    }

    public GetAggregatedDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregatedDesktopsResponseBodyAggregations extends TeaModel {
        /**
         * <p>The aggregation results.</p>
         */
        @NameInMap("DesktopAggregation")
        public java.util.List<java.util.Map<String, String>> desktopAggregation;

        public static GetAggregatedDesktopsResponseBodyAggregations build(java.util.Map<String, ?> map) throws Exception {
            GetAggregatedDesktopsResponseBodyAggregations self = new GetAggregatedDesktopsResponseBodyAggregations();
            return TeaModel.build(map, self);
        }

        public GetAggregatedDesktopsResponseBodyAggregations setDesktopAggregation(java.util.List<java.util.Map<String, String>> desktopAggregation) {
            this.desktopAggregation = desktopAggregation;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getDesktopAggregation() {
            return this.desktopAggregation;
        }

    }

}
