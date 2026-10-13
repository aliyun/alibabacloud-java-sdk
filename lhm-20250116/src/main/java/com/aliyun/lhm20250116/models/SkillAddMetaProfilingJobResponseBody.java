// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SkillAddMetaProfilingJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the created or updated metadata profiling task.</p>
     * 
     * <strong>example:</strong>
     * <p>100256</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <p>The error code. This parameter is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. This parameter is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is invalid or missing.</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues for this call.</p>
     * 
     * <strong>example:</strong>
     * <p>3F45B8C1-2A6E-4C9B-9E1F-7D2A1B0C5E66</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure. If the call fails, troubleshoot the issue based on the errCode and errMessage parameters.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SkillAddMetaProfilingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SkillAddMetaProfilingJobResponseBody self = new SkillAddMetaProfilingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SkillAddMetaProfilingJobResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public SkillAddMetaProfilingJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SkillAddMetaProfilingJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SkillAddMetaProfilingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SkillAddMetaProfilingJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
