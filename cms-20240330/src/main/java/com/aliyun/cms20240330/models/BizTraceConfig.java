// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class BizTraceConfig extends TeaModel {
    @NameInMap("advancedConfig")
    public String advancedConfig;

    @NameInMap("bizTraceCode")
    public String bizTraceCode;

    @NameInMap("bizTraceId")
    public String bizTraceId;

    @NameInMap("bizTraceName")
    public String bizTraceName;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("ruleConfig")
    public String ruleConfig;

    @NameInMap("workspace")
    public String workspace;

    public static BizTraceConfig build(java.util.Map<String, ?> map) throws Exception {
        BizTraceConfig self = new BizTraceConfig();
        return TeaModel.build(map, self);
    }

    public BizTraceConfig setAdvancedConfig(String advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    public BizTraceConfig setBizTraceCode(String bizTraceCode) {
        this.bizTraceCode = bizTraceCode;
        return this;
    }
    public String getBizTraceCode() {
        return this.bizTraceCode;
    }

    public BizTraceConfig setBizTraceId(String bizTraceId) {
        this.bizTraceId = bizTraceId;
        return this;
    }
    public String getBizTraceId() {
        return this.bizTraceId;
    }

    public BizTraceConfig setBizTraceName(String bizTraceName) {
        this.bizTraceName = bizTraceName;
        return this;
    }
    public String getBizTraceName() {
        return this.bizTraceName;
    }

    public BizTraceConfig setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BizTraceConfig setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BizTraceConfig setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public BizTraceConfig setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
