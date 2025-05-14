// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertMultiDimTableRecordResponseBody extends TeaModel {
    @NameInMap("Value")
    public java.util.List<InsertMultiDimTableRecordResponseBodyValue> value;

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

    public static InsertMultiDimTableRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertMultiDimTableRecordResponseBody self = new InsertMultiDimTableRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertMultiDimTableRecordResponseBody setValue(java.util.List<InsertMultiDimTableRecordResponseBodyValue> value) {
        this.value = value;
        return this;
    }
    public java.util.List<InsertMultiDimTableRecordResponseBodyValue> getValue() {
        return this.value;
    }

    public InsertMultiDimTableRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertMultiDimTableRecordResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public InsertMultiDimTableRecordResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class InsertMultiDimTableRecordResponseBodyValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hfauVBFJIo</p>
         */
        @NameInMap("Id")
        public String id;

        public static InsertMultiDimTableRecordResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            InsertMultiDimTableRecordResponseBodyValue self = new InsertMultiDimTableRecordResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public InsertMultiDimTableRecordResponseBodyValue setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
