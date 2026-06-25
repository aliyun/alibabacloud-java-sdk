// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceTokenRequest extends TeaModel {
    /**
     * <p>Type of URL to return. Valid values:</p>
     * <ul>
     * <li><strong>WorkBench</strong>: Log on to the container using Workbench.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WorkBench</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>Name of the service worker. Call the ListServiceContainers operation to get the worker name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker0</p>
     */
    @NameInMap("WorkerName")
    public String workerName;

    public static CreateServiceInstanceTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceTokenRequest self = new CreateServiceInstanceTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceTokenRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public CreateServiceInstanceTokenRequest setWorkerName(String workerName) {
        this.workerName = workerName;
        return this;
    }
    public String getWorkerName() {
        return this.workerName;
    }

}
