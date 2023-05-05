// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAllAppCategoryRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    public static ListAllAppCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllAppCategoryRequest self = new ListAllAppCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListAllAppCategoryRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
