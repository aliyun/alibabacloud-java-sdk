// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ListFaceGroupsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListFaceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFaceGroupsRequest self = new ListFaceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListFaceGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFaceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
