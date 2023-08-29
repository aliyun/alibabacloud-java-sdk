// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerListResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetCustomerListResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call is successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCustomerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerListResponseBody self = new GetCustomerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerListResponseBody setData(GetCustomerListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerListResponseBodyData getData() {
        return this.data;
    }

    public GetCustomerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomerListResponseBodyData extends TeaModel {
        /**
         * <p>The list of customer IDs.</p>
         */
        @NameInMap("UidList")
        public java.util.List<String> uidList;

        public static GetCustomerListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseBodyData self = new GetCustomerListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerListResponseBodyData setUidList(java.util.List<String> uidList) {
            this.uidList = uidList;
            return this;
        }
        public java.util.List<String> getUidList() {
            return this.uidList;
        }

    }

}
