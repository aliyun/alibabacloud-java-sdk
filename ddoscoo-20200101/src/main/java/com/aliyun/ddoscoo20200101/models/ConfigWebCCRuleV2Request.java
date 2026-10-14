// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCRuleV2Request extends TeaModel {
    /**
     * <p>The domain name of the website service.</p>
     * <blockquote>
     * <p>The domain name must have a website service forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The validity period of the rule. Unit: seconds. Default value: 0, which indicates that the rule is permanently effective.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Expires")
    public Long expires;

    /**
     * <p>The configuration of the frequency control rule, expressed as a JSON-formatted string with the following structure:</p>
     * <ul>
     * <li><p><strong>action</strong>: String type. Required. The matching action. Valid values:</p>
     * <ul>
     * <li><strong>block</strong>: Block.</li>
     * <li><strong>challenge</strong>: JavaScript Challenge.</li>
     * <li><strong>watch</strong>: Monitor.</li>
     * </ul>
     * </li>
     * <li><p><strong>name</strong>: String type. Required. The rule name.</p>
     * </li>
     * <li><p><strong>condition</strong>: Map type. Required. The matching condition. The structure is as follows:</p>
     * <blockquote>
     * <p>If multiple matching conditions are specified, the conditions are evaluated using the AND logic.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>field</strong>: String type. Required. The matching field.</p>
     * </li>
     * <li><p><strong>match_method</strong>: String type. Required. The matching method.</p>
     * <blockquote>
     * <p>For the valid values of <strong>field</strong> and <strong>match_method</strong>, see the supplementary description below the request parameters table.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>header_name</strong>: String type. Optional. The name of the custom HTTP header field.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>field</strong> is set to <strong>header</strong>.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>content</strong>: String type. Required. The matching content.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>ratelimit</strong>: String type. Required. The frequency control field. You can collect frequency statistics by IP address or custom header. The structure is as follows:</p>
     * <ul>
     * <li><strong>interval</strong>: Integer type. Required. The statistical period (seconds).</li>
     * <li><strong>ttl</strong>: Integer type. Required. The action duration (seconds).</li>
     * <li><strong>threshold</strong>: Integer type. Required. The threshold (count).</li>
     * <li><strong>subkey</strong>: String type. Optional. The field name. Set this parameter only when the statistical source is header.</li>
     * <li><strong>target</strong>: String type. Required. The statistical source. Valid values: ip and header.</li>
     * </ul>
     * </li>
     * <li><p><strong>status_code</strong>: String type. Optional. The frequency control field. You can collect statistics based on the count or ratio of status codes. The structure is as follows:</p>
     * <ul>
     * <li><strong>enabled</strong>: Boolean type. Required. Specifies whether to enable status code statistics.</li>
     * <li><strong>code</strong>: Integer type. Required. Enabling status code. Valid values: <strong>100</strong> to <strong>599</strong>.</li>
     * <li><strong>use_ratio</strong>: Boolean type. Required. Specifies whether to use the ratio. If set to true, the ratio is used.</li>
     * <li><strong>ratio_threshold</strong>: Integer type. Optional. The ratio at which enabling status code appears. When the ratio is used, the action is triggered only when the corresponding status code reaches <strong>ratio_threshold</strong>. Valid values: <strong>1</strong> to <strong>100</strong>.</li>
     * <li><strong>count_threshold</strong>: Integer type. Optional. The count at which enabling status code appears. When the ratio is not used, the action is triggered only when the corresponding status code reaches <strong>count_threshold</strong>. Valid values: <strong>2</strong> to <strong>50000</strong>.</li>
     * </ul>
     * </li>
     * <li><p><strong>statistics</strong>: String type. Optional. The deduplication statistics. This parameter can be left empty, which indicates that deduplication is not performed. The structure is as follows:</p>
     * <ul>
     * <li><strong>mode</strong>: String type. Required. Specifies whether to enable deduplication statistics. Valid values:<ul>
     * <li><strong>count</strong>: deduplication disabled</li>
     * <li><strong>distinct</strong>: deduplication enabled</li>
     * </ul>
     * </li>
     * <li><strong>field</strong>: String type. Required. The statistical source for deduplication. Valid values: ip, header, and uri.</li>
     * <li><strong>header_name</strong>: String type. Optional. The field name. Set this parameter only when the statistical source is header.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;action&quot;:&quot;block&quot;,&quot;name&quot;:&quot;trdsss&quot;,&quot;statistics&quot;:{&quot;mode&quot;:&quot;count&quot;,&quot;field&quot;:&quot;header&quot;,&quot;header_name&quot;:&quot;hahah&quot;},&quot;ratelimit&quot;:{&quot;interval&quot;:60,&quot;ttl&quot;:300,&quot;threshold&quot;:70,&quot;target&quot;:&quot;ip&quot;},&quot;status_code&quot;:{&quot;enabled&quot;:true,&quot;code&quot;:404,&quot;use_ratio&quot;:true,&quot;ratio_threshold&quot;:80,&quot;count_threshold&quot;:2},&quot;condition&quot;:[{&quot;field&quot;:&quot;ip&quot;,&quot;match_method&quot;:&quot;belong&quot;,&quot;content&quot;:&quot;1.1.1.1&quot;}]}]</p>
     */
    @NameInMap("RuleList")
    public String ruleList;

    public static ConfigWebCCRuleV2Request build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebCCRuleV2Request self = new ConfigWebCCRuleV2Request();
        return TeaModel.build(map, self);
    }

    public ConfigWebCCRuleV2Request setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigWebCCRuleV2Request setExpires(Long expires) {
        this.expires = expires;
        return this;
    }
    public Long getExpires() {
        return this.expires;
    }

    public ConfigWebCCRuleV2Request setRuleList(String ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public String getRuleList() {
        return this.ruleList;
    }

}
