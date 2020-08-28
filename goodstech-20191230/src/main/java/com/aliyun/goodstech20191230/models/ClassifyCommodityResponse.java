// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class ClassifyCommodityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ClassifyCommodityResponseData data;

    public static ClassifyCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        ClassifyCommodityResponse self = new ClassifyCommodityResponse();
        return TeaModel.build(map, self);
    }

    public static class ClassifyCommodityResponseDataCategories extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("CategoryName")
        @Validation(required = true)
        public String categoryName;

        @NameInMap("CategoryId")
        @Validation(required = true)
        public String categoryId;

        public static ClassifyCommodityResponseDataCategories build(java.util.Map<String, ?> map) throws Exception {
            ClassifyCommodityResponseDataCategories self = new ClassifyCommodityResponseDataCategories();
            return TeaModel.build(map, self);
        }

    }

    public static class ClassifyCommodityResponseData extends TeaModel {
        @NameInMap("Categories")
        @Validation(required = true)
        public java.util.List<ClassifyCommodityResponseDataCategories> categories;

        public static ClassifyCommodityResponseData build(java.util.Map<String, ?> map) throws Exception {
            ClassifyCommodityResponseData self = new ClassifyCommodityResponseData();
            return TeaModel.build(map, self);
        }

    }

}
