// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormComponentDefinitionListResponseBody extends TeaModel {
    @NameInMap("Result")
    public java.util.List<GetFormComponentDefinitionListResponseBodyResult> result;

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

    public static GetFormComponentDefinitionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFormComponentDefinitionListResponseBody self = new GetFormComponentDefinitionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFormComponentDefinitionListResponseBody setResult(java.util.List<GetFormComponentDefinitionListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetFormComponentDefinitionListResponseBodyResult> getResult() {
        return this.result;
    }

    public GetFormComponentDefinitionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFormComponentDefinitionListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetFormComponentDefinitionListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetFormComponentDefinitionListResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FooterYida</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <strong>example:</strong>
         * <p>formContainer_kksjiuk</p>
         */
        @NameInMap("FieldId")
        public String fieldId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;en_US&quot;:&quot;&quot;}</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>formContainer_kksjiuk</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        public static GetFormComponentDefinitionListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFormComponentDefinitionListResponseBodyResult self = new GetFormComponentDefinitionListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFormComponentDefinitionListResponseBodyResult setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetFormComponentDefinitionListResponseBodyResult setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public GetFormComponentDefinitionListResponseBodyResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetFormComponentDefinitionListResponseBodyResult setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

}
