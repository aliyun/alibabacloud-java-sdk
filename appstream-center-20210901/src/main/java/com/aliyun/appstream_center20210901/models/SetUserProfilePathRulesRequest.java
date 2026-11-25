// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class SetUserProfilePathRulesRequest extends TeaModel {
    /**
     * <p>The ID of a single app instance group. You must specify either this parameter or AppInstanceGroupSetId. If the cloud application or cloud browser app instance group belongs to an enabled set, you must configure the rules for the set.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-0bi83v****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The ID of an enabled app instance group set. You must specify either this parameter or AppInstanceGroupId. You can configure rules for up to 200 member app instance groups at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstanceGroupSetId")
    public String appInstanceGroupSetId;

    /**
     * <p>The region ID. When you query or configure rules for a specific app instance group, specify the region where the target app instance group resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The JSON array string that contains the complete list of rules. Each item uses <code>blackPath</code> to specify the excluded path and <code>whitePaths</code> to specify the relative paths that still require roaming within the excluded directory. The path type <code>file</code> indicates a file, and <code>folder</code> indicates a directory.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;blackPath&quot;:{&quot;path&quot;:&quot;AppData\Local&quot;,&quot;type&quot;:&quot;folder&quot;},&quot;whitePaths&quot;:[{&quot;path&quot;:&quot;.\Microsoft\Office&quot;,&quot;type&quot;:&quot;folder&quot;}]}]</p>
     */
    @NameInMap("UserProfilePathRules")
    public String userProfilePathRules;

    /**
     * <p>The type of rule to configure. Set this parameter to <code>AppInstanceGroup</code> when you configure rules for an app instance group or an app instance group set.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroup</p>
     */
    @NameInMap("UserProfileRuleType")
    public String userProfileRuleType;

    public static SetUserProfilePathRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserProfilePathRulesRequest self = new SetUserProfilePathRulesRequest();
        return TeaModel.build(map, self);
    }

    public SetUserProfilePathRulesRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public SetUserProfilePathRulesRequest setAppInstanceGroupSetId(String appInstanceGroupSetId) {
        this.appInstanceGroupSetId = appInstanceGroupSetId;
        return this;
    }
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    public SetUserProfilePathRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetUserProfilePathRulesRequest setUserProfilePathRules(String userProfilePathRules) {
        this.userProfilePathRules = userProfilePathRules;
        return this;
    }
    public String getUserProfilePathRules() {
        return this.userProfilePathRules;
    }

    public SetUserProfilePathRulesRequest setUserProfileRuleType(String userProfileRuleType) {
        this.userProfileRuleType = userProfileRuleType;
        return this;
    }
    public String getUserProfileRuleType() {
        return this.userProfileRuleType;
    }

}
