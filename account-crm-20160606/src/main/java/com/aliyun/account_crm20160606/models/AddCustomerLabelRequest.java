// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AddCustomerLabelRequest extends TeaModel {
    @NameInMap("Endtime")
    public String endtime;

    @NameInMap("LabelSeries")
    public String labelSeries;

    @NameInMap("LabelTypes")
    public java.util.List<String> labelTypes;

    @NameInMap("Organization")
    public String organization;

    @NameInMap("PK")
    public Long PK;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Token")
    public String token;

    @NameInMap("UserName")
    public String userName;

    public static AddCustomerLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomerLabelRequest self = new AddCustomerLabelRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomerLabelRequest setEndtime(String endtime) {
        this.endtime = endtime;
        return this;
    }
    public String getEndtime() {
        return this.endtime;
    }

    public AddCustomerLabelRequest setLabelSeries(String labelSeries) {
        this.labelSeries = labelSeries;
        return this;
    }
    public String getLabelSeries() {
        return this.labelSeries;
    }

    public AddCustomerLabelRequest setLabelTypes(java.util.List<String> labelTypes) {
        this.labelTypes = labelTypes;
        return this;
    }
    public java.util.List<String> getLabelTypes() {
        return this.labelTypes;
    }

    public AddCustomerLabelRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public AddCustomerLabelRequest setPK(Long PK) {
        this.PK = PK;
        return this;
    }
    public Long getPK() {
        return this.PK;
    }

    public AddCustomerLabelRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddCustomerLabelRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public AddCustomerLabelRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
