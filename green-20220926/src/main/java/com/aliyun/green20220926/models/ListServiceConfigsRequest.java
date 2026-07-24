// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListServiceConfigsRequest extends TeaModel {
    /**
     * <p>The classification.</p>
     * 
     * <strong>example:</strong>
     * <p>guard-scene</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>The protection type. Valid values:</p>
     * <ul>
     * <li><p>modelProtection: model protection.</p>
     * </li>
     * <li><p>agentRealtimeProtection: agent real-time protection.</p>
     * </li>
     * <li><p>agentBehaviorAudit: agent behavior audit.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>modelProtection</p>
     */
    @NameInMap("ProtectionType")
    public String protectionType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The usage status.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("UseStatus")
    public String useStatus;

    public static ListServiceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConfigsRequest self = new ListServiceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceConfigsRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public ListServiceConfigsRequest setProtectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }
    public String getProtectionType() {
        return this.protectionType;
    }

    public ListServiceConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceConfigsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListServiceConfigsRequest setUseStatus(String useStatus) {
        this.useStatus = useStatus;
        return this;
    }
    public String getUseStatus() {
        return this.useStatus;
    }

}
