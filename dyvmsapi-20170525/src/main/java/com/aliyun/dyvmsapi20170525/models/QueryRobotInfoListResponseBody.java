// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotInfoListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The basic information about the robot, in the JSON format. The basic information contains the following parameters:</p>
     * <ul>
     * <li><strong>id</strong>: the robot ID.</li>
     * <li><strong>robotName</strong>: the robot name.</li>
     * <li><strong>robotType</strong>: the robot type.</li>
     * <li><strong>auditStatus</strong>: the review state.</li>
     * <li><strong>gmtCreate</strong>: the time when the task was created.</li>
     * <li><strong>gmtModified</strong>: the time when the task was modified.</li>
     * <li><strong>partnerId</strong>: the partner ID.</li>
     * <li><strong>asrId</strong>: the ID of the automatic speech recognition (ASR) model.</li>
     * <li><strong>asrType</strong>: the ASR type. Valid values: <strong>Public</strong> and <strong>Private</strong>.</li>
     * <li><strong>remark</strong>: the additional information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{[&quot;id&quot;:1000010920004, &quot;gmtModified&quot;:&quot;Thu Mar 21 15:38:55 CST 2019&quot;, &quot;auditStatus&quot;:&quot;AUDITPASS&quot;,&quot;gmtCreate&quot;:&quot;Thu Mar 21 12:00:51 CST 2019&quot;,&quot;remark&quot;:&quot;tset&quot;,&quot;partnerId&quot;:100000022670001,&quot;asrId&quot;:&quot;a9a1d69081fd4266ad788346bf5e1b6c&quot;,&quot;robotType&quot;:&quot;CUSTOM&quot;,&quot;asrType&quot;:&quot;1&quot;,&quot;robotName&quot;:&quot;Collection scenario&quot;},{&quot;id&quot;:1000010920003,&quot;gmtModified&quot;:&quot;Thu Mar 21 11:51:10 CST 2019&quot;,&quot;auditStatus&quot;:&quot;AUDITPASS&quot;,&quot;gmtCreate&quot;:&quot;Thu Mar 21 11:44:57 CST 2019&quot;,&quot;remark&quot;:&quot;test&quot;,&quot;partnerId&quot;:100000022670001,&quot;asrId&quot;:&quot;a9a1d69081fd4266ad788346bf5e1b6c&quot;,&quot;robotType&quot;:&quot;CUSTOM&quot;,&quot;asrType&quot;:&quot;1&quot;,&quot;robotName&quot;:&quot;Collection scenario&quot;]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F59AF338-655D-48E8-9471-5EB07692B1CC</p>
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
