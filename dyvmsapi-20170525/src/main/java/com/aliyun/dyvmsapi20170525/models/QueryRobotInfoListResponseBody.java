// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotInfoListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The basic information about the robot, in the JSON format. The basic information contains the following parameters:</p>
     * <br>
     * <p>*   **id**: the robot ID.</p>
     * <p>*   **robotName**: the robot name.</p>
     * <p>*   **robotType**: the robot type.</p>
     * <p>*   **auditStatus**: the review state.</p>
     * <p>*   **gmtCreate**: the time when the task was created.</p>
     * <p>*   **gmtModified**: the time when the task was modified.</p>
     * <p>*   **partnerId**: the partner ID.</p>
     * <p>*   **asrId**: the ID of the automatic speech recognition (ASR) model.</p>
     * <p>*   **asrType**: the ASR type. Valid values: **Public** and **Private**.</p>
     * <p>*   **remark**: the additional information.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryRobotInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotInfoListResponseBody self = new QueryRobotInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotInfoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRobotInfoListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryRobotInfoListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRobotInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
