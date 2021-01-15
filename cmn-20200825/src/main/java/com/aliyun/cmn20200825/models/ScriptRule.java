// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ScriptRule extends TeaModel {
    // 设备架构
    @NameInMap("Arch")
    public String arch;

    // 设备安全域
    @NameInMap("Domain")
    public String domain;

    // 设备型号
    @NameInMap("Model")
    public String model;

    // 设备OS版本
    @NameInMap("Os")
    public String os;

    // 设备角色
    @NameInMap("Role")
    public String role;

    // 规则id
    @NameInMap("RuleId")
    public String ruleId;

    // 脚本id
    @NameInMap("ScriptId")
    public String scriptId;

    // 设备厂商
    @NameInMap("Vendor")
    public String vendor;

    public static ScriptRule build(java.util.Map<String, ?> map) throws Exception {
        ScriptRule self = new ScriptRule();
        return TeaModel.build(map, self);
    }

    public ScriptRule setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public ScriptRule setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ScriptRule setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ScriptRule setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ScriptRule setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ScriptRule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ScriptRule setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ScriptRule setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
