// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddCategoryResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddCategoryResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Requests throttling triggered.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>778C0B3B-xxxx-5FC1-A947-36EDD13606AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryResponseBody self = new AddCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddCategoryResponseBody setData(AddCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddCategoryResponseBodyData getData() {
        return this.data;
    }

    public AddCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCategoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddCategoryResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the category. Save this ID for future API calls that use this category.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>类目名称</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        public static AddCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddCategoryResponseBodyData self = new AddCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddCategoryResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public AddCategoryResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

}
