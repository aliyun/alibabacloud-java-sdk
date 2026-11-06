// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class AppUseTimeReportResponseBody extends TeaModel {
    /**
     * <p>Error code returned; <code>0</code> indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    /**
     * <p>Error message returned; no message is returned upon success.</p>
     * 
     * <strong>example:</strong>
     * <p>请求异常</p>
     */
    @NameInMap("RetMsg")
    public String retMsg;

    /**
     * <p>Result of invoking the API  </p>
     * <ul>
     * <li>true indicates success  </li>
     * <li>false indicates failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RetValue")
    public Boolean retValue;

    public static AppUseTimeReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppUseTimeReportResponseBody self = new AppUseTimeReportResponseBody();
        return TeaModel.build(map, self);
    }

    public AppUseTimeReportResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public AppUseTimeReportResponseBody setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }
    public String getRetMsg() {
        return this.retMsg;
    }

    public AppUseTimeReportResponseBody setRetValue(Boolean retValue) {
        this.retValue = retValue;
        return this;
    }
    public Boolean getRetValue() {
        return this.retValue;
    }

}
