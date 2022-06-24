// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateAppsRelationshipRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AuthId")
    public String authId;

    @NameInMap("Edges")
    public String edges;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static CreateAppsRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppsRelationshipRequest self = new CreateAppsRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppsRelationshipRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateAppsRelationshipRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public CreateAppsRelationshipRequest setEdges(String edges) {
        this.edges = edges;
        return this;
    }
    public String getEdges() {
        return this.edges;
    }

    public CreateAppsRelationshipRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAppsRelationshipRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
