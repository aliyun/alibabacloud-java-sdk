// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccInfoRequest extends TeaModel {
    @NameInMap("ExtendId")
    public String extendId;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetCsccInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCsccInfoRequest self = new GetCsccInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCsccInfoRequest setExtendId(String extendId) {
        this.extendId = extendId;
        return this;
    }
    public String getExtendId() {
        return this.extendId;
    }

    public GetCsccInfoRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
