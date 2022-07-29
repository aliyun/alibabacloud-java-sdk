// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubscriptionAlbumCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListSubscriptionAlbumCategoryResponseBodyResult> result;

    public static ListSubscriptionAlbumCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionAlbumCategoryResponseBody self = new ListSubscriptionAlbumCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionAlbumCategoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSubscriptionAlbumCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscriptionAlbumCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionAlbumCategoryResponseBody setResult(java.util.List<ListSubscriptionAlbumCategoryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSubscriptionAlbumCategoryResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListSubscriptionAlbumCategoryResponseBodyResult extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        public static ListSubscriptionAlbumCategoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionAlbumCategoryResponseBodyResult self = new ListSubscriptionAlbumCategoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionAlbumCategoryResponseBodyResult setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListSubscriptionAlbumCategoryResponseBodyResult setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

}
