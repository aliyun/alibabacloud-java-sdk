// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeSecretKeysRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecretKeyId")
    public String secretKeyId;

    @NameInMap("SecretKeyName")
    public String secretKeyName;

    public static DescribeSecretKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretKeysRequest self = new DescribeSecretKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecretKeysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecretKeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecretKeysRequest setSecretKeyId(String secretKeyId) {
        this.secretKeyId = secretKeyId;
        return this;
    }
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    public DescribeSecretKeysRequest setSecretKeyName(String secretKeyName) {
        this.secretKeyName = secretKeyName;
        return this;
    }
    public String getSecretKeyName() {
        return this.secretKeyName;
    }

}
