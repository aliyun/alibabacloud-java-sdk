// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SetQuotaRequest extends TeaModel {
    @NameInMap("TotalQuota")
    public Long totalQuota;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static SetQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetQuotaRequest self = new SetQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetQuotaRequest setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    public SetQuotaRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public SetQuotaRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
