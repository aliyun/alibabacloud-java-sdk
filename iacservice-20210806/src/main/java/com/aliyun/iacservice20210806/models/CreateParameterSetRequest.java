// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateParameterSetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

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
    public java.util.List<CreateParameterSetRequestParameters> parameters;

    public static CreateParameterSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterSetRequest self = new CreateParameterSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateParameterSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateParameterSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParameterSetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateParameterSetRequest setParameters(java.util.List<CreateParameterSetRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateParameterSetRequestParameters> getParameters() {
        return this.parameters;
    }

    public static class CreateParameterSetRequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test1121</p>
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
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateParameterSetRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateParameterSetRequestParameters self = new CreateParameterSetRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateParameterSetRequestParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateParameterSetRequestParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateParameterSetRequestParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
