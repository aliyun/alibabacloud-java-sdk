// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListCategoryResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("Data")
    public ListCategoryResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace id is null or invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request succeeded.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCategoryResponseBody self = new ListCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCategoryResponseBody setData(ListCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCategoryResponseBodyData getData() {
        return this.data;
    }

    public ListCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCategoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCategoryResponseBodyDataCategoryList extends TeaModel {
        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The category name.</p>
         * 
         * <strong>example:</strong>
         * <p>类目1</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The category type. The only valid value is:</p>
         * <ul>
         * <li><code>UNSTRUCTURED</code>: A standard category.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNSTRUCTURED</p>
         */
        @NameInMap("CategoryType")
        public String categoryType;

        /**
         * <p>Indicates whether the category is the default. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The category is the default.</p>
         * </li>
         * <li><p><code>false</code>: The category is not the default.</p>
         * </li>
         * </ul>
         * <p>You cannot delete the default category.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The parent category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_addd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
         */
        @NameInMap("ParentCategoryId")
        public String parentCategoryId;

        public static ListCategoryResponseBodyDataCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListCategoryResponseBodyDataCategoryList self = new ListCategoryResponseBodyDataCategoryList();
            return TeaModel.build(map, self);
        }

        public ListCategoryResponseBodyDataCategoryList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListCategoryResponseBodyDataCategoryList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListCategoryResponseBodyDataCategoryList setCategoryType(String categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public String getCategoryType() {
            return this.categoryType;
        }

        public ListCategoryResponseBodyDataCategoryList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListCategoryResponseBodyDataCategoryList setParentCategoryId(String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public String getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

    public static class ListCategoryResponseBodyData extends TeaModel {
        /**
         * <p>The list of categories.</p>
         */
        @NameInMap("CategoryList")
        public java.util.List<ListCategoryResponseBodyDataCategoryList> categoryList;

        /**
         * <p>Indicates whether more results are available for retrieval. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: More results are available.</p>
         * </li>
         * <li><p><code>false</code>: This is the last page of results.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <p>The maximum number of results to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token used to retrieve the next page of results. This parameter is omitted when no more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAALHWGpGoYCcYMxiFfmlhvh7Z4G8jiXR6IjHYd+M9WQVJ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of matching categories.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCategoryResponseBodyData self = new ListCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCategoryResponseBodyData setCategoryList(java.util.List<ListCategoryResponseBodyDataCategoryList> categoryList) {
            this.categoryList = categoryList;
            return this;
        }
        public java.util.List<ListCategoryResponseBodyDataCategoryList> getCategoryList() {
            return this.categoryList;
        }

        public ListCategoryResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListCategoryResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListCategoryResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListCategoryResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
