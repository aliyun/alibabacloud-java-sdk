// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckReportStatusResponseBody extends TeaModel {
    /**
     * <p>The report generation status. Valid values:</p>
     * <ul>
     * <li>0: not generated</li>
     * <li>1: generating</li>
     * <li>2: generated</li>
     * <li>3: generation failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("data")
    public Integer data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDataCheckReportStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckReportStatusResponseBody self = new GetDataCheckReportStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCheckReportStatusResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public GetDataCheckReportStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDataCheckReportStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetDataCheckReportStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCheckReportStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
