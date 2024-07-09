// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyAclEntriesRequest extends TeaModel {
    /**
     * <p>The Internet access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>allow: allows access to the Internet.</p>
     * </li>
     * <li><p>disable: forbids access to the Internet.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>allow</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance IDs (office network IDs or cloud computer IDs) to which the Internet access control policy is applicable.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceId")
    public java.util.List<String> sourceId;

    /**
     * <p>The granularity to which the Internet access control policy is applicable.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>desktop: cloud computer granularity.</p>
     * </li>
     * <li><p>vpc: office network granularity.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ModifyAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAclEntriesRequest self = new ModifyAclEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAclEntriesRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifyAclEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAclEntriesRequest setSourceId(java.util.List<String> sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    public ModifyAclEntriesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
