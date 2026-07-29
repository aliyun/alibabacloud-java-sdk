// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeNetworkLayerInterceptsResponseBody extends TeaModel {
    /**
     * <p>The number of interception log records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InterceptionRecordCount")
    public Long interceptionRecordCount;

    /**
     * <p>The interception record details.</p>
     */
    @NameInMap("InterceptionRecords")
    public java.util.List<DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords> interceptionRecords;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B4B379C2-9319-4C6B-B579-FE36831B09F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of interception logs that match the current filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>17</p>
     */
    @NameInMap("TotalCnt")
    public String totalCnt;

    public static DescribeNetworkLayerInterceptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkLayerInterceptsResponseBody self = new DescribeNetworkLayerInterceptsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkLayerInterceptsResponseBody setInterceptionRecordCount(Long interceptionRecordCount) {
        this.interceptionRecordCount = interceptionRecordCount;
        return this;
    }
    public Long getInterceptionRecordCount() {
        return this.interceptionRecordCount;
    }

    public DescribeNetworkLayerInterceptsResponseBody setInterceptionRecords(java.util.List<DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords> interceptionRecords) {
        this.interceptionRecords = interceptionRecords;
        return this;
    }
    public java.util.List<DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords> getInterceptionRecords() {
        return this.interceptionRecords;
    }

    public DescribeNetworkLayerInterceptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkLayerInterceptsResponseBody setTotalCnt(String totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public String getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords extends TeaModel {
        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.254.56.252</p>
         */
        @NameInMap("DestinationIp")
        public String destinationIp;

        /**
         * <p>The destination port in the interception log.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("DestinationPort")
        public String destinationPort;

        /**
         * <p>The interception action.</p>
         * 
         * <strong>example:</strong>
         * <p>drop</p>
         */
        @NameInMap("InterceptAction")
        public String interceptAction;

        /**
         * <p>The number of interceptions within the specified time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InterceptCount")
        public Long interceptCount;

        /**
         * <p>The end time of the interception.</p>
         * <blockquote>
         * <p>The value is a Unix/POSIX timestamp. Unit: seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1778830500</p>
         */
        @NameInMap("InterceptEndTime")
        public Long interceptEndTime;

        /**
         * <p>The packet interception module.</p>
         * 
         * <strong>example:</strong>
         * <p>dip_blacklist</p>
         */
        @NameInMap("InterceptModule")
        public String interceptModule;

        /**
         * <p>The start time of the interception.</p>
         * <blockquote>
         * <p>The value is a Unix/POSIX timestamp. Unit: seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1778830500</p>
         */
        @NameInMap("InterceptStartTime")
        public Long interceptStartTime;

        /**
         * <p>The network protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("NetworkProtocol")
        public String networkProtocol;

        /**
         * <p>The network protocol number. This is a standard network protocol number.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("ProtocolNumber")
        public String protocolNumber;

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>183.224.38.37</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <p>The source port in the interception log.</p>
         * 
         * <strong>example:</strong>
         * <p>9998</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        public static DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords self = new DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setDestinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public String getDestinationIp() {
            return this.destinationIp;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setDestinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public String getDestinationPort() {
            return this.destinationPort;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setInterceptAction(String interceptAction) {
            this.interceptAction = interceptAction;
            return this;
        }
        public String getInterceptAction() {
            return this.interceptAction;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setInterceptCount(Long interceptCount) {
            this.interceptCount = interceptCount;
            return this;
        }
        public Long getInterceptCount() {
            return this.interceptCount;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setInterceptEndTime(Long interceptEndTime) {
            this.interceptEndTime = interceptEndTime;
            return this;
        }
        public Long getInterceptEndTime() {
            return this.interceptEndTime;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setInterceptModule(String interceptModule) {
            this.interceptModule = interceptModule;
            return this;
        }
        public String getInterceptModule() {
            return this.interceptModule;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setInterceptStartTime(Long interceptStartTime) {
            this.interceptStartTime = interceptStartTime;
            return this;
        }
        public Long getInterceptStartTime() {
            return this.interceptStartTime;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setNetworkProtocol(String networkProtocol) {
            this.networkProtocol = networkProtocol;
            return this;
        }
        public String getNetworkProtocol() {
            return this.networkProtocol;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setProtocolNumber(String protocolNumber) {
            this.protocolNumber = protocolNumber;
            return this;
        }
        public String getProtocolNumber() {
            return this.protocolNumber;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeNetworkLayerInterceptsResponseBodyInterceptionRecords setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

    }

}
