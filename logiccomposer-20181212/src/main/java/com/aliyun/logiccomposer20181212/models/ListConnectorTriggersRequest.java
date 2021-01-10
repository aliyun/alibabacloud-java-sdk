// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListConnectorTriggersRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Lang")
    public String lang;

    public static ListConnectorTriggersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorTriggersRequest self = new ListConnectorTriggersRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectorTriggersRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListConnectorTriggersRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
