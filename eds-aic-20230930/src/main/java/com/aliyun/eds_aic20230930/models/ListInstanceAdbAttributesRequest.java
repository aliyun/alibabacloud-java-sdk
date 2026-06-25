// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ListInstanceAdbAttributesRequest extends TeaModel {
    /**
     * <p>The public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>106.38.188.223</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>The list of cloud phone instance IDs. You can specify from 1 to 100 IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.3.23</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The ADB port number.</p>
     * 
     * <strong>example:</strong>
     * <p>5555</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The network protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The maximum number of records to return on each page for a paged query. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that indicates the position from which the query starts. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListInstanceAdbAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAdbAttributesRequest self = new ListInstanceAdbAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceAdbAttributesRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public ListInstanceAdbAttributesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstanceAdbAttributesRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public ListInstanceAdbAttributesRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public ListInstanceAdbAttributesRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ListInstanceAdbAttributesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceAdbAttributesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
