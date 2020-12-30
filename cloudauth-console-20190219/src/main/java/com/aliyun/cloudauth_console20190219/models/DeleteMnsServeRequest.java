// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DeleteMnsServeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteMnsServeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMnsServeRequest self = new DeleteMnsServeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMnsServeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteMnsServeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
