// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListOperationResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public ListOperationResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationResponseBody self = new ListOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationResponseBody setData(ListOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOperationResponseBodyData getData() {
        return this.data;
    }

    public ListOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOperationResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the user is an administrator. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("AdminOrNot")
        public Boolean adminOrNot;

        /**
         * <p>The resources on which the permissions are granted.</p>
         */
        @NameInMap("OperationList")
        public java.util.List<String> operationList;

        public static ListOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationResponseBodyData self = new ListOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOperationResponseBodyData setAdminOrNot(Boolean adminOrNot) {
            this.adminOrNot = adminOrNot;
            return this;
        }
        public Boolean getAdminOrNot() {
            return this.adminOrNot;
        }

        public ListOperationResponseBodyData setOperationList(java.util.List<String> operationList) {
            this.operationList = operationList;
            return this;
        }
        public java.util.List<String> getOperationList() {
            return this.operationList;
        }

    }

}
