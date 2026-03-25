// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSecretReferencesRequest extends TeaModel {
    /**
     * <p>The page number. The value starts from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListSecretReferencesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretReferencesRequest self = new ListSecretReferencesRequest();
        return TeaModel.build(map, self);
    }

    public ListSecretReferencesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSecretReferencesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
