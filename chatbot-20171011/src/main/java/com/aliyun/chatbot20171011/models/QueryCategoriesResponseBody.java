// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryCategoriesResponseBody extends TeaModel {
    @NameInMap("Categories")
    public java.util.List<Children> categories;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCategoriesResponseBody self = new QueryCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCategoriesResponseBody setCategories(java.util.List<Children> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<Children> getCategories() {
        return this.categories;
    }

    public QueryCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
