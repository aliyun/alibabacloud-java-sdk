// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateTestCaseRequest extends TeaModel {
    @NameInMap("updateWorkitemPropertyRequest")
    public java.util.List<UpdateTestCaseRequestUpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest;

    public static UpdateTestCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTestCaseRequest self = new UpdateTestCaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTestCaseRequest setUpdateWorkitemPropertyRequest(java.util.List<UpdateTestCaseRequestUpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest) {
        this.updateWorkitemPropertyRequest = updateWorkitemPropertyRequest;
        return this;
    }
    public java.util.List<UpdateTestCaseRequestUpdateWorkitemPropertyRequest> getUpdateWorkitemPropertyRequest() {
        return this.updateWorkitemPropertyRequest;
    }

    public static class UpdateTestCaseRequestUpdateWorkitemPropertyRequest extends TeaModel {
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        @NameInMap("fieldValue")
        public String fieldValue;

        public static UpdateTestCaseRequestUpdateWorkitemPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdateTestCaseRequestUpdateWorkitemPropertyRequest self = new UpdateTestCaseRequestUpdateWorkitemPropertyRequest();
            return TeaModel.build(map, self);
        }

        public UpdateTestCaseRequestUpdateWorkitemPropertyRequest setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public UpdateTestCaseRequestUpdateWorkitemPropertyRequest setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

}
