// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretVersionIdsRequest extends TeaModel {
    /**
     * <p>Specifies whether to include credential versions that have no version stages in the response.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>false (default): No</p>
     * </li>
     * <li><p>true: Yes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDeprecated")
    public String includeDeprecated;

    /**
     * <p>The number of the page to return for a paged query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or Alibaba Cloud Resource Name (ARN) of the credential.</p>
     * <blockquote>
     * <p>When you access a credential that belongs to another Alibaba Cloud account, you must specify the ARN of the credential. The ARN of a credential is in the format of <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
     * </blockquote>
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
