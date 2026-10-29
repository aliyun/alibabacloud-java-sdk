// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsGetRuleCategoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public SdnsGetRuleCategoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SdnsGetRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdnsGetRuleCategoryResponseBody self = new SdnsGetRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public SdnsGetRuleCategoryResponseBody setData(SdnsGetRuleCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SdnsGetRuleCategoryResponseBodyData getData() {
        return this.data;
    }

    public SdnsGetRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SdnsGetRuleCategoryResponseBodyDataRecordLinePaths extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>chinanet</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>isps</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>电信</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Integer level;

        public static SdnsGetRuleCategoryResponseBodyDataRecordLinePaths build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRecordLinePaths self = new SdnsGetRuleCategoryResponseBodyDataRecordLinePaths();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRecordLinePaths setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsGetRuleCategoryResponseBodyDataRecordLinePaths setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SdnsGetRuleCategoryResponseBodyDataRecordLinePaths setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public SdnsGetRuleCategoryResponseBodyDataRecordLinePaths setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRecordLine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>internal</p>
         */
        @NameInMap("LineId")
        public String lineId;

        /**
         * <strong>example:</strong>
         * <p>中国地区</p>
         */
        @NameInMap("LineLabel")
        public String lineLabel;

        @NameInMap("Paths")
        public java.util.List<SdnsGetRuleCategoryResponseBodyDataRecordLinePaths> paths;

        public static SdnsGetRuleCategoryResponseBodyDataRecordLine build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRecordLine self = new SdnsGetRuleCategoryResponseBodyDataRecordLine();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRecordLine setLineId(String lineId) {
            this.lineId = lineId;
            return this;
        }
        public String getLineId() {
            return this.lineId;
        }

        public SdnsGetRuleCategoryResponseBodyDataRecordLine setLineLabel(String lineLabel) {
            this.lineLabel = lineLabel;
            return this;
        }
        public String getLineLabel() {
            return this.lineLabel;
        }

        public SdnsGetRuleCategoryResponseBodyDataRecordLine setPaths(java.util.List<SdnsGetRuleCategoryResponseBodyDataRecordLinePaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<SdnsGetRuleCategoryResponseBodyDataRecordLinePaths> getPaths() {
            return this.paths;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRegionArea extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>huadong</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>华东</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsGetRuleCategoryResponseBodyDataRegionArea build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRegionArea self = new SdnsGetRuleCategoryResponseBodyDataRegionArea();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionArea setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionArea setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRegionCity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;x&quot;</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsGetRuleCategoryResponseBodyDataRegionCity build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRegionCity self = new SdnsGetRuleCategoryResponseBodyDataRegionCity();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionCity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionCity setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRegionContinent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>亚洲</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsGetRuleCategoryResponseBodyDataRegionContinent build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRegionContinent self = new SdnsGetRuleCategoryResponseBodyDataRegionContinent();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionContinent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionContinent setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRegionCountry extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>中国大陆</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsGetRuleCategoryResponseBodyDataRegionCountry build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRegionCountry self = new SdnsGetRuleCategoryResponseBodyDataRegionCountry();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionCountry setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionCountry setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRegionIsp extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>chinanet</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>电信</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsGetRuleCategoryResponseBodyDataRegionIsp build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRegionIsp self = new SdnsGetRuleCategoryResponseBodyDataRegionIsp();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionIsp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionIsp setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRegionProvince extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>zhejiang</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>浙江</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsGetRuleCategoryResponseBodyDataRegionProvince build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRegionProvince self = new SdnsGetRuleCategoryResponseBodyDataRegionProvince();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionProvince setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegionProvince setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRegion extends TeaModel {
        @NameInMap("Area")
        public SdnsGetRuleCategoryResponseBodyDataRegionArea area;

        @NameInMap("City")
        public SdnsGetRuleCategoryResponseBodyDataRegionCity city;

        @NameInMap("Continent")
        public SdnsGetRuleCategoryResponseBodyDataRegionContinent continent;

        @NameInMap("Country")
        public SdnsGetRuleCategoryResponseBodyDataRegionCountry country;

        @NameInMap("Isp")
        public SdnsGetRuleCategoryResponseBodyDataRegionIsp isp;

        @NameInMap("Province")
        public SdnsGetRuleCategoryResponseBodyDataRegionProvince province;

        public static SdnsGetRuleCategoryResponseBodyDataRegion build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRegion self = new SdnsGetRuleCategoryResponseBodyDataRegion();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRegion setArea(SdnsGetRuleCategoryResponseBodyDataRegionArea area) {
            this.area = area;
            return this;
        }
        public SdnsGetRuleCategoryResponseBodyDataRegionArea getArea() {
            return this.area;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegion setCity(SdnsGetRuleCategoryResponseBodyDataRegionCity city) {
            this.city = city;
            return this;
        }
        public SdnsGetRuleCategoryResponseBodyDataRegionCity getCity() {
            return this.city;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegion setContinent(SdnsGetRuleCategoryResponseBodyDataRegionContinent continent) {
            this.continent = continent;
            return this;
        }
        public SdnsGetRuleCategoryResponseBodyDataRegionContinent getContinent() {
            return this.continent;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegion setCountry(SdnsGetRuleCategoryResponseBodyDataRegionCountry country) {
            this.country = country;
            return this;
        }
        public SdnsGetRuleCategoryResponseBodyDataRegionCountry getCountry() {
            return this.country;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegion setIsp(SdnsGetRuleCategoryResponseBodyDataRegionIsp isp) {
            this.isp = isp;
            return this;
        }
        public SdnsGetRuleCategoryResponseBodyDataRegionIsp getIsp() {
            return this.isp;
        }

        public SdnsGetRuleCategoryResponseBodyDataRegion setProvince(SdnsGetRuleCategoryResponseBodyDataRegionProvince province) {
            this.province = province;
            return this;
        }
        public SdnsGetRuleCategoryResponseBodyDataRegionProvince getProvince() {
            return this.province;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRulesRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.0.2.200</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("TypeLabel")
        public String typeLabel;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static SdnsGetRuleCategoryResponseBodyDataRulesRecords build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRulesRecords self = new SdnsGetRuleCategoryResponseBodyDataRulesRecords();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRulesRecords setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SdnsGetRuleCategoryResponseBodyDataRulesRecords setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SdnsGetRuleCategoryResponseBodyDataRulesRecords setTypeLabel(String typeLabel) {
            this.typeLabel = typeLabel;
            return this;
        }
        public String getTypeLabel() {
            return this.typeLabel;
        }

        public SdnsGetRuleCategoryResponseBodyDataRulesRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyDataRules extends TeaModel {
        @NameInMap("ArgKeys")
        public java.util.List<String> argKeys;

        @NameInMap("Args")
        public java.util.Map<String, String> args;

        /**
         * <strong>example:</strong>
         * <p>默认规则</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Records")
        public java.util.List<SdnsGetRuleCategoryResponseBodyDataRulesRecords> records;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResultMode")
        public Integer resultMode;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static SdnsGetRuleCategoryResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyDataRules self = new SdnsGetRuleCategoryResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyDataRules setArgKeys(java.util.List<String> argKeys) {
            this.argKeys = argKeys;
            return this;
        }
        public java.util.List<String> getArgKeys() {
            return this.argKeys;
        }

        public SdnsGetRuleCategoryResponseBodyDataRules setArgs(java.util.Map<String, String> args) {
            this.args = args;
            return this;
        }
        public java.util.Map<String, String> getArgs() {
            return this.args;
        }

        public SdnsGetRuleCategoryResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SdnsGetRuleCategoryResponseBodyDataRules setRecords(java.util.List<SdnsGetRuleCategoryResponseBodyDataRulesRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SdnsGetRuleCategoryResponseBodyDataRulesRecords> getRecords() {
            return this.records;
        }

        public SdnsGetRuleCategoryResponseBodyDataRules setResultMode(Integer resultMode) {
            this.resultMode = resultMode;
            return this;
        }
        public Integer getResultMode() {
            return this.resultMode;
        }

        public SdnsGetRuleCategoryResponseBodyDataRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

    public static class SdnsGetRuleCategoryResponseBodyData extends TeaModel {
        @NameInMap("ClientIpRanges")
        public java.util.List<String> clientIpRanges;

        /**
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>123456789012345678</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>IP_RANGE</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("RecordLine")
        public SdnsGetRuleCategoryResponseBodyDataRecordLine recordLine;

        @NameInMap("Region")
        public SdnsGetRuleCategoryResponseBodyDataRegion region;

        @NameInMap("Rules")
        public java.util.List<SdnsGetRuleCategoryResponseBodyDataRules> rules;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static SdnsGetRuleCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SdnsGetRuleCategoryResponseBodyData self = new SdnsGetRuleCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SdnsGetRuleCategoryResponseBodyData setClientIpRanges(java.util.List<String> clientIpRanges) {
            this.clientIpRanges = clientIpRanges;
            return this;
        }
        public java.util.List<String> getClientIpRanges() {
            return this.clientIpRanges;
        }

        public SdnsGetRuleCategoryResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SdnsGetRuleCategoryResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsGetRuleCategoryResponseBodyData setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public SdnsGetRuleCategoryResponseBodyData setRecordLine(SdnsGetRuleCategoryResponseBodyDataRecordLine recordLine) {
            this.recordLine = recordLine;
            return this;
        }
        public SdnsGetRuleCategoryResponseBodyDataRecordLine getRecordLine() {
            return this.recordLine;
        }

        public SdnsGetRuleCategoryResponseBodyData setRegion(SdnsGetRuleCategoryResponseBodyDataRegion region) {
            this.region = region;
            return this;
        }
        public SdnsGetRuleCategoryResponseBodyDataRegion getRegion() {
            return this.region;
        }

        public SdnsGetRuleCategoryResponseBodyData setRules(java.util.List<SdnsGetRuleCategoryResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<SdnsGetRuleCategoryResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public SdnsGetRuleCategoryResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
