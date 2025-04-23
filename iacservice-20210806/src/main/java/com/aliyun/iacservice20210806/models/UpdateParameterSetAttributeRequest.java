// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateParameterSetAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("parameters")
    public java.util.List<UpdateParameterSetAttributeRequestParameters> parameters;

    public static UpdateParameterSetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterSetAttributeRequest self = new UpdateParameterSetAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateParameterSetAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateParameterSetAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateParameterSetAttributeRequest setParameters(java.util.List<UpdateParameterSetAttributeRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateParameterSetAttributeRequestParameters> getParameters() {
        return this.parameters;
    }

    public static class UpdateParameterSetAttributeRequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1mjm9exduos1bipw9x6</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateParameterSetAttributeRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateParameterSetAttributeRequestParameters self = new UpdateParameterSetAttributeRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateParameterSetAttributeRequestParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateParameterSetAttributeRequestParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateParameterSetAttributeRequestParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
