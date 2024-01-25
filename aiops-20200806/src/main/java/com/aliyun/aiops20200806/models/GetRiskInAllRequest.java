// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskInAllRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("Screen")
    public Integer screen;

    public static GetRiskInAllRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskInAllRequest self = new GetRiskInAllRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskInAllRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetRiskInAllRequest setScreen(Integer screen) {
        this.screen = screen;
        return this;
    }
    public Integer getScreen() {
        return this.screen;
    }

}
