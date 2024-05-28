// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkitemFieldRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("updateWorkitemPropertyRequest")
    public java.util.List<UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workitemIdentifier")
    public String workitemIdentifier;

    public static UpdateWorkitemFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemFieldRequest self = new UpdateWorkitemFieldRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemFieldRequest setUpdateWorkitemPropertyRequest(java.util.List<UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest) {
        this.updateWorkitemPropertyRequest = updateWorkitemPropertyRequest;
        return this;
    }
    public java.util.List<UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest> getUpdateWorkitemPropertyRequest() {
        return this.updateWorkitemPropertyRequest;
    }

    public UpdateWorkitemFieldRequest setWorkitemIdentifier(String workitemIdentifier) {
        this.workitemIdentifier = workitemIdentifier;
        return this;
    }
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    public static class UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("fieldValue")
        public String fieldValue;

        public static UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest self = new UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest();
            return TeaModel.build(map, self);
        }

        public UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public UpdateWorkitemFieldRequestUpdateWorkitemPropertyRequest setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

}
