// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceProvincesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the administrative region in China from which the requests are sent.</p>
     */
    @NameInMap("SourceProvinces")
    public java.util.List<DescribePortViewSourceProvincesResponseBodySourceProvinces> sourceProvinces;

    public static DescribePortViewSourceProvincesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceProvincesResponseBody self = new DescribePortViewSourceProvincesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceProvincesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortViewSourceProvincesResponseBody setSourceProvinces(java.util.List<DescribePortViewSourceProvincesResponseBodySourceProvinces> sourceProvinces) {
        this.sourceProvinces = sourceProvinces;
        return this;
    }
    public java.util.List<DescribePortViewSourceProvincesResponseBodySourceProvinces> getSourceProvinces() {
        return this.sourceProvinces;
    }

    public static class DescribePortViewSourceProvincesResponseBodySourceProvinces extends TeaModel {
        /**
         * <p>The total number of requests that are sent from the ISP.</p>
         * <br>
         * <p>> This parameter does not indicate the accurate number of requests. You can use this parameter to calculate the proportion of requests from different administrative regions in China.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The ID of the administrative region in China from which the requests are sent. For example, **110000** indicates Beijing, and **120000** indicates Tianjin.</p>
         * <br>
         * <p>> For more information, see [Location parameters](https://help.aliyun.com/document_detail/167926.html).</p>
         */
        @NameInMap("ProvinceId")
        public String provinceId;

        public static DescribePortViewSourceProvincesResponseBodySourceProvinces build(java.util.Map<String, ?> map) throws Exception {
            DescribePortViewSourceProvincesResponseBodySourceProvinces self = new DescribePortViewSourceProvincesResponseBodySourceProvinces();
            return TeaModel.build(map, self);
        }

        public DescribePortViewSourceProvincesResponseBodySourceProvinces setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribePortViewSourceProvincesResponseBodySourceProvinces setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

    }

}
