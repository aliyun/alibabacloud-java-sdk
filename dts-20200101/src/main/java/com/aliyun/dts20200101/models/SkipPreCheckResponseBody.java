// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SkipPreCheckResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the <strong>%s</strong> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p> If the specified <strong>JobId</strong> parameter is invalid, <strong>The Value of Input Parameter %s is not valid</strong> is returned for <strong>ErrMessage</strong> and <strong>JobId</strong> is returned for <strong>DynamicMessage</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>JobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the DTS task on which the precheck is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>kyri3z9w29a****</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8C498360-7892-433C-847A-BA71A850****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the precheck task.</p>
     * 
     * <strong>example:</strong>
     * <p>b4my3zg929a****</p>
     */
    @NameInMap("ScheduleJobId")
    public String scheduleJobId;

    /**
     * <p>The shortened name of the precheck item.</p>
     * 
     * <strong>example:</strong>
     * <p>CHECK_SAME_OBJ</p>
     */
    @NameInMap("SkipItems")
    public String skipItems;

    /**
     * <p>The name of the precheck item.</p>
     * 
     * <strong>example:</strong>
     * <p>CHECK_SAME_OBJ_DETAIL</p>
     */
    @NameInMap("SkipNames")
    public String skipNames;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SkipPreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SkipPreCheckResponseBody self = new SkipPreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public SkipPreCheckResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SkipPreCheckResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public SkipPreCheckResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SkipPreCheckResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SkipPreCheckResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SkipPreCheckResponseBody setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public SkipPreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SkipPreCheckResponseBody setScheduleJobId(String scheduleJobId) {
        this.scheduleJobId = scheduleJobId;
        return this;
    }
    public String getScheduleJobId() {
        return this.scheduleJobId;
    }

    public SkipPreCheckResponseBody setSkipItems(String skipItems) {
        this.skipItems = skipItems;
        return this;
    }
    public String getSkipItems() {
        return this.skipItems;
    }

    public SkipPreCheckResponseBody setSkipNames(String skipNames) {
        this.skipNames = skipNames;
        return this;
    }
    public String getSkipNames() {
        return this.skipNames;
    }

    public SkipPreCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
