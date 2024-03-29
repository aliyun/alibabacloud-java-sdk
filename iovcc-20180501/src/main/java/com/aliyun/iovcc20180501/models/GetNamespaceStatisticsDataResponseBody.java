// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetNamespaceStatisticsDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public GetNamespaceStatisticsDataResponseBodyStatistics statistics;

    public static GetNamespaceStatisticsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceStatisticsDataResponseBody self = new GetNamespaceStatisticsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNamespaceStatisticsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNamespaceStatisticsDataResponseBody setStatistics(GetNamespaceStatisticsDataResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public GetNamespaceStatisticsDataResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public static class GetNamespaceStatisticsDataResponseBodyStatisticsSeries extends TeaModel {
        @NameInMap("Data")
        public java.util.List<Long> data;

        @NameInMap("Name")
        public String name;

        public static GetNamespaceStatisticsDataResponseBodyStatisticsSeries build(java.util.Map<String, ?> map) throws Exception {
            GetNamespaceStatisticsDataResponseBodyStatisticsSeries self = new GetNamespaceStatisticsDataResponseBodyStatisticsSeries();
            return TeaModel.build(map, self);
        }

        public GetNamespaceStatisticsDataResponseBodyStatisticsSeries setData(java.util.List<Long> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Long> getData() {
            return this.data;
        }

        public GetNamespaceStatisticsDataResponseBodyStatisticsSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetNamespaceStatisticsDataResponseBodyStatistics extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<Long> categories;

        @NameInMap("Series")
        public java.util.List<GetNamespaceStatisticsDataResponseBodyStatisticsSeries> series;

        public static GetNamespaceStatisticsDataResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetNamespaceStatisticsDataResponseBodyStatistics self = new GetNamespaceStatisticsDataResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public GetNamespaceStatisticsDataResponseBodyStatistics setCategories(java.util.List<Long> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<Long> getCategories() {
            return this.categories;
        }

        public GetNamespaceStatisticsDataResponseBodyStatistics setSeries(java.util.List<GetNamespaceStatisticsDataResponseBodyStatisticsSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<GetNamespaceStatisticsDataResponseBodyStatisticsSeries> getSeries() {
            return this.series;
        }

    }

}
