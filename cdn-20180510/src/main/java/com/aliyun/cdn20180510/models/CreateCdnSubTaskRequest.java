// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnSubTaskRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ReportIds")
    public String reportIds;

    public static CreateCdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnSubTaskRequest self = new CreateCdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdnSubTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

}
