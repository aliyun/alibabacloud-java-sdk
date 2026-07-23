// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListAgentsResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values: Success: The operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListAgentsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to list agents</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7DA60DED-CD36-5837-B848-C01A23D2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns true if the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsResponseBody self = new ListAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentsResponseBody setData(ListAgentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAgentsResponseBodyData getData() {
        return this.data;
    }

    public ListAgentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentsResponseBodyData extends TeaModel {
        /**
         * <p>The list of agents.</p>
         */
        @NameInMap("Agents")
        public java.util.List<Agent> agents;

        /**
         * <p>The ID of the first record.</p>
         * 
         * <strong>example:</strong>
         * <p>uat-agent</p>
         */
        @NameInMap("FirstId")
        public String firstId;

        /**
         * <p>Indicates whether more pages are available. Valid values:</p>
         * <ul>
         * <li><p>true: More pages are available.</p>
         * </li>
         * <li><p>false: No more pages are available.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public String hasMore;

        /**
         * <p>The ID of the last record.</p>
         * 
         * <strong>example:</strong>
         * <p>last-agent</p>
         */
        @NameInMap("LastId")
        public String lastId;

        public static ListAgentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyData self = new ListAgentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyData setAgents(java.util.List<Agent> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<Agent> getAgents() {
            return this.agents;
        }

        public ListAgentsResponseBodyData setFirstId(String firstId) {
            this.firstId = firstId;
            return this;
        }
        public String getFirstId() {
            return this.firstId;
        }

        public ListAgentsResponseBodyData setHasMore(String hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public String getHasMore() {
            return this.hasMore;
        }

        public ListAgentsResponseBodyData setLastId(String lastId) {
            this.lastId = lastId;
            return this;
        }
        public String getLastId() {
            return this.lastId;
        }

    }

}
