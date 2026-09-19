// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DescribeTemplateCacheRequest extends TeaModel {
    /**
     * <p>The team ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static DescribeTemplateCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateCacheRequest self = new DescribeTemplateCacheRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateCacheRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
