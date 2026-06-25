// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodesRequest extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp-bp17psa7fhxqmm*****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method. Only the subscription billing method is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The maximum number of entries to return on each page for a paged query. The maximum value is 100. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The token for the next query. If a query does not return all results, NextToken is not empty. Use the returned NextToken in your next query to continue.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>A list of Cloud Phone matrix IDs.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>The name of the Cloud Phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>node_name</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("NodeNameList")
    public java.util.List<String> nodeNameList;

    /**
     * <p>The instance type of the Cloud Phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>cpm.gx7.10xlarge</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    /**
     * <p>The status of the Cloud Phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<DescribeCloudPhoneNodesRequestTags> tags;

    public static DescribeCloudPhoneNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodesRequest self = new DescribeCloudPhoneNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodesRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public DescribeCloudPhoneNodesRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeCloudPhoneNodesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeCloudPhoneNodesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public DescribeCloudPhoneNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudPhoneNodesRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public DescribeCloudPhoneNodesRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeCloudPhoneNodesRequest setNodeNameList(java.util.List<String> nodeNameList) {
        this.nodeNameList = nodeNameList;
        return this;
    }
    public java.util.List<String> getNodeNameList() {
        return this.nodeNameList;
    }

    public DescribeCloudPhoneNodesRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

    public DescribeCloudPhoneNodesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCloudPhoneNodesRequest setTags(java.util.List<DescribeCloudPhoneNodesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeCloudPhoneNodesRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeCloudPhoneNodesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCloudPhoneNodesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodesRequestTags self = new DescribeCloudPhoneNodesRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCloudPhoneNodesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
