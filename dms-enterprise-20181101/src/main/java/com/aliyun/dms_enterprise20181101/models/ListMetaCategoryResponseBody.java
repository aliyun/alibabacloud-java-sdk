// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListMetaCategoryResponseBody extends TeaModel {
    @NameInMap("CategoryList")
    public ListMetaCategoryResponseBodyCategoryList categoryList;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListMetaCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCategoryResponseBody self = new ListMetaCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaCategoryResponseBody setCategoryList(ListMetaCategoryResponseBodyCategoryList categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public ListMetaCategoryResponseBodyCategoryList getCategoryList() {
        return this.categoryList;
    }

    public ListMetaCategoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMetaCategoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMetaCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetaCategoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetaCategoryResponseBodyCategoryList extends TeaModel {
        @NameInMap("MetaCategory")
        public java.util.List<MetaCategory> metaCategory;

        public static ListMetaCategoryResponseBodyCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListMetaCategoryResponseBodyCategoryList self = new ListMetaCategoryResponseBodyCategoryList();
            return TeaModel.build(map, self);
        }

        public ListMetaCategoryResponseBodyCategoryList setMetaCategory(java.util.List<MetaCategory> metaCategory) {
            this.metaCategory = metaCategory;
            return this;
        }
        public java.util.List<MetaCategory> getMetaCategory() {
            return this.metaCategory;
        }

    }

}
