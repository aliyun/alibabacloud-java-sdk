// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllSheetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("value")
    public java.util.List<GetMultiDimTableAllSheetsResponseBodyValue> value;

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

    public static GetMultiDimTableAllSheetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllSheetsResponseBody self = new GetMultiDimTableAllSheetsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllSheetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiDimTableAllSheetsResponseBody setValue(java.util.List<GetMultiDimTableAllSheetsResponseBodyValue> value) {
        this.value = value;
        return this;
    }
    public java.util.List<GetMultiDimTableAllSheetsResponseBodyValue> getValue() {
        return this.value;
    }

    public GetMultiDimTableAllSheetsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetMultiDimTableAllSheetsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetMultiDimTableAllSheetsResponseBodyValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetMultiDimTableAllSheetsResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableAllSheetsResponseBodyValue self = new GetMultiDimTableAllSheetsResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableAllSheetsResponseBodyValue setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMultiDimTableAllSheetsResponseBodyValue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
