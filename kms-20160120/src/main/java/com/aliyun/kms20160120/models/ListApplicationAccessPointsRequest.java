// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListApplicationAccessPointsRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListApplicationAccessPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAccessPointsRequest self = new ListApplicationAccessPointsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationAccessPointsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationAccessPointsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
