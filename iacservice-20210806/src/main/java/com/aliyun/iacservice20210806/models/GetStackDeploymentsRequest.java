// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackDeploymentsRequest extends TeaModel {
    /**
     * <p>The configuration version, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("configVersion")
    public String configVersion;

    /**
     * <p>The name of the deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("deploymentName")
    public String deploymentName;

    /**
     * <p>The deployment number. The deployment number of each stack starts from 1 and increments each time a deployment is successfully triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deploymentNo")
    public String deploymentNo;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The deployment status. Valid values:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Pending</td>
     * <td>The initial status after the deployment is created.</td>
     * </tr>
     * <tr>
     * <td>PriorityQueued</td>
     * <td>The deployment is queued with priority.</td>
     * </tr>
     * <tr>
     * <td>PlanQueued</td>
     * <td>The deployment is queued and waiting for an available workflow after it is created.</td>
     * </tr>
     * <tr>
     * <td>ApplyQueued</td>
     * <td>The deployment is queued and waiting for an available workflow during execution.</td>
     * </tr>
     * <tr>
     * <td>Planning</td>
     * <td>The deployment is in the plan phase.</td>
     * </tr>
     * <tr>
     * <td>Planned</td>
     * <td>The deployment has completed the plan phase.</td>
     * </tr>
     * <tr>
     * <td>ConfigProactiveInProgress</td>
     * <td>The compliance precheck is in progress.</td>
     * </tr>
     * <tr>
     * <td>ConfigProactiveSuccess</td>
     * <td>The compliance precheck is successful.</td>
     * </tr>
     * <tr>
     * <td>DetectInProgress</td>
     * <td>Drift detection is in progress.</td>
     * </tr>
     * <tr>
     * <td>ImportQueued</td>
     * <td>The deployment is queued and waiting for an available workflow during the import phase.</td>
     * </tr>
     * <tr>
     * <td>Importing</td>
     * <td>The deployment is in the import phase.</td>
     * </tr>
     * <tr>
     * <td>Imported</td>
     * <td>The deployment has completed the import phase.</td>
     * </tr>
     * <tr>
     * <td>StateQueued</td>
     * <td>The deployment is queued and waiting for an available workflow during the state command execution.</td>
     * </tr>
     * <tr>
     * <td>Stating</td>
     * <td>The deployment is executing the state command.</td>
     * </tr>
     * <tr>
     * <td>Stated</td>
     * <td>The deployment has completed the execution of the state command.</td>
     * </tr>
     * <tr>
     * <td>Confirmed</td>
     * <td>The deployment is confirmed after the plan phase.</td>
     * </tr>
     * <tr>
     * <td>PlannedAndFinished</td>
     * <td>The deployment is in the final state because no differences are found after the plan phase.</td>
     * </tr>
     * <tr>
     * <td>Applying</td>
     * <td>The deployment is in the apply phase.</td>
     * </tr>
     * <tr>
     * <td>Applied</td>
     * <td>The deployment has completed the apply phase.</td>
     * </tr>
     * <tr>
     * <td>Discarded</td>
     * <td>The deployment is discarded and enters the final state.</td>
     * </tr>
     * <tr>
     * <td>Errored</td>
     * <td>An error occurred during the deployment execution, and the deployment enters the final state.</td>
     * </tr>
     * <tr>
     * <td>ConfigProactiveFailure</td>
     * <td>The compliance precheck failed.</td>
     * </tr>
     * <tr>
     * <td>Canceled</td>
     * <td>The deployment execution is canceled, and the deployment enters the final state.</td>
     * </tr>
     * </tbody></table>
     * 
     * <strong>example:</strong>
     * <p>Applied</p>
     */
    @NameInMap("status")
    public String status;

    public static GetStackDeploymentsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackDeploymentsRequest self = new GetStackDeploymentsRequest();
        return TeaModel.build(map, self);
    }

    public GetStackDeploymentsRequest setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }
    public String getConfigVersion() {
        return this.configVersion;
    }

    public GetStackDeploymentsRequest setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
    public String getDeploymentName() {
        return this.deploymentName;
    }

    public GetStackDeploymentsRequest setDeploymentNo(String deploymentNo) {
        this.deploymentNo = deploymentNo;
        return this;
    }
    public String getDeploymentNo() {
        return this.deploymentNo;
    }

    public GetStackDeploymentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetStackDeploymentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetStackDeploymentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
