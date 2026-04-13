// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackDeploymentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("configVersion")
    public String configVersion;

    /**
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("deploymentName")
    public String deploymentName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deploymentNo")
    public String deploymentNo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
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
