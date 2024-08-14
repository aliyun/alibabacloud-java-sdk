// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretsRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FetchTags")
    public String fetchTags;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;:&quot;SecretName&quot;, &quot;Values&quot;:[&quot;Val1&quot;,&quot;Val2&quot;]}]</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The secret filter. The filter consists of one or more key-value pairs. You can specify one key-value pair or leave this parameter empty. If you use one tag key or tag value to filter resources, up to 4,000 resources can be queried. If you want to query more than 4,000 resources, call the <a href="https://help.aliyun.com/document_detail/120090.html">ListResourceTags</a> operation.</p>
     * <ul>
     * <li><p>Key</p>
     * <ul>
     * <li><p>Description: the property that you want to filter.</p>
     * </li>
     * <li><p>Type: string.</p>
     * </li>
     * <li><p>Valid values:</p>
     * <ul>
     * <li>SecretName: the secret name.</li>
     * <li>Description: the description of the secret.</li>
     * <li>TagKey: the tag key.</li>
     * <li>TagValue: the tag value.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>Values</p>
     * <ul>
     * <li><p>Description: the value to be included after filtering.</p>
     * </li>
     * <li><p>Type: string.</p>
     * </li>
     * <li><p>Length: 0 to 10.</p>
     * </li>
     * <li><p>Valid values:</p>
     * <ul>
     * <li>If the Key field is set to SecretName, the value must be 1 to 192 characters in length and can contain letters, digits, and special characters <code>_ / + = . @ -</code>.</li>
     * <li>If the Key field is set to Description, the value must be 1 to 256 characters in length.</li>
     * <li>If the Key field is set to TagKey, the value must be 1 to 256 characters in length and can contain letters, digits, and special characters <code>/ _ - . + = @ :</code>.</li>
     * <li>If the Key field is set to TagValue, the value must be 1 to 256 characters in length and can contain letters, numbers, and special characters <code>/ _ - . + = @ :</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>The logical relationship between values of the Values field in a key-value pair is OR. Example: <code>[ {&quot;Key&quot;:&quot;SecretName&quot;, &quot;Values&quot;:[&quot;sec1&quot;,&quot;sec2&quot;]}]</code>. In this example, the semantics are <code>SecretName=sec 1 OR SecretName=sec 2</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the returned page.</p>
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
