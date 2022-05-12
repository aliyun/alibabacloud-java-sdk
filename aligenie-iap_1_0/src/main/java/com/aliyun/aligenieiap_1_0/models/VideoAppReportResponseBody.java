// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class VideoAppReportResponseBody extends TeaModel {
    @NameInMap("RetCode")
    public Integer retCode;

    @NameInMap("RetMsg")
    public String retMsg;

    @NameInMap("RetValue")
    public Boolean retValue;

    public static VideoAppReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoAppReportResponseBody self = new VideoAppReportResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoAppReportResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public VideoAppReportResponseBody setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }
    public String getRetMsg() {
        return this.retMsg;
    }

    public VideoAppReportResponseBody setRetValue(Boolean retValue) {
        this.retValue = retValue;
        return this;
    }
    public Boolean getRetValue() {
        return this.retValue;
    }

}
