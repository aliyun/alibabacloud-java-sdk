// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfMonitorStatusReportDataRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("SourceId")
    public String sourceId;

    public static ListPtsPerfMonitorStatusReportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfMonitorStatusReportDataRequest self = new ListPtsPerfMonitorStatusReportDataRequest();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfMonitorStatusReportDataRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListPtsPerfMonitorStatusReportDataRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
