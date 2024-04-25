// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateReverseDtsJobRequest extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ShardPassword")
    public String shardPassword;

    @NameInMap("ShardUsername")
    public String shardUsername;

    public static CreateReverseDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReverseDtsJobRequest self = new CreateReverseDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateReverseDtsJobRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public CreateReverseDtsJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateReverseDtsJobRequest setShardPassword(String shardPassword) {
        this.shardPassword = shardPassword;
        return this;
    }
    public String getShardPassword() {
        return this.shardPassword;
    }

    public CreateReverseDtsJobRequest setShardUsername(String shardUsername) {
        this.shardUsername = shardUsername;
        return this;
    }
    public String getShardUsername() {
        return this.shardUsername;
    }

}
