// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSDGStatusShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the AIC instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of SDGs that you want to query. By default, all SDGs are queried.</p>
     */
    @NameInMap("SDGIds")
    public String SDGIdsShrink;

    /**
     * <p>The deployment status of the SDG.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeInstanceSDGStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSDGStatusShrinkRequest self = new DescribeInstanceSDGStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSDGStatusShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceSDGStatusShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceSDGStatusShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceSDGStatusShrinkRequest setSDGIdsShrink(String SDGIdsShrink) {
        this.SDGIdsShrink = SDGIdsShrink;
        return this;
    }
    public String getSDGIdsShrink() {
        return this.SDGIdsShrink;
    }

    public DescribeInstanceSDGStatusShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
