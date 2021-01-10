// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListConnectorsRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Lang")
    public String lang;

    public static ListConnectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsRequest self = new ListConnectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectorsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListConnectorsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
