// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class BatchFetchAccountLabelRequest extends TeaModel {
    @NameInMap("Instant")
    public Boolean instant;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LabelSeriesList")
    public java.util.List<String> labelSeriesList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Organization")
    public String organization;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public Long pk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static BatchFetchAccountLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchFetchAccountLabelRequest self = new BatchFetchAccountLabelRequest();
        return TeaModel.build(map, self);
    }

    public BatchFetchAccountLabelRequest setInstant(Boolean instant) {
        this.instant = instant;
        return this;
    }
    public Boolean getInstant() {
        return this.instant;
    }

    public BatchFetchAccountLabelRequest setLabelSeriesList(java.util.List<String> labelSeriesList) {
        this.labelSeriesList = labelSeriesList;
        return this;
    }
    public java.util.List<String> getLabelSeriesList() {
        return this.labelSeriesList;
    }

    public BatchFetchAccountLabelRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public BatchFetchAccountLabelRequest setPk(Long pk) {
        this.pk = pk;
        return this;
    }
    public Long getPk() {
        return this.pk;
    }

    public BatchFetchAccountLabelRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public BatchFetchAccountLabelRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
