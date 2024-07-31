// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the real-time synchronization node or data synchronization solution is deployed. Valid values:</p>
     * <ul>
     * <li>success: The real-time synchronization node or data synchronization solution is deployed.</li>
     * <li>fail: The real-time synchronization node or data synchronization solution fails to be deployed.</li>
     * </ul>
     */
    @NameInMap("Data")
    public DeployDISyncTaskResponseBodyData data;

    /**
     * <p>The result of deploying the real-time synchronization node or data synchronization solution.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937635973****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request. You can query logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeployDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployDISyncTaskResponseBody self = new DeployDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployDISyncTaskResponseBody setData(DeployDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public DeployDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeployDISyncTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>submit and deploy fail.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The cause of the failure to deploy the real-time synchronization node or data synchronization solution.</p>
         * <p>If the real-time synchronization node or data synchronization solution is deployed, the value null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DeployDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployDISyncTaskResponseBodyData self = new DeployDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeployDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
