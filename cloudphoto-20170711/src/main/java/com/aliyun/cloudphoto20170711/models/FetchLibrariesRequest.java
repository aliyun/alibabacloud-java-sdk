// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchLibrariesRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("NeedQuota")
    public Boolean needQuota;

    public static FetchLibrariesRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchLibrariesRequest self = new FetchLibrariesRequest();
        return TeaModel.build(map, self);
    }

    public FetchLibrariesRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public FetchLibrariesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public FetchLibrariesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public FetchLibrariesRequest setNeedQuota(Boolean needQuota) {
        this.needQuota = needQuota;
        return this;
    }
    public Boolean getNeedQuota() {
        return this.needQuota;
    }

}
