// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMessageAcksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageAcks")
    public ListMessageAcksResponseBodyMessageAcks messageAcks;

    public static ListMessageAcksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageAcksResponseBody self = new ListMessageAcksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageAcksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageAcksResponseBody setMessageAcks(ListMessageAcksResponseBodyMessageAcks messageAcks) {
        this.messageAcks = messageAcks;
        return this;
    }
    public ListMessageAcksResponseBodyMessageAcks getMessageAcks() {
        return this.messageAcks;
    }

    public static class ListMessageAcksResponseBodyMessageAcksList extends TeaModel {
        @NameInMap("Mid")
        public Long mid;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("AckTime")
        public Long ackTime;

        public static ListMessageAcksResponseBodyMessageAcksList build(java.util.Map<String, ?> map) throws Exception {
            ListMessageAcksResponseBodyMessageAcksList self = new ListMessageAcksResponseBodyMessageAcksList();
            return TeaModel.build(map, self);
        }

        public ListMessageAcksResponseBodyMessageAcksList setMid(Long mid) {
            this.mid = mid;
            return this;
        }
        public Long getMid() {
            return this.mid;
        }

        public ListMessageAcksResponseBodyMessageAcksList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListMessageAcksResponseBodyMessageAcksList setAckTime(Long ackTime) {
            this.ackTime = ackTime;
            return this;
        }
        public Long getAckTime() {
            return this.ackTime;
        }

    }

    public static class ListMessageAcksResponseBodyMessageAcksPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListMessageAcksResponseBodyMessageAcksPagination build(java.util.Map<String, ?> map) throws Exception {
            ListMessageAcksResponseBodyMessageAcksPagination self = new ListMessageAcksResponseBodyMessageAcksPagination();
            return TeaModel.build(map, self);
        }

        public ListMessageAcksResponseBodyMessageAcksPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListMessageAcksResponseBodyMessageAcksPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListMessageAcksResponseBodyMessageAcksPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListMessageAcksResponseBodyMessageAcksPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListMessageAcksResponseBodyMessageAcks extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListMessageAcksResponseBodyMessageAcksList> list;

        @NameInMap("Pagination")
        public ListMessageAcksResponseBodyMessageAcksPagination pagination;

        public static ListMessageAcksResponseBodyMessageAcks build(java.util.Map<String, ?> map) throws Exception {
            ListMessageAcksResponseBodyMessageAcks self = new ListMessageAcksResponseBodyMessageAcks();
            return TeaModel.build(map, self);
        }

        public ListMessageAcksResponseBodyMessageAcks setList(java.util.List<ListMessageAcksResponseBodyMessageAcksList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMessageAcksResponseBodyMessageAcksList> getList() {
            return this.list;
        }

        public ListMessageAcksResponseBodyMessageAcks setPagination(ListMessageAcksResponseBodyMessageAcksPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListMessageAcksResponseBodyMessageAcksPagination getPagination() {
            return this.pagination;
        }

    }

}
