// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIvrTrackingDetailsResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListIvrTrackingDetailsResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D2RB671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListIvrTrackingDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIvrTrackingDetailsResponseBody self = new ListIvrTrackingDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIvrTrackingDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIvrTrackingDetailsResponseBody setData(ListIvrTrackingDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIvrTrackingDetailsResponseBodyData getData() {
        return this.data;
    }

    public ListIvrTrackingDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIvrTrackingDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIvrTrackingDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIvrTrackingDetailsResponseBodyDataList extends TeaModel {
        /**
         * <p>Callee number.</p>
         * 
         * <strong>example:</strong>
         * <p>0533128****</p>
         */
        @NameInMap("Callee")
        public String callee;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>1332315****</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <p>Voice channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>65cp2c15-92ac-4e67-98b2-073a3c541c5d</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>Channel-associated data.</p>
         * 
         * <strong>example:</strong>
         * <p>A=B;C=D</p>
         */
        @NameInMap("ChannelVariables")
        public String channelVariables;

        /**
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-10963442671187****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The time when the call entered this IVR edge zone, in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1621910542876</p>
         */
        @NameInMap("EnterTime")
        public Long enterTime;

        /**
         * <p>Contact flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc99462-1058-47d0-a114-f145ea7444ff</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The name of the contact flow.</p>
         * 
         * <strong>example:</strong>
         * <p>测试IVR</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("Instance")
        public String instance;

        /**
         * <p>Time when leaving this IVR node.</p>
         * 
         * <strong>example:</strong>
         * <p>1621910545105</p>
         */
        @NameInMap("LeaveTime")
        public Long leaveTime;

        /**
         * <p>Status code of the edge zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("NodeExitCode")
        public String nodeExitCode;

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e0bc19a3</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Edge zone name.</p>
         * 
         * <strong>example:</strong>
         * <p>放音</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>A collection of properties of the edge zone.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;say&quot;:&quot;您好。&quot;}</p>
         */
        @NameInMap("NodeProperties")
        public java.util.Map<String, ?> nodeProperties;

        /**
         * <p>File Type.</p>
         * 
         * <strong>example:</strong>
         * <p>PLAY_SAY</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>Node variables.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;digits&quot;:&quot;2&quot;}</p>
         */
        @NameInMap("NodeVariables")
        public java.util.Map<String, ?> nodeVariables;

        public static ListIvrTrackingDetailsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListIvrTrackingDetailsResponseBodyDataList self = new ListIvrTrackingDetailsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListIvrTrackingDetailsResponseBodyDataList setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setChannelVariables(String channelVariables) {
            this.channelVariables = channelVariables;
            return this;
        }
        public String getChannelVariables() {
            return this.channelVariables;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setEnterTime(Long enterTime) {
            this.enterTime = enterTime;
            return this;
        }
        public Long getEnterTime() {
            return this.enterTime;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setLeaveTime(Long leaveTime) {
            this.leaveTime = leaveTime;
            return this;
        }
        public Long getLeaveTime() {
            return this.leaveTime;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeExitCode(String nodeExitCode) {
            this.nodeExitCode = nodeExitCode;
            return this;
        }
        public String getNodeExitCode() {
            return this.nodeExitCode;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeProperties(java.util.Map<String, ?> nodeProperties) {
            this.nodeProperties = nodeProperties;
            return this;
        }
        public java.util.Map<String, ?> getNodeProperties() {
            return this.nodeProperties;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeVariables(java.util.Map<String, ?> nodeVariables) {
            this.nodeVariables = nodeVariables;
            return this;
        }
        public java.util.Map<String, ?> getNodeVariables() {
            return this.nodeVariables;
        }

    }

    public static class ListIvrTrackingDetailsResponseBodyData extends TeaModel {
        /**
         * <p>List of IVR tracking details.</p>
         */
        @NameInMap("List")
        public java.util.List<ListIvrTrackingDetailsResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListIvrTrackingDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIvrTrackingDetailsResponseBodyData self = new ListIvrTrackingDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIvrTrackingDetailsResponseBodyData setList(java.util.List<ListIvrTrackingDetailsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListIvrTrackingDetailsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListIvrTrackingDetailsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIvrTrackingDetailsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIvrTrackingDetailsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
