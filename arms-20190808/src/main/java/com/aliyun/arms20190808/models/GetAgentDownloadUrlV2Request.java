// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlV2Request extends TeaModel {
    /**
     * <p>The agent type.\
     * <strong>Valid values:</strong></p>
     * <ul>
     * <li><strong>JavaAgent</strong></li>
     * <li><strong>Instgo</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JavaAgent</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The architecture type of the environment where the agent is installed.\
     * This parameter is required and valid only when <strong>AgentType</strong> is set to <strong>Instgo</strong>.\
     * <strong>Valid values:</strong></p>
     * <ul>
     * <li><strong>amd64</strong></li>
     * <li><strong>arm64</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>amd64</p>
     */
    @NameInMap("ArchType")
    public String archType;

    /**
     * <p>The operating system of the environment where the agent is installed.\
     * This parameter is required and valid only when <strong>AgentType</strong> is set to <strong>Instgo</strong>.\
     * <strong>Valid values:</strong></p>
     * <ul>
     * <li><strong>linux</strong></li>
     * <li><strong>darwin</strong></li>
     * <li><strong>windows</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("OsType")
    public String osType;

    public static GetAgentDownloadUrlV2Request build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDownloadUrlV2Request self = new GetAgentDownloadUrlV2Request();
        return TeaModel.build(map, self);
    }

    public GetAgentDownloadUrlV2Request setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public GetAgentDownloadUrlV2Request setArchType(String archType) {
        this.archType = archType;
        return this;
    }
    public String getArchType() {
        return this.archType;
    }

    public GetAgentDownloadUrlV2Request setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

}
