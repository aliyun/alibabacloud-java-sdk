// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsVerifyRuleCategoryShrinkRequest extends TeaModel {
    /**
     * <p>The parameter object used for the current validation. If no custom parameters are used, pass an empty JSON object {}. Do not pass an empty string or null.</p>
     */
    @NameInMap("Args")
    public String argsShrink;

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
    public String clientIpRangesShrink;

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
    public String rulesShrink;

    public static SdnsVerifyRuleCategoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SdnsVerifyRuleCategoryShrinkRequest self = new SdnsVerifyRuleCategoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SdnsVerifyRuleCategoryShrinkRequest setArgsShrink(String argsShrink) {
        this.argsShrink = argsShrink;
        return this;
    }
    public String getArgsShrink() {
        return this.argsShrink;
    }

    public SdnsVerifyRuleCategoryShrinkRequest setCip(String cip) {
        this.cip = cip;
        return this;
    }
    public String getCip() {
        return this.cip;
    }

    public SdnsVerifyRuleCategoryShrinkRequest setClientIpRangesShrink(String clientIpRangesShrink) {
        this.clientIpRangesShrink = clientIpRangesShrink;
        return this;
    }
    public String getClientIpRangesShrink() {
        return this.clientIpRangesShrink;
    }

    public SdnsVerifyRuleCategoryShrinkRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public SdnsVerifyRuleCategoryShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
