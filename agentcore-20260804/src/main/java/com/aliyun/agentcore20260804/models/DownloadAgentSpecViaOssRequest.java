// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DownloadAgentSpecViaOssRequest extends TeaModel {
    /**
     * <p>The version number. If not specified, the version corresponding to the latest label is downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("agentSpecVersion")
    public String agentSpecVersion;

    public static DownloadAgentSpecViaOssRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadAgentSpecViaOssRequest self = new DownloadAgentSpecViaOssRequest();
        return TeaModel.build(map, self);
    }

    public DownloadAgentSpecViaOssRequest setAgentSpecVersion(String agentSpecVersion) {
        this.agentSpecVersion = agentSpecVersion;
        return this;
    }
    public String getAgentSpecVersion() {
        return this.agentSpecVersion;
    }

}
