// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusResponseBody extends TeaModel {
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    @NameInMap("precheck_report_id")
    @Validation(required = true)
    public String precheckReportId;

    @NameInMap("upgrade_step")
    @Validation(required = true)
    public String upgradeStep;

    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static GetUpgradeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeStatusResponseBody self = new GetUpgradeStatusResponseBody();
        return TeaModel.build(map, self);
    }

}
