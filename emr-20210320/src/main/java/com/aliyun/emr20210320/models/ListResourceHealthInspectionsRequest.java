// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListResourceHealthInspectionsRequest extends TeaModel {
    /**
     * <p>应用名称。</p>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>集群ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>组件名称。</p>
     * 
     * <strong>example:</strong>
     * <p>DataNode</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>健康状态。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;BAD&quot;]</p>
     */
    @NameInMap("HealthStatuses")
    public java.util.List<String> healthStatuses;

    /**
     * <p>语言</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>一次获取的最大记录数。取值范围：1~100。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>节点Id列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp14l5n4v46uxsscl033&quot;]</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>节点名称列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;core1-1&quot;]</p>
     */
    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>地域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>查询的目标资源类型，合法值：</p>
     * <p>
     * - APPLICATION
     * <p>
     * - COMPONENT
     * <p>
     * - COMPONENT_INSTANCE
     * <p>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListResourceHealthInspectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthInspectionsRequest self = new ListResourceHealthInspectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthInspectionsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListResourceHealthInspectionsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListResourceHealthInspectionsRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ListResourceHealthInspectionsRequest setHealthStatuses(java.util.List<String> healthStatuses) {
        this.healthStatuses = healthStatuses;
        return this;
    }
    public java.util.List<String> getHealthStatuses() {
        return this.healthStatuses;
    }

    public ListResourceHealthInspectionsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListResourceHealthInspectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceHealthInspectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceHealthInspectionsRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ListResourceHealthInspectionsRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public ListResourceHealthInspectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListResourceHealthInspectionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
