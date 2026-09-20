// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiTestRequest extends TeaModel {
    /**
     * <p>The ID of the API to test.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The page size. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDataServiceApiTestRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiTestRequest self = new ListDataServiceApiTestRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiTestRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public ListDataServiceApiTestRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
