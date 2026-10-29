// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsVerifyRuleCategoryResponseBody extends TeaModel {
    /**
     * <p>The configuration of the matched rule. If no rules are matched, this field is empty or omitted. This field does not represent the final response of the actual resolution chain.</p>
     */
    @NameInMap("Data")
    public SdnsVerifyRuleCategoryResponseBodyData data;

    /**
     * <p>The ID of the request, used to troubleshoot call issues. This field is not the policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SdnsVerifyRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdnsVerifyRuleCategoryResponseBody self = new SdnsVerifyRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public SdnsVerifyRuleCategoryResponseBody setData(SdnsVerifyRuleCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SdnsVerifyRuleCategoryResponseBodyData getData() {
        return this.data;
    }

    public SdnsVerifyRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SdnsVerifyRuleCategoryResponseBodyDataRecords extends TeaModel {
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

        public static SdnsVerifyRuleCategoryResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SdnsVerifyRuleCategoryResponseBodyDataRecords self = new SdnsVerifyRuleCategoryResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public SdnsVerifyRuleCategoryResponseBodyDataRecords setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SdnsVerifyRuleCategoryResponseBodyDataRecords setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SdnsVerifyRuleCategoryResponseBodyDataRecords setTypeLabel(String typeLabel) {
            this.typeLabel = typeLabel;
            return this;
        }
        public String getTypeLabel() {
            return this.typeLabel;
        }

        public SdnsVerifyRuleCategoryResponseBodyDataRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class SdnsVerifyRuleCategoryResponseBodyData extends TeaModel {
        /**
         * <p>The custom parameter names and their display order. This field can be empty if no custom parameters are used.</p>
         */
        @NameInMap("ArgKeys")
        public java.util.List<String> argKeys;

        /**
         * <p>The custom parameter match conditions attached to the rule. If not configured, no parameter restrictions are attached.</p>
         */
        @NameInMap("Args")
        public java.util.Map<String, String> args;

        /**
         * <p>The rule name, used to identify the rule. This field cannot replace the policy ID.</p>
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
        public java.util.List<SdnsVerifyRuleCategoryResponseBodyDataRecords> records;

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

        public static SdnsVerifyRuleCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SdnsVerifyRuleCategoryResponseBodyData self = new SdnsVerifyRuleCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SdnsVerifyRuleCategoryResponseBodyData setArgKeys(java.util.List<String> argKeys) {
            this.argKeys = argKeys;
            return this;
        }
        public java.util.List<String> getArgKeys() {
            return this.argKeys;
        }

        public SdnsVerifyRuleCategoryResponseBodyData setArgs(java.util.Map<String, String> args) {
            this.args = args;
            return this;
        }
        public java.util.Map<String, String> getArgs() {
            return this.args;
        }

        public SdnsVerifyRuleCategoryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SdnsVerifyRuleCategoryResponseBodyData setRecords(java.util.List<SdnsVerifyRuleCategoryResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<SdnsVerifyRuleCategoryResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public SdnsVerifyRuleCategoryResponseBodyData setResultMode(Integer resultMode) {
            this.resultMode = resultMode;
            return this;
        }
        public Integer getResultMode() {
            return this.resultMode;
        }

        public SdnsVerifyRuleCategoryResponseBodyData setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
