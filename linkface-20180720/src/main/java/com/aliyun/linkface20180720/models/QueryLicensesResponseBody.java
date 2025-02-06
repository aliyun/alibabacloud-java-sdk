// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryLicensesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryLicensesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>FBE0F2A8-F115-4FE8-BF80-2D068E2372CB</p>
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
    @NameInMap("Total")
    public Integer total;

    public static QueryLicensesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLicensesResponseBody self = new QueryLicensesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLicensesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryLicensesResponseBody setData(java.util.List<QueryLicensesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLicensesResponseBodyData> getData() {
        return this.data;
    }

    public QueryLicensesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLicensesResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryLicensesResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryLicensesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryLicensesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLicensesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLicensesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryLicensesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CostQuantity")
        public Integer costQuantity;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LicenseType")
        public Integer licenseType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        public static QueryLicensesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLicensesResponseBodyData self = new QueryLicensesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLicensesResponseBodyData setCostQuantity(Integer costQuantity) {
            this.costQuantity = costQuantity;
            return this;
        }
        public Integer getCostQuantity() {
            return this.costQuantity;
        }

        public QueryLicensesResponseBodyData setLicenseType(Integer licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Integer getLicenseType() {
            return this.licenseType;
        }

        public QueryLicensesResponseBodyData setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

}
