// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return resource tags for each secret. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Resource tags are returned.</p>
     * </li>
     * <li><p><code>false</code> (default): Resource tags are not returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FetchTags")
    public String fetchTags;

    /**
     * <p>Filters secrets based on specified conditions. The value is a list of up to 10 key-value pairs. When you filter by tag, the query returns a maximum of 4,000 resources. If more than 4,000 resources match the filter, call the <a href="https://help.aliyun.com/document_detail/120090.html">ListResourceTags</a> operation.</p>
     * <ul>
     * <li><p>Key</p>
     * <ul>
     * <li><p>Description: The filter property.</p>
     * </li>
     * <li><p>Type: String.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Values</p>
     * <ul>
     * <li><p>Description: The filter value.</p>
     * </li>
     * <li><p>Type: String.</p>
     * </li>
     * <li><p>You can specify up to 10 items.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>Valid values for Key:</p>
     * <ul>
     * <li><p>Set <code>Key</code> to <strong>SecretName</strong> to filter by secret name.</p>
     * </li>
     * <li><p>Set <code>Key</code> to <strong>Description</strong> to filter by secret description.</p>
     * </li>
     * <li><p>Set <code>Key</code> to <strong>TagKey</strong> to filter by tag key.</p>
     * </li>
     * <li><p>Set <code>Key</code> to <strong>TagValue</strong> to filter by tag value.</p>
     * </li>
     * <li><p>Set <code>Key</code> to <strong>DKMSInstanceId</strong> to filter by KMS instance ID.</p>
     * </li>
     * <li><p>Set Key to <strong>SecretType</strong> to filter by secret type. <code>Values</code> can be <code>Generic</code>, <code>RDS</code>, <code>Redis</code>, <code>RAMCredentials</code>, <code>ECS</code>, or <code>PolarDB</code>.</p>
     * </li>
     * <li><p>Set <code>Key</code> to <strong>Creator</strong> to filter by the creator of the secret.</p>
     * </li>
     * </ul>
     * <p>If you specify multiple values for a key, the filter applies a logical OR. For example, if you enter <code>[ {&quot;Key&quot;:&quot;SecretName&quot;, &quot;Values&quot;:[&quot;sec1&quot;,&quot;sec2&quot;]} ]</code>, this means: <code>(SecretName=sec1 OR SecretName=sec2)</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;:&quot;SecretName&quot;, &quot;Values&quot;:[&quot;Val1&quot;,&quot;Val2&quot;]}]</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The page number.<br>
     * The value must be greater than 0.<br>
     * Default: 1.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.<br>
     * The value must be between 1 and 100.<br>
     * Default: 10.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsRequest self = new ListSecretsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecretsRequest setFetchTags(String fetchTags) {
        this.fetchTags = fetchTags;
        return this;
    }
    public String getFetchTags() {
        return this.fetchTags;
    }

    public ListSecretsRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListSecretsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSecretsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
