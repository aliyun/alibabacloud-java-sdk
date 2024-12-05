// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureMigrationJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The start offset of incremental data migration. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>40E35BD9-002E-4D63-9BE5-FBA48833****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SID of the Oracle database.</p>
     * <blockquote>
     * <p> You must specify this parameter only if the <strong>DestinationEndpoint.EngineName</strong> parameter is set to <strong>Oracle</strong> and the <strong>Oracle</strong> database is deployed in a non-RAC architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ConfigureMigrationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigureMigrationJobResponseBody self = new ConfigureMigrationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigureMigrationJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ConfigureMigrationJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ConfigureMigrationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigureMigrationJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
