// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectTemplatesRequest extends TeaModel {
    // 模板类型
    @NameInMap("category")
    public String category;

    public static ListProjectTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectTemplatesRequest self = new ListProjectTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectTemplatesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

}
