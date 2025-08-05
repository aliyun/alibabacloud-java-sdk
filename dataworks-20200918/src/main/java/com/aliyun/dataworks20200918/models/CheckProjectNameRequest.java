// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CheckProjectNameRequest extends TeaModel {
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static CheckProjectNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckProjectNameRequest self = new CheckProjectNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckProjectNameRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CheckProjectNameRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
