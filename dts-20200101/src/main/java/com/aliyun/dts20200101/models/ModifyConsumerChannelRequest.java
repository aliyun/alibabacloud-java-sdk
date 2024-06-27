// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerChannelRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group. You can call the <a href="https://help.aliyun.com/document_detail/264169.html">DescribeConsumerChannel</a> operation to query the consumer group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsor2y66j4219****</p>
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
     * <ul>
     * <li>A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>A password must be 8 to 32 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    /**
     * <p>The new username of the consumer group.</p>
     * <ul>
     * <li>A username can contain one or more of the following character types: uppercase letters, lowercase letters, digits, and underscores (_).</li>
     * <li>A username cannot exceed 16 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    /**
     * <p>The ID of the change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>DtsInstanceId</strong> and <strong>DtsJobId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsboss6pn1w73****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>DtsInstanceId</strong> and <strong>DtsJobId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>boss6pn1w73****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the region where the change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
