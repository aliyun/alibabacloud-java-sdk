// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>The information that indicates whether the sync node was updated.</p>
     */
    @NameInMap("Data")
    public UpdateDISyncTaskResponseBodyData data;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskResponseBody self = new UpdateDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskResponseBody setData(UpdateDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateDISyncTaskResponseBodyData extends TeaModel {
        /**
         * <p>The reason why the sync node failed to be updated. If the sync node was updated, this parameter is left empty.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the sync node was updated. Valid values:</p>
         * <br>
         * <p>*   success: The sync node was updated.</p>
         * <p>*   fail: The sync node failed to be updated.</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDISyncTaskResponseBodyData self = new UpdateDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
