// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListAgentResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAgentResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentResponseBody self = new ListAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentResponseBody setData(java.util.List<ListAgentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentResponseBodyData> getData() {
        return this.data;
    }

    public ListAgentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAgentResponseBodyData extends TeaModel {
        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("AgentKey")
        public String agentKey;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("InstanceInfos")
        public java.util.Map<String, ?> instanceInfos;

        public static ListAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentResponseBodyData self = new ListAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public ListAgentResponseBodyData setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public ListAgentResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentResponseBodyData setInstanceInfos(java.util.Map<String, ?> instanceInfos) {
            this.instanceInfos = instanceInfos;
            return this;
        }
        public java.util.Map<String, ?> getInstanceInfos() {
            return this.instanceInfos;
        }

    }

}
