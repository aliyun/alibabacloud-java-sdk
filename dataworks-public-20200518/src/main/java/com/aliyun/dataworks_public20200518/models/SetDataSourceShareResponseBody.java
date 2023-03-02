// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetDataSourceShareResponseBody extends TeaModel {
    /**
     * <p>The information about the sharing operation.</p>
     */
    @NameInMap("Data")
    public SetDataSourceShareResponseBodyData data;

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

    public static SetDataSourceShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDataSourceShareResponseBody self = new SetDataSourceShareResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDataSourceShareResponseBody setData(SetDataSourceShareResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetDataSourceShareResponseBodyData getData() {
        return this.data;
    }

    public SetDataSourceShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDataSourceShareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetDataSourceShareResponseBodyData extends TeaModel {
        /**
         * <p>The reason why the data source failed to be shared. If the data source was shared, this parameter is left empty.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the data source was shared. Valid values:</p>
         * <br>
         * <p>*   success: The data source was shared.</p>
         * <p>*   fail: The data source failed to be shared. You can troubleshoot issues based on the Message parameter.</p>
         */
        @NameInMap("Status")
        public String status;

        public static SetDataSourceShareResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetDataSourceShareResponseBodyData self = new SetDataSourceShareResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetDataSourceShareResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SetDataSourceShareResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
