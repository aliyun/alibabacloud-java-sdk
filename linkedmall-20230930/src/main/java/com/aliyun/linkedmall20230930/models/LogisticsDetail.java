// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsDetail extends TeaModel {
    /**
     * <p>Time when the logistics event occurred</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-11T12:22:24.000+08:00</p>
     */
    @NameInMap("ocurrTimeStr")
    public String ocurrTimeStr;

    /**
     * <p>Description of the logistics event</p>
     * 
     * <strong>example:</strong>
     * <p>已签收</p>
     */
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
