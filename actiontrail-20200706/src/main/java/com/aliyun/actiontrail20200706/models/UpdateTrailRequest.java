// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateTrailRequest extends TeaModel {
    /**
     * <p>The read/write type of the events to be delivered. Valid values:</p>
     * <br>
     * <p>*   Write: write events. It is the default value.</p>
     * <p>*   Read: read events.</p>
     * <p>*   All: read and write events.</p>
     */
    @NameInMap("EventRW")
    public String eventRW;

    @NameInMap("MaxComputeProjectArn")
    public String maxComputeProjectArn;

    @NameInMap("MaxComputeWriteRoleArn")
    public String maxComputeWriteRoleArn;

    /**
     * <p>The name of the trail whose configurations you want to update.</p>
     * <br>
     * <p>The name must be 6 to 36 characters in length and can contain lowercase letters, digits, hyphens (-), and underscores (\_). It must start with a lowercase letter.</p>
     * <br>
     * <p>>  The name must be unique within an Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket to which you want to deliver events.</p>
     * <br>
     * <p>The name must be 3 to 63 characters in length. The name must start with a lowercase letter or a digit and can contain lowercase letters, digits, and hyphens (-).</p>
     * <br>
     * <p>>  Make sure that the bucket exists before you update the configuration of the trail.</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The prefix of the files that are stored in the OSS bucket.</p>
     * <br>
     * <p>The prefix must be 6 to 32 characters in length. The prefix must start with a letter and can contain letters, digits, hyphens (-), forward slashes (/), and underscores (\_).</p>
     */
    @NameInMap("OssKeyPrefix")
    public String ossKeyPrefix;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.</p>
     * <br>
     * <p>*   If you do not specify this parameter, ActionTrail creates a service-linked role to create the required resources. For more information, see [Manage the service-linked role](~~169244~~).</p>
     * <p>*   If you specify this parameter, you must grant the permissions of the service-linked role that is assumed by ActionTrail to the RAM role before you can deliver events to your Alibaba Cloud account. If you need to deliver events to other Alibaba Cloud accounts, you must attach the permission policy that is used to grant permissions related to event delivery to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see [Deliver events across Alibaba Cloud accounts](~~207462~~).</p>
     */
    @NameInMap("OssWriteRoleArn")
    public String ossWriteRoleArn;

    /**
     * <p>The ARN of the Log Service project to which you want to deliver events.</p>
     */
    @NameInMap("SlsProjectArn")
    public String slsProjectArn;

    /**
     * <p>The ARN of the RAM role that is assumed by ActionTrail to deliver events to the Log Service project.</p>
     * <br>
     * <p>*   If you do not specify this parameter, ActionTrail creates a service-linked role to create the corresponding resource. For more information, see [Manage the service-linked role](~~169244~~).</p>
     * <p>*   If you specify this parameter, you must grant the permissions of the service-linked role that is assumed by ActionTrail to the RAM role before you can deliver events to your Alibaba Cloud account. If you need to deliver events to other Alibaba Cloud accounts, you must attach the permission policy that is used to grant permissions related to event delivery to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see [Deliver events across Alibaba Cloud accounts](~~207462~~).</p>
     */
    @NameInMap("SlsWriteRoleArn")
    public String slsWriteRoleArn;

    /**
     * <p>The region of the trail.</p>
     * <br>
     * <p>*   The default value is All, which indicates that the trail delivers events from all regions.</p>
     * <br>
     * <p>You can also specify specific regions. You can call the [DescribeRegions](~~213597~~) operation to query all the supported regions.</p>
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
