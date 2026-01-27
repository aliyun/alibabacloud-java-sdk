// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxInstancesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     * <ul>
     * <li><strong>connectionString</strong>: the connection string of the sandbox instance, in the format of IP address:Port number. This parameter indicates the endpoint of the sandbox instance if the value of the SandboxType parameter is <strong>Sandbox</strong>. This parameter indicates the Network File System (NFS) mount address if the value of the SandboxType parameter is <strong>NFS</strong>.</li>
     * <li><strong>restoreSeconds</strong>: the time required to create the sandbox instance. Unit: seconds.</li>
     * <li><strong>restoreTime</strong>: the point in time to which the sandbox instance is restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</li>
     * <li><strong>instanceId</strong>: the ID of the sandbox instance.</li>
     * <li><strong>backupSetId</strong>: the ID of the backup set.</li>
     * <li><strong>createTime</strong>: the point in time when the sandbox instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</li>
     * <li><strong>backupPlanId</strong>: the ID of the backup schedule.</li>
     * <li><strong>vpcId</strong>: the ID of the virtual private cloud (VPC).</li>
     * <li><strong>vpcSwitchId</strong>: the ID of the VSwitch.</li>
     * <li><strong>sandboxSpecification</strong>: the specifications of the sandbox instance.</li>
     * <li><strong>status</strong>: the status of the sandbox instance. Valid values: <strong>running</strong>, <strong>check_pass</strong>, and <strong>stop</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;number&quot;: 1,     &quot;size&quot;: 1,     &quot;content&quot;: [       {         &quot;connectionString&quot;: &quot;172.26.178.229:3306&quot;,         &quot;restoreSeconds&quot;: 15,         &quot;restoreTime&quot;: &quot;2021-08-11T07:26:24Z&quot;,         &quot;instanceId&quot;: &quot;1jxxxxx9xxxms&quot;,         &quot;backupSetId&quot;: &quot;1hxxxx8xxxxxa_20210811152624&quot;,         &quot;createTime&quot;: &quot;2021-08-12T07:40:29Z&quot;,         &quot;backupPlanId&quot;: &quot;1hxxxx8xxxxxa&quot;,         &quot;vpcId&quot;: &quot;vpc-bp1dxxxxxjy0xxxxx1xxp&quot;,         &quot;sandboxSpecification&quot;: &quot;MYSQL_1C_1M_SD&quot;,         &quot;status&quot;: &quot;running&quot;,         &quot;vpcSwitchId&quot;: &quot;vsw-bp1bxxxxxumxxxxxwxx2w&quot;       }     ],     &quot;totalElements&quot;: 1   }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSandboxInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxInstancesResponseBody self = new DescribeSandboxInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSandboxInstancesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeSandboxInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSandboxInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSandboxInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSandboxInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSandboxInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
