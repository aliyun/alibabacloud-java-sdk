// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlTableLineageResponseBody extends TeaModel {
    /**
     * <p>The data body returned by the operation. For the field structure, see the child parameters.</p>
     */
    @NameInMap("data")
    public GetSqlTableLineageResponseBodyData data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with the current call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed. Use errCode and errMessage to troubleshoot the issue.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetSqlTableLineageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlTableLineageResponseBody self = new GetSqlTableLineageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlTableLineageResponseBody setData(GetSqlTableLineageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSqlTableLineageResponseBodyData getData() {
        return this.data;
    }

    public GetSqlTableLineageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetSqlTableLineageResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetSqlTableLineageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlTableLineageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSqlTableLineageResponseBodyData extends TeaModel {
        /**
         * <p>The list of downstream tables.</p>
         */
        @NameInMap("downstreamTables")
        public java.util.List<String> downstreamTables;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>connection timeout</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed. Use errCode and errMessage to troubleshoot the issue.</li>
         * </ul>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <p>The list of upstream tables.</p>
         */
        @NameInMap("upstreamTables")
        public java.util.List<String> upstreamTables;

        public static GetSqlTableLineageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSqlTableLineageResponseBodyData self = new GetSqlTableLineageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSqlTableLineageResponseBodyData setDownstreamTables(java.util.List<String> downstreamTables) {
            this.downstreamTables = downstreamTables;
            return this;
        }
        public java.util.List<String> getDownstreamTables() {
            return this.downstreamTables;
        }

        public GetSqlTableLineageResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetSqlTableLineageResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetSqlTableLineageResponseBodyData setUpstreamTables(java.util.List<String> upstreamTables) {
            this.upstreamTables = upstreamTables;
            return this;
        }
        public java.util.List<String> getUpstreamTables() {
            return this.upstreamTables;
        }

    }

}
