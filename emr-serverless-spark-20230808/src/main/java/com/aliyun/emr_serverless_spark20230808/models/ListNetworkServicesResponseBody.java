// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListNetworkServicesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A list of network connections.</p>
     */
    @NameInMap("networkServices")
    public java.util.List<ListNetworkServicesResponseBodyNetworkServices> networkServices;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("queues")
    public java.util.List<ListNetworkServicesResponseBodyQueues> queues;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18C7775A-7995-128A-A10C-9116EA87****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListNetworkServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkServicesResponseBody self = new ListNetworkServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkServicesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNetworkServicesResponseBody setNetworkServices(java.util.List<ListNetworkServicesResponseBodyNetworkServices> networkServices) {
        this.networkServices = networkServices;
        return this;
    }
    public java.util.List<ListNetworkServicesResponseBodyNetworkServices> getNetworkServices() {
        return this.networkServices;
    }

    public ListNetworkServicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNetworkServicesResponseBody setQueues(java.util.List<ListNetworkServicesResponseBodyQueues> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<ListNetworkServicesResponseBodyQueues> getQueues() {
        return this.queues;
    }

    public ListNetworkServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNetworkServicesResponseBodyNetworkServicesStateChangeReason extends TeaModel {
        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The message that provides details about the state change.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        @NameInMap("message")
        public String message;

        public static ListNetworkServicesResponseBodyNetworkServicesStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkServicesResponseBodyNetworkServicesStateChangeReason self = new ListNetworkServicesResponseBodyNetworkServicesStateChangeReason();
            return TeaModel.build(map, self);
        }

        public ListNetworkServicesResponseBodyNetworkServicesStateChangeReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListNetworkServicesResponseBodyNetworkServicesStateChangeReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListNetworkServicesResponseBodyNetworkServices extends TeaModel {
        /**
         * <p>The name of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>ns-d7a1d02045fb****</p>
         */
        @NameInMap("networkServiceId")
        public String networkServiceId;

        /**
         * <p>The state of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The reason for the state change.</p>
         */
        @NameInMap("stateChangeReason")
        public ListNetworkServicesResponseBodyNetworkServicesStateChangeReason stateChangeReason;

        /**
         * <p>The type of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>NetworkService</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vt6r7o1w4tw7j6****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The list of vSwitch IDs.</p>
         */
        @NameInMap("vswitchIds")
        public java.util.List<String> vswitchIds;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListNetworkServicesResponseBodyNetworkServices build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkServicesResponseBodyNetworkServices self = new ListNetworkServicesResponseBodyNetworkServices();
            return TeaModel.build(map, self);
        }

        public ListNetworkServicesResponseBodyNetworkServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNetworkServicesResponseBodyNetworkServices setNetworkServiceId(String networkServiceId) {
            this.networkServiceId = networkServiceId;
            return this;
        }
        public String getNetworkServiceId() {
            return this.networkServiceId;
        }

        public ListNetworkServicesResponseBodyNetworkServices setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListNetworkServicesResponseBodyNetworkServices setStateChangeReason(ListNetworkServicesResponseBodyNetworkServicesStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }
        public ListNetworkServicesResponseBodyNetworkServicesStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        public ListNetworkServicesResponseBodyNetworkServices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNetworkServicesResponseBodyNetworkServices setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNetworkServicesResponseBodyNetworkServices setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public ListNetworkServicesResponseBodyNetworkServices setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListNetworkServicesResponseBodyQueuesStateChangeReason extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        @NameInMap("message")
        public String message;

        public static ListNetworkServicesResponseBodyQueuesStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkServicesResponseBodyQueuesStateChangeReason self = new ListNetworkServicesResponseBodyQueuesStateChangeReason();
            return TeaModel.build(map, self);
        }

        public ListNetworkServicesResponseBodyQueuesStateChangeReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListNetworkServicesResponseBodyQueuesStateChangeReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListNetworkServicesResponseBodyQueues extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>ns-d7a1d02045fb****</p>
         */
        @NameInMap("networkServiceId")
        public String networkServiceId;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("stateChangeReason")
        public ListNetworkServicesResponseBodyQueuesStateChangeReason stateChangeReason;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>NetworkService</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6k2anfa9nzbm4cj****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("vswitchIds")
        public java.util.List<String> vswitchIds;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListNetworkServicesResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkServicesResponseBodyQueues self = new ListNetworkServicesResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public ListNetworkServicesResponseBodyQueues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNetworkServicesResponseBodyQueues setNetworkServiceId(String networkServiceId) {
            this.networkServiceId = networkServiceId;
            return this;
        }
        public String getNetworkServiceId() {
            return this.networkServiceId;
        }

        public ListNetworkServicesResponseBodyQueues setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListNetworkServicesResponseBodyQueues setStateChangeReason(ListNetworkServicesResponseBodyQueuesStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }
        public ListNetworkServicesResponseBodyQueuesStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        public ListNetworkServicesResponseBodyQueues setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNetworkServicesResponseBodyQueues setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNetworkServicesResponseBodyQueues setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public ListNetworkServicesResponseBodyQueues setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
