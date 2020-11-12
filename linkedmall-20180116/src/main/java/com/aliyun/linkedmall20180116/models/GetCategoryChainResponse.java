// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCategoryChainResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CategoryList")
    @Validation(required = true)
    public java.util.List<GetCategoryChainResponseCategoryList> categoryList;

    public static GetCategoryChainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryChainResponse self = new GetCategoryChainResponse();
        return TeaModel.build(map, self);
    }

    public GetCategoryChainResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCategoryChainResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCategoryChainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCategoryChainResponse setCategoryList(java.util.List<GetCategoryChainResponseCategoryList> categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public java.util.List<GetCategoryChainResponseCategoryList> getCategoryList() {
        return this.categoryList;
    }

    public static class GetCategoryChainResponseCategoryList extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetCategoryChainResponseCategoryList build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryChainResponseCategoryList self = new GetCategoryChainResponseCategoryList();
            return TeaModel.build(map, self);
        }

        public GetCategoryChainResponseCategoryList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetCategoryChainResponseCategoryList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
