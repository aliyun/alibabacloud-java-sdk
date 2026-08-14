// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerChannelRequest extends TeaModel {
    /**
     * <p>The name of the consumer group. The name can be up to 128 characters in length. Specify a business-meaningful name for easy identification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>订阅组A</p>
     */
    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    /**
     * <p>The password of the consumer group account.</p>
     * <ul>
     * <li>The password must contain characters from at least two of the following categories: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    /**
     * <p>The username of the consumer group account.</p>
     * <p>The username can contain uppercase letters, lowercase letters, digits, and underscores (_). The username can be up to 16 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    /**
     * <p>The ID of the change tracking instance. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the instance ID.</p>
     * <blockquote>
     * <p>You must specify one of the <strong>DtsInstanceId</strong> and <strong>DtsJobId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsboss6pn1w******</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
     * <blockquote>
     * <p>You must specify one of the <strong>DtsInstanceId</strong> and <strong>DtsJobId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>boss6pn1w******</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the region in which the DTS change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
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
     * <p>rg-aek2zx4uizich7y</p>
     */
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
