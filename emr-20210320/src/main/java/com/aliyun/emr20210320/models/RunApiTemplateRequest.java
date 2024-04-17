// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApiTemplateRequest extends TeaModel {
    /**
     * <p>接口名。</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>幂等客户端TOKEN。</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>地域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>集群模板id。</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static RunApiTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        RunApiTemplateRequest self = new RunApiTemplateRequest();
        return TeaModel.build(map, self);
    }

    public RunApiTemplateRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public RunApiTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunApiTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunApiTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
