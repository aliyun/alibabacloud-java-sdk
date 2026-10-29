// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class CreateSdnsRuleCategoryRequest extends TeaModel {
    /**
     * <p>The array of client IP address ranges required for the IP_RANGE pattern. Send this parameter as a JSON form field. Do not specify this parameter for the LINE pattern. This parameter supports single IPv4 and IPv6 addresses, CIDR blocks, and start-end ranges. Multiple entries have an OR relationship. For CIDR blocks, the IPv4 prefix length ranges from 0 to 32, and the IPv6 prefix length ranges from 0 to 128. Start-end ranges are inclusive and must belong to the same address family, and the start address cannot be greater than the end address. Duplicates, inclusions, and overlaps are allowed within the same policy. When the policy is saved and read back, the array sequence, duplicates, and original text of each string are preserved. The array can contain up to 2,000 array elements. The total number of parsed non-empty address expressions ranges from 1 to 2,000, and duplicates are counted. We recommend that you specify one expression per array element. It is compatible with line breaks within an array element. Each expression can contain up to 128 characters, including leading and trailing spaces. The serialized UTF-8 JSON content cannot exceed 65,535 bytes. The quantity and byte limits take effect simultaneously. Overlaps are not allowed between different IP_RANGE policies for the same account, domain name, and address family. Disabled policies are also checked. Disabling a policy does not release the ranges. This limit does not compare independent configurations of LINE policies and the legacy SetIPRegionResult operation.</p>
     */
    @NameInMap("ClientIpRanges")
    public java.util.List<String> clientIpRanges;

    /**
     * <p>The domain name connected to HTTPDNS for the current account. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to enable the policy upon creation. If this parameter is omitted or set to false, the policy is disabled (Status=0). If this parameter is set to true, the policy is enabled (Status=1), and you do not need to call the enable operation. This parameter applies to the LINE and IP_RANGE modes. Actual resolution still requires waiting for configuration propagation.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The line identifier required for the LINE mode. Valid values:</p>
     * <ul>
     * <li>internal: the Chinese mainland.</li>
     * <li>overseas: outside the Chinese mainland.</li>
     * </ul>
     * <p>Do not specify this parameter for the IP_RANGE mode.</p>
     * 
     * <strong>example:</strong>
     * <p>internal</p>
     */
    @NameInMap("LineId")
    public String lineId;

    /**
     * <p>The match type. Valid values:</p>
     * <ul>
     * <li>LINE: the line mode.</li>
     * <li>IP_RANGE: the client IP address range mode.</li>
     * </ul>
     * <p>If this parameter is omitted, it is processed as LINE. To create an IP address range policy, you must explicitly set this parameter to IP_RANGE and provide ClientIpRanges. You cannot provide LineId or Paths at the same time. The match type cannot be changed after creation.</p>
     * 
     * <strong>example:</strong>
     * <p>IP_RANGE</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The line selection path that describes the line conditions at each level. This parameter applies only to the LINE mode. The IP_RANGE mode does not use line paths. When you create a line policy, provide valid options at each level. Use x for the default option. For the Chinese mainland, the levels include ISP, region, and province. For regions outside the Chinese mainland, the levels include continent and region.</p>
     */
    @NameInMap("Paths")
    public java.util.List<CreateSdnsRuleCategoryRequestPaths> paths;

    /**
     * <p>The complete list of rules. This parameter is required and must contain at least one rule. When matching only by IP address range, configure a default rule without ArgKeys and Args, and configure the A or AAAA destination addresses in the Records of this rule. When saved, the serialized UTF-8 JSON content must be less than 65,535 bytes.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateSdnsRuleCategoryRequestRules> rules;

    public static CreateSdnsRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSdnsRuleCategoryRequest self = new CreateSdnsRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateSdnsRuleCategoryRequest setClientIpRanges(java.util.List<String> clientIpRanges) {
        this.clientIpRanges = clientIpRanges;
        return this;
    }
    public java.util.List<String> getClientIpRanges() {
        return this.clientIpRanges;
    }

    public CreateSdnsRuleCategoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateSdnsRuleCategoryRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateSdnsRuleCategoryRequest setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public CreateSdnsRuleCategoryRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public CreateSdnsRuleCategoryRequest setPaths(java.util.List<CreateSdnsRuleCategoryRequestPaths> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<CreateSdnsRuleCategoryRequestPaths> getPaths() {
        return this.paths;
    }

    public CreateSdnsRuleCategoryRequest setRules(java.util.List<CreateSdnsRuleCategoryRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateSdnsRuleCategoryRequestRules> getRules() {
        return this.rules;
    }

    public static class CreateSdnsRuleCategoryRequestPaths extends TeaModel {
        /**
         * <p>The code of the option at this level. For example, chinanet at the isps level indicates China Telecom. Use valid options for the associated line and maintain consistent hierarchical subordination.</p>
         * 
         * <strong>example:</strong>
         * <p>chinanet</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The level identifier. For the Chinese mainland, use isps, subRegions, and provinces. For regions outside the Chinese mainland, use continents and geoRegions. This parameter corresponds to Level.</p>
         * 
         * <strong>example:</strong>
         * <p>isps</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The sequence number of the line level. For the Chinese mainland, the values are 1 (ISP), 2 (region), and 3 (province). For regions outside the Chinese mainland, the values are 1 (continent) and 2 (region).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Integer level;

        public static CreateSdnsRuleCategoryRequestPaths build(java.util.Map<String, ?> map) throws Exception {
            CreateSdnsRuleCategoryRequestPaths self = new CreateSdnsRuleCategoryRequestPaths();
            return TeaModel.build(map, self);
        }

        public CreateSdnsRuleCategoryRequestPaths setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateSdnsRuleCategoryRequestPaths setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSdnsRuleCategoryRequestPaths setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

    }

    public static class CreateSdnsRuleCategoryRequestRulesRecords extends TeaModel {
        /**
         * <p>The single destination IP address corresponding to the record. If Type is set to 1, the value is an IPv4 address, such as 192.0.2.200. If Type is set to 28, the value is an IPv6 address, such as 2001:db8::200. Do not use CIDR blocks, start-end ranges, or domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.200</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The DNS record type. Valid values:</p>
         * <ul>
         * <li>1: A record.</li>
         * <li>28: AAAA record.</li>
         * </ul>
         * <p>Specify an integer. Do not use the string A or AAAA.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The auxiliary display text for the record type. This parameter does not participate in matching or resolution decisions and can be omitted in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("TypeLabel")
        public String typeLabel;

        /**
         * <p>The relative weight of the record. This parameter is used to select one record of the same queried type only when ResultMode is set to 1. We recommend that you set this parameter to a positive integer from 1 to 100. The sum of the weights of all records does not need to be 100. This parameter does not participate in selection when ResultMode is set to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateSdnsRuleCategoryRequestRulesRecords build(java.util.Map<String, ?> map) throws Exception {
            CreateSdnsRuleCategoryRequestRulesRecords self = new CreateSdnsRuleCategoryRequestRulesRecords();
            return TeaModel.build(map, self);
        }

        public CreateSdnsRuleCategoryRequestRulesRecords setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public CreateSdnsRuleCategoryRequestRulesRecords setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateSdnsRuleCategoryRequestRulesRecords setTypeLabel(String typeLabel) {
            this.typeLabel = typeLabel;
            return this;
        }
        public String getTypeLabel() {
            return this.typeLabel;
        }

        public CreateSdnsRuleCategoryRequestRulesRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateSdnsRuleCategoryRequestRules extends TeaModel {
        /**
         * <p>The optional list of custom parameter names used to record the display order. Omit this parameter when matching only by IP address range. If Args is used, the names must correspond to the parameter names in Args.</p>
         */
        @NameInMap("ArgKeys")
        public java.util.List<String> argKeys;

        /**
         * <p>The optional custom parameter conditions. The key is the parameter name, and the value is the match value. Omit this parameter when matching only by IP address range. You do not need to add business parameters.</p>
         */
        @NameInMap("Args")
        public java.util.Map<String, String> args;

        /**
         * <p>The rule name. This parameter is required and cannot be null. We recommend that you use a non-empty name with business meaning. This parameter cannot replace the policy Id.</p>
         * 
         * <strong>example:</strong>
         * <p>Default rule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of configured resolution records, which can include A and AAAA records. Actual resolution returns only records of the queried type. If the list is empty or does not contain records of the queried type, the system continues to fall back.</p>
         */
        @NameInMap("Records")
        public java.util.List<CreateSdnsRuleCategoryRequestRulesRecords> records;

        /**
         * <p>The record return mode. Valid values:</p>
         * <ul>
         * <li>0: returns all records of the queried type.</li>
         * <li>1: returns one record of the queried type based on the weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResultMode")
        public Integer resultMode;

        /**
         * <p>The cache validity period of the record, in seconds. This parameter must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static CreateSdnsRuleCategoryRequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSdnsRuleCategoryRequestRules self = new CreateSdnsRuleCategoryRequestRules();
            return TeaModel.build(map, self);
        }

        public CreateSdnsRuleCategoryRequestRules setArgKeys(java.util.List<String> argKeys) {
            this.argKeys = argKeys;
            return this;
        }
        public java.util.List<String> getArgKeys() {
            return this.argKeys;
        }

        public CreateSdnsRuleCategoryRequestRules setArgs(java.util.Map<String, String> args) {
            this.args = args;
            return this;
        }
        public java.util.Map<String, String> getArgs() {
            return this.args;
        }

        public CreateSdnsRuleCategoryRequestRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSdnsRuleCategoryRequestRules setRecords(java.util.List<CreateSdnsRuleCategoryRequestRulesRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<CreateSdnsRuleCategoryRequestRulesRecords> getRecords() {
            return this.records;
        }

        public CreateSdnsRuleCategoryRequestRules setResultMode(Integer resultMode) {
            this.resultMode = resultMode;
            return this;
        }
        public Integer getResultMode() {
            return this.resultMode;
        }

        public CreateSdnsRuleCategoryRequestRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
