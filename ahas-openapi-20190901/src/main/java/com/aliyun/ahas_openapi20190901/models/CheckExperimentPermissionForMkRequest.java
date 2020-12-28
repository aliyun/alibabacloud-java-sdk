// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CheckExperimentPermissionForMkRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Type")
    public String type;

    public static CheckExperimentPermissionForMkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckExperimentPermissionForMkRequest self = new CheckExperimentPermissionForMkRequest();
        return TeaModel.build(map, self);
    }

    public CheckExperimentPermissionForMkRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public CheckExperimentPermissionForMkRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CheckExperimentPermissionForMkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CheckExperimentPermissionForMkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
