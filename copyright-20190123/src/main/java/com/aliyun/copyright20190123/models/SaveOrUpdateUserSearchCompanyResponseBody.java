// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SaveOrUpdateUserSearchCompanyResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static SaveOrUpdateUserSearchCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdateUserSearchCompanyResponseBody self = new SaveOrUpdateUserSearchCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdateUserSearchCompanyResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveOrUpdateUserSearchCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
