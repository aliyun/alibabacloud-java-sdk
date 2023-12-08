// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSubTaskRequest extends TeaModel {
    /**
     * <p>[](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex)</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>****</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     */
    @NameInMap("ReportIds")
    public String reportIds;

    public static CreateDcdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnSubTaskRequest self = new CreateDcdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnSubTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDcdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

}
