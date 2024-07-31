// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListClusterConfigsResponseBody extends TeaModel {
    @NameInMap("ClusterConfigs")
    public java.util.List<ClusterConfig> clusterConfigs;

    /**
     * <strong>example:</strong>
     * <p>101011005</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid.Cluster.ClusterNotFound</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListClusterConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterConfigsResponseBody self = new ListClusterConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterConfigsResponseBody setClusterConfigs(java.util.List<ClusterConfig> clusterConfigs) {
        this.clusterConfigs = clusterConfigs;
        return this;
    }
    public java.util.List<ClusterConfig> getClusterConfigs() {
        return this.clusterConfigs;
    }

    public ListClusterConfigsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClusterConfigsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListClusterConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListClusterConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
