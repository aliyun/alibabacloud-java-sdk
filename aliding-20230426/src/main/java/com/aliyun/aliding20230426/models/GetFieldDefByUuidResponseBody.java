// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFieldDefByUuidResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetFieldDefByUuidResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetFieldDefByUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFieldDefByUuidResponseBody self = new GetFieldDefByUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFieldDefByUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFieldDefByUuidResponseBody setResult(java.util.List<GetFieldDefByUuidResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetFieldDefByUuidResponseBodyResult> getResult() {
        return this.result;
    }

    public GetFieldDefByUuidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetFieldDefByUuidResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetFieldDefByUuidResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetFieldDefByUuidResponseBodyResult extends TeaModel {
        @NameInMap("Behavior")
        public String behavior;

        @NameInMap("Children")
        public String children;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("FieldId")
        public String fieldId;

        @NameInMap("Label")
        public Object label;

        @NameInMap("Props")
        public Object props;

        @NameInMap("Success")
        public Boolean success;

        public static GetFieldDefByUuidResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFieldDefByUuidResponseBodyResult self = new GetFieldDefByUuidResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFieldDefByUuidResponseBodyResult setBehavior(String behavior) {
            this.behavior = behavior;
            return this;
        }
        public String getBehavior() {
            return this.behavior;
        }

        public GetFieldDefByUuidResponseBodyResult setChildren(String children) {
            this.children = children;
            return this;
        }
        public String getChildren() {
            return this.children;
        }

        public GetFieldDefByUuidResponseBodyResult setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetFieldDefByUuidResponseBodyResult setFieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }
        public String getFieldId() {
            return this.fieldId;
        }

        public GetFieldDefByUuidResponseBodyResult setLabel(Object label) {
            this.label = label;
            return this;
        }
        public Object getLabel() {
            return this.label;
        }

        public GetFieldDefByUuidResponseBodyResult setProps(Object props) {
            this.props = props;
            return this;
        }
        public Object getProps() {
            return this.props;
        }

        public GetFieldDefByUuidResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
