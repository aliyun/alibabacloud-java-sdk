// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class CreateSdnsRuleCategoryShrinkRequest extends TeaModel {
    /**
     * <p>The array of client IP address ranges required for the IP_RANGE pattern. Send this parameter as a JSON form field. Do not specify this parameter for the LINE pattern. This parameter supports single IPv4 and IPv6 addresses, CIDR blocks, and start-end ranges. Multiple entries have an OR relationship. For CIDR blocks, the IPv4 prefix length ranges from 0 to 32, and the IPv6 prefix length ranges from 0 to 128. Start-end ranges are inclusive and must belong to the same address family, and the start address cannot be greater than the end address. Duplicates, inclusions, and overlaps are allowed within the same policy. When the policy is saved and read back, the array sequence, duplicates, and original text of each string are preserved. The array can contain up to 2,000 array elements. The total number of parsed non-empty address expressions ranges from 1 to 2,000, and duplicates are counted. We recommend that you specify one expression per array element. It is compatible with line breaks within an array element. Each expression can contain up to 128 characters, including leading and trailing spaces. The serialized UTF-8 JSON content cannot exceed 65,535 bytes. The quantity and byte limits take effect simultaneously. Overlaps are not allowed between different IP_RANGE policies for the same account, domain name, and address family. Disabled policies are also checked. Disabling a policy does not release the ranges. This limit does not compare independent configurations of LINE policies and the legacy SetIPRegionResult operation.</p>
     */
    @NameInMap("ClientIpRanges")
    public String clientIpRangesShrink;

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
    public String pathsShrink;

    /**
     * <p>The complete list of rules. This parameter is required and must contain at least one rule. When matching only by IP address range, configure a default rule without ArgKeys and Args, and configure the A or AAAA destination addresses in the Records of this rule. When saved, the serialized UTF-8 JSON content must be less than 65,535 bytes.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    public static CreateSdnsRuleCategoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSdnsRuleCategoryShrinkRequest self = new CreateSdnsRuleCategoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSdnsRuleCategoryShrinkRequest setClientIpRangesShrink(String clientIpRangesShrink) {
        this.clientIpRangesShrink = clientIpRangesShrink;
        return this;
    }
    public String getClientIpRangesShrink() {
        return this.clientIpRangesShrink;
    }

    public CreateSdnsRuleCategoryShrinkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateSdnsRuleCategoryShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateSdnsRuleCategoryShrinkRequest setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public CreateSdnsRuleCategoryShrinkRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public CreateSdnsRuleCategoryShrinkRequest setPathsShrink(String pathsShrink) {
        this.pathsShrink = pathsShrink;
        return this;
    }
    public String getPathsShrink() {
        return this.pathsShrink;
    }

    public CreateSdnsRuleCategoryShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
