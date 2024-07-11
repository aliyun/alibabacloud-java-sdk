// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCRuleV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("Expires")
    public Long expires;

    /**
     * <p>The frequency control rule. This parameter is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>action</strong>: the action that is performed if the rule is matched. This field is required and must be of the string type. Valid values:</p>
     * <ul>
     * <li><strong>block</strong>: The requests that match the rule are blocked.</li>
     * <li><strong>challenge</strong>: Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule is implemented.</li>
     * <li><strong>watch</strong>: The requests that match the rule are recorded in logs and allowed.</li>
     * </ul>
     * </li>
     * <li><p><strong>name</strong>: the name of the rule. This field is required and must be of the string type.</p>
     * </li>
     * <li><p><strong>condition</strong>: the match conditions. This field is required and must be of the map type. This field contains the following parameters:</p>
     * <p>**</p>
     * <p><strong>Note</strong> The AND logical operator is used to evaluate multiple match conditions.</p>
     * <ul>
     * <li><p><strong>field</strong>: the match field. This field is required and must be of the string type.</p>
     * </li>
     * <li><p><strong>match_method</strong>: the logical relation. This field is required and must be of the string type.</p>
     * <p>**</p>
     * <p><strong>Note</strong> For information about the mappings between the <strong>field</strong> and <strong>match_method</strong> parameters, see the &quot;Mappings between the field and match_method parameters&quot; section of this topic.</p>
     * </li>
     * <li><p><strong>header_name</strong>: the name of the custom HTTP header. This field is optional and must be of the string type.</p>
     * <p>**</p>
     * <p><strong>Note</strong> This field is required only when <strong>field</strong> is set to <strong>header</strong>.</p>
     * </li>
     * <li><p><strong>content</strong>: the match content. This field is required and must be of the string type.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>ratelimit</strong>: the frequency control field. This field is optional and must be of the string type. The frequency can be measured based on IP addresses or custom headers. This field contains the following parameters:</p>
     * <ul>
     * <li><strong>interval</strong>: the statistical duration. Unit: seconds. This field is required and must be of the integer type.</li>
     * <li><strong>ttl</strong>: the period during which the specified action is performed. Unit: seconds. This field is required and must be of the integer type.</li>
     * <li><strong>threshold</strong>: the threshold. This field is required and must be of the integer type.</li>
     * <li><strong>subkey</strong>: the name of the field. This field is optional and must be of the string type. This field is required only when target is set to header.</li>
     * <li><strong>target</strong>: the statistical source. This field is required and must be of the string type. Valid values: ip and header.</li>
     * </ul>
     * </li>
     * <li><p><strong>status_code</strong>: the frequency control field. This field is optional and must be of the string type. Frequency control can be performed based on the quantity or percentage of status codes. This field contains the following parameters:</p>
     * <ul>
     * <li><strong>enabled</strong>: specifies whether to enable status code statistics. This field is required and must be of the Boolean type.</li>
     * <li><strong>code</strong>: the status code. This field is required and must be of the integer type. Valid values: <strong>100</strong> to <strong>599</strong>.</li>
     * <li><strong>use_ratio</strong>: specifies whether to use a ratio. This field is required and must be of the Boolean type. To use a ratio, set this field to true.</li>
     * <li><strong>ratio_threshold</strong>: the ratio of the status code. This field is optional and must be of the integer type. If a ratio is used, the action specified in the rule is performed only when the ratio of the status code reaches <strong>ratio_threshold</strong>. Valid values: <strong>1</strong> to <strong>100</strong>.</li>
     * <li><strong>count_threshold</strong>: the quantity of the status code. This field is optional and must be of the integer type. If a ratio is not used, the action specified in the rule is performed only when the quantity of the status code reaches <strong>count_threshold</strong>. Valid values: <strong>2</strong> to <strong>50000</strong>.</li>
     * </ul>
     * </li>
     * <li><p><strong>statistics</strong>: specifies whether deduplication is used for statistics. This field is optional and must be of the string type. By default, deduplication is not used for statistics. This field contains the following parameters:</p>
     * <ul>
     * <li><p><strong>mode</strong>: specifies whether deduplication is used for status code statistics. This field is required and must be of the string type. Valid values:</p>
     * <ul>
     * <li><strong>count</strong>: Deduplication is not used for statistics.</li>
     * <li><strong>distinct</strong>: Deduplication is used for statistics.</li>
     * </ul>
     * </li>
     * <li><p><strong>field</strong>: the statistical source. This field is required and must be of the string type. Valid values: ip, header, and uri.</p>
     * </li>
     * <li><p><strong>header_name</strong>: the name of the header. This field is optional and must be of the string type. This field is required only when field is set to header.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;action&quot;:&quot;block&quot;,&quot;name&quot;:&quot;trdsss&quot;,&quot;ratelimit&quot;:{&quot;interval&quot;:60,&quot;ttl&quot;:300,&quot;threshold&quot;:70,&quot;target&quot;:&quot;ip&quot;},&quot;condition&quot;:[{&quot;field&quot;:&quot;ip&quot;,&quot;match_method&quot;:&quot;belong&quot;,&quot;content&quot;:&quot;1.1.1.1&quot;}]}]</p>
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
