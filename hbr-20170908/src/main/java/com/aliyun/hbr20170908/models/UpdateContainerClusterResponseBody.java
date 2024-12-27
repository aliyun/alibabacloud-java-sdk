// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateContainerClusterResponseBody extends TeaModel {
    /**
     * <p>Return code, 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return information.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates if the request was successful.</p>
     * <ul>
     * <li>true: Success</li>
     * <li>false: Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Cluster token, used for registering HBR clients within the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhY2NvdW*****VnZpgXQC5A==</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>Indicates whether the cluster token has been updated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TokenUpdated")
    public Boolean tokenUpdated;

    public static UpdateContainerClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerClusterResponseBody self = new UpdateContainerClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContainerClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateContainerClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContainerClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContainerClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateContainerClusterResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UpdateContainerClusterResponseBody setTokenUpdated(Boolean tokenUpdated) {
        this.tokenUpdated = tokenUpdated;
        return this;
    }
    public Boolean getTokenUpdated() {
        return this.tokenUpdated;
    }

}
