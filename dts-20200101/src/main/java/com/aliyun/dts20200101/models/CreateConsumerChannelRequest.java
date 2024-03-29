// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerChannelRequest extends TeaModel {
    /**
     * <p>The name of the consumer group. The name can be up to 128 characters in length. We recommend that you use an informative name for easy identification.</p>
     */
    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    /**
     * <p>The password of the consumer group.</p>
     * <br>
     * <p>*   A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>*   A password must be 8 to 32 characters in length.</p>
     */
    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    /**
     * <p>The username of the consumer group.</p>
     * <br>
     * <p>*   A username must contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (\_).</p>
     * <p>*   A username cannot exceed 16 characters in length.</p>
     */
    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    /**
     * <p>The ID of the change tracking instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.</p>
     * <br>
     * <p>>  You must specify at least one of the **DtsInstanceId** and **DtsJobId**. parameters.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     * <br>
     * <p>>  You must specify at least one of the **DtsInstanceId** and **DtsJobId**. parameters.</p>
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

    public static CreateConsumerChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerChannelRequest self = new CreateConsumerChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerChannelRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    public CreateConsumerChannelRequest setConsumerGroupPassword(String consumerGroupPassword) {
        this.consumerGroupPassword = consumerGroupPassword;
        return this;
    }
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    public CreateConsumerChannelRequest setConsumerGroupUserName(String consumerGroupUserName) {
        this.consumerGroupUserName = consumerGroupUserName;
        return this;
    }
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    public CreateConsumerChannelRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public CreateConsumerChannelRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public CreateConsumerChannelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateConsumerChannelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
