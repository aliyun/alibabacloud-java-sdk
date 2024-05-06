// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudAccessRequest extends TeaModel {
    @NameInMap("CloudName")
    public String cloudName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("SecretId")
    public String secretId;

    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListCloudAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccessRequest self = new ListCloudAccessRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAccessRequest setCloudName(String cloudName) {
        this.cloudName = cloudName;
        return this;
    }
    public String getCloudName() {
        return this.cloudName;
    }

    public ListCloudAccessRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudAccessRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public ListCloudAccessRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
