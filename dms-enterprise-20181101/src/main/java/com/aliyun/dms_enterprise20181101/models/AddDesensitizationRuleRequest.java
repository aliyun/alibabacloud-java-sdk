// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddDesensitizationRuleRequest extends TeaModel {
    /**
     * <p>The parameters of the algorithm.</p>
     */
    @NameInMap("FunctionParams")
    public java.util.List<java.util.Map<String, String>> functionParams;

    /**
     * <p>The type of the masking algorithm.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>FIX_POS : masks characters in the specified position.</li>
     * <li>DATE_ROUNDING: rounds the date.</li>
     * <li>PLAINTEXT: does not mask data.</li>
     * <li>SHA1: masks characters by using the secure hash algorithm 1 (SHA-1)</li>
     * <li>HMAC: masks characters by using the hash-based message authentication code (HMAC).</li>
     * <li>STRING_TRANSFORM: shift characters.</li>
     * <li>NUMBER_ROUNDING: rounds numbers.</li>
     * <li>AES: masks characters by using the advanced encryption standard (AES) algorithm.</li>
     * <li>SHA256: masks characters by using SHA-256 algorithm.</li>
     * <li>DES: masks characters by using the data encryption standard (DES) algorithm.</li>
     * <li>MAP_REPLACE: masks the mapped data.</li>
     * <li>FIX_CHAR: masks fixed characters.</li>
     * <li>DEFAULT: masks all characters.</li>
     * <li>RANDOM_REPLACE: randomly replaces characters.</li>
     * <li>MD5: masks characters by using the MD5 algorithm.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MD5</p>
     */
    @NameInMap("FunctionType")
    public String functionType;

    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>hash algorithm</p>
     */
    @NameInMap("RuleDescription")
    public String ruleDescription;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desensitization algorithm test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The masking algorithm.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>PLAINTEXT</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>TRANSFORM</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ENCRYPT</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>REPLACE</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>HASH</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>MASK</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HASH</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static AddDesensitizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDesensitizationRuleRequest self = new AddDesensitizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddDesensitizationRuleRequest setFunctionParams(java.util.List<java.util.Map<String, String>> functionParams) {
        this.functionParams = functionParams;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getFunctionParams() {
        return this.functionParams;
    }

    public AddDesensitizationRuleRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public AddDesensitizationRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    public AddDesensitizationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddDesensitizationRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public AddDesensitizationRuleRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
