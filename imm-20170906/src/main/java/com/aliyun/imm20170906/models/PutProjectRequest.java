// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class PutProjectRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ServiceRole")
    public String serviceRole;

    @NameInMap("CU")
    public Integer CU;

    @NameInMap("Type")
    public String type;

    @NameInMap("BillingType")
    public String billingType;

    public static PutProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProjectRequest self = new PutProjectRequest();
        return TeaModel.build(map, self);
    }

    public PutProjectRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public PutProjectRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public PutProjectRequest setCU(Integer CU) {
        this.CU = CU;
        return this;
    }
    public Integer getCU() {
        return this.CU;
    }

    public PutProjectRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PutProjectRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

}
