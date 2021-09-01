// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetCategoryChainResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CategoryList")
    public java.util.List<GetCategoryChainResponseBodyCategoryList> categoryList;

    public static GetCategoryChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryChainResponseBody self = new GetCategoryChainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCategoryChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCategoryChainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCategoryChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCategoryChainResponseBody setCategoryList(java.util.List<GetCategoryChainResponseBodyCategoryList> categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public java.util.List<GetCategoryChainResponseBodyCategoryList> getCategoryList() {
        return this.categoryList;
    }

    public static class GetCategoryChainResponseBodyCategoryList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("CategoryId")
        public Long categoryId;

        public static GetCategoryChainResponseBodyCategoryList build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryChainResponseBodyCategoryList self = new GetCategoryChainResponseBodyCategoryList();
            return TeaModel.build(map, self);
        }

        public GetCategoryChainResponseBodyCategoryList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCategoryChainResponseBodyCategoryList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

    }

}
