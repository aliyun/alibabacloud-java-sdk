// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ProxyId")
    public Long proxyId;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("CreatorName")
    public String creatorName;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("PrivateEnable")
    public Boolean privateEnable;

    @NameInMap("PrivateHost")
    public String privateHost;

    @NameInMap("PublicEnable")
    public Boolean publicEnable;

    @NameInMap("PublicHost")
    public String publicHost;

    @NameInMap("MysqlPort")
    public Integer mysqlPort;

    @NameInMap("HttpsPort")
    public Integer httpsPort;

    public static GetProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProxyResponseBody self = new GetProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProxyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetProxyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetProxyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetProxyResponseBody setProxyId(Long proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public Long getProxyId() {
        return this.proxyId;
    }

    public GetProxyResponseBody setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public GetProxyResponseBody setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public GetProxyResponseBody setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetProxyResponseBody setPrivateEnable(Boolean privateEnable) {
        this.privateEnable = privateEnable;
        return this;
    }
    public Boolean getPrivateEnable() {
        return this.privateEnable;
    }

    public GetProxyResponseBody setPrivateHost(String privateHost) {
        this.privateHost = privateHost;
        return this;
    }
    public String getPrivateHost() {
        return this.privateHost;
    }

    public GetProxyResponseBody setPublicEnable(Boolean publicEnable) {
        this.publicEnable = publicEnable;
        return this;
    }
    public Boolean getPublicEnable() {
        return this.publicEnable;
    }

    public GetProxyResponseBody setPublicHost(String publicHost) {
        this.publicHost = publicHost;
        return this;
    }
    public String getPublicHost() {
        return this.publicHost;
    }

    public GetProxyResponseBody setMysqlPort(Integer mysqlPort) {
        this.mysqlPort = mysqlPort;
        return this;
    }
    public Integer getMysqlPort() {
        return this.mysqlPort;
    }

    public GetProxyResponseBody setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public Integer getHttpsPort() {
        return this.httpsPort;
    }

}
