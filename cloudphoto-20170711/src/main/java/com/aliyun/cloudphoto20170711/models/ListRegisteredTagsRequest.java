// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListRegisteredTagsRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("Lang")
    public java.util.List<String> lang;

    public static ListRegisteredTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegisteredTagsRequest self = new ListRegisteredTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListRegisteredTagsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ListRegisteredTagsRequest setLang(java.util.List<String> lang) {
        this.lang = lang;
        return this;
    }
    public java.util.List<String> getLang() {
        return this.lang;
    }

}
