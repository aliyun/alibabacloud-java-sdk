// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListHealthCheckTemplatesRequest extends TeaModel {
    /**
     * <p>The IDs of health check templates.</p>
     */
    @NameInMap("HealthCheckTemplateIds")
    public java.util.List<String> healthCheckTemplateIds;

    /**
     * <p>The health check templates.</p>
     */
    @NameInMap("HealthCheckTemplateNames")
    public java.util.List<String> healthCheckTemplateNames;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListHealthCheckTemplatesRequestTag> tag;

    public static ListHealthCheckTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHealthCheckTemplatesRequest self = new ListHealthCheckTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListHealthCheckTemplatesRequest setHealthCheckTemplateIds(java.util.List<String> healthCheckTemplateIds) {
        this.healthCheckTemplateIds = healthCheckTemplateIds;
        return this;
    }
    public java.util.List<String> getHealthCheckTemplateIds() {
        return this.healthCheckTemplateIds;
    }

    public ListHealthCheckTemplatesRequest setHealthCheckTemplateNames(java.util.List<String> healthCheckTemplateNames) {
        this.healthCheckTemplateNames = healthCheckTemplateNames;
        return this;
    }
    public java.util.List<String> getHealthCheckTemplateNames() {
        return this.healthCheckTemplateNames;
    }

    public ListHealthCheckTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHealthCheckTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHealthCheckTemplatesRequest setTag(java.util.List<ListHealthCheckTemplatesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListHealthCheckTemplatesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListHealthCheckTemplatesRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListHealthCheckTemplatesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListHealthCheckTemplatesRequestTag self = new ListHealthCheckTemplatesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListHealthCheckTemplatesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListHealthCheckTemplatesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
