// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeNetworkLayerInterceptsRequest extends TeaModel {
    /**
     * <p>The destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.118.170.18</p>
     */
    @NameInMap("DestinationIp")
    public String destinationIp;

    /**
     * <p>The destination port.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("DestinationPort")
    public Long destinationPort;

    /**
     * <p>The end time of the DDoS attack event to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1563445054</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID of the Anti-DDoS Origin instance to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-z2q1qzxb****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The network protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("NetworkProtocol")
    public String networkProtocol;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>Settings for the number of interception logs to return on each page when you perform a paged query. Paging is used to return results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The network protocol number. This is a standard network protocol number.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ProtocolNumber")
    public Long protocolNumber;

    /**
     * <p>The source port.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>37.60.241.154</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>The start time of the DDoS attack event to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1557305044</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeNetworkLayerInterceptsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkLayerInterceptsRequest self = new DescribeNetworkLayerInterceptsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkLayerInterceptsRequest setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public DescribeNetworkLayerInterceptsRequest setDestinationPort(Long destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }
    public Long getDestinationPort() {
        return this.destinationPort;
    }

    public DescribeNetworkLayerInterceptsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeNetworkLayerInterceptsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkLayerInterceptsRequest setNetworkProtocol(String networkProtocol) {
        this.networkProtocol = networkProtocol;
        return this;
    }
    public String getNetworkProtocol() {
        return this.networkProtocol;
    }

    public DescribeNetworkLayerInterceptsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeNetworkLayerInterceptsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkLayerInterceptsRequest setProtocolNumber(Long protocolNumber) {
        this.protocolNumber = protocolNumber;
        return this;
    }
    public Long getProtocolNumber() {
        return this.protocolNumber;
    }

    public DescribeNetworkLayerInterceptsRequest setSourcePort(Long sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Long getSourcePort() {
        return this.sourcePort;
    }

    public DescribeNetworkLayerInterceptsRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public DescribeNetworkLayerInterceptsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
