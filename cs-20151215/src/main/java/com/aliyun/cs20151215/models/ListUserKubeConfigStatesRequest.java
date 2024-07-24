// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListUserKubeConfigStatesRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <ul>
     * <li>Valid values: ≥ 1.</li>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("page_number")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Value values: 1 to 100.</li>
     * <li>Default value: 50.</li>
     * </ul>
     * 
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
