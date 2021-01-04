// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcZoneBlockConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("BlockConfig")
    public DescribeCcZoneBlockConfigResponseBodyBlockConfig blockConfig;

    public static DescribeCcZoneBlockConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcZoneBlockConfigResponseBody self = new DescribeCcZoneBlockConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcZoneBlockConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcZoneBlockConfigResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeCcZoneBlockConfigResponseBody setBlockConfig(DescribeCcZoneBlockConfigResponseBodyBlockConfig blockConfig) {
        this.blockConfig = blockConfig;
        return this;
    }
    public DescribeCcZoneBlockConfigResponseBodyBlockConfig getBlockConfig() {
        return this.blockConfig;
    }

    public static class DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones extends TeaModel {
        @NameInMap("Provinces")
        public java.util.List<String> provinces;

        @NameInMap("Country")
        public String country;

        public static DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones self = new DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones();
            return TeaModel.build(map, self);
        }

        public DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones setProvinces(java.util.List<String> provinces) {
            this.provinces = provinces;
            return this;
        }
        public java.util.List<String> getProvinces() {
            return this.provinces;
        }

        public DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

    }

    public static class DescribeCcZoneBlockConfigResponseBodyBlockConfig extends TeaModel {
        @NameInMap("CcZones")
        public java.util.List<DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones> ccZones;

        @NameInMap("Enable")
        public Integer enable;

        public static DescribeCcZoneBlockConfigResponseBodyBlockConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcZoneBlockConfigResponseBodyBlockConfig self = new DescribeCcZoneBlockConfigResponseBodyBlockConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCcZoneBlockConfigResponseBodyBlockConfig setCcZones(java.util.List<DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones> ccZones) {
            this.ccZones = ccZones;
            return this;
        }
        public java.util.List<DescribeCcZoneBlockConfigResponseBodyBlockConfigCcZones> getCcZones() {
            return this.ccZones;
        }

        public DescribeCcZoneBlockConfigResponseBodyBlockConfig setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

    }

}
