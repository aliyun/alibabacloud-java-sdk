// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestDataServiceApiRequest extends TeaModel {
    @NameInMap("ApiId")
    public Long apiId;

    @NameInMap("BodyContent")
    public String bodyContent;

    @NameInMap("BodyParams")
    public java.util.List<TestDataServiceApiRequestBodyParams> bodyParams;

    @NameInMap("HeadParams")
    public java.util.List<TestDataServiceApiRequestHeadParams> headParams;

    @NameInMap("PathParams")
    public java.util.List<TestDataServiceApiRequestPathParams> pathParams;

    @NameInMap("QueryParam")
    public java.util.List<TestDataServiceApiRequestQueryParam> queryParam;

    public static TestDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        TestDataServiceApiRequest self = new TestDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public TestDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public TestDataServiceApiRequest setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent;
        return this;
    }
    public String getBodyContent() {
        return this.bodyContent;
    }

    public TestDataServiceApiRequest setBodyParams(java.util.List<TestDataServiceApiRequestBodyParams> bodyParams) {
        this.bodyParams = bodyParams;
        return this;
    }
    public java.util.List<TestDataServiceApiRequestBodyParams> getBodyParams() {
        return this.bodyParams;
    }

    public TestDataServiceApiRequest setHeadParams(java.util.List<TestDataServiceApiRequestHeadParams> headParams) {
        this.headParams = headParams;
        return this;
    }
    public java.util.List<TestDataServiceApiRequestHeadParams> getHeadParams() {
        return this.headParams;
    }

    public TestDataServiceApiRequest setPathParams(java.util.List<TestDataServiceApiRequestPathParams> pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public java.util.List<TestDataServiceApiRequestPathParams> getPathParams() {
        return this.pathParams;
    }

    public TestDataServiceApiRequest setQueryParam(java.util.List<TestDataServiceApiRequestQueryParam> queryParam) {
        this.queryParam = queryParam;
        return this;
    }
    public java.util.List<TestDataServiceApiRequestQueryParam> getQueryParam() {
        return this.queryParam;
    }

    public static class TestDataServiceApiRequestBodyParams extends TeaModel {
        @NameInMap("ParamKey")
        public String paramKey;

        @NameInMap("ParamValue")
        public String paramValue;

        public static TestDataServiceApiRequestBodyParams build(java.util.Map<String, ?> map) throws Exception {
            TestDataServiceApiRequestBodyParams self = new TestDataServiceApiRequestBodyParams();
            return TeaModel.build(map, self);
        }

        public TestDataServiceApiRequestBodyParams setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

        public TestDataServiceApiRequestBodyParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class TestDataServiceApiRequestHeadParams extends TeaModel {
        @NameInMap("ParamKey")
        public String paramKey;

        @NameInMap("ParamValue")
        public String paramValue;

        public static TestDataServiceApiRequestHeadParams build(java.util.Map<String, ?> map) throws Exception {
            TestDataServiceApiRequestHeadParams self = new TestDataServiceApiRequestHeadParams();
            return TeaModel.build(map, self);
        }

        public TestDataServiceApiRequestHeadParams setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

        public TestDataServiceApiRequestHeadParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class TestDataServiceApiRequestPathParams extends TeaModel {
        @NameInMap("ParamKey")
        public String paramKey;

        @NameInMap("ParamValue")
        public String paramValue;

        public static TestDataServiceApiRequestPathParams build(java.util.Map<String, ?> map) throws Exception {
            TestDataServiceApiRequestPathParams self = new TestDataServiceApiRequestPathParams();
            return TeaModel.build(map, self);
        }

        public TestDataServiceApiRequestPathParams setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

        public TestDataServiceApiRequestPathParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class TestDataServiceApiRequestQueryParam extends TeaModel {
        @NameInMap("ParamKey")
        public String paramKey;

        @NameInMap("ParamValue")
        public String paramValue;

        public static TestDataServiceApiRequestQueryParam build(java.util.Map<String, ?> map) throws Exception {
            TestDataServiceApiRequestQueryParam self = new TestDataServiceApiRequestQueryParam();
            return TeaModel.build(map, self);
        }

        public TestDataServiceApiRequestQueryParam setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

        public TestDataServiceApiRequestQueryParam setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

}
