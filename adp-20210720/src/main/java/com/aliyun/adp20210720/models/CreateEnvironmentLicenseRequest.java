// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateEnvironmentLicenseRequest extends TeaModel {
    // 企业名称
    @NameInMap("companyName")
    public String companyName;

    // 联系方式
    @NameInMap("contact")
    public String contact;

    // 机器指纹信息
    @NameInMap("machineFingerprint")
    public String machineFingerprint;

    // 使用场景
    @NameInMap("scenario")
    public String scenario;

    // 证书类型
    @NameInMap("type")
    public String type;

    public static CreateEnvironmentLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentLicenseRequest self = new CreateEnvironmentLicenseRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentLicenseRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateEnvironmentLicenseRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public CreateEnvironmentLicenseRequest setMachineFingerprint(String machineFingerprint) {
        this.machineFingerprint = machineFingerprint;
        return this;
    }
    public String getMachineFingerprint() {
        return this.machineFingerprint;
    }

    public CreateEnvironmentLicenseRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public CreateEnvironmentLicenseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
