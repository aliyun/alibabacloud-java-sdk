// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ECR ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-fu8rszhgv7623c****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The maximum number of entries to read. Valid values: 1 to 2147483647. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the ECR.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>e0a2dbeb69a8beeeb8194e92b702df3fd3e7bfe6ce7bfc16e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group to which the ECR belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2aq7f4va****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeExpressConnectRouterRequestTag> tag;

    public static DescribeExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterRequest self = new DescribeExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeExpressConnectRouterRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public DescribeExpressConnectRouterRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectRouterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeExpressConnectRouterRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectRouterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeExpressConnectRouterRequest setTag(java.util.List<DescribeExpressConnectRouterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeExpressConnectRouterRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeExpressConnectRouterRequestTag extends TeaModel {
        /**
         * <p>The tag keys.</p>
         * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A tag value.</p>
         * <p>A tag value can be a maximum of 128 characters in length. It cannot contain <code>http://</code> or <code>https://</code> and cannot start with <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeExpressConnectRouterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterRequestTag self = new DescribeExpressConnectRouterRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExpressConnectRouterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
