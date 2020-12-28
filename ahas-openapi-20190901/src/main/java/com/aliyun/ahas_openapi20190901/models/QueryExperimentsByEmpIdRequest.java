// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class QueryExperimentsByEmpIdRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryExperimentsByEmpIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentsByEmpIdRequest self = new QueryExperimentsByEmpIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryExperimentsByEmpIdRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public QueryExperimentsByEmpIdRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
