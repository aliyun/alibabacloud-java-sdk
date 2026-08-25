// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RunImageTestRequest extends TeaModel {
    /**
     * <p>The test compute unit (CU).</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("Cu")
    public Double cu;

    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The image test execution ID, which is used as an idempotence identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The unique identifier of the general-purpose resource group used to run the test task. Only Serverless resource groups are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_xxx_xxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static RunImageTestRequest build(java.util.Map<String, ?> map) throws Exception {
        RunImageTestRequest self = new RunImageTestRequest();
        return TeaModel.build(map, self);
    }

    public RunImageTestRequest setCu(Double cu) {
        this.cu = cu;
        return this;
    }
    public Double getCu() {
        return this.cu;
    }

    public RunImageTestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RunImageTestRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public RunImageTestRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
