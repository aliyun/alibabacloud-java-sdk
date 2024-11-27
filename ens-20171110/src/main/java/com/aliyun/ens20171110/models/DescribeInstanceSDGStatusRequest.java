// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSDGStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SDGIds")
    public java.util.List<String> SDGIds;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeInstanceSDGStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSDGStatusRequest self = new DescribeInstanceSDGStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSDGStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceSDGStatusRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceSDGStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceSDGStatusRequest setSDGIds(java.util.List<String> SDGIds) {
        this.SDGIds = SDGIds;
        return this;
    }
    public java.util.List<String> getSDGIds() {
        return this.SDGIds;
    }

    public DescribeInstanceSDGStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
