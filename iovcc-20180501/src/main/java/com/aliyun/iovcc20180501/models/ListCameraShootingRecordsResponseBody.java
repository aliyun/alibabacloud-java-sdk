// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListCameraShootingRecordsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShootingRecords")
    public ListCameraShootingRecordsResponseBodyShootingRecords shootingRecords;

    public static ListCameraShootingRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCameraShootingRecordsResponseBody self = new ListCameraShootingRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCameraShootingRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCameraShootingRecordsResponseBody setShootingRecords(ListCameraShootingRecordsResponseBodyShootingRecords shootingRecords) {
        this.shootingRecords = shootingRecords;
        return this;
    }
    public ListCameraShootingRecordsResponseBodyShootingRecords getShootingRecords() {
        return this.shootingRecords;
    }

    public static class ListCameraShootingRecordsResponseBodyShootingRecordsPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPageCount")
        public Long totalPageCount;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        public static ListCameraShootingRecordsResponseBodyShootingRecordsPagination build(java.util.Map<String, ?> map) throws Exception {
            ListCameraShootingRecordsResponseBodyShootingRecordsPagination self = new ListCameraShootingRecordsResponseBodyShootingRecordsPagination();
            return TeaModel.build(map, self);
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsPagination setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsPagination setTotalPageCount(Long totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsPagination setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsPagination setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListCameraShootingRecordsResponseBodyShootingRecordsList extends TeaModel {
        // 主键ID
        @NameInMap("Id")
        public Long id;

        // 拍摄类型，0-图片，1-视频
        @NameInMap("ShootingType")
        public Long shootingType;

        // 拍摄数量
        @NameInMap("Number")
        public Long number;

        // 拍照间隔/视频时长，单位为s
        @NameInMap("Time")
        public Long time;

        // 记录时间
        @NameInMap("RecordTime")
        public Long recordTime;

        // 状态：0-未完成，1-已完成
        @NameInMap("Status")
        public Long status;

        public static ListCameraShootingRecordsResponseBodyShootingRecordsList build(java.util.Map<String, ?> map) throws Exception {
            ListCameraShootingRecordsResponseBodyShootingRecordsList self = new ListCameraShootingRecordsResponseBodyShootingRecordsList();
            return TeaModel.build(map, self);
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsList setShootingType(Long shootingType) {
            this.shootingType = shootingType;
            return this;
        }
        public Long getShootingType() {
            return this.shootingType;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsList setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsList setRecordTime(Long recordTime) {
            this.recordTime = recordTime;
            return this;
        }
        public Long getRecordTime() {
            return this.recordTime;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecordsList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListCameraShootingRecordsResponseBodyShootingRecords extends TeaModel {
        @NameInMap("Pagination")
        public ListCameraShootingRecordsResponseBodyShootingRecordsPagination pagination;

        @NameInMap("List")
        public java.util.List<ListCameraShootingRecordsResponseBodyShootingRecordsList> list;

        public static ListCameraShootingRecordsResponseBodyShootingRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCameraShootingRecordsResponseBodyShootingRecords self = new ListCameraShootingRecordsResponseBodyShootingRecords();
            return TeaModel.build(map, self);
        }

        public ListCameraShootingRecordsResponseBodyShootingRecords setPagination(ListCameraShootingRecordsResponseBodyShootingRecordsPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListCameraShootingRecordsResponseBodyShootingRecordsPagination getPagination() {
            return this.pagination;
        }

        public ListCameraShootingRecordsResponseBodyShootingRecords setList(java.util.List<ListCameraShootingRecordsResponseBodyShootingRecordsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCameraShootingRecordsResponseBodyShootingRecordsList> getList() {
            return this.list;
        }

    }

}
