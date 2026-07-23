// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkApiDestinationParameters extends TeaModel {
    /**
     * <p>The parameters for the HTTP request body, specified as key-value pairs.</p>
     */
    @NameInMap("BodyParameters")
    public SinkApiDestinationParametersBodyParameters bodyParameters;

    /**
     * <p>The custom HTTP header parameters to add to the request, specified as key-value pairs.</p>
     */
    @NameInMap("HeaderParameters")
    public SinkApiDestinationParametersHeaderParameters headerParameters;

    /**
     * <p>The name of the API destination.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The query string parameters to add to the endpoint URL, specified as key-value pairs.</p>
     */
    @NameInMap("QueryStringParameters")
    public SinkApiDestinationParametersQueryStringParameters queryStringParameters;

    /**
     * <p>The timeout for the API call, in seconds. If the endpoint does not respond within this period, the call fails. The valid range is 1 to 60.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static SinkApiDestinationParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkApiDestinationParameters self = new SinkApiDestinationParameters();
        return TeaModel.build(map, self);
    }

    public SinkApiDestinationParameters setBodyParameters(SinkApiDestinationParametersBodyParameters bodyParameters) {
        this.bodyParameters = bodyParameters;
        return this;
    }
    public SinkApiDestinationParametersBodyParameters getBodyParameters() {
        return this.bodyParameters;
    }

    public SinkApiDestinationParameters setHeaderParameters(SinkApiDestinationParametersHeaderParameters headerParameters) {
        this.headerParameters = headerParameters;
        return this;
    }
    public SinkApiDestinationParametersHeaderParameters getHeaderParameters() {
        return this.headerParameters;
    }

    public SinkApiDestinationParameters setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SinkApiDestinationParameters setQueryStringParameters(SinkApiDestinationParametersQueryStringParameters queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
        return this;
    }
    public SinkApiDestinationParametersQueryStringParameters getQueryStringParameters() {
        return this.queryStringParameters;
    }

    public SinkApiDestinationParameters setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class SinkApiDestinationParametersBodyParameters extends TeaModel {
        /**
         * <p>Defines how the parameter\&quot;s value is created. Use <code>CONSTANT</code> to specify a static string in the <code>value</code> field. Use <code>JSONPATH</code> to extract data from the event payload with a JSONPath expression in the <code>value</code> field. Use <code>TEMPLATE</code> to build the value from the <code>template</code> field.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template to use to build the parameter value. This field is used only when the <code>form</code> is set to <code>TEMPLATE</code>. You can use variables, such as <code>${event.id}</code>, in the template to reference event data.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The static value or JSONPath expression for the parameter. This field applies only when the <code>form</code> is set to <code>CONSTANT</code> or <code>JSONPATH</code>.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkApiDestinationParametersBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            SinkApiDestinationParametersBodyParameters self = new SinkApiDestinationParametersBodyParameters();
            return TeaModel.build(map, self);
        }

        public SinkApiDestinationParametersBodyParameters setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkApiDestinationParametersBodyParameters setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkApiDestinationParametersBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkApiDestinationParametersHeaderParameters extends TeaModel {
        /**
         * <p>Defines how the parameter\&quot;s value is created. Use <code>CONSTANT</code> to specify a static string in the <code>value</code> field. Use <code>JSONPATH</code> to extract data from the event payload with a JSONPath expression in the <code>value</code> field. Use <code>TEMPLATE</code> to build the value from the <code>template</code> field.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template to use to build the parameter value. This field is used only when the <code>form</code> is set to <code>TEMPLATE</code>. You can use variables, such as <code>${event.id}</code>, in the template to reference event data.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The static value or JSONPath expression for the parameter. This field applies only when the <code>form</code> is set to <code>CONSTANT</code> or <code>JSONPATH</code>.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkApiDestinationParametersHeaderParameters build(java.util.Map<String, ?> map) throws Exception {
            SinkApiDestinationParametersHeaderParameters self = new SinkApiDestinationParametersHeaderParameters();
            return TeaModel.build(map, self);
        }

        public SinkApiDestinationParametersHeaderParameters setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkApiDestinationParametersHeaderParameters setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkApiDestinationParametersHeaderParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkApiDestinationParametersQueryStringParameters extends TeaModel {
        /**
         * <p>Defines how the parameter\&quot;s value is created. Use <code>CONSTANT</code> to specify a static string in the <code>value</code> field. Use <code>JSONPATH</code> to extract data from the event payload with a JSONPath expression in the <code>value</code> field. Use <code>TEMPLATE</code> to build the value from the <code>template</code> field.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template to use to build the parameter value. This field is used only when the <code>form</code> is set to <code>TEMPLATE</code>. You can use variables, such as <code>${event.id}</code>, in the template to reference event data.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The static value or JSONPath expression for the parameter. This field applies only when the <code>form</code> is set to <code>CONSTANT</code> or <code>JSONPATH</code>.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkApiDestinationParametersQueryStringParameters build(java.util.Map<String, ?> map) throws Exception {
            SinkApiDestinationParametersQueryStringParameters self = new SinkApiDestinationParametersQueryStringParameters();
            return TeaModel.build(map, self);
        }

        public SinkApiDestinationParametersQueryStringParameters setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkApiDestinationParametersQueryStringParameters setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkApiDestinationParametersQueryStringParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
