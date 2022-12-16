// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryConfigRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The format of the configuration. Supported formats include TEXT, JSON, XML, and HTML.
    @NameInMap("ConfigType")
    public String configType;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NeedRunningConf")
    public Boolean needRunningConf;

    // The extended request parameter in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    public static QueryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigRequest self = new QueryConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryConfigRequest setNeedRunningConf(Boolean needRunningConf) {
        this.needRunningConf = needRunningConf;
        return this;
    }
    public Boolean getNeedRunningConf() {
        return this.needRunningConf;
    }

    public QueryConfigRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
