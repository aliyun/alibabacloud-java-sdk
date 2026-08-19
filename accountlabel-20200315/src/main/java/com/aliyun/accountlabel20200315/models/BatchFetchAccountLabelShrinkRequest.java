// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class BatchFetchAccountLabelShrinkRequest extends TeaModel {
    @NameInMap("Instant")
    public Boolean instant;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LabelSeriesList")
    public String labelSeriesListShrink;

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

    public static BatchFetchAccountLabelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchFetchAccountLabelShrinkRequest self = new BatchFetchAccountLabelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchFetchAccountLabelShrinkRequest setInstant(Boolean instant) {
        this.instant = instant;
        return this;
    }
    public Boolean getInstant() {
        return this.instant;
    }

    public BatchFetchAccountLabelShrinkRequest setLabelSeriesListShrink(String labelSeriesListShrink) {
        this.labelSeriesListShrink = labelSeriesListShrink;
        return this;
    }
    public String getLabelSeriesListShrink() {
        return this.labelSeriesListShrink;
    }

    public BatchFetchAccountLabelShrinkRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public BatchFetchAccountLabelShrinkRequest setPk(Long pk) {
        this.pk = pk;
        return this;
    }
    public Long getPk() {
        return this.pk;
    }

    public BatchFetchAccountLabelShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public BatchFetchAccountLabelShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
