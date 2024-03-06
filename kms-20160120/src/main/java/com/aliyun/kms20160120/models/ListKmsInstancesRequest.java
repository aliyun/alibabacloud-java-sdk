// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKmsInstancesRequest extends TeaModel {
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

    public static ListKmsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKmsInstancesRequest self = new ListKmsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListKmsInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKmsInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
