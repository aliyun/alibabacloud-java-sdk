// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateTrailRequest extends TeaModel {
    /**
     * <p>The read/write type of the events to be delivered. Valid values:</p>
     * <ul>
     * <li>Write: write events. It is the default value.</li>
     * <li>Read: read events.</li>
     * <li>All: read and write events.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("EventRW")
    public String eventRW;

    /**
     * <p>The ARN of the MaxCompute project to which you want to deliver events.</p>
     * <blockquote>
     * <p> The name of the MaxCompute project must be prefixed with actiontrail_.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:odps:cn-hangzhou:、151277687691****:project/actiontrail_****</p>
     */
    @NameInMap("MaxComputeProjectArn")
    public String maxComputeProjectArn;

    /**
     * <p>The ARN of the role that is assumed by ActionTrail to deliver events to the destination Simple Log Service project.</p>
     * <ul>
     * <li>If you do not specify this parameter, ActionTrail creates a service-linked role to create the required resources. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">Manage the service-linked role</a>.</li>
     * <li>If you specify this parameter and deliver events to the current account, you must grant the RAM role the permissions on the service-linked role for ActionTrail. If you want to deliver events to other accounts, you must attach a system policy to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events across Alibaba Cloud accounts</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::151277687691****:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("MaxComputeWriteRoleArn")
    public String maxComputeWriteRoleArn;

    /**
     * <p>The name of the trail whose configurations you want to update.</p>
     * <p>The name must be 6 to 36 characters in length and can contain lowercase letters, digits, hyphens (-), and underscores (_). It must start with a lowercase letter.</p>
     * <blockquote>
     * <p> The name must be unique within an Alibaba Cloud account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket to which you want to deliver events.</p>
     * <p>The name must be 3 to 63 characters in length. The name must start with a lowercase letter or a digit and can contain lowercase letters, digits, and hyphens (-).</p>
     * <blockquote>
     * <p> Make sure that the bucket exists before you update the configuration of the trail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>audit-log</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The prefix of the files that are stored in the OSS bucket.</p>
     * <p>The prefix must be 6 to 32 characters in length. The prefix must start with a letter and can contain letters, digits, hyphens (-), forward slashes (/), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>at-product-account-audit-B</p>
     */
    @NameInMap("OssKeyPrefix")
    public String ossKeyPrefix;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.</p>
     * <ul>
     * <li>If you do not specify this parameter, ActionTrail creates a service-linked role to create the required resources. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">Manage the service-linked role</a>.</li>
     * <li>If you specify this parameter, you must grant the permissions of the service-linked role that is assumed by ActionTrail to the RAM role before you can deliver events to your Alibaba Cloud account. If you need to deliver events to other Alibaba Cloud accounts, you must attach the permission policy that is used to grant permissions related to event delivery to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events across Alibaba Cloud accounts</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("OssWriteRoleArn")
    public String ossWriteRoleArn;

    /**
     * <p>The ARN of the Log Service project to which you want to deliver events.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:log:cn-shanghai::project/***</p>
     */
    @NameInMap("SlsProjectArn")
    public String slsProjectArn;

    /**
     * <p>The ARN of the RAM role that is assumed by ActionTrail to deliver events to the Log Service project.</p>
     * <ul>
     * <li>If you do not specify this parameter, ActionTrail creates a service-linked role to create the corresponding resource. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">Manage the service-linked role</a>.</li>
     * <li>If you specify this parameter, you must grant the permissions of the service-linked role that is assumed by ActionTrail to the RAM role before you can deliver events to your Alibaba Cloud account. If you need to deliver events to other Alibaba Cloud accounts, you must attach the permission policy that is used to grant permissions related to event delivery to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events across Alibaba Cloud accounts</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("SlsWriteRoleArn")
    public String slsWriteRoleArn;

    /**
     * <p>The region of the trail.</p>
     * <ul>
     * <li>The default value is All, which indicates that the trail delivers events from all regions.</li>
     * </ul>
     * <p>You can also specify specific regions. You can call the <a href="https://help.aliyun.com/document_detail/213597.html">DescribeRegions</a> operation to query all the supported regions.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("TrailRegion")
    public String trailRegion;

    public static UpdateTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrailRequest self = new UpdateTrailRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrailRequest setEventRW(String eventRW) {
        this.eventRW = eventRW;
        return this;
    }
    public String getEventRW() {
        return this.eventRW;
    }

    public UpdateTrailRequest setMaxComputeProjectArn(String maxComputeProjectArn) {
        this.maxComputeProjectArn = maxComputeProjectArn;
        return this;
    }
    public String getMaxComputeProjectArn() {
        return this.maxComputeProjectArn;
    }

    public UpdateTrailRequest setMaxComputeWriteRoleArn(String maxComputeWriteRoleArn) {
        this.maxComputeWriteRoleArn = maxComputeWriteRoleArn;
        return this;
    }
    public String getMaxComputeWriteRoleArn() {
        return this.maxComputeWriteRoleArn;
    }

    public UpdateTrailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTrailRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public UpdateTrailRequest setOssKeyPrefix(String ossKeyPrefix) {
        this.ossKeyPrefix = ossKeyPrefix;
        return this;
    }
    public String getOssKeyPrefix() {
        return this.ossKeyPrefix;
    }

    public UpdateTrailRequest setOssWriteRoleArn(String ossWriteRoleArn) {
        this.ossWriteRoleArn = ossWriteRoleArn;
        return this;
    }
    public String getOssWriteRoleArn() {
        return this.ossWriteRoleArn;
    }

    public UpdateTrailRequest setSlsProjectArn(String slsProjectArn) {
        this.slsProjectArn = slsProjectArn;
        return this;
    }
    public String getSlsProjectArn() {
        return this.slsProjectArn;
    }

    public UpdateTrailRequest setSlsWriteRoleArn(String slsWriteRoleArn) {
        this.slsWriteRoleArn = slsWriteRoleArn;
        return this;
    }
    public String getSlsWriteRoleArn() {
        return this.slsWriteRoleArn;
    }

    public UpdateTrailRequest setTrailRegion(String trailRegion) {
        this.trailRegion = trailRegion;
        return this;
    }
    public String getTrailRegion() {
        return this.trailRegion;
    }

}
