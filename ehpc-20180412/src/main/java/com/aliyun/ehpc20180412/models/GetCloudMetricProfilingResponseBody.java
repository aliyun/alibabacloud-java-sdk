// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricProfilingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SvgUrls")
    public java.util.List<GetCloudMetricProfilingResponseBodySvgUrls> svgUrls;

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

    public GetCloudMetricProfilingResponseBody setSvgUrls(java.util.List<GetCloudMetricProfilingResponseBodySvgUrls> svgUrls) {
        this.svgUrls = svgUrls;
        return this;
    }
    public java.util.List<GetCloudMetricProfilingResponseBodySvgUrls> getSvgUrls() {
        return this.svgUrls;
    }

    public static class GetCloudMetricProfilingResponseBodySvgUrls extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Url")
        public String url;

        @NameInMap("Name")
        public String name;

        public static GetCloudMetricProfilingResponseBodySvgUrls build(java.util.Map<String, ?> map) throws Exception {
            GetCloudMetricProfilingResponseBodySvgUrls self = new GetCloudMetricProfilingResponseBodySvgUrls();
            return TeaModel.build(map, self);
        }

        public GetCloudMetricProfilingResponseBodySvgUrls setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCloudMetricProfilingResponseBodySvgUrls setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetCloudMetricProfilingResponseBodySvgUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetCloudMetricProfilingResponseBodySvgUrls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
