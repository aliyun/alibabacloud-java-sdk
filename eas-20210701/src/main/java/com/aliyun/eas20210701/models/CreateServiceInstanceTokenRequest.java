// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceTokenRequest extends TeaModel {
    /**
     * <p>The type of URL to retrieve. Valid values:</p>
     * <ul>
     * <li><strong>WorkBench</strong>: Logs on to the container through the Workbench page.</li>
     * <li><strong>WebShell</strong>: Logs on to the container through a WebSocket URL. This value is not supported for processor-type services or services created before June 2026.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WorkBench</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The name of the service worker. You can call the ListServiceContainers operation to obtain the worker name.</p>
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
