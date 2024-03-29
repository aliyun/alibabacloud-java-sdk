// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerChannelRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group. You can call the [DescribeConsumerChannel](~~264169~~) operation to query the consumer group ID.</p>
     */
    @NameInMap("ConsumerGroupId")
    public String consumerGroupId;

    /**
     * <p>The name of the consumer group. The name cannot exceed 128 characters in length. We recommend that you use an informative name for easy identification.</p>
     */
    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    /**
     * <p>The new password of the consumer group.</p>
     * <br>
     * <p>*   A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>*   A password must be 8 to 32 characters in length.</p>
     */
    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    /**
     * <p>The new username of the consumer group.</p>
     * <br>
     * <p>*   A username can contain one or more of the following character types: uppercase letters, lowercase letters, digits, and underscores (\_).</p>
     * <p>*   A username cannot exceed 16 characters in length.</p>
     */
    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    /**
     * <p>The ID of the change tracking instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.</p>
     * <br>
     * <p>>  You must specify at least one of the **DtsInstanceId** and **DtsJobId** parameters.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     * <br>
     * <p>>  You must specify at least one of the **DtsInstanceId** and **DtsJobId** parameters.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the region where the change tracking instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyConsumerChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerChannelRequest self = new ModifyConsumerChannelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerChannelRequest setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public ModifyConsumerChannelRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    public ModifyConsumerChannelRequest setConsumerGroupPassword(String consumerGroupPassword) {
        this.consumerGroupPassword = consumerGroupPassword;
        return this;
    }
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    public ModifyConsumerChannelRequest setConsumerGroupUserName(String consumerGroupUserName) {
        this.consumerGroupUserName = consumerGroupUserName;
        return this;
    }
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    public ModifyConsumerChannelRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyConsumerChannelRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyConsumerChannelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyConsumerChannelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
