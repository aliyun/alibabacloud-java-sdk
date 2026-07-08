// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class ListCategoriesResponseBody extends TeaModel {
    /**
     * <p>The returned category list</p>
     */
    @NameInMap("data")
    public java.util.List<Category> data;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>request ID</p>
     * 
     * <strong>example:</strong>
     * <p>099A671E-FA21-5A36-8A73-918572DDEF53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesResponseBody self = new ListCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCategoriesResponseBody setData(java.util.List<Category> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Category> getData() {
        return this.data;
    }

    public ListCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
