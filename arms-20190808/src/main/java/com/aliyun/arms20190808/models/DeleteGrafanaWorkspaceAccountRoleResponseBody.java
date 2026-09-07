// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaWorkspaceAccountRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>{
     *         &quot;RequestId&quot;: &quot;01A079B0-7AA2-50A6-9A74-D89FE01432A5&quot;,
     *         &quot;TraceId&quot;: &quot;0a03282e17887480040532718e74b7&quot;,
     *         &quot;Data&quot;: true,
     *         &quot;Code&quot;: 200,
     *         &quot;Success&quot;: true
     *     }</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>22614CC7-7EA5-576F-9536-28717A886EB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>0a06dfe917788110578173646e4852</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DeleteGrafanaWorkspaceAccountRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaWorkspaceAccountRoleResponseBody self = new DeleteGrafanaWorkspaceAccountRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaWorkspaceAccountRoleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteGrafanaWorkspaceAccountRoleResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteGrafanaWorkspaceAccountRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGrafanaWorkspaceAccountRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGrafanaWorkspaceAccountRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteGrafanaWorkspaceAccountRoleResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
