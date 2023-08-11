// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectFieldRequest extends TeaModel {
    @NameInMap("statusIdentifier")
    public String statusIdentifier;

    @NameInMap("updateBasicFieldRequestList")
    public java.util.List<UpdateProjectFieldRequestUpdateBasicFieldRequestList> updateBasicFieldRequestList;

    @NameInMap("updateForOpenApiList")
    public java.util.List<UpdateProjectFieldRequestUpdateForOpenApiList> updateForOpenApiList;

    public static UpdateProjectFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectFieldRequest self = new UpdateProjectFieldRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectFieldRequest setStatusIdentifier(String statusIdentifier) {
        this.statusIdentifier = statusIdentifier;
        return this;
    }
    public String getStatusIdentifier() {
        return this.statusIdentifier;
    }

    public UpdateProjectFieldRequest setUpdateBasicFieldRequestList(java.util.List<UpdateProjectFieldRequestUpdateBasicFieldRequestList> updateBasicFieldRequestList) {
        this.updateBasicFieldRequestList = updateBasicFieldRequestList;
        return this;
    }
    public java.util.List<UpdateProjectFieldRequestUpdateBasicFieldRequestList> getUpdateBasicFieldRequestList() {
        return this.updateBasicFieldRequestList;
    }

    public UpdateProjectFieldRequest setUpdateForOpenApiList(java.util.List<UpdateProjectFieldRequestUpdateForOpenApiList> updateForOpenApiList) {
        this.updateForOpenApiList = updateForOpenApiList;
        return this;
    }
    public java.util.List<UpdateProjectFieldRequestUpdateForOpenApiList> getUpdateForOpenApiList() {
        return this.updateForOpenApiList;
    }

    public static class UpdateProjectFieldRequestUpdateBasicFieldRequestList extends TeaModel {
        @NameInMap("propertyKey")
        public String propertyKey;

        @NameInMap("propertyValue")
        public String propertyValue;

        public static UpdateProjectFieldRequestUpdateBasicFieldRequestList build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectFieldRequestUpdateBasicFieldRequestList self = new UpdateProjectFieldRequestUpdateBasicFieldRequestList();
            return TeaModel.build(map, self);
        }

        public UpdateProjectFieldRequestUpdateBasicFieldRequestList setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public UpdateProjectFieldRequestUpdateBasicFieldRequestList setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class UpdateProjectFieldRequestUpdateForOpenApiList extends TeaModel {
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        @NameInMap("value")
        public String value;

        public static UpdateProjectFieldRequestUpdateForOpenApiList build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectFieldRequestUpdateForOpenApiList self = new UpdateProjectFieldRequestUpdateForOpenApiList();
            return TeaModel.build(map, self);
        }

        public UpdateProjectFieldRequestUpdateForOpenApiList setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public UpdateProjectFieldRequestUpdateForOpenApiList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
