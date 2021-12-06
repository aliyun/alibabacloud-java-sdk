// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationProvisioningsRequest extends TeaModel {
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProvisioningStatus")
    public String provisioningStatus;

    @NameInMap("TargetId")
    public String targetId;

    @NameInMap("TargetType")
    public String targetType;

    public static ListAccessConfigurationProvisioningsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationProvisioningsRequest self = new ListAccessConfigurationProvisioningsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationProvisioningsRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public ListAccessConfigurationProvisioningsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListAccessConfigurationProvisioningsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessConfigurationProvisioningsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessConfigurationProvisioningsRequest setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }
    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    public ListAccessConfigurationProvisioningsRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListAccessConfigurationProvisioningsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
