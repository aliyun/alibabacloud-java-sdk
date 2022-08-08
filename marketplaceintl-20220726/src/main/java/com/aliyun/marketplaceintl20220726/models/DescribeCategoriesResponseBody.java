// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeCategoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeCategoriesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoriesResponseBody self = new DescribeCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCategoriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCategoriesResponseBody setData(java.util.List<DescribeCategoriesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCategoriesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCategoriesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeCategoriesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCategoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCategoriesResponseBodyDataSubCategories extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        public static DescribeCategoriesResponseBodyDataSubCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoriesResponseBodyDataSubCategories self = new DescribeCategoriesResponseBodyDataSubCategories();
            return TeaModel.build(map, self);
        }

        public DescribeCategoriesResponseBodyDataSubCategories setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeCategoriesResponseBodyDataSubCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

    public static class DescribeCategoriesResponseBodyData extends TeaModel {
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("SubCategories")
        public java.util.List<DescribeCategoriesResponseBodyDataSubCategories> subCategories;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeCategoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoriesResponseBodyData self = new DescribeCategoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCategoriesResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeCategoriesResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeCategoriesResponseBodyData setSubCategories(java.util.List<DescribeCategoriesResponseBodyDataSubCategories> subCategories) {
            this.subCategories = subCategories;
            return this;
        }
        public java.util.List<DescribeCategoriesResponseBodyDataSubCategories> getSubCategories() {
            return this.subCategories;
        }

        public DescribeCategoriesResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
