// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGeoInfoResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<DescribeDcdnWafGeoInfoResponseBodyContent> content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnWafGeoInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGeoInfoResponseBody self = new DescribeDcdnWafGeoInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGeoInfoResponseBody setContent(java.util.List<DescribeDcdnWafGeoInfoResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeDcdnWafGeoInfoResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeDcdnWafGeoInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions self = new DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnWafGeoInfoResponseBodyContentContinents extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Regions")
        public java.util.List<DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions> regions;

        public static DescribeDcdnWafGeoInfoResponseBodyContentContinents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafGeoInfoResponseBodyContentContinents self = new DescribeDcdnWafGeoInfoResponseBodyContentContinents();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafGeoInfoResponseBodyContentContinents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDcdnWafGeoInfoResponseBodyContentContinents setRegions(java.util.List<DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<DescribeDcdnWafGeoInfoResponseBodyContentContinentsRegions> getRegions() {
            return this.regions;
        }

    }

    public static class DescribeDcdnWafGeoInfoResponseBodyContent extends TeaModel {
        @NameInMap("Continents")
        public java.util.List<DescribeDcdnWafGeoInfoResponseBodyContentContinents> continents;

        @NameInMap("Type")
        public String type;

        public static DescribeDcdnWafGeoInfoResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafGeoInfoResponseBodyContent self = new DescribeDcdnWafGeoInfoResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafGeoInfoResponseBodyContent setContinents(java.util.List<DescribeDcdnWafGeoInfoResponseBodyContentContinents> continents) {
            this.continents = continents;
            return this;
        }
        public java.util.List<DescribeDcdnWafGeoInfoResponseBodyContentContinents> getContinents() {
            return this.continents;
        }

        public DescribeDcdnWafGeoInfoResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
