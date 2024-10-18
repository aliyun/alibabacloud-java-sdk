// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableFileSystemsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Page starts from page 1. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAvailableFileSystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableFileSystemsRequest self = new ListAvailableFileSystemsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableFileSystemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAvailableFileSystemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
