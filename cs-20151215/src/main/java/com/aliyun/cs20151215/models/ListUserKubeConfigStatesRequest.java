// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListUserKubeConfigStatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("page_number")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    public static ListUserKubeConfigStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserKubeConfigStatesRequest self = new ListUserKubeConfigStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserKubeConfigStatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserKubeConfigStatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
