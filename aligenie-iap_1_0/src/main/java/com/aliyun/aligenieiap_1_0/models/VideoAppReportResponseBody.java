// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class VideoAppReportResponseBody extends TeaModel {
    /**
     * <p>The returned error code. <code>0</code> indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    /**
     * <p>The returned error message. This field is not returned if the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>请求异常</p>
     */
    @NameInMap("RetMsg")
    public String retMsg;

    /**
     * <p>The returned invocation result.</p>
     * <ul>
     * <li>true indicates success.</li>
     * <li>false indicates failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
