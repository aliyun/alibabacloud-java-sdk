// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUserSummaryRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("SourceType")
    public String sourceType;

    public static GetUserSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserSummaryRequest self = new GetUserSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetUserSummaryRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetUserSummaryRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public GetUserSummaryRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
