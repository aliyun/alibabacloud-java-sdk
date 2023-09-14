// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApplicationConfigsRequest extends TeaModel {
    /**
     * <p>应用名称。</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>配置文件名称。</p>
     */
    @NameInMap("ConfigFileName")
    public String configFileName;

    /**
     * <p>配置键值，支持模糊查询。</p>
     */
    @NameInMap("ConfigItemKey")
    public String configItemKey;

    /**
     * <p>配置项值。</p>
     */
    @NameInMap("ConfigItemValue")
    public String configItemValue;

    /**
     * <p>一次获取的最大记录数。取值范围：1~100。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>节点组ID。</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>节点ID。</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>区域ID。</p>
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
