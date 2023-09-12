// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsDetail extends TeaModel {
    @NameInMap("ocurrTimeStr")
    public String ocurrTimeStr;

    @NameInMap("standerdDesc")
    public String standerdDesc;

    public static LogisticsDetail build(java.util.Map<String, ?> map) throws Exception {
        LogisticsDetail self = new LogisticsDetail();
        return TeaModel.build(map, self);
    }

    public LogisticsDetail setOcurrTimeStr(String ocurrTimeStr) {
        this.ocurrTimeStr = ocurrTimeStr;
        return this;
    }
    public String getOcurrTimeStr() {
        return this.ocurrTimeStr;
    }

    public LogisticsDetail setStanderdDesc(String standerdDesc) {
        this.standerdDesc = standerdDesc;
        return this;
    }
    public String getStanderdDesc() {
        return this.standerdDesc;
    }

}
