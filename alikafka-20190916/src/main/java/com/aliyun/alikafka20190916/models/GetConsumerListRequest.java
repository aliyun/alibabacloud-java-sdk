// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerListRequest extends TeaModel {
    /**
     * <p>The name of the consumer group. If you do not configure this parameter, all consumer groups are queried.</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the instance to which the consumer group belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to be returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance to which the consumer group belongs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetConsumerListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerListRequest self = new GetConsumerListRequest();
        return TeaModel.build(map, self);
    }

    public GetConsumerListRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public GetConsumerListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetConsumerListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetConsumerListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetConsumerListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
