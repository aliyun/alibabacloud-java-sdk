// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTranscodeParamsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("app")
    public String app;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pushdomain")
    public String pushdomain;

    @NameInMap("template_name")
    public String templateName;

    public static DescribeLiveDomainTranscodeParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTranscodeParamsRequest self = new DescribeLiveDomainTranscodeParamsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTranscodeParamsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveDomainTranscodeParamsRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeLiveDomainTranscodeParamsRequest setPushdomain(String pushdomain) {
        this.pushdomain = pushdomain;
        return this;
    }
    public String getPushdomain() {
        return this.pushdomain;
    }

    public DescribeLiveDomainTranscodeParamsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
