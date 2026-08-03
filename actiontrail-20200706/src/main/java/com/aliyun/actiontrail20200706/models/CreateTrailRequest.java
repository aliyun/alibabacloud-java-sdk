// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateTrailRequest extends TeaModel {
    /**
     * <p>Specifies the read/write type of events that the trail delivers. Valid values:</p>
     * <ul>
     * <li><p>Write: Write events.</p>
     * </li>
     * <li><p>Read: Read events.</p>
     * </li>
     * <li><p>All (default): All read and write events.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Write</p>
     */
    @NameInMap("EventRW")
    public String eventRW;

    /**
     * <p>Specifies whether the trail is a multi-account trail. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * <p>To create a trail for an organization, set this parameter to <code>true</code>. The trail will collect events from all member accounts in the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOrganizationTrail")
    public Boolean isOrganizationTrail;

    /**
     * <p>The ARN of the MaxCompute project to which ActionTrail delivers events.</p>
     * <blockquote>
     * <p>You must specify a destination for the trail by providing at least one of the following parameters: <code>OssBucketName</code>, <code>SlsProjectArn</code>, or <code>MaxComputeProjectArn</code>.</p>
     * </blockquote>
     * <blockquote>
     * <p>The project name in the ARN must start with <code>actiontrail_</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:odps:cn-hangzhou:15127787691****:project/actiontrail_****</p>
     */
    @NameInMap("MaxComputeProjectArn")
    public String maxComputeProjectArn;

    /**
     * <p>The ARN of the RAM role that ActionTrail assumes to deliver events to the MaxCompute project.</p>
     * <ul>
     * <li><p>If this parameter is not specified, ActionTrail creates a service-linked role to deliver events. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">ActionTrail service-linked role</a>.</p>
     * </li>
     * <li><p>If you specify a role, it must be a RAM role that you created. This role must have a trust policy that allows the ActionTrail service (\<code>actiontrail.aliyuncs.com\\</code>) to assume it. The role\&quot;s permission policy must grant permissions to write to the specified MaxCompute project. For more information about cross-account delivery, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events from multiple Alibaba Cloud accounts to the same account</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::15127787691****:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("MaxComputeWriteRoleArn")
    public String maxComputeWriteRoleArn;

    /**
     * <p>The name of the trail.</p>
     * <blockquote>
     * <ul>
     * <li><p>Length: 6 to 36 characters.</p>
     * </li>
     * <li><p>Characters: Lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>Must start with a lowercase letter.</p>
     * </li>
     * <li><p>Must be uniquewithin an Alibaba Cloud account.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the OSS bucket to which ActionTrail delivers events.</p>
     * <ul>
     * <li><p>Length: 3 to 63 characters.</p>
     * </li>
     * <li><p>Characters: Lowercase letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>Must start with a lowercase letter or a digit.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify a destination for the trail by providing at least one of the following parameters: <code>OssBucketName</code>, <code>SlsProjectArn</code>, or <code>MaxComputeProjectArn</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>audit-log</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The prefix for the names of log files that ActionTrail delivers to your OSS bucket.</p>
     * <ul>
     * <li><p>Length: 6 to 32 characters.</p>
     * </li>
     * <li><p>Characters: Letters, digits, hyphens (-), forward slashes (/), and underscores (_).</p>
     * </li>
     * <li><p>Must start with a letter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>at-product-account-audit-B</p>
     */
    @NameInMap("OssKeyPrefix")
    public String ossKeyPrefix;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that ActionTrail assumes to deliver events to the OSS bucket.</p>
     * <ul>
     * <li><p>If you do not specify this parameter, ActionTrail creates a service-linked role to deliver events. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">ActionTrail service-linked role</a>.</p>
     * </li>
     * <li><p>If you specify a role, it must be a RAM role that you created. This role must have a trust policy that allows the ActionTrail service (actiontrail.aliyuncs.com) to assume it. The role\&quot;s RAM policy must grant permissions to write to the specified OSS bucket. For more information about cross-account delivery, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events from multiple Alibaba Cloud accounts to the same account</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::15127787691****:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("OssWriteRoleArn")
    public String ossWriteRoleArn;

    /**
     * <p>The ARN of the SLS project to which ActionTrail delivers events.</p>
     * <blockquote>
     * <p>You must specify a destination for the trail by providing at least one of the following parameters: <code>OssBucketName</code>, <code>SlsProjectArn</code>, or <code>MaxComputeProjectArn</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:log:cn-shanghai:151266687691****:project/test-project</p>
     */
    @NameInMap("SlsProjectArn")
    public String slsProjectArn;

    /**
     * <p>The ARN of the RAM role that ActionTrail assumes to deliver events to the SLS project.</p>
     * <ul>
     * <li><p>If this parameter is not specified, ActionTrail creates a service-linked role to deliver events. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">ActionTrail service-linked role</a>.</p>
     * </li>
     * <li><p>If you specify a role, it must be a RAM role that you created. This role must have a trust policy that allows the ActionTrail service (actiontrail.aliyuncs.com) to assume it. The role\&quot;s permission policy must grant permissions to write to the specified SLS project. For more information about cross-account delivery, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events from multiple Alibaba Cloud accounts to the same account</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::151266687691****:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("SlsWriteRoleArn")
    public String slsWriteRoleArn;

    /**
     * <p>The region in which the trail is created. By default, a trail is created in all regions and this parameter is set to <code>All</code>. To create a trail in a specific region, provide the region ID. For more information about regions, call the <a href="https://help.aliyun.com/document_detail/213597.html">DescribeRegions</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("TrailRegion")
    public String trailRegion;

    public static CreateTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrailRequest self = new CreateTrailRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrailRequest setEventRW(String eventRW) {
        this.eventRW = eventRW;
        return this;
    }
    public String getEventRW() {
        return this.eventRW;
    }

    public CreateTrailRequest setIsOrganizationTrail(Boolean isOrganizationTrail) {
        this.isOrganizationTrail = isOrganizationTrail;
        return this;
    }
    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    public CreateTrailRequest setMaxComputeProjectArn(String maxComputeProjectArn) {
        this.maxComputeProjectArn = maxComputeProjectArn;
        return this;
    }
    public String getMaxComputeProjectArn() {
        return this.maxComputeProjectArn;
    }

    public CreateTrailRequest setMaxComputeWriteRoleArn(String maxComputeWriteRoleArn) {
        this.maxComputeWriteRoleArn = maxComputeWriteRoleArn;
        return this;
    }
    public String getMaxComputeWriteRoleArn() {
        return this.maxComputeWriteRoleArn;
    }

    public CreateTrailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTrailRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateTrailRequest setOssKeyPrefix(String ossKeyPrefix) {
        this.ossKeyPrefix = ossKeyPrefix;
        return this;
    }
    public String getOssKeyPrefix() {
        return this.ossKeyPrefix;
    }

    public CreateTrailRequest setOssWriteRoleArn(String ossWriteRoleArn) {
        this.ossWriteRoleArn = ossWriteRoleArn;
        return this;
    }
    public String getOssWriteRoleArn() {
        return this.ossWriteRoleArn;
    }

    public CreateTrailRequest setSlsProjectArn(String slsProjectArn) {
        this.slsProjectArn = slsProjectArn;
        return this;
    }
    public String getSlsProjectArn() {
        return this.slsProjectArn;
    }

    public CreateTrailRequest setSlsWriteRoleArn(String slsWriteRoleArn) {
        this.slsWriteRoleArn = slsWriteRoleArn;
        return this;
    }
    public String getSlsWriteRoleArn() {
        return this.slsWriteRoleArn;
    }

    public CreateTrailRequest setTrailRegion(String trailRegion) {
        this.trailRegion = trailRegion;
        return this;
    }
    public String getTrailRegion() {
        return this.trailRegion;
    }

}
