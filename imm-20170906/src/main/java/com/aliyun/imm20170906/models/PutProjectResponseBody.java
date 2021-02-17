// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class PutProjectResponseBody extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("CU")
    public Integer CU;

    @NameInMap("ServiceRole")
    public String serviceRole;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BillingType")
    public String billingType;

    public static PutProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutProjectResponseBody self = new PutProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PutProjectResponseBody setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public PutProjectResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public PutProjectResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PutProjectResponseBody setCU(Integer CU) {
        this.CU = CU;
        return this;
    }
    public Integer getCU() {
        return this.CU;
    }

    public PutProjectResponseBody setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public PutProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutProjectResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public PutProjectResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public PutProjectResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutProjectResponseBody setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

}
