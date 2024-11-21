// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>The data center. Valid values:</p>
     * <ul>
     * <li>cn: the Chinese mainland.</li>
     * <li>sg: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2CCD40B1-3F20-5FF0-8A67-E3F34B87744F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the delivery task.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the delivery task.</p>
     * 
     * <strong>example:</strong>
     * <p>er-http</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateUserDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserDeliveryTaskResponseBody self = new CreateUserDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserDeliveryTaskResponseBody setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateUserDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserDeliveryTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateUserDeliveryTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
