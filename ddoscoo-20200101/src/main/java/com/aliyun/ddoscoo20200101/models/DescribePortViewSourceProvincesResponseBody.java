// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceProvincesResponseBody extends TeaModel {
    @NameInMap("SourceProvinces")
    public java.util.List<DescribePortViewSourceProvincesResponseBodySourceProvinces> sourceProvinces;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortViewSourceProvincesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceProvincesResponseBody self = new DescribePortViewSourceProvincesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceProvincesResponseBody setSourceProvinces(java.util.List<DescribePortViewSourceProvincesResponseBodySourceProvinces> sourceProvinces) {
        this.sourceProvinces = sourceProvinces;
        return this;
    }
    public java.util.List<DescribePortViewSourceProvincesResponseBodySourceProvinces> getSourceProvinces() {
        return this.sourceProvinces;
    }

    public DescribePortViewSourceProvincesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePortViewSourceProvincesResponseBodySourceProvinces extends TeaModel {
        @NameInMap("ProvinceId")
        public String provinceId;

        @NameInMap("Count")
        public Long count;

        public static DescribePortViewSourceProvincesResponseBodySourceProvinces build(java.util.Map<String, ?> map) throws Exception {
            DescribePortViewSourceProvincesResponseBodySourceProvinces self = new DescribePortViewSourceProvincesResponseBodySourceProvinces();
            return TeaModel.build(map, self);
        }

        public DescribePortViewSourceProvincesResponseBodySourceProvinces setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

        public DescribePortViewSourceProvincesResponseBodySourceProvinces setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
