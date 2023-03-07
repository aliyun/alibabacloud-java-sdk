// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricProfilingResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of profiling results.</p>
     */
    @NameInMap("SvgUrls")
    public GetCloudMetricProfilingResponseBodySvgUrls svgUrls;

    public static GetCloudMetricProfilingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudMetricProfilingResponseBody self = new GetCloudMetricProfilingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudMetricProfilingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCloudMetricProfilingResponseBody setSvgUrls(GetCloudMetricProfilingResponseBodySvgUrls svgUrls) {
        this.svgUrls = svgUrls;
        return this;
    }
    public GetCloudMetricProfilingResponseBodySvgUrls getSvgUrls() {
        return this.svgUrls;
    }

    public static class GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo extends TeaModel {
        /**
         * <p>The name of the SVG file that contains the profiling results.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the SVG file. Unit: bytes.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The type of the SVG file.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the Object Storage Service (OSS) bucket where the scalable vector graphics (SVG) file is stored.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo self = new GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo();
            return TeaModel.build(map, self);
        }

        public GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetCloudMetricProfilingResponseBodySvgUrls extends TeaModel {
        @NameInMap("SvgInfo")
        public java.util.List<GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo> svgInfo;

        public static GetCloudMetricProfilingResponseBodySvgUrls build(java.util.Map<String, ?> map) throws Exception {
            GetCloudMetricProfilingResponseBodySvgUrls self = new GetCloudMetricProfilingResponseBodySvgUrls();
            return TeaModel.build(map, self);
        }

        public GetCloudMetricProfilingResponseBodySvgUrls setSvgInfo(java.util.List<GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo> svgInfo) {
            this.svgInfo = svgInfo;
            return this;
        }
        public java.util.List<GetCloudMetricProfilingResponseBodySvgUrlsSvgInfo> getSvgInfo() {
            return this.svgInfo;
        }

    }

}
