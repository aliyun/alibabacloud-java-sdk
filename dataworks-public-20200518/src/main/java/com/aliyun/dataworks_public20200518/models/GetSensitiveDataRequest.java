// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSensitiveDataRequest extends TeaModel {
    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static GetSensitiveDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDataRequest self = new GetSensitiveDataRequest();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSensitiveDataRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetSensitiveDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
