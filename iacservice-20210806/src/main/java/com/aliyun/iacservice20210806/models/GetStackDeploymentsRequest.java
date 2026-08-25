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
     * <p>The deployment name.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("deploymentName")
    public String deploymentName;

    /**
     * <p>The deployment number. The deployment number for each stack starts from 1 and increments each time a deployment is successfully triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deploymentNo")
    public String deploymentNo;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results returned per page. Default value: 20. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The deployment status.</p>
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
     * <td>Priority queuing in progress.</td>
     * </tr>
     * <tr>
     * <td>PlanQueued</td>
     * <td>The deployment is queuing because no workflow is available after creation.</td>
     * </tr>
     * <tr>
     * <td>ApplyQueued</td>
     * <td>The deployment is queuing because no workflow is available during execution.</td>
     * </tr>
     * <tr>
     * <td>Planning</td>
     * <td>The resource deployment is in the Plan phase.</td>
     * </tr>
     * <tr>
     * <td>Planned</td>
     * <td>The resource deployment has completed the Plan phase.</td>
     * </tr>
     * <tr>
     * <td>ConfigProactiveInProgress</td>
     * <td>Compliance pre-check in progress.</td>
     * </tr>
     * <tr>
     * <td>ConfigProactiveSuccess</td>
     * <td>Compliance pre-check succeeded.</td>
     * </tr>
     * <tr>
     * <td>DetectInProgress</td>
     * <td>Drift detection in progress.</td>
     * </tr>
     * <tr>
     * <td>ImportQueued</td>
     * <td>The deployment is queuing because no workflow is available during Import execution.</td>
     * </tr>
     * <tr>
     * <td>Importing</td>
     * <td>The resource deployment is in the Import phase.</td>
     * </tr>
     * <tr>
     * <td>Imported</td>
     * <td>The resource deployment has completed the Import phase.</td>
     * </tr>
     * <tr>
     * <td>StateQueued</td>
     * <td>The deployment is queuing because no workflow is available during state command execution.</td>
     * </tr>
     * <tr>
     * <td>Stating</td>
     * <td>The resource deployment is executing the state command.</td>
     * </tr>
     * <tr>
     * <td>Stated</td>
     * <td>The resource deployment has completed the state command execution.</td>
     * </tr>
     * <tr>
     * <td>Confirmed</td>
     * <td>The resource deployment has been confirmed after the Plan phase.</td>
     * </tr>
     * <tr>
     * <td>PlannedAndFinished</td>
     * <td>No diff was found after the Plan phase. The deployment is in a final status.</td>
     * </tr>
     * <tr>
     * <td>Applying</td>
     * <td>The resource deployment is in the Apply phase.</td>
     * </tr>
     * <tr>
     * <td>Applied</td>
     * <td>The resource deployment has completed the Apply phase.</td>
     * </tr>
     * <tr>
     * <td>Discarded</td>
     * <td>The resource deployment has been discarded and is in a final status.</td>
     * </tr>
     * <tr>
     * <td>Errored</td>
     * <td>The deployment execution encountered an error and is in a final status.</td>
     * </tr>
     * <tr>
     * <td>ConfigProactiveFailure</td>
     * <td>Compliance pre-check failed.</td>
     * </tr>
     * <tr>
     * <td>Canceled</td>
     * <td>The deployment execution has been canceled and is in a final status.</td>
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
