// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkApiDestinationParameters extends TeaModel {
    @NameInMap("BodyParameters")
    public SinkApiDestinationParametersBodyParameters bodyParameters;

    @NameInMap("HeaderParameters")
    public SinkApiDestinationParametersHeaderParameters headerParameters;

    @NameInMap("Name")
    public String name;

    @NameInMap("QueryStringParameters")
    public SinkApiDestinationParametersQueryStringParameters queryStringParameters;

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

    public static class SinkApiDestinationParametersBodyParameters extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
