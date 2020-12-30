// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetQuotaRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static GetQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaRequest self = new GetQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public GetQuotaRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
