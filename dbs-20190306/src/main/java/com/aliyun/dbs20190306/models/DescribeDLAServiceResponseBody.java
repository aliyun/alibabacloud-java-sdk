// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeDLAServiceResponseBody extends TeaModel {
    /**
     * <p>Specifies whether to enable the feature of automatically adding incremental data to a data lake. If this feature is enabled, DBS adds the backup sets that are newly generated to the data lake that is created for the backup schedule. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoAdd")
    public Boolean autoAdd;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>Indicates whether a failed DLA task exists in the return result. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A failed DLA task exists.</li>
     * <li><strong>false</strong>: No failed DLA task exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HaveJobFailed")
    public Boolean haveJobFailed;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the DLA service for the backup schedule. Valid values:</p>
     * <ul>
     * <li><strong>Running</strong>: DLA is running.</li>
     * <li><strong>Closing</strong>: DLA is being disabled.</li>
     * <li><strong>Closed</strong>: DLA is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDLAServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDLAServiceResponseBody self = new DescribeDLAServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDLAServiceResponseBody setAutoAdd(Boolean autoAdd) {
        this.autoAdd = autoAdd;
        return this;
    }
    public Boolean getAutoAdd() {
        return this.autoAdd;
    }

    public DescribeDLAServiceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDLAServiceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDLAServiceResponseBody setHaveJobFailed(Boolean haveJobFailed) {
        this.haveJobFailed = haveJobFailed;
        return this;
    }
    public Boolean getHaveJobFailed() {
        return this.haveJobFailed;
    }

    public DescribeDLAServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDLAServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDLAServiceResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeDLAServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
