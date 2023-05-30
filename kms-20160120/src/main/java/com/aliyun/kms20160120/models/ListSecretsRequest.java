// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretsRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("FetchTags")
    public String fetchTags;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The secret filter. The filter consists of one or more key-value pairs. You can specify one key-value pair or leave this parameter empty. If you use one tag key or tag value to filter resources, up to 4,000 resources can be queried. If you want to query more than 4,000 resources, call the [ListResourceTags](~~120090~~) operation.</p>
     * <br>
     * <p>*   Key</p>
     * <br>
     * <p>    *   Description: the property that you want to filter.</p>
     * <br>
     * <p>    *   Type: string.</p>
     * <br>
     * <p>    *   Valid values:</p>
     * <br>
     * <p>        *   SecretName: the secret name.</p>
     * <p>        *   Description: the description of the secret.</p>
     * <p>        *   TagKey: the tag key.</p>
     * <p>        *   TagValue: the tag value.</p>
     * <br>
     * <p>*   Values</p>
     * <br>
     * <p>    *   Description: the value to be included after filtering.</p>
     * <br>
     * <p>    *   Type: string.</p>
     * <br>
     * <p>    *   Length: 0 to 10.</p>
     * <br>
     * <p>    *   Valid values:</p>
     * <br>
     * <p>        *   If the Key field is set to SecretName, the value must be 1 to 192 characters in length and can contain letters, digits, and special characters `_ / + = . @ -`.</p>
     * <p>        *   If the Key field is set to Description, the value must be 1 to 256 characters in length.</p>
     * <p>        *   If the Key field is set to TagKey, the value must be 1 to 256 characters in length and can contain letters, digits, and special characters `/ _ - . + = @ :`.</p>
     * <p>        *   If the Key field is set to TagValue, the value must be 1 to 256 characters in length and can contain letters, numbers, and special characters `/ _ - . + = @ :`.</p>
     * <br>
     * <p>The logical relationship between values of the Values field in a key-value pair is OR. Example: `[ {"Key":"SecretName", "Values":["sec1","sec2"]}]`. In this example, the semantics are `SecretName=sec 1 OR SecretName=sec 2`.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the returned page.</p>
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
