// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayRoutesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListGatewayRoutesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRoutesResponseBody self = new ListGatewayRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayRoutesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewayRoutesResponseBody setData(ListGatewayRoutesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayRoutesResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayRoutesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayRoutesResponseBodyDataItems extends TeaModel {
        @NameInMap("backend")
        public GatewayRouteBackend backend;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("description")
        public String description;

        @NameInMap("domainInfo")
        public GatewayRouteDomainInfo domainInfo;

        /**
         * <strong>example:</strong>
         * <p>gr-cqa8oddlhtg***</p>
         */
        @NameInMap("gatewayRouteId")
        public String gatewayRouteId;

        @NameInMap("match")
        public HttpRouteMatch match;

        /**
         * <strong>example:</strong>
         * <p>pre-itemcenter-router</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>NotPublished</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static ListGatewayRoutesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRoutesResponseBodyDataItems self = new ListGatewayRoutesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListGatewayRoutesResponseBodyDataItems setBackend(GatewayRouteBackend backend) {
            this.backend = backend;
            return this;
        }
        public GatewayRouteBackend getBackend() {
            return this.backend;
        }

        public ListGatewayRoutesResponseBodyDataItems setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListGatewayRoutesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGatewayRoutesResponseBodyDataItems setDomainInfo(GatewayRouteDomainInfo domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }
        public GatewayRouteDomainInfo getDomainInfo() {
            return this.domainInfo;
        }

        public ListGatewayRoutesResponseBodyDataItems setGatewayRouteId(String gatewayRouteId) {
            this.gatewayRouteId = gatewayRouteId;
            return this;
        }
        public String getGatewayRouteId() {
            return this.gatewayRouteId;
        }

        public ListGatewayRoutesResponseBodyDataItems setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public ListGatewayRoutesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayRoutesResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGatewayRoutesResponseBodyDataItems setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListGatewayRoutesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListGatewayRoutesResponseBodyDataItems> items;

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
         * <p>2</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListGatewayRoutesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayRoutesResponseBodyData self = new ListGatewayRoutesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayRoutesResponseBodyData setItems(java.util.List<ListGatewayRoutesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGatewayRoutesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListGatewayRoutesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayRoutesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayRoutesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
