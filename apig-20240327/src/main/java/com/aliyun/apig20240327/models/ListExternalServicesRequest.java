// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListExternalServicesRequest extends TeaModel {
    @NameInMap("importableOnly")
    public Boolean importableOnly;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("nameLike")
    public String nameLike;

    @NameInMap("paiWorkspaceId")
    public String paiWorkspaceId;

    @NameInMap("sourceType")
    public String sourceType;

    public static ListExternalServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExternalServicesRequest self = new ListExternalServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListExternalServicesRequest setImportableOnly(Boolean importableOnly) {
        this.importableOnly = importableOnly;
        return this;
    }
    public Boolean getImportableOnly() {
        return this.importableOnly;
    }

    public ListExternalServicesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListExternalServicesRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListExternalServicesRequest setPaiWorkspaceId(String paiWorkspaceId) {
        this.paiWorkspaceId = paiWorkspaceId;
        return this;
    }
    public String getPaiWorkspaceId() {
        return this.paiWorkspaceId;
    }

    public ListExternalServicesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
