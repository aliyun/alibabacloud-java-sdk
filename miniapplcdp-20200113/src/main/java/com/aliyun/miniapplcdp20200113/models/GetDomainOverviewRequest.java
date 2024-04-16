// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDomainOverviewRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("Source")
    public String source;

    public static GetDomainOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainOverviewRequest self = new GetDomainOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainOverviewRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetDomainOverviewRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetDomainOverviewRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GetDomainOverviewRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
