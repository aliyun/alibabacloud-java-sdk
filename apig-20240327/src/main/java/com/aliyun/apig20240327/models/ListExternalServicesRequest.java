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
     * <p>The maximum number of entries to return. Valid range: (0, 100]. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The keyword used for fuzzy match by API name.</p>
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
     * <p>The service source type used to filter results. Valid values:</p>
     * <ul>
     * <li>MSE_NACOS: the service originates from MSE Nacos.</li>
     * <li>K8S: the service originates from a Kubernetes cluster in Container Service.</li>
     * <li>FC3: the service originates from Function Compute.</li>
     * <li>VIP: the service originates from a fixed address.</li>
     * <li>DNS: the service originates from a domain name.</li>
     * </ul>
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
