// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseInstanceResponseBody extends TeaModel {
    /**
     * <p>The information about the task.</p>
     */
    @NameInMap("Data")
    public IncreaseInstanceResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static IncreaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IncreaseInstanceResponseBody self = new IncreaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public IncreaseInstanceResponseBody setData(IncreaseInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IncreaseInstanceResponseBodyData getData() {
        return this.data;
    }

    public IncreaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IncreaseInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class IncreaseInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The status of the task.</p>
         * <br>
         * <p>*   PROCESSING: in progress</p>
         * <p>*   FAIL: failed</p>
         * <p>*   SUCCESS: successful</p>
         */
        @NameInMap("IncrementStatus")
        public String incrementStatus;

        public static IncreaseInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IncreaseInstanceResponseBodyData self = new IncreaseInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IncreaseInstanceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IncreaseInstanceResponseBodyData setIncrementStatus(String incrementStatus) {
            this.incrementStatus = incrementStatus;
            return this;
        }
        public String getIncrementStatus() {
            return this.incrementStatus;
        }

    }

}
