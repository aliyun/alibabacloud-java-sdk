// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateBizTraceRequest extends TeaModel {
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
     * <p>just test</p>
     */
    @NameInMap("bizTraceName")
    public String bizTraceName;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;entrancePid&quot;:&quot;xxx@d9w3jd9j3&quot;,&quot;rpcMatcher&quot;:{&quot;matchType&quot;:&quot;EQUALS&quot;,&quot;pattern&quot;:&quot;/&quot;},&quot;characteristics&quot;:{&quot;operation&quot;:&quot;OR&quot;,&quot;rules&quot;:[{&quot;target&quot;:&quot;CUSTOM_EXTRACT&quot;,&quot;id&quot;:&quot;oi0b3bb7&quot;,&quot;key&quot;:&quot;biz.test&quot;,&quot;matcher&quot;:{&quot;matchType&quot;:&quot;CONTAINS&quot;,&quot;pattern&quot;:[&quot;1&quot;]}}]}}]</p>
     */
    @NameInMap("ruleConfig")
    public String ruleConfig;

    /**
     * <strong>example:</strong>
     * <p>default-cms-xxxxxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateBizTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizTraceRequest self = new CreateBizTraceRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizTraceRequest setAdvancedConfig(String advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    public CreateBizTraceRequest setBizTraceCode(String bizTraceCode) {
        this.bizTraceCode = bizTraceCode;
        return this;
    }
    public String getBizTraceCode() {
        return this.bizTraceCode;
    }

    public CreateBizTraceRequest setBizTraceName(String bizTraceName) {
        this.bizTraceName = bizTraceName;
        return this;
    }
    public String getBizTraceName() {
        return this.bizTraceName;
    }

    public CreateBizTraceRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public CreateBizTraceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
