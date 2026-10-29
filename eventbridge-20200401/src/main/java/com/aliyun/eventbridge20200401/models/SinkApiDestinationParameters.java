// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkApiDestinationParameters extends TeaModel {
    /**
     * <p>The HTTP body parameters.</p>
     */
    @NameInMap("BodyParameters")
    public SinkApiDestinationParametersBodyParameters bodyParameters;

    /**
     * <p>The HTTP header parameters.</p>
     */
    @NameInMap("HeaderParameters")
    public SinkApiDestinationParametersHeaderParameters headerParameters;

    /**
     * <p>The name of the API destination.</p>
     * 
     * <strong>example:</strong>
     * <p>example-api-destination</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The HTTP query parameters.</p>
     */
    @NameInMap("QueryStringParameters")
    public SinkApiDestinationParametersQueryStringParameters queryStringParameters;

    /**
     * <p>The timeout period for the API call, in seconds. Valid values: 1 to 60. If the destination does not respond within this period, the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
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
         * <p>Form</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>Template</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;message&quot;:&quot;${message}&quot;}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;message&quot;:&quot;$.data.message&quot;}</p>
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
         * <p>Form</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>Template</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;${headerName1}&quot;:&quot;${headerValue1}&quot;}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;headerName1&quot;:&quot;X-Example&quot;,&quot;headerValue1&quot;:&quot;example-value&quot;}</p>
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
         * <p>Form</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template used to construct the parameter value. This parameter is used only when Form is set to TEMPLATE. You can use variables such as ${event.id} to reference event data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;id&quot;:&quot;${event.id}&quot;}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;id&quot;:&quot;$.data.id&quot;}</p>
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
