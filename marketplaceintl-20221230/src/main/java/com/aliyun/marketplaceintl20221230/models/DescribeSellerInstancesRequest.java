// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class DescribeSellerInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5000002763123</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <strong>example:</strong>
     * <p>OPENED</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>5322460655123456</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static DescribeSellerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSellerInstancesRequest self = new DescribeSellerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSellerInstancesRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribeSellerInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeSellerInstancesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DescribeSellerInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSellerInstancesRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
