// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetDRMLicenseRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("DRMType")
    public String DRMType;

    @NameInMap("DRMLicense")
    public String DRMLicense;

    public static GetDRMLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDRMLicenseRequest self = new GetDRMLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetDRMLicenseRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetDRMLicenseRequest setDRMType(String DRMType) {
        this.DRMType = DRMType;
        return this;
    }
    public String getDRMType() {
        return this.DRMType;
    }

    public GetDRMLicenseRequest setDRMLicense(String DRMLicense) {
        this.DRMLicense = DRMLicense;
        return this;
    }
    public String getDRMLicense() {
        return this.DRMLicense;
    }

}
