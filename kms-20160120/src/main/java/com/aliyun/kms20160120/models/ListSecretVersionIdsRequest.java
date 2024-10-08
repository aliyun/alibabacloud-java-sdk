// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretVersionIdsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return deprecated secret versions.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>false: no</li>
     * <li>true: yes</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDeprecated")
    public String includeDeprecated;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static ListSecretVersionIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecretVersionIdsRequest self = new ListSecretVersionIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecretVersionIdsRequest setIncludeDeprecated(String includeDeprecated) {
        this.includeDeprecated = includeDeprecated;
        return this;
    }
    public String getIncludeDeprecated() {
        return this.includeDeprecated;
    }

    public ListSecretVersionIdsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSecretVersionIdsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSecretVersionIdsRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
