// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobMetricsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDIJobMetricsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDIJobMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobMetricsResponseBody self = new ListDIJobMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDIJobMetricsResponseBody setPagingInfo(ListDIJobMetricsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDIJobMetricsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDIJobMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList extends TeaModel {
        /**
         * <p>The point in time at which data is sampled based on the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1716881141</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Value")
        public Double value;

        public static ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList self = new ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList();
            return TeaModel.build(map, self);
        }

        public ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class ListDIJobMetricsResponseBodyPagingInfoJobMetrics extends TeaModel {
        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>JobDelay</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The metric data.</p>
         */
        @NameInMap("SeriesList")
        public java.util.List<ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList> seriesList;

        public static ListDIJobMetricsResponseBodyPagingInfoJobMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobMetricsResponseBodyPagingInfoJobMetrics self = new ListDIJobMetricsResponseBodyPagingInfoJobMetrics();
            return TeaModel.build(map, self);
        }

        public ListDIJobMetricsResponseBodyPagingInfoJobMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDIJobMetricsResponseBodyPagingInfoJobMetrics setSeriesList(java.util.List<ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList> seriesList) {
            this.seriesList = seriesList;
            return this;
        }
        public java.util.List<ListDIJobMetricsResponseBodyPagingInfoJobMetricsSeriesList> getSeriesList() {
            return this.seriesList;
        }

    }

    public static class ListDIJobMetricsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The metrics returned.</p>
         */
        @NameInMap("JobMetrics")
        public java.util.List<ListDIJobMetricsResponseBodyPagingInfoJobMetrics> jobMetrics;

        public static ListDIJobMetricsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDIJobMetricsResponseBodyPagingInfo self = new ListDIJobMetricsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDIJobMetricsResponseBodyPagingInfo setJobMetrics(java.util.List<ListDIJobMetricsResponseBodyPagingInfoJobMetrics> jobMetrics) {
            this.jobMetrics = jobMetrics;
            return this;
        }
        public java.util.List<ListDIJobMetricsResponseBodyPagingInfoJobMetrics> getJobMetrics() {
            return this.jobMetrics;
        }

    }

}
