// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DisableProjectExtensionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DisableProjectExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableProjectExtensionRequest self = new DisableProjectExtensionRequest();
        return TeaModel.build(map, self);
    }

    public DisableProjectExtensionRequest setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
        return this;
    }
    public String getExtensionCode() {
        return this.extensionCode;
    }

    public DisableProjectExtensionRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DisableProjectExtensionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
