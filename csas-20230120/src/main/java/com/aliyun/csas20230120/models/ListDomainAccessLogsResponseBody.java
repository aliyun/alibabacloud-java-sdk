// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainAccessLogsResponseBody extends TeaModel {
    /**
     * <p>The list of access log records.</p>
     */
    @NameInMap("AccessLogs")
    public java.util.List<ListDomainAccessLogsResponseBodyAccessLogs> accessLogs;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019F68B6-A17E-5ECD-B053-820242E5ADBF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>122</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListDomainAccessLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainAccessLogsResponseBody self = new ListDomainAccessLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainAccessLogsResponseBody setAccessLogs(java.util.List<ListDomainAccessLogsResponseBodyAccessLogs> accessLogs) {
        this.accessLogs = accessLogs;
        return this;
    }
    public java.util.List<ListDomainAccessLogsResponseBodyAccessLogs> getAccessLogs() {
        return this.accessLogs;
    }

    public ListDomainAccessLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainAccessLogsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListDomainAccessLogsResponseBodyAccessLogs extends TeaModel {
        /**
         * <p>The action taken upon a rule hit.</p>
         * 
         * <strong>example:</strong>
         * <p>WhiteList</p>
         */
        @NameInMap("BlockAction")
        public String blockAction;

        /**
         * <p>The department.</p>
         * 
         * <strong>example:</strong>
         * <p>IT department</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The destination URL accessed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/a">https://www.example.com/a</a></p>
         */
        @NameInMap("DestAddress")
        public String destAddress;

        /**
         * <p>The event time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10 14:03:22</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <p>The Layer 4 protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("L4ProtocolType")
        public String l4ProtocolType;

        /**
         * <p>The name of the client process that initiated the access.</p>
         * 
         * <strong>example:</strong>
         * <p>chrome.exe</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4</p>
         */
        @NameInMap("RemoteAddress")
        public String remoteAddress;

        /**
         * <p>The destination domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("RemoteHost")
        public String remoteHost;

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("RemotePort")
        public String remotePort;

        /**
         * <p>The source address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.5</p>
         */
        @NameInMap("SrcAddress")
        public String srcAddress;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListDomainAccessLogsResponseBodyAccessLogs build(java.util.Map<String, ?> map) throws Exception {
            ListDomainAccessLogsResponseBodyAccessLogs self = new ListDomainAccessLogsResponseBodyAccessLogs();
            return TeaModel.build(map, self);
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setBlockAction(String blockAction) {
            this.blockAction = blockAction;
            return this;
        }
        public String getBlockAction() {
            return this.blockAction;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setDestAddress(String destAddress) {
            this.destAddress = destAddress;
            return this;
        }
        public String getDestAddress() {
            return this.destAddress;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setL4ProtocolType(String l4ProtocolType) {
            this.l4ProtocolType = l4ProtocolType;
            return this;
        }
        public String getL4ProtocolType() {
            return this.l4ProtocolType;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setRemoteAddress(String remoteAddress) {
            this.remoteAddress = remoteAddress;
            return this;
        }
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setRemoteHost(String remoteHost) {
            this.remoteHost = remoteHost;
            return this;
        }
        public String getRemoteHost() {
            return this.remoteHost;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setRemotePort(String remotePort) {
            this.remotePort = remotePort;
            return this;
        }
        public String getRemotePort() {
            return this.remotePort;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setSrcAddress(String srcAddress) {
            this.srcAddress = srcAddress;
            return this;
        }
        public String getSrcAddress() {
            return this.srcAddress;
        }

        public ListDomainAccessLogsResponseBodyAccessLogs setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
