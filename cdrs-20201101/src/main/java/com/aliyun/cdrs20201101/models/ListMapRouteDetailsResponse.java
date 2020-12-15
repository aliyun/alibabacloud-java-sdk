// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListMapRouteDetailsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListMapRouteDetailsResponseData> data;

    public static ListMapRouteDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMapRouteDetailsResponse self = new ListMapRouteDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListMapRouteDetailsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMapRouteDetailsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMapRouteDetailsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListMapRouteDetailsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMapRouteDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMapRouteDetailsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListMapRouteDetailsResponse setData(java.util.List<ListMapRouteDetailsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMapRouteDetailsResponseData> getData() {
        return this.data;
    }

    public static class ListMapRouteDetailsResponseData extends TeaModel {
        @NameInMap("Destination")
        @Validation(required = true)
        public String destination;

        @NameInMap("Origin")
        @Validation(required = true)
        public String origin;

        @NameInMap("Route")
        @Validation(required = true)
        public String route;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static ListMapRouteDetailsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListMapRouteDetailsResponseData self = new ListMapRouteDetailsResponseData();
            return TeaModel.build(map, self);
        }

        public ListMapRouteDetailsResponseData setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListMapRouteDetailsResponseData setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public ListMapRouteDetailsResponseData setRoute(String route) {
            this.route = route;
            return this;
        }
        public String getRoute() {
            return this.route;
        }

        public ListMapRouteDetailsResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
