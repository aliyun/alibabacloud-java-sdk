// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListManagedDataKeyVersionsRequest extends TeaModel {
    /**
     * <p>The name of the managed data key (DK) to query. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-data-key</p>
     */
    @NameInMap("DataKeyName")
    public String dataKeyName;

    /**
     * <p>The page number. The value must be an integer greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListManagedDataKeyVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManagedDataKeyVersionsRequest self = new ListManagedDataKeyVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListManagedDataKeyVersionsRequest setDataKeyName(String dataKeyName) {
        this.dataKeyName = dataKeyName;
        return this;
    }
    public String getDataKeyName() {
        return this.dataKeyName;
    }

    public ListManagedDataKeyVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListManagedDataKeyVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
