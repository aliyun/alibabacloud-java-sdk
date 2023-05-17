// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreatePropertyResponseBody extends TeaModel {
    @NameInMap("CreateResult")
    public CreatePropertyResponseBodyCreateResult createResult;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePropertyResponseBody self = new CreatePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePropertyResponseBody setCreateResult(CreatePropertyResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreatePropertyResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreatePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("PropertyId")
        public Long propertyId;

        @NameInMap("PropertyValue")
        public String propertyValue;

        public static CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues self = new CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues();
            return TeaModel.build(map, self);
        }

        public CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        public String propertyValue;

        @NameInMap("PropertyValueId")
        public Long propertyValueId;

        public static CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues build(java.util.Map<String, ?> map) throws Exception {
            CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues self = new CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues();
            return TeaModel.build(map, self);
        }

        public CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues setPropertyValueId(Long propertyValueId) {
            this.propertyValueId = propertyValueId;
            return this;
        }
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

    }

    public static class CreatePropertyResponseBodyCreateResultSavePropertyValueModel extends TeaModel {
        @NameInMap("FailedPropertyValues")
        public java.util.List<CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues> failedPropertyValues;

        @NameInMap("SavePropertyValues")
        public java.util.List<CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues> savePropertyValues;

        public static CreatePropertyResponseBodyCreateResultSavePropertyValueModel build(java.util.Map<String, ?> map) throws Exception {
            CreatePropertyResponseBodyCreateResultSavePropertyValueModel self = new CreatePropertyResponseBodyCreateResultSavePropertyValueModel();
            return TeaModel.build(map, self);
        }

        public CreatePropertyResponseBodyCreateResultSavePropertyValueModel setFailedPropertyValues(java.util.List<CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues> failedPropertyValues) {
            this.failedPropertyValues = failedPropertyValues;
            return this;
        }
        public java.util.List<CreatePropertyResponseBodyCreateResultSavePropertyValueModelFailedPropertyValues> getFailedPropertyValues() {
            return this.failedPropertyValues;
        }

        public CreatePropertyResponseBodyCreateResultSavePropertyValueModel setSavePropertyValues(java.util.List<CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues> savePropertyValues) {
            this.savePropertyValues = savePropertyValues;
            return this;
        }
        public java.util.List<CreatePropertyResponseBodyCreateResultSavePropertyValueModelSavePropertyValues> getSavePropertyValues() {
            return this.savePropertyValues;
        }

    }

    public static class CreatePropertyResponseBodyCreateResult extends TeaModel {
        @NameInMap("PropertyId")
        public Long propertyId;

        @NameInMap("PropertyKey")
        public String propertyKey;

        @NameInMap("SavePropertyValueModel")
        public CreatePropertyResponseBodyCreateResultSavePropertyValueModel savePropertyValueModel;

        public static CreatePropertyResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreatePropertyResponseBodyCreateResult self = new CreatePropertyResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreatePropertyResponseBodyCreateResult setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public CreatePropertyResponseBodyCreateResult setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public CreatePropertyResponseBodyCreateResult setSavePropertyValueModel(CreatePropertyResponseBodyCreateResultSavePropertyValueModel savePropertyValueModel) {
            this.savePropertyValueModel = savePropertyValueModel;
            return this;
        }
        public CreatePropertyResponseBodyCreateResultSavePropertyValueModel getSavePropertyValueModel() {
            return this.savePropertyValueModel;
        }

    }

}
