// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceCategoriesResponseBody extends TeaModel {
    /**
     * <p>The category list of the service.</p>
     */
    @NameInMap("Categories")
    public java.util.List<String> categories;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListServiceCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceCategoriesResponseBody self = new ListServiceCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceCategoriesResponseBody setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public ListServiceCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
