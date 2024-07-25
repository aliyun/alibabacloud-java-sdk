// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayServicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListGatewayServicesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8FA9BB94-915B-5299-A694-49FCC7F5DD00</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayServicesResponseBody self = new ListGatewayServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayServicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewayServicesResponseBody setData(ListGatewayServicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayServicesResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayServicesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<GatewayService> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("totalSize")
        public Long totalSize;

        public static ListGatewayServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServicesResponseBodyData self = new ListGatewayServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayServicesResponseBodyData setItems(java.util.List<GatewayService> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GatewayService> getItems() {
            return this.items;
        }

        public ListGatewayServicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayServicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayServicesResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
