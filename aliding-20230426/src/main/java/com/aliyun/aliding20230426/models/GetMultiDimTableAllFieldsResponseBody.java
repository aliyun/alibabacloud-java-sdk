// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableAllFieldsResponseBody extends TeaModel {
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
    public java.util.List<GetMultiDimTableAllFieldsResponseBodyValue> value;

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

    public static GetMultiDimTableAllFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableAllFieldsResponseBody self = new GetMultiDimTableAllFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableAllFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiDimTableAllFieldsResponseBody setValue(java.util.List<GetMultiDimTableAllFieldsResponseBodyValue> value) {
        this.value = value;
        return this;
    }
    public java.util.List<GetMultiDimTableAllFieldsResponseBodyValue> getValue() {
        return this.value;
    }

    public GetMultiDimTableAllFieldsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetMultiDimTableAllFieldsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetMultiDimTableAllFieldsResponseBodyValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>stxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>Sheet1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMultiDimTableAllFieldsResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableAllFieldsResponseBodyValue self = new GetMultiDimTableAllFieldsResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableAllFieldsResponseBodyValue setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMultiDimTableAllFieldsResponseBodyValue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMultiDimTableAllFieldsResponseBodyValue setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public GetMultiDimTableAllFieldsResponseBodyValue setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
