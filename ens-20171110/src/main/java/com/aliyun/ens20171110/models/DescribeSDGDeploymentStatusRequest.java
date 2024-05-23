// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGDeploymentStatusRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the SDG.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static DescribeSDGDeploymentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGDeploymentStatusRequest self = new DescribeSDGDeploymentStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDGDeploymentStatusRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSDGDeploymentStatusRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSDGDeploymentStatusRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
