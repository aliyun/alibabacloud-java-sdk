// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateIssueCategoryReportRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CreateIssueCategoryReportRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIssueCategoryReportRelationResponseBody self = new CreateIssueCategoryReportRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIssueCategoryReportRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIssueCategoryReportRelationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
