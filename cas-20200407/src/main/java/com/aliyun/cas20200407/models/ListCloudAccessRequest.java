// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudAccessRequest extends TeaModel {
    /**
     * <p>The cloud service provider. Set the value to <strong>Tencent</strong>, which indicates Tencent Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("CloudName")
    public String cloudName;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The AccessKey ID that is used to access cloud resources.</p>
     * 
     * <strong>example:</strong>
     * <p>276</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The number of entries per page. Valid values: <strong>10</strong>, <strong>20</strong>, and <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
