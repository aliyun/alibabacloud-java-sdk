// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaRequest extends TeaModel {
    /**
     * <p>The tags. Tags are used to filter services.</p>
     * <br>
     * <p>You can filter services only by the tag whose `name` is `product`. Example: {"name":"product","value":"ECS"}.</p>
     * <br>
     * <p>> We recommend that you do not use the special tags in the CloudMonitor console.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 10000.</p>
     * <br>
     * <p>Default value: 30.</p>
     * <br>
     * <p>> The value of this parameter is not limited. You can view a large number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeProjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaRequest self = new DescribeProjectMetaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMetaRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public DescribeProjectMetaRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectMetaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
