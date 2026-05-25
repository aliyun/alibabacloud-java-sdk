// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class SearchTlogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Long errorCode;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public SearchTlogResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>A8313212-EB4E-4E15-A7F9-D9C8F3FE8E94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchTlogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTlogResponseBody self = new SearchTlogResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTlogResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public SearchTlogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchTlogResponseBody setModel(SearchTlogResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public SearchTlogResponseBodyModel getModel() {
        return this.model;
    }

    public SearchTlogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTlogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchTlogResponseBodyModel extends TeaModel {
        @NameInMap("Data")
        public java.util.List<?> data;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Took")
        public Integer took;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        @NameInMap("Trend")
        public java.util.List<?> trend;

        public static SearchTlogResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            SearchTlogResponseBodyModel self = new SearchTlogResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public SearchTlogResponseBodyModel setData(java.util.List<?> data) {
            this.data = data;
            return this;
        }
        public java.util.List<?> getData() {
            return this.data;
        }

        public SearchTlogResponseBodyModel setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public SearchTlogResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchTlogResponseBodyModel setTook(Integer took) {
            this.took = took;
            return this;
        }
        public Integer getTook() {
            return this.took;
        }

        public SearchTlogResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public SearchTlogResponseBodyModel setTrend(java.util.List<?> trend) {
            this.trend = trend;
            return this;
        }
        public java.util.List<?> getTrend() {
            return this.trend;
        }

    }

}
