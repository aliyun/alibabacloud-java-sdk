// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetTrailStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the status of a multi-account trail. Valid values:</p>
     * <ul>
     * <li>true: Query the status of a multi-account trail.</li>
     * <li>false: Query the status of a single-account trail. It is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOrganizationTrail")
    public Boolean isOrganizationTrail;

    /**
     * <p>The name of the trail.</p>
     * <p>The name must be 6 to 36 characters in length. The name must start with a lowercase letter and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * <blockquote>
     * <p>The name must be unique within your Alibaba Cloud account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-test</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetTrailStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrailStatusRequest self = new GetTrailStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTrailStatusRequest setIsOrganizationTrail(Boolean isOrganizationTrail) {
        this.isOrganizationTrail = isOrganizationTrail;
        return this;
    }
    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    public GetTrailStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
