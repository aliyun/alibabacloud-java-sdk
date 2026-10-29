// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class UpdateSdnsRuleCategoryShrinkRequest extends TeaModel {
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
    public String rulesShrink;

    public static UpdateSdnsRuleCategoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSdnsRuleCategoryShrinkRequest self = new UpdateSdnsRuleCategoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSdnsRuleCategoryShrinkRequest setClientIpRanges(String clientIpRanges) {
        this.clientIpRanges = clientIpRanges;
        return this;
    }
    public String getClientIpRanges() {
        return this.clientIpRanges;
    }

    public UpdateSdnsRuleCategoryShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateSdnsRuleCategoryShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
