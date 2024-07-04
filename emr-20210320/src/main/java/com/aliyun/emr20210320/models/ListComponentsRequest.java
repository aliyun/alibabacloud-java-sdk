// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentsRequest extends TeaModel {
    /**
     * <p>应用名称列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;HDFS&quot;]</p>
     */
    @NameInMap("ApplicationNames")
    public java.util.List<String> applicationNames;

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
     * <p>组件名称列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;DataNode&quot;]</p>
     */
    @NameInMap("ComponentNames")
    public java.util.List<String> componentNames;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ComponentStates")
    public java.util.List<String> componentStates;

    /**
     * <p>是否包含过期配置。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeExpiredConfig")
    public Boolean includeExpiredConfig;

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
     * <p>地域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsRequest self = new ListComponentsRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentsRequest setApplicationNames(java.util.List<String> applicationNames) {
        this.applicationNames = applicationNames;
        return this;
    }
    public java.util.List<String> getApplicationNames() {
        return this.applicationNames;
    }

    public ListComponentsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListComponentsRequest setComponentNames(java.util.List<String> componentNames) {
        this.componentNames = componentNames;
        return this;
    }
    public java.util.List<String> getComponentNames() {
        return this.componentNames;
    }

    public ListComponentsRequest setComponentStates(java.util.List<String> componentStates) {
        this.componentStates = componentStates;
        return this;
    }
    public java.util.List<String> getComponentStates() {
        return this.componentStates;
    }

    public ListComponentsRequest setIncludeExpiredConfig(Boolean includeExpiredConfig) {
        this.includeExpiredConfig = includeExpiredConfig;
        return this;
    }
    public Boolean getIncludeExpiredConfig() {
        return this.includeExpiredConfig;
    }

    public ListComponentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComponentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComponentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
