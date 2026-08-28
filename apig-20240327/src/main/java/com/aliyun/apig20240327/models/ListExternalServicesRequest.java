// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListExternalServicesRequest extends TeaModel {
    /**
     * <p>Specifies whether to return only services that have not been imported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("importableOnly")
    public Boolean importableOnly;

    /**
     * <p>The maximum number of results to return. Valid range: (0, 100]. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>Fuzzy search by API name.</p>
     * 
     * <strong>example:</strong>
     * <p>imah</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The workspace ID of the PAI-EAS service.</p>
     * 
     * <strong>example:</strong>
     * <p>667435</p>
     */
    @NameInMap("paiWorkspaceId")
    public String paiWorkspaceId;

    /**
     * <p>The service source type used to query services. This parameter is essentially required. If not provided, the API returns 400 InvalidParameter.WithValue. Valid values: SAE_K8S_SERVICE, PAI_EAS_SERVICE, CloudFlow, K8S, FC3, PAI_WORKSPACE, and MSE_NACOS.</p>
     * 
     * <strong>example:</strong>
     * <p>FC3</p>
     */
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
