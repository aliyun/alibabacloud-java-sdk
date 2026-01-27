// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeCostInfoByDbsInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{
     *       &quot;backupPlanComment&quot;: &quot;&quot;,
     *       &quot;commodity&quot;: &quot;cbs_post&quot;,
     *       &quot;product&quot;: &quot;cbs&quot;,
     *       &quot;moduleCode&quot;: &quot;BackupStorageSize&quot;,
     *       &quot;instanceName&quot;: &quot;d-2zefd6337d766294&quot;,
     *       &quot;backupPlanId&quot;: &quot;dbs:d-2zefd6337d766294&quot;,
     *       &quot;moduleName&quot;: &quot;mongodb&quot;
     *     }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9C397502-B4F2-4E22-AD97-C81F0049F3F3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeCostInfoByDbsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostInfoByDbsInstanceResponseBody self = new DescribeCostInfoByDbsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCostInfoByDbsInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCostInfoByDbsInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeCostInfoByDbsInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeCostInfoByDbsInstanceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeCostInfoByDbsInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCostInfoByDbsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCostInfoByDbsInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
