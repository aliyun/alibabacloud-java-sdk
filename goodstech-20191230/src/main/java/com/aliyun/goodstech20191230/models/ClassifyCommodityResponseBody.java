// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class ClassifyCommodityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ClassifyCommodityResponseBodyData data;

    public static ClassifyCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClassifyCommodityResponseBody self = new ClassifyCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public ClassifyCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClassifyCommodityResponseBody setData(ClassifyCommodityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClassifyCommodityResponseBodyData getData() {
        return this.data;
    }

    public static class ClassifyCommodityResponseBodyDataCategories extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        public static ClassifyCommodityResponseBodyDataCategories build(java.util.Map<String, ?> map) throws Exception {
            ClassifyCommodityResponseBodyDataCategories self = new ClassifyCommodityResponseBodyDataCategories();
            return TeaModel.build(map, self);
        }

        public ClassifyCommodityResponseBodyDataCategories setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public ClassifyCommodityResponseBodyDataCategories setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ClassifyCommodityResponseBodyDataCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

    public static class ClassifyCommodityResponseBodyData extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<ClassifyCommodityResponseBodyDataCategories> categories;

        public static ClassifyCommodityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClassifyCommodityResponseBodyData self = new ClassifyCommodityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClassifyCommodityResponseBodyData setCategories(java.util.List<ClassifyCommodityResponseBodyDataCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<ClassifyCommodityResponseBodyDataCategories> getCategories() {
            return this.categories;
        }

    }

}
