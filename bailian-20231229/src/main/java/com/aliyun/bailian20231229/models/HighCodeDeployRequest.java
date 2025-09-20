// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class HighCodeDeployRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>智能客服agent</p>
     */
    @NameInMap("agentDesc")
    public String agentDesc;

    /**
     * <strong>example:</strong>
     * <p>2000013</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>mma_test_02</p>
     */
    @NameInMap("agentName")
    public String agentName;

    /**
     * <strong>example:</strong>
     * <p>xxxxx.whl</p>
     */
    @NameInMap("sourceCodeName")
    public String sourceCodeName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://bailian-application-developer-code.oss-cn-beijing.aliyuncs.com/xxxxx.whl">https://bailian-application-developer-code.oss-cn-beijing.aliyuncs.com/xxxxx.whl</a></p>
     */
    @NameInMap("sourceCodeOssUrl")
    public String sourceCodeOssUrl;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("telemetryEnabled")
    public Boolean telemetryEnabled;

    public static HighCodeDeployRequest build(java.util.Map<String, ?> map) throws Exception {
        HighCodeDeployRequest self = new HighCodeDeployRequest();
        return TeaModel.build(map, self);
    }

    public HighCodeDeployRequest setAgentDesc(String agentDesc) {
        this.agentDesc = agentDesc;
        return this;
    }
    public String getAgentDesc() {
        return this.agentDesc;
    }

    public HighCodeDeployRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public HighCodeDeployRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public HighCodeDeployRequest setSourceCodeName(String sourceCodeName) {
        this.sourceCodeName = sourceCodeName;
        return this;
    }
    public String getSourceCodeName() {
        return this.sourceCodeName;
    }

    public HighCodeDeployRequest setSourceCodeOssUrl(String sourceCodeOssUrl) {
        this.sourceCodeOssUrl = sourceCodeOssUrl;
        return this;
    }
    public String getSourceCodeOssUrl() {
        return this.sourceCodeOssUrl;
    }

    public HighCodeDeployRequest setTelemetryEnabled(Boolean telemetryEnabled) {
        this.telemetryEnabled = telemetryEnabled;
        return this;
    }
    public Boolean getTelemetryEnabled() {
        return this.telemetryEnabled;
    }

}
