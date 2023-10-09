// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetTopicListRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Default value: 10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the instance to which the topics that you want to query belong.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the topic that you want to query.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static GetTopicListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTopicListRequest self = new GetTopicListRequest();
        return TeaModel.build(map, self);
    }

    public GetTopicListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public GetTopicListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTopicListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetTopicListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTopicListRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
