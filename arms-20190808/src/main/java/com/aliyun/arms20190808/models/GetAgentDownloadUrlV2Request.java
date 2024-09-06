// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JavaAgent</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <strong>example:</strong>
     * <p>amd64</p>
     */
    @NameInMap("ArchType")
    public String archType;

    /**
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
