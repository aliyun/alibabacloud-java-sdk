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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The reason why the data source failed to be shared. If the data source is successfully shared, the value of this parameter is an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>datasource is wrong</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the data source was shared. Valid values:</p>
         * <ul>
         * <li>success.</li>
         * <li>fail. You can view the value of the Message parameter to identify the cause of the failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
