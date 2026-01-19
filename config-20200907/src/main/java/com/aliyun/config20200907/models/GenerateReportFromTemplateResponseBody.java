// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateReportFromTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6CE4ABA1-9A57-41A9-8EA9-E8B17D4671CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateReportFromTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateReportFromTemplateResponseBody self = new GenerateReportFromTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateReportFromTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
