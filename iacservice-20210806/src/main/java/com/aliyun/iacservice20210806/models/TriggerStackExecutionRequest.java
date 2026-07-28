// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class TriggerStackExecutionRequest extends TeaModel {
    /**
     * <p>Operation to execute  </p>
     * <ul>
     * <li>terraform plan  </li>
     * <li>terraform apply  </li>
     * <li>state detect</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>terraform plan</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>Collection of changed files. You can specify only the folders containing changed files.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("changedFolders")
    public java.util.List<String> changedFolders;

    /**
     * <p>Idempotent token. Format: [0-9a-zA-Z-]{1,64}. We recommend using a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Stack code path. Currently, only Stacks created through IaC templates are supported.<br>Parameter format: iacservice::{moduleId}</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iacservice::mod-xxx</p>
     */
    @NameInMap("codePackagePath")
    public String codePackagePath;

    /**
     * <p>Code version of the Stack to trigger</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("codeVersionId")
    public String codeVersionId;

    public static TriggerStackExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerStackExecutionRequest self = new TriggerStackExecutionRequest();
        return TeaModel.build(map, self);
    }

    public TriggerStackExecutionRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public TriggerStackExecutionRequest setChangedFolders(java.util.List<String> changedFolders) {
        this.changedFolders = changedFolders;
        return this;
    }
    public java.util.List<String> getChangedFolders() {
        return this.changedFolders;
    }

    public TriggerStackExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TriggerStackExecutionRequest setCodePackagePath(String codePackagePath) {
        this.codePackagePath = codePackagePath;
        return this;
    }
    public String getCodePackagePath() {
        return this.codePackagePath;
    }

    public TriggerStackExecutionRequest setCodeVersionId(String codeVersionId) {
        this.codeVersionId = codeVersionId;
        return this;
    }
    public String getCodeVersionId() {
        return this.codeVersionId;
    }

}
