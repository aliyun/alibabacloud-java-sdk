// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceProvincesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public Long count;

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
