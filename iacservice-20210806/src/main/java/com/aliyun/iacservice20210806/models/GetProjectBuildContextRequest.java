// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectBuildContextRequest extends TeaModel {
    @NameInMap("isPassAssertCheck")
    public Boolean isPassAssertCheck;

    @NameInMap("status")
    public String status;

    public static GetProjectBuildContextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectBuildContextRequest self = new GetProjectBuildContextRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectBuildContextRequest setIsPassAssertCheck(Boolean isPassAssertCheck) {
        this.isPassAssertCheck = isPassAssertCheck;
        return this;
    }
    public Boolean getIsPassAssertCheck() {
        return this.isPassAssertCheck;
    }

    public GetProjectBuildContextRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
