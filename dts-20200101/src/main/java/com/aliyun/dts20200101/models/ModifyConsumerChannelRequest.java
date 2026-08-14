// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerChannelRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group. You can call <a href="https://help.aliyun.com/document_detail/264169.html">DescribeConsumerChannel</a> to query the consumer group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsor2y66j4219****</p>
     */
    @NameInMap("ConsumerGroupId")
    public String consumerGroupId;

    /**
     * <p>The new name of the consumer group. The name can be up to 128 characters in length. Specify a descriptive name for easy identification.</p>
     * 
     * <strong>example:</strong>
     * <p>订阅组B</p>
     */
    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    /**
     * <p>The new password of the consumer group account.</p>
     * <ul>
     * <li>The password must contain characters from at least two of the following categories: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    /**
     * <p>The new username of the consumer group account.</p>
     * <ul>
     * <li>The username can contain one or more types of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).</li>
     * <li>The username can be up to 16 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    /**
     * <p>The ID of the change tracking instance. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the instance ID.</p>
     * <blockquote>
     * <p>You must specify either <strong>DtsInstanceId</strong> or <strong>DtsJobId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsboss6pn1w73****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
     * <blockquote>
     * <p>You must specify either <strong>DtsInstanceId</strong> or <strong>DtsJobId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>boss6pn1w73****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The region ID of the DTS change tracking instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
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
