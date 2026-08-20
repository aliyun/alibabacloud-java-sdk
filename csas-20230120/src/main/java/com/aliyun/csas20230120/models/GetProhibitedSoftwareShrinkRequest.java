// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetProhibitedSoftwareShrinkRequest extends TeaModel {
    /**
     * <p>The prohibited software ID.</p>
     */
    @NameInMap("SoftwareId")
    public String softwareIdShrink;

    public static GetProhibitedSoftwareShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProhibitedSoftwareShrinkRequest self = new GetProhibitedSoftwareShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetProhibitedSoftwareShrinkRequest setSoftwareIdShrink(String softwareIdShrink) {
        this.softwareIdShrink = softwareIdShrink;
        return this;
    }
    public String getSoftwareIdShrink() {
        return this.softwareIdShrink;
    }

}
