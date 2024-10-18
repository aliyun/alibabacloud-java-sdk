// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListMultiDimTableRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("records")
    public java.util.List<ListMultiDimTableRecordsResponseBodyRecords> records;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static ListMultiDimTableRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultiDimTableRecordsResponseBody self = new ListMultiDimTableRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultiDimTableRecordsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListMultiDimTableRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiDimTableRecordsResponseBody setRecords(java.util.List<ListMultiDimTableRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListMultiDimTableRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListMultiDimTableRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultiDimTableRecordsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListMultiDimTableRecordsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class ListMultiDimTableRecordsResponseBodyRecordsCreatedBy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListMultiDimTableRecordsResponseBodyRecordsCreatedBy build(java.util.Map<String, ?> map) throws Exception {
            ListMultiDimTableRecordsResponseBodyRecordsCreatedBy self = new ListMultiDimTableRecordsResponseBodyRecordsCreatedBy();
            return TeaModel.build(map, self);
        }

        public ListMultiDimTableRecordsResponseBodyRecordsCreatedBy setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListMultiDimTableRecordsResponseBodyRecordsLastModifiedBy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListMultiDimTableRecordsResponseBodyRecordsLastModifiedBy build(java.util.Map<String, ?> map) throws Exception {
            ListMultiDimTableRecordsResponseBodyRecordsLastModifiedBy self = new ListMultiDimTableRecordsResponseBodyRecordsLastModifiedBy();
            return TeaModel.build(map, self);
        }

        public ListMultiDimTableRecordsResponseBodyRecordsLastModifiedBy setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListMultiDimTableRecordsResponseBodyRecords extends TeaModel {
        @NameInMap("CreatedBy")
        public ListMultiDimTableRecordsResponseBodyRecordsCreatedBy createdBy;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>title,shortTitle</p>
         */
        @NameInMap("Fields")
        public java.util.Map<String, ?> fields;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("LastModifiedBy")
        public ListMultiDimTableRecordsResponseBodyRecordsLastModifiedBy lastModifiedBy;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        public static ListMultiDimTableRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListMultiDimTableRecordsResponseBodyRecords self = new ListMultiDimTableRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListMultiDimTableRecordsResponseBodyRecords setCreatedBy(ListMultiDimTableRecordsResponseBodyRecordsCreatedBy createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public ListMultiDimTableRecordsResponseBodyRecordsCreatedBy getCreatedBy() {
            return this.createdBy;
        }

        public ListMultiDimTableRecordsResponseBodyRecords setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListMultiDimTableRecordsResponseBodyRecords setFields(java.util.Map<String, ?> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.Map<String, ?> getFields() {
            return this.fields;
        }

        public ListMultiDimTableRecordsResponseBodyRecords setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMultiDimTableRecordsResponseBodyRecords setLastModifiedBy(ListMultiDimTableRecordsResponseBodyRecordsLastModifiedBy lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public ListMultiDimTableRecordsResponseBodyRecordsLastModifiedBy getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public ListMultiDimTableRecordsResponseBodyRecords setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

    }

}
