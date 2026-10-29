// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsListRuleCategoriesResponseBody extends TeaModel {
    /**
     * <p>The list of all custom resolution policies for the domain name, including LINE and IP_RANGE policies, as well as enabled and disabled policies. The order of the list is not guaranteed.</p>
     */
    @NameInMap("List")
    public java.util.List<SdnsListRuleCategoriesResponseBodyList> list;

    /**
     * <p>The ID of the request, which is used to troubleshoot call issues and is not the policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SdnsListRuleCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdnsListRuleCategoriesResponseBody self = new SdnsListRuleCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public SdnsListRuleCategoriesResponseBody setList(java.util.List<SdnsListRuleCategoriesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<SdnsListRuleCategoriesResponseBodyList> getList() {
        return this.list;
    }

    public SdnsListRuleCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SdnsListRuleCategoriesResponseBodyListRecordLinePaths extends TeaModel {
        /**
         * <p>The code of the option at this level. For example, chinanet at the isps level indicates China Telecom. Use valid options for the associated line and maintain consistent hierarchical relationships.</p>
         * 
         * <strong>example:</strong>
         * <p>chinanet</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The level identifier. For the Chinese mainland, valid values are isps, subRegions, and provinces. For regions outside the Chinese mainland, valid values are continents and geoRegions. This corresponds to the Level field.</p>
         * 
         * <strong>example:</strong>
         * <p>isps</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The display name of the line option. The display name of the default option can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>China Telecom</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The sequence number of the line level. For the Chinese mainland, the values are 1 (ISP), 2 (region), and 3 (province). For regions outside the Chinese mainland, the values are 1 (continent) and 2 (geographical region).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Integer level;

        public static SdnsListRuleCategoriesResponseBodyListRecordLinePaths build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRecordLinePaths self = new SdnsListRuleCategoriesResponseBodyListRecordLinePaths();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRecordLinePaths setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsListRuleCategoriesResponseBodyListRecordLinePaths setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SdnsListRuleCategoriesResponseBodyListRecordLinePaths setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public SdnsListRuleCategoriesResponseBodyListRecordLinePaths setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRecordLine extends TeaModel {
        /**
         * <p>The line identifier. Valid values: internal: the Chinese mainland. overseas: outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>internal</p>
         */
        @NameInMap("LineId")
        public String lineId;

        /**
         * <p>The display name of the line.</p>
         * 
         * <strong>example:</strong>
         * <p>The Chinese mainland</p>
         */
        @NameInMap("LineLabel")
        public String lineLabel;

        /**
         * <p>The line selection path, which describes the line conditions at each level. This field applies only to LINE policies. IP_RANGE policies do not use line paths.</p>
         */
        @NameInMap("Paths")
        public java.util.List<SdnsListRuleCategoriesResponseBodyListRecordLinePaths> paths;

        public static SdnsListRuleCategoriesResponseBodyListRecordLine build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRecordLine self = new SdnsListRuleCategoriesResponseBodyListRecordLine();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRecordLine setLineId(String lineId) {
            this.lineId = lineId;
            return this;
        }
        public String getLineId() {
            return this.lineId;
        }

        public SdnsListRuleCategoriesResponseBodyListRecordLine setLineLabel(String lineLabel) {
            this.lineLabel = lineLabel;
            return this;
        }
        public String getLineLabel() {
            return this.lineLabel;
        }

        public SdnsListRuleCategoriesResponseBodyListRecordLine setPaths(java.util.List<SdnsListRuleCategoriesResponseBodyListRecordLinePaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<SdnsListRuleCategoriesResponseBodyListRecordLinePaths> getPaths() {
            return this.paths;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRegionArea extends TeaModel {
        /**
         * <p>The code of the region. The value x indicates the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>huadong</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display name of the region. An empty string can be returned for the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>East China</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsListRuleCategoriesResponseBodyListRegionArea build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRegionArea self = new SdnsListRuleCategoriesResponseBodyListRegionArea();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRegionArea setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsListRuleCategoriesResponseBodyListRegionArea setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRegionCity extends TeaModel {
        /**
         * <p>The code of the city. This is a reserved field for compatibility. The default value is x, which indicates that no city is specified. The example uses the JSON string literal &quot;x&quot;, where the double quotes are not part of the actual field content.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;x&quot;</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display name of the city. This is a reserved field for compatibility, and an empty string is returned. The example uses the JSON literal &quot;&quot; to represent an empty string, where the double quotes are not part of the actual field content.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsListRuleCategoriesResponseBodyListRegionCity build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRegionCity self = new SdnsListRuleCategoriesResponseBodyListRegionCity();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRegionCity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsListRuleCategoriesResponseBodyListRegionCity setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRegionContinent extends TeaModel {
        /**
         * <p>The code of the continent. The value x indicates the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display name of the continent. An empty string can be returned for the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsListRuleCategoriesResponseBodyListRegionContinent build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRegionContinent self = new SdnsListRuleCategoriesResponseBodyListRegionContinent();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRegionContinent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsListRuleCategoriesResponseBodyListRegionContinent setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRegionCountry extends TeaModel {
        /**
         * <p>The code of the country or region. The value x indicates the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display name of the country or region. An empty string can be returned for the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>The Chinese mainland</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsListRuleCategoriesResponseBodyListRegionCountry build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRegionCountry self = new SdnsListRuleCategoriesResponseBodyListRegionCountry();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRegionCountry setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsListRuleCategoriesResponseBodyListRegionCountry setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRegionIsp extends TeaModel {
        /**
         * <p>The code of the ISP. The value x indicates the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>chinanet</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display name of the ISP. An empty string can be returned for the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>China Telecom</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsListRuleCategoriesResponseBodyListRegionIsp build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRegionIsp self = new SdnsListRuleCategoriesResponseBodyListRegionIsp();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRegionIsp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsListRuleCategoriesResponseBodyListRegionIsp setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRegionProvince extends TeaModel {
        /**
         * <p>The code of the province. The value x indicates the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>zhejiang</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display name of the province. An empty string can be returned for the default item.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("Label")
        public String label;

        public static SdnsListRuleCategoriesResponseBodyListRegionProvince build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRegionProvince self = new SdnsListRuleCategoriesResponseBodyListRegionProvince();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRegionProvince setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsListRuleCategoriesResponseBodyListRegionProvince setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRegion extends TeaModel {
        /**
         * <p>The code and display name of the region.</p>
         */
        @NameInMap("Area")
        public SdnsListRuleCategoriesResponseBodyListRegionArea area;

        /**
         * <p>The code and display name of the city. This is a reserved field for compatibility. City-level granularity is not currently provided.</p>
         */
        @NameInMap("City")
        public SdnsListRuleCategoriesResponseBodyListRegionCity city;

        /**
         * <p>The code and display name of the continent.</p>
         */
        @NameInMap("Continent")
        public SdnsListRuleCategoriesResponseBodyListRegionContinent continent;

        /**
         * <p>The code and display name of the country or region.</p>
         */
        @NameInMap("Country")
        public SdnsListRuleCategoriesResponseBodyListRegionCountry country;

        /**
         * <p>The code and display name of the ISP.</p>
         */
        @NameInMap("Isp")
        public SdnsListRuleCategoriesResponseBodyListRegionIsp isp;

        /**
         * <p>The code and display name of the province.</p>
         */
        @NameInMap("Province")
        public SdnsListRuleCategoriesResponseBodyListRegionProvince province;

        public static SdnsListRuleCategoriesResponseBodyListRegion build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRegion self = new SdnsListRuleCategoriesResponseBodyListRegion();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRegion setArea(SdnsListRuleCategoriesResponseBodyListRegionArea area) {
            this.area = area;
            return this;
        }
        public SdnsListRuleCategoriesResponseBodyListRegionArea getArea() {
            return this.area;
        }

        public SdnsListRuleCategoriesResponseBodyListRegion setCity(SdnsListRuleCategoriesResponseBodyListRegionCity city) {
            this.city = city;
            return this;
        }
        public SdnsListRuleCategoriesResponseBodyListRegionCity getCity() {
            return this.city;
        }

        public SdnsListRuleCategoriesResponseBodyListRegion setContinent(SdnsListRuleCategoriesResponseBodyListRegionContinent continent) {
            this.continent = continent;
            return this;
        }
        public SdnsListRuleCategoriesResponseBodyListRegionContinent getContinent() {
            return this.continent;
        }

        public SdnsListRuleCategoriesResponseBodyListRegion setCountry(SdnsListRuleCategoriesResponseBodyListRegionCountry country) {
            this.country = country;
            return this;
        }
        public SdnsListRuleCategoriesResponseBodyListRegionCountry getCountry() {
            return this.country;
        }

        public SdnsListRuleCategoriesResponseBodyListRegion setIsp(SdnsListRuleCategoriesResponseBodyListRegionIsp isp) {
            this.isp = isp;
            return this;
        }
        public SdnsListRuleCategoriesResponseBodyListRegionIsp getIsp() {
            return this.isp;
        }

        public SdnsListRuleCategoriesResponseBodyListRegion setProvince(SdnsListRuleCategoriesResponseBodyListRegionProvince province) {
            this.province = province;
            return this;
        }
        public SdnsListRuleCategoriesResponseBodyListRegionProvince getProvince() {
            return this.province;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRulesRecords extends TeaModel {
        /**
         * <p>The single destination IP address corresponding to the record. When Type is 1, it is an IPv4 address, such as 192.0.2.200. When Type is 28, it is an IPv6 address, such as 2001:db8::200. CIDR blocks, IP ranges, or domain names are not used.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.200</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The DNS record type. Valid values: 1: A record. 28: AAAA record. Enter an integer instead of the string A or AAAA.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The auxiliary display text for the record type, which is not used for matching or resolution decisions. This field can be omitted in requests.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("TypeLabel")
        public String typeLabel;

        /**
         * <p>The relative weight of the record, which is used to select one record of the same query type only when ResultMode is 1. Set this to a positive integer from 1 to 100. The sum of the weights of all records does not need to be 100. This field is not used for selection when ResultMode is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static SdnsListRuleCategoriesResponseBodyListRulesRecords build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRulesRecords self = new SdnsListRuleCategoriesResponseBodyListRulesRecords();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRulesRecords setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SdnsListRuleCategoriesResponseBodyListRulesRecords setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SdnsListRuleCategoriesResponseBodyListRulesRecords setTypeLabel(String typeLabel) {
            this.typeLabel = typeLabel;
            return this;
        }
        public String getTypeLabel() {
            return this.typeLabel;
        }

        public SdnsListRuleCategoriesResponseBodyListRulesRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyListRules extends TeaModel {
        /**
         * <p>The names and display order of custom parameters. This field can be empty if no custom parameters are used.</p>
         */
        @NameInMap("ArgKeys")
        public java.util.List<String> argKeys;

        /**
         * <p>The custom parameter matching conditions attached to the rule. If not configured, no parameter restrictions are applied.</p>
         */
        @NameInMap("Args")
        public java.util.Map<String, String> args;

        /**
         * <p>The name of the rule, which is used to identify the rule and cannot replace the policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Default rule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of configured DNS records, which can include A and AAAA records. Actual resolution returns only records of the queried type. If the list is empty or contains no records of the queried type, the system continues to fall back.</p>
         */
        @NameInMap("Records")
        public java.util.List<SdnsListRuleCategoriesResponseBodyListRulesRecords> records;

        /**
         * <p>The record return mode. Valid values: 0: returns all records of the queried type. 1: returns one record of the queried type based on weight.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResultMode")
        public Integer resultMode;

        /**
         * <p>The cache validity period of the record, in seconds. This value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static SdnsListRuleCategoriesResponseBodyListRules build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyListRules self = new SdnsListRuleCategoriesResponseBodyListRules();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyListRules setArgKeys(java.util.List<String> argKeys) {
            this.argKeys = argKeys;
            return this;
        }
        public java.util.List<String> getArgKeys() {
            return this.argKeys;
        }

        public SdnsListRuleCategoriesResponseBodyListRules setArgs(java.util.Map<String, String> args) {
            this.args = args;
            return this;
        }
        public java.util.Map<String, String> getArgs() {
            return this.args;
        }

        public SdnsListRuleCategoriesResponseBodyListRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SdnsListRuleCategoriesResponseBodyListRules setRecords(java.util.List<SdnsListRuleCategoriesResponseBodyListRulesRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SdnsListRuleCategoriesResponseBodyListRulesRecords> getRecords() {
            return this.records;
        }

        public SdnsListRuleCategoriesResponseBodyListRules setResultMode(Integer resultMode) {
            this.resultMode = resultMode;
            return this;
        }
        public Integer getResultMode() {
            return this.resultMode;
        }

        public SdnsListRuleCategoriesResponseBodyListRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

    public static class SdnsListRuleCategoriesResponseBodyList extends TeaModel {
        /**
         * <p>The array of original CIDR blocks from the most recent successful submission for an IP_RANGE policy. The order, duplicates, and content of each string are preserved. The response is a JSON array, not a text string of an array. This field is not used for LINE policies.</p>
         */
        @NameInMap("ClientIpRanges")
        public java.util.List<String> clientIpRanges;

        /**
         * <p>The domain name to which the policy is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the policy, which can be used to query, update, enable, disable, or delete the policy. Treat it as a string to avoid precision loss of large integers.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012345678</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The match type of the policy. Valid values: LINE: line policy. IP_RANGE: client CIDR block policy.</p>
         * 
         * <strong>example:</strong>
         * <p>IP_RANGE</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The line display information for a LINE policy. This field can be empty or omitted for an IP_RANGE policy.</p>
         */
        @NameInMap("RecordLine")
        public SdnsListRuleCategoriesResponseBodyListRecordLine recordLine;

        /**
         * <p>The line and region display information for compatibility with existing clients. This field applies only to LINE policies and can be empty or omitted for IP_RANGE policies.</p>
         */
        @NameInMap("Region")
        public SdnsListRuleCategoriesResponseBodyListRegion region;

        /**
         * <p>The list of custom resolution rules included in the policy. If multiple rules have no parameter conditions, only the first rule is prioritized. Multiple return addresses should be configured in a single rule.</p>
         */
        @NameInMap("Rules")
        public java.util.List<SdnsListRuleCategoriesResponseBodyListRules> rules;

        /**
         * <p>The status of the policy. Valid values: 0: disabled. 1: enabled. After a policy is enabled, actual resolution requires waiting for configuration propagation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static SdnsListRuleCategoriesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            SdnsListRuleCategoriesResponseBodyList self = new SdnsListRuleCategoriesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public SdnsListRuleCategoriesResponseBodyList setClientIpRanges(java.util.List<String> clientIpRanges) {
            this.clientIpRanges = clientIpRanges;
            return this;
        }
        public java.util.List<String> getClientIpRanges() {
            return this.clientIpRanges;
        }

        public SdnsListRuleCategoriesResponseBodyList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SdnsListRuleCategoriesResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SdnsListRuleCategoriesResponseBodyList setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public SdnsListRuleCategoriesResponseBodyList setRecordLine(SdnsListRuleCategoriesResponseBodyListRecordLine recordLine) {
            this.recordLine = recordLine;
            return this;
        }
        public SdnsListRuleCategoriesResponseBodyListRecordLine getRecordLine() {
            return this.recordLine;
        }

        public SdnsListRuleCategoriesResponseBodyList setRegion(SdnsListRuleCategoriesResponseBodyListRegion region) {
            this.region = region;
            return this;
        }
        public SdnsListRuleCategoriesResponseBodyListRegion getRegion() {
            return this.region;
        }

        public SdnsListRuleCategoriesResponseBodyList setRules(java.util.List<SdnsListRuleCategoriesResponseBodyListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<SdnsListRuleCategoriesResponseBodyListRules> getRules() {
            return this.rules;
        }

        public SdnsListRuleCategoriesResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
