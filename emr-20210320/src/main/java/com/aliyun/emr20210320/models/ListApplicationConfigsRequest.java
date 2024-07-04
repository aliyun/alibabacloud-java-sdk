// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApplicationConfigsRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-e6a9d46e9267****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the configuration file.</p>
     * 
     * <strong>example:</strong>
     * <p>hdfs-site.xml</p>
     */
    @NameInMap("ConfigFileName")
    public String configFileName;

    /**
     * <p>The name of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>dfs.replication</p>
     */
    @NameInMap("ConfigItemKey")
    public String configItemKey;

    /**
     * <p>The value of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ConfigItemValue")
    public String configItemValue;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The page number of the next page returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-d555335ced5c****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp10h9rezawz1i4o****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListApplicationConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationConfigsRequest self = new ListApplicationConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationConfigsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListApplicationConfigsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListApplicationConfigsRequest setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public ListApplicationConfigsRequest setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public ListApplicationConfigsRequest setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
        return this;
    }
    public String getConfigItemValue() {
        return this.configItemValue;
    }

    public ListApplicationConfigsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationConfigsRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListApplicationConfigsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListApplicationConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
