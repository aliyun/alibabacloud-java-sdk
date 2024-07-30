// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteCategoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("Data")
    public DeleteCategoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>workspace id is null or invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCategoryResponseBody self = new DeleteCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCategoryResponseBody setData(DeleteCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteCategoryResponseBodyData getData() {
        return this.data;
    }

    public DeleteCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCategoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeleteCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteCategoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3XXXXXXXX</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        public static DeleteCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteCategoryResponseBodyData self = new DeleteCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteCategoryResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

    }

}
