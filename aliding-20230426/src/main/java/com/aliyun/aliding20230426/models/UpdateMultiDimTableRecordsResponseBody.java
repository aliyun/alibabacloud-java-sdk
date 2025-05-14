// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableRecordsResponseBody extends TeaModel {
    @NameInMap("Value")
    public java.util.List<UpdateMultiDimTableRecordsResponseBodyValue> value;

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

    public static UpdateMultiDimTableRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableRecordsResponseBody self = new UpdateMultiDimTableRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableRecordsResponseBody setValue(java.util.List<UpdateMultiDimTableRecordsResponseBodyValue> value) {
        this.value = value;
        return this;
    }
    public java.util.List<UpdateMultiDimTableRecordsResponseBodyValue> getValue() {
        return this.value;
    }

    public UpdateMultiDimTableRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMultiDimTableRecordsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public UpdateMultiDimTableRecordsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class UpdateMultiDimTableRecordsResponseBodyValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Id")
        public String id;

        public static UpdateMultiDimTableRecordsResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiDimTableRecordsResponseBodyValue self = new UpdateMultiDimTableRecordsResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public UpdateMultiDimTableRecordsResponseBodyValue setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
