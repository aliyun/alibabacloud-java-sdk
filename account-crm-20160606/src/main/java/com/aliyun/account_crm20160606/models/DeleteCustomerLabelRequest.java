// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class DeleteCustomerLabelRequest extends TeaModel {
    @NameInMap("LabelSeries")
    public String labelSeries;

    @NameInMap("LabelTypes")
    public java.util.List<String> labelTypes;

    @NameInMap("Organization")
    public String organization;

    @NameInMap("PK")
    public Long PK;

    @NameInMap("Token")
    public String token;

    @NameInMap("UserName")
    public String userName;

    public static DeleteCustomerLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomerLabelRequest self = new DeleteCustomerLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomerLabelRequest setLabelSeries(String labelSeries) {
        this.labelSeries = labelSeries;
        return this;
    }
    public String getLabelSeries() {
        return this.labelSeries;
    }

    public DeleteCustomerLabelRequest setLabelTypes(java.util.List<String> labelTypes) {
        this.labelTypes = labelTypes;
        return this;
    }
    public java.util.List<String> getLabelTypes() {
        return this.labelTypes;
    }

    public DeleteCustomerLabelRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public DeleteCustomerLabelRequest setPK(Long PK) {
        this.PK = PK;
        return this;
    }
    public Long getPK() {
        return this.PK;
    }

    public DeleteCustomerLabelRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DeleteCustomerLabelRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
