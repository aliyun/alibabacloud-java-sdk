// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class GetReportResponseBody extends TeaModel {
    /**
     * <p>Data Details.</p>
     */
    @NameInMap("Datas")
    public java.util.List<GetReportResponseBodyDatas> datas;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportResponseBody self = new GetReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportResponseBody setDatas(java.util.List<GetReportResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GetReportResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public GetReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetReportResponseBodyDatasData extends TeaModel {
        /**
         * <p>Data Points.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;1726416000&quot;: 0.44,
         *   &quot;1726502400&quot;: 0.44,
         *   &quot;1726588800&quot;: 0.44,
         *   &quot;1726675200&quot;: 0.44,
         *   &quot;1726761600&quot;: 0.43,
         *   &quot;1726848000&quot;: 0.43,
         *   &quot;1726934400&quot;: 0.43,
         *   &quot;1727020800&quot;: 0.43
         * }</p>
         */
        @NameInMap("DataPoints")
        public java.util.Map<String, ?> dataPoints;

        /**
         * <p>Data Labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;category&quot;: &quot;cloud&quot;
         * }</p>
         */
        @NameInMap("Labels")
        public java.util.Map<String, ?> labels;

        public static GetReportResponseBodyDatasData build(java.util.Map<String, ?> map) throws Exception {
            GetReportResponseBodyDatasData self = new GetReportResponseBodyDatasData();
            return TeaModel.build(map, self);
        }

        public GetReportResponseBodyDatasData setDataPoints(java.util.Map<String, ?> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.Map<String, ?> getDataPoints() {
            return this.dataPoints;
        }

        public GetReportResponseBodyDatasData setLabels(java.util.Map<String, ?> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, ?> getLabels() {
            return this.labels;
        }

    }

    public static class GetReportResponseBodyDatas extends TeaModel {
        /**
         * <p>Data.</p>
         */
        @NameInMap("Data")
        public java.util.List<GetReportResponseBodyDatasData> data;

        /**
         * <p>Data Title.</p>
         * 
         * <strong>example:</strong>
         * <p>disk_count_percent_by_category</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetReportResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetReportResponseBodyDatas self = new GetReportResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetReportResponseBodyDatas setData(java.util.List<GetReportResponseBodyDatasData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetReportResponseBodyDatasData> getData() {
            return this.data;
        }

        public GetReportResponseBodyDatas setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
