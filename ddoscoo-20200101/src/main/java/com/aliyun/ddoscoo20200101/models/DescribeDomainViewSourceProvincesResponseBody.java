// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewSourceProvincesResponseBody extends TeaModel {
    @NameInMap("SourceProvinces")
    public java.util.List<DescribeDomainViewSourceProvincesResponseBodySourceProvinces> sourceProvinces;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainViewSourceProvincesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewSourceProvincesResponseBody self = new DescribeDomainViewSourceProvincesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewSourceProvincesResponseBody setSourceProvinces(java.util.List<DescribeDomainViewSourceProvincesResponseBodySourceProvinces> sourceProvinces) {
        this.sourceProvinces = sourceProvinces;
        return this;
    }
    public java.util.List<DescribeDomainViewSourceProvincesResponseBodySourceProvinces> getSourceProvinces() {
        return this.sourceProvinces;
    }

    public DescribeDomainViewSourceProvincesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainViewSourceProvincesResponseBodySourceProvinces extends TeaModel {
        @NameInMap("ProvinceId")
        public String provinceId;

        @NameInMap("Count")
        public Long count;

        public static DescribeDomainViewSourceProvincesResponseBodySourceProvinces build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainViewSourceProvincesResponseBodySourceProvinces self = new DescribeDomainViewSourceProvincesResponseBodySourceProvinces();
            return TeaModel.build(map, self);
        }

        public DescribeDomainViewSourceProvincesResponseBodySourceProvinces setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

        public DescribeDomainViewSourceProvincesResponseBodySourceProvinces setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
