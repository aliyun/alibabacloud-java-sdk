// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListFileSystemWithMountTargetsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListFileSystemWithMountTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileSystemWithMountTargetsRequest self = new ListFileSystemWithMountTargetsRequest();
        return TeaModel.build(map, self);
    }

    public ListFileSystemWithMountTargetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFileSystemWithMountTargetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
