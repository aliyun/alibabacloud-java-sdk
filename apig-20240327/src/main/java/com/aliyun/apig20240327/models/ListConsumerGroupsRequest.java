// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerGroupsRequest extends TeaModel {
    /**
     * <p>The gateway type. Valid values: API and AI. Note: This parameter is actually required. If it is not provided, the API returns InvalidParameter.IsEmpty(400) &quot;Parameter gatewayType should not be empty.&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The fuzzy match condition for the consumer group name.</p>
     * 
     * <strong>example:</strong>
     * <p>api</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListConsumerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupsRequest self = new ListConsumerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupsRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListConsumerGroupsRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListConsumerGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumerGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
