// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class BizTraceConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;sample&quot;:{&quot;strategy&quot;:&quot;BY_APP&quot;}}</p>
     */
    @NameInMap("advancedConfig")
    public String advancedConfig;

    /**
     * <strong>example:</strong>
     * <p>label_env</p>
     */
    @NameInMap("bizTraceCode")
    public String bizTraceCode;

    /**
     * <strong>example:</strong>
     * <p>e339260ed64c95d</p>
     */
    @NameInMap("bizTraceId")
    public String bizTraceId;

    /**
     * <strong>example:</strong>
     * <p>just test</p>
     */
    @NameInMap("bizTraceName")
    public String bizTraceName;

    /**
     * <strong>example:</strong>
     * <p>2025-12-12 00:00:00</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;entrancePid&quot;:&quot;xxxxx@b57c44xx6e86&quot;,&quot;rpcMatcher&quot;:{&quot;matchType&quot;:&quot;EQUALS&quot;,&quot;pattern&quot;:&quot;/createApp&quot;},&quot;characteristics&quot;:{&quot;operation&quot;:&quot;AND&quot;,&quot;rules&quot;:[{&quot;target&quot;:&quot;CUSTOM_EXTRACT&quot;,&quot;matcher&quot;:{&quot;matchType&quot;:&quot;CONTAINS&quot;,&quot;pattern&quot;:[]}}]}}]</p>
     */
    @NameInMap("ruleConfig")
    public String ruleConfig;

    /**
     * <strong>example:</strong>
     * <p>default-cms-xxxxxxx-cn-hangzhou</p>
     */
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
