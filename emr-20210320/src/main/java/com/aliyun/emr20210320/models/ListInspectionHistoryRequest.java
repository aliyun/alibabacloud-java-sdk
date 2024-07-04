// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListInspectionHistoryRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>组件名称</p>
     */
    @NameInMap("Component")
    public String component;

    /**
     * <p>节点id</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>地域ID。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>服务名称</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>巡检历史类型 application/component</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListInspectionHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionHistoryRequest self = new ListInspectionHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListInspectionHistoryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListInspectionHistoryRequest setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public ListInspectionHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInspectionHistoryRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListInspectionHistoryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInspectionHistoryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInspectionHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInspectionHistoryRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ListInspectionHistoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
