// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class ClassifyCommodityResponseBody extends TeaModel {
    @NameInMap("Data")
    public ClassifyCommodityResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ClassifyCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClassifyCommodityResponseBody self = new ClassifyCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public ClassifyCommodityResponseBody setData(ClassifyCommodityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClassifyCommodityResponseBodyData getData() {
        return this.data;
    }

    public ClassifyCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClassifyCommodityResponseBodyDataCategories extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Score")
        public Float score;

        public static ClassifyCommodityResponseBodyDataCategories build(java.util.Map<String, ?> map) throws Exception {
            ClassifyCommodityResponseBodyDataCategories self = new ClassifyCommodityResponseBodyDataCategories();
            return TeaModel.build(map, self);
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

        public ClassifyCommodityResponseBodyDataCategories setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
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
