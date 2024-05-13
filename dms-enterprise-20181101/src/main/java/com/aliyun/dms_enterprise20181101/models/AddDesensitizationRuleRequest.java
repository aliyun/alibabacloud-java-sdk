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
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   FIX_POS : masks characters in the specified position.</p>
     * <p>*   DATE_ROUNDING: rounds the date.</p>
     * <p>*   PLAINTEXT: does not mask data.</p>
     * <p>*   SHA1: masks characters by using the secure hash algorithm 1 (SHA-1)</p>
     * <p>*   HMAC: masks characters by using the hash-based message authentication code (HMAC).</p>
     * <p>*   STRING_TRANSFORM: shift characters.</p>
     * <p>*   NUMBER_ROUNDING: rounds numbers.</p>
     * <p>*   AES: masks characters by using the advanced encryption standard (AES) algorithm.</p>
     * <p>*   SHA256: masks characters by using SHA-256 algorithm.</p>
     * <p>*   DES: masks characters by using the data encryption standard (DES) algorithm.</p>
     * <p>*   MAP_REPLACE: masks the mapped data.</p>
     * <p>*   FIX_CHAR: masks fixed characters.</p>
     * <p>*   DEFAULT: masks all characters.</p>
     * <p>*   RANDOM_REPLACE: randomly replaces characters.</p>
     * <p>*   MD5: masks characters by using the MD5 algorithm.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FunctionType")
    public String functionType;

    /**
     * <p>The description of the rule.</p>
     */
    @NameInMap("RuleDescription")
    public String ruleDescription;

    /**
     * <p>The name of the rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The masking algorithm.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PLAINTEXT</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   TRANSFORM</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   ENCRYPT</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   REPLACE</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   HASH</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   MASK</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html) section of the "Manage DMS tenants" topic.</p>
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
