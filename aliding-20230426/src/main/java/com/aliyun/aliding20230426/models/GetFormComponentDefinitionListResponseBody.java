// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormComponentDefinitionListResponseBody extends TeaModel {
    @NameInMap("Result")
    public java.util.List<GetFormComponentDefinitionListResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

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
        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("FieldId")
        public String fieldId;

        @NameInMap("Label")
        public String label;

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
