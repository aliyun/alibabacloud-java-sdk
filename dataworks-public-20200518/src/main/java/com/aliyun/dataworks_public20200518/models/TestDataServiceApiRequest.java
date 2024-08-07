// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestDataServiceApiRequest extends TeaModel {
    /**
     * <p>The ID of the DataService Studio API on which the test is performed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12343</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The data of the request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("BodyContent")
    public String bodyContent;

    /**
     * <p>The request parameters that are contained in the request body.</p>
     */
    @NameInMap("BodyParams")
    public java.util.List<TestDataServiceApiRequestBodyParams> bodyParams;

    /**
     * <p>The request parameters that are contained in the request header.</p>
     */
    @NameInMap("HeadParams")
    public java.util.List<TestDataServiceApiRequestHeadParams> headParams;

    /**
     * <p>The request parameters that are contained in the request path.</p>
     */
    @NameInMap("PathParams")
    public java.util.List<TestDataServiceApiRequestPathParams> pathParams;

    /**
     * <p>The request parameters that are contained in the query.</p>
     */
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
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ParamKey")
        public String paramKey;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>requestId</p>
         */
        @NameInMap("ParamKey")
        public String paramKey;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
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
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>path1</p>
         */
        @NameInMap("ParamKey")
        public String paramKey;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
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
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ParamKey")
        public String paramKey;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
