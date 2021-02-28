// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateCategoryResponseBody extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCategoryResponseBody self = new CreateCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCategoryResponseBody setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
