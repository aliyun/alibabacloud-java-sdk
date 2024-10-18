// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableRecordResponseBody extends TeaModel {
    @NameInMap("CreatedBy")
    public GetMultiDimTableRecordResponseBodyCreatedBy createdBy;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CreatedTime")
    public Long createdTime;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Fields")
    public java.util.Map<String, ?> fields;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("LastModifiedBy")
    public GetMultiDimTableRecordResponseBodyLastModifiedBy lastModifiedBy;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("LastModifiedTime")
    public Long lastModifiedTime;

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

    public static GetMultiDimTableRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableRecordResponseBody self = new GetMultiDimTableRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableRecordResponseBody setCreatedBy(GetMultiDimTableRecordResponseBodyCreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public GetMultiDimTableRecordResponseBodyCreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public GetMultiDimTableRecordResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public GetMultiDimTableRecordResponseBody setFields(java.util.Map<String, ?> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.Map<String, ?> getFields() {
        return this.fields;
    }

    public GetMultiDimTableRecordResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetMultiDimTableRecordResponseBody setLastModifiedBy(GetMultiDimTableRecordResponseBodyLastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    public GetMultiDimTableRecordResponseBodyLastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public GetMultiDimTableRecordResponseBody setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetMultiDimTableRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiDimTableRecordResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetMultiDimTableRecordResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetMultiDimTableRecordResponseBodyCreatedBy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetMultiDimTableRecordResponseBodyCreatedBy build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableRecordResponseBodyCreatedBy self = new GetMultiDimTableRecordResponseBodyCreatedBy();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableRecordResponseBodyCreatedBy setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetMultiDimTableRecordResponseBodyLastModifiedBy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetMultiDimTableRecordResponseBodyLastModifiedBy build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableRecordResponseBodyLastModifiedBy self = new GetMultiDimTableRecordResponseBodyLastModifiedBy();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableRecordResponseBodyLastModifiedBy setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
