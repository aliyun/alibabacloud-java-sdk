// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetUserApplicationGroupsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("NameSpace")
    public String nameSpace;

    public static GetUserApplicationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserApplicationGroupsRequest self = new GetUserApplicationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetUserApplicationGroupsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetUserApplicationGroupsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetUserApplicationGroupsRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

}
