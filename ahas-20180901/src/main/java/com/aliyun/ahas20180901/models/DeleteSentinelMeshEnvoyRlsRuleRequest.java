// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSentinelMeshEnvoyRlsRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static DeleteSentinelMeshEnvoyRlsRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSentinelMeshEnvoyRlsRuleRequest self = new DeleteSentinelMeshEnvoyRlsRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSentinelMeshEnvoyRlsRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public DeleteSentinelMeshEnvoyRlsRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteSentinelMeshEnvoyRlsRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteSentinelMeshEnvoyRlsRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
