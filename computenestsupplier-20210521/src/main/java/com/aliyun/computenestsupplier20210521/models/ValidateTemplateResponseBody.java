// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ValidateTemplateResponseBody extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<java.util.Map<String, ?>> parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Outputs")
    public java.util.List<ValidateTemplateResponseBodyOutputs> outputs;

    @NameInMap("Description")
    public String description;

    public static ValidateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateResponseBody self = new ValidateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateResponseBody setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getParameters() {
        return this.parameters;
    }

    public ValidateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateTemplateResponseBody setOutputs(java.util.List<ValidateTemplateResponseBodyOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<ValidateTemplateResponseBodyOutputs> getOutputs() {
        return this.outputs;
    }

    public ValidateTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class ValidateTemplateResponseBodyOutputs extends TeaModel {
        @NameInMap("OutputKey")
        public String outputKey;

        @NameInMap("Description")
        public String description;

        public static ValidateTemplateResponseBodyOutputs build(java.util.Map<String, ?> map) throws Exception {
            ValidateTemplateResponseBodyOutputs self = new ValidateTemplateResponseBodyOutputs();
            return TeaModel.build(map, self);
        }

        public ValidateTemplateResponseBodyOutputs setOutputKey(String outputKey) {
            this.outputKey = outputKey;
            return this;
        }
        public String getOutputKey() {
            return this.outputKey;
        }

        public ValidateTemplateResponseBodyOutputs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
