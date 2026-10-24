// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class UpdateAssetScopeRequest extends TeaModel {
    /**
     * <p>The asset scope ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1932</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The effective scope mode. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: All user groups.</li>
     * <li><strong>UserGroupNormal</strong>: Specified user groups.</li>
     * <li><strong>DeviceGroupNormal</strong>: Specified device groups.</li>
     * <li><strong>DevTagNormal</strong>: Specified device tags.</li>
     * </ul>
     * <p>This field determines the meaning of MatchTargetIds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The IDs of the user groups, device tags, or tag groups.</p>
     */
    @NameInMap("MatchTargetIds")
    public java.util.List<String> matchTargetIds;

    public static UpdateAssetScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetScopeRequest self = new UpdateAssetScopeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAssetScopeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAssetScopeRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public UpdateAssetScopeRequest setMatchTargetIds(java.util.List<String> matchTargetIds) {
        this.matchTargetIds = matchTargetIds;
        return this;
    }
    public java.util.List<String> getMatchTargetIds() {
        return this.matchTargetIds;
    }

}
