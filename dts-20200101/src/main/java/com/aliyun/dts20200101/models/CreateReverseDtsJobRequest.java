// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateReverseDtsJobRequest extends TeaModel {
    /**
     * <p>The ID of the synchronization or migration task, which can be queried by calling <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n99m9jx822k****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>Resource GroupId</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Shard Password</p>
     * 
     * <strong>example:</strong>
     * <p>DTStest****</p>
     */
    @NameInMap("ShardPassword")
    public String shardPassword;

    /**
     * <p>Shard User name</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
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
