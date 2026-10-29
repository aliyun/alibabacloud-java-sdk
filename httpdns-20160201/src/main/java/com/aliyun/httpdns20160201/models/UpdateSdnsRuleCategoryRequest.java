// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class UpdateSdnsRuleCategoryRequest extends TeaModel {
    /**
     * <p>The JSON text string of the IP address range array. This parameter is used only to update IP_RANGE policies. If this parameter is omitted, the original IP address ranges are retained. If this parameter is provided, the original IP address ranges are replaced as a whole. You cannot pass an empty string, an empty array [], null, or a non-string array. Single IP addresses, CIDR blocks, and start-end ranges of IPv4 and IPv6 are supported. Multiple entries have an OR relationship. For CIDR blocks, the IPv4 prefix length ranges from 0 to 32, and the IPv6 prefix length ranges from 0 to 128. Start-end ranges are inclusive and must belong to the same address family, and the start address must not be greater than the end address. Overlapping, containing, and duplicate ranges are allowed within the same policy. When the policy is saved and read back, the array order, duplicate items, and the original text of each string are retained. An array can contain up to 2,000 array elements. The total number of parsed non-empty address expressions ranges from 1 to 2,000, and duplicate items are counted. We recommend that you specify one expression per element. It is compatible with line breaks within an element. Each expression can contain up to 128 characters, including leading and trailing whitespace. The serialized UTF-8 JSON sequence cannot exceed 65,535 bytes. The quantity and byte limits take effect at the same time. Overlapping is not allowed among different IP_RANGE policies of the same account, the same domain name, and the same address family. Disabled policies are also checked. Disabling a policy does not release its IP address ranges. This limit does not compare LINE policies and the independent configurations of the legacy SetIPRegionResult operation. The new ranges do not conflict with the old ranges of the same policy during an update. Send this parameter as a single form field, and do not add quotes to the JSON text again.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;198.51.100.0/24&quot;,&quot;2001:db8:1::/64&quot;]</p>
     */
    @NameInMap("ClientIpRanges")
    public String clientIpRanges;

    /**
     * <p>The ID of the policy for the current account. This parameter is required. You can obtain the ID from the Id field in the response of CreateSdnsRuleCategory or from the list returned by SdnsListRuleCategories. Use a decimal string to avoid precision loss for large integers.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789012345678</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The complete list of rules. This parameter is required and must contain at least one rule. If you match only by IP address range, you can configure a default rule without ArgKeys and Args, and configure the A or AAAA destination addresses in the Records field of the rule. The update replaces the original rule list as a whole. Old rules that are not included in the new list are removed. When the rules are saved, the serialized UTF-8 JSON content must be less than 65,535 bytes.</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateSdnsRuleCategoryRequestRules> rules;

    public static UpdateSdnsRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSdnsRuleCategoryRequest self = new UpdateSdnsRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSdnsRuleCategoryRequest setClientIpRanges(String clientIpRanges) {
        this.clientIpRanges = clientIpRanges;
        return this;
    }
    public String getClientIpRanges() {
        return this.clientIpRanges;
    }

    public UpdateSdnsRuleCategoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateSdnsRuleCategoryRequest setRules(java.util.List<UpdateSdnsRuleCategoryRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<UpdateSdnsRuleCategoryRequestRules> getRules() {
        return this.rules;
    }

    public static class UpdateSdnsRuleCategoryRequestRulesRecords extends TeaModel {
        /**
         * <p>The single destination IP address corresponding to the record. When Type is set to 1, the IP address is an IPv4 address, such as 192.0.2.200. When Type is set to 28, the IP address is an IPv6 address, such as 2001:db8::200. Do not use CIDR blocks, start-end ranges, or domain names.</p>
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
         * <li>28: AAAA record.
         * Specify an integer. Do not use the string A or AAAA.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The auxiliary display text for the record type. This text is not used for matching or DNS resolution decisions. You can omit this parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("TypeLabel")
        public String typeLabel;

        /**
         * <p>The relative weight of the record. This parameter is used to select one record of the same queried type only when ResultMode is set to 1. We recommend that you set this parameter to a positive integer from 1 to 100. The sum of the weights of all records does not need to be 100. This parameter is not used for selection when ResultMode is set to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateSdnsRuleCategoryRequestRulesRecords build(java.util.Map<String, ?> map) throws Exception {
            UpdateSdnsRuleCategoryRequestRulesRecords self = new UpdateSdnsRuleCategoryRequestRulesRecords();
            return TeaModel.build(map, self);
        }

        public UpdateSdnsRuleCategoryRequestRulesRecords setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public UpdateSdnsRuleCategoryRequestRulesRecords setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public UpdateSdnsRuleCategoryRequestRulesRecords setTypeLabel(String typeLabel) {
            this.typeLabel = typeLabel;
            return this;
        }
        public String getTypeLabel() {
            return this.typeLabel;
        }

        public UpdateSdnsRuleCategoryRequestRulesRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateSdnsRuleCategoryRequestRules extends TeaModel {
        /**
         * <p>The optional list of custom parameter names, which is used to record the display order. Omit this parameter if you match only by IP address range. If you use Args, the names must correspond to the parameter names in Args.</p>
         */
        @NameInMap("ArgKeys")
        public java.util.List<String> argKeys;

        /**
         * <p>The optional custom parameter conditions. The key is the parameter name, and the value is the match value. Omit this parameter if you match only by IP address range. You do not need to add business parameters.</p>
         */
        @NameInMap("Args")
        public java.util.Map<String, String> args;

        /**
         * <p>The name of the rule. This parameter is required and cannot be null. We recommend that you use a non-empty name that has business meaning. The name cannot replace the policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Default rule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of configured DNS records. The list can include A and AAAA records. Actual DNS resolution returns only the records of the queried type. If the list is empty or does not contain records of the queried type, the system continues to fall back.</p>
         */
        @NameInMap("Records")
        public java.util.List<UpdateSdnsRuleCategoryRequestRulesRecords> records;

        /**
         * <p>The record return mode. Valid values:</p>
         * <ul>
         * <li>0: Returns all records of the queried type.</li>
         * <li>1: Returns one record of the queried type based on the weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResultMode")
        public Integer resultMode;

        /**
         * <p>The cache validity period of the record, in seconds. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static UpdateSdnsRuleCategoryRequestRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateSdnsRuleCategoryRequestRules self = new UpdateSdnsRuleCategoryRequestRules();
            return TeaModel.build(map, self);
        }

        public UpdateSdnsRuleCategoryRequestRules setArgKeys(java.util.List<String> argKeys) {
            this.argKeys = argKeys;
            return this;
        }
        public java.util.List<String> getArgKeys() {
            return this.argKeys;
        }

        public UpdateSdnsRuleCategoryRequestRules setArgs(java.util.Map<String, String> args) {
            this.args = args;
            return this;
        }
        public java.util.Map<String, String> getArgs() {
            return this.args;
        }

        public UpdateSdnsRuleCategoryRequestRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSdnsRuleCategoryRequestRules setRecords(java.util.List<UpdateSdnsRuleCategoryRequestRulesRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<UpdateSdnsRuleCategoryRequestRulesRecords> getRecords() {
            return this.records;
        }

        public UpdateSdnsRuleCategoryRequestRules setResultMode(Integer resultMode) {
            this.resultMode = resultMode;
            return this;
        }
        public Integer getResultMode() {
            return this.resultMode;
        }

        public UpdateSdnsRuleCategoryRequestRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
