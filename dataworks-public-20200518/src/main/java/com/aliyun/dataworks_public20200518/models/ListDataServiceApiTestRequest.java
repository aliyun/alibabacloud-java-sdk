// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiTestRequest extends TeaModel {
    /**
     * <p>The ID of the DataService Studio API on which tests are performed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
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
