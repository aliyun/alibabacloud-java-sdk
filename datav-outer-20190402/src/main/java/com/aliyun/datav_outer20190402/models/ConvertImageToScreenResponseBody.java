// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ConvertImageToScreenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScreenId")
    public String screenId;

    @NameInMap("Charts")
    public String charts;

    public static ConvertImageToScreenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertImageToScreenResponseBody self = new ConvertImageToScreenResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertImageToScreenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertImageToScreenResponseBody setScreenId(String screenId) {
        this.screenId = screenId;
        return this;
    }
    public String getScreenId() {
        return this.screenId;
    }

    public ConvertImageToScreenResponseBody setCharts(String charts) {
        this.charts = charts;
        return this;
    }
    public String getCharts() {
        return this.charts;
    }

}
