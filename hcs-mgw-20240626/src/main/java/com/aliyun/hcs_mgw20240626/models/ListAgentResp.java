// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListAgentResp extends TeaModel {
    @NameInMap("ImportAgent")
    public java.util.List<GetAgentResp> importAgent;

    /**
     * <strong>example:</strong>
     * <your-next-agent-name>
     */
    @NameInMap("NextMarker")
    public String nextMarker;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Truncated")
    public Boolean truncated;

    public static ListAgentResp build(java.util.Map<String, ?> map) throws Exception {
        ListAgentResp self = new ListAgentResp();
        return TeaModel.build(map, self);
    }

    public ListAgentResp setImportAgent(java.util.List<GetAgentResp> importAgent) {
        this.importAgent = importAgent;
        return this;
    }
    public java.util.List<GetAgentResp> getImportAgent() {
        return this.importAgent;
    }

    public ListAgentResp setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListAgentResp setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

}
