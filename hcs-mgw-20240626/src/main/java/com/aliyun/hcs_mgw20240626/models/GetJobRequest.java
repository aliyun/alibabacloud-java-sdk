// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain the details of the migration task by using the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("byVersion")
    public String byVersion;

    public static GetJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobRequest self = new GetJobRequest();
        return TeaModel.build(map, self);
    }

    public GetJobRequest setByVersion(String byVersion) {
        this.byVersion = byVersion;
        return this;
    }
    public String getByVersion() {
        return this.byVersion;
    }

}
