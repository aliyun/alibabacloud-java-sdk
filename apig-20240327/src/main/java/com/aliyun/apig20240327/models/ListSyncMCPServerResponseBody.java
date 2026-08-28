// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSyncMCPServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListSyncMCPServerResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>211B1C7E-DD93-58D3-AA4B-9B392B63258C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSyncMCPServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSyncMCPServerResponseBody self = new ListSyncMCPServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSyncMCPServerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSyncMCPServerResponseBody setData(ListSyncMCPServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSyncMCPServerResponseBodyData getData() {
        return this.data;
    }

    public ListSyncMCPServerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSyncMCPServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSyncMCPServerResponseBodyData extends TeaModel {
        @NameInMap("domainIds")
        public java.util.List<String> domainIds;

        @NameInMap("mcpServers")
        public java.util.List<String> mcpServers;

        public static ListSyncMCPServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSyncMCPServerResponseBodyData self = new ListSyncMCPServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSyncMCPServerResponseBodyData setDomainIds(java.util.List<String> domainIds) {
            this.domainIds = domainIds;
            return this;
        }
        public java.util.List<String> getDomainIds() {
            return this.domainIds;
        }

        public ListSyncMCPServerResponseBodyData setMcpServers(java.util.List<String> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<String> getMcpServers() {
            return this.mcpServers;
        }

    }

}
