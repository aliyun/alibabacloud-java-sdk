// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceExtRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page. For example, to query the returned results on the first page, set the value to **1**.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeInstanceExtRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceExtRequest self = new DescribeInstanceExtRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceExtRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceExtRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceExtRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
