// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsVerifyRuleCategoryRequest extends TeaModel {
    /**
     * <p>The parameter object used for the current validation. If no custom parameters are used, pass an empty JSON object {}. Do not pass an empty string or null.</p>
     */
    @NameInMap("Args")
    public java.util.Map<String, String> args;

    /**
     * <p>The simulated client IP address. This parameter is required in IP_RANGE mode. Supports a single IPv4 or IPv6 address. CIDR blocks and start-to-end ranges are not supported. This parameter is used for CIDR block matching in the current request and does not change the source of the actual DNS resolution request.</p>
     * 
     * <strong>example:</strong>
     * <p>198.51.100.10</p>
     */
    @NameInMap("Cip")
    public String cip;

    /**
     * <p>The array of client CIDR blocks that must be provided in the IP_RANGE pattern. Send this parameter as a JSON form field. Do not pass this parameter in the LINE pattern. Supports single IPv4 and IPv6 addresses, CIDR blocks, and start-to-end ranges. Multiple entries have an OR relationship. For CIDR blocks, the IPv4 prefix length ranges from 0 to 32, and the IPv6 prefix length ranges from 0 to 128. Start-to-end ranges are inclusive and must belong to the same address family, with the start address not greater than the end address. Overlapping, containing, and duplicate ranges are allowed within the same policy. When the policy is saved and read back, the array sequence, duplicate items, and the original text of each string are preserved. The array can contain up to 2,000 array elements. The total number of parsed non-empty address expressions ranges from 1 to 2,000, including duplicates. Specify one expression per array element. It is compatible with line breaks within an array element. Each expression can contain up to 128 characters, including leading and trailing whitespace. The serialized UTF-8 JSON content cannot exceed 65,535 bytes. Both the quantity and byte limits apply simultaneously. To authenticate, the system only checks the ranges that you commit and does not check for conflicts with saved policies.</p>
     */
    @NameInMap("ClientIpRanges")
    public java.util.List<String> clientIpRanges;

    /**
     * <p>The match type. Valid values:</p>
     * <ul>
     * <li>LINE: line mode</li>
     * <li>IP_RANGE: client CIDR block mode
     * If this parameter is omitted, LINE is used. In IP_RANGE mode, you must provide both ClientIpRanges and Cip.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IP_RANGE</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The complete list of rules. This parameter is required and must contain at least one rule. If you only need to match CIDR blocks, configure a default rule without ArgKeys and Args, and configure the A/AAAA destination addresses in the Records field of this rule. This operation is used for match validation and does not save the rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<SdnsVerifyRuleCategoryRequestRules> rules;

    public static SdnsVerifyRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SdnsVerifyRuleCategoryRequest self = new SdnsVerifyRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public SdnsVerifyRuleCategoryRequest setArgs(java.util.Map<String, String> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, String> getArgs() {
        return this.args;
    }

    public SdnsVerifyRuleCategoryRequest setCip(String cip) {
        this.cip = cip;
        return this;
    }
    public String getCip() {
        return this.cip;
    }

    public SdnsVerifyRuleCategoryRequest setClientIpRanges(java.util.List<String> clientIpRanges) {
        this.clientIpRanges = clientIpRanges;
        return this;
    }
    public java.util.List<String> getClientIpRanges() {
        return this.clientIpRanges;
    }

    public SdnsVerifyRuleCategoryRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public SdnsVerifyRuleCategoryRequest setRules(java.util.List<SdnsVerifyRuleCategoryRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<SdnsVerifyRuleCategoryRequestRules> getRules() {
        return this.rules;
    }

    public static class SdnsVerifyRuleCategoryRequestRulesRecords extends TeaModel {
        /**
         * <p>The single destination IP address for the record. If Type is set to 1, specify an IPv4 address, such as 192.0.2.200. If Type is set to 28, specify an IPv6 address, such as 2001:db8::200. Do not use CIDR blocks, start-to-end ranges, or domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.200</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The DNS record type. Valid values:</p>
         * <ul>
         * <li>1: A record</li>
         * <li>28: AAAA record
         * Specify an integer. Do not use the strings A or AAAA.</li>
         * </ul>
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
         * <p>The relative weight of the record. This parameter is used to select one record of the same query type only when ResultMode is set to 1. Set this parameter to a positive integer from 1 to 100. The sum of the weights of all records does not need to be 100. This parameter does not participate in selection when ResultMode is set to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static SdnsVerifyRuleCategoryRequestRulesRecords build(java.util.Map<String, ?> map) throws Exception {
            SdnsVerifyRuleCategoryRequestRulesRecords self = new SdnsVerifyRuleCategoryRequestRulesRecords();
            return TeaModel.build(map, self);
        }

        public SdnsVerifyRuleCategoryRequestRulesRecords setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SdnsVerifyRuleCategoryRequestRulesRecords setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SdnsVerifyRuleCategoryRequestRulesRecords setTypeLabel(String typeLabel) {
            this.typeLabel = typeLabel;
            return this;
        }
        public String getTypeLabel() {
            return this.typeLabel;
        }

        public SdnsVerifyRuleCategoryRequestRulesRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class SdnsVerifyRuleCategoryRequestRules extends TeaModel {
        /**
         * <p>The optional list of custom parameter names, used to record the display order. Omit this parameter if you only match CIDR blocks. If you use Args, the names must correspond to the parameter names in Args.</p>
         */
        @NameInMap("ArgKeys")
        public java.util.List<String> argKeys;

        /**
         * <p>The optional custom parameter conditions. The key is the parameter name and the value is the match value. Omit this parameter if you only match CIDR blocks. You do not need to add business parameters.</p>
         */
        @NameInMap("Args")
        public java.util.Map<String, String> args;

        /**
         * <p>The rule name. This parameter is required and cannot be null. Use a non-empty name with business meaning. This parameter cannot replace the policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Default rule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of configured DNS records, which can include A and AAAA records. Actual DNS resolution returns only records of the queried type. If the list is empty or does not contain records of the queried type, the system continues to fall back. This operation returns the records configured in the rule and does not filter them by query type.</p>
         */
        @NameInMap("Records")
        public java.util.List<SdnsVerifyRuleCategoryRequestRulesRecords> records;

        /**
         * <p>The record return mode. Valid values:</p>
         * <ul>
         * <li>0: Returns all records of the queried type.</li>
         * <li>1: Returns one record of the queried type based on weight.
         * Policy validation only returns the rule configuration and does not perform weight sampling.</li>
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

        public static SdnsVerifyRuleCategoryRequestRules build(java.util.Map<String, ?> map) throws Exception {
            SdnsVerifyRuleCategoryRequestRules self = new SdnsVerifyRuleCategoryRequestRules();
            return TeaModel.build(map, self);
        }

        public SdnsVerifyRuleCategoryRequestRules setArgKeys(java.util.List<String> argKeys) {
            this.argKeys = argKeys;
            return this;
        }
        public java.util.List<String> getArgKeys() {
            return this.argKeys;
        }

        public SdnsVerifyRuleCategoryRequestRules setArgs(java.util.Map<String, String> args) {
            this.args = args;
            return this;
        }
        public java.util.Map<String, String> getArgs() {
            return this.args;
        }

        public SdnsVerifyRuleCategoryRequestRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SdnsVerifyRuleCategoryRequestRules setRecords(java.util.List<SdnsVerifyRuleCategoryRequestRulesRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SdnsVerifyRuleCategoryRequestRulesRecords> getRecords() {
            return this.records;
        }

        public SdnsVerifyRuleCategoryRequestRules setResultMode(Integer resultMode) {
            this.resultMode = resultMode;
            return this;
        }
        public Integer getResultMode() {
            return this.resultMode;
        }

        public SdnsVerifyRuleCategoryRequestRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
