// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryZnodeDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public QueryZnodeDetailResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58E06A0A-BD2C-47A0-99C2-B100F353****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static QueryZnodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryZnodeDetailResponseBody self = new QueryZnodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryZnodeDetailResponseBody setData(QueryZnodeDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryZnodeDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryZnodeDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryZnodeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryZnodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryZnodeDetailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryZnodeDetailResponseBodyData extends TeaModel {
        /**
         * <p>The data of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>Indicates whether the node information was returned. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The node information was returned.</li>
         * <li><code>false</code>: The node information failed to be returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Dir")
        public Boolean dir;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>zookeeper</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>/zookeeper</p>
         */
        @NameInMap("Path")
        public String path;

        public static QueryZnodeDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryZnodeDetailResponseBodyData self = new QueryZnodeDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryZnodeDetailResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryZnodeDetailResponseBodyData setDir(Boolean dir) {
            this.dir = dir;
            return this;
        }
        public Boolean getDir() {
            return this.dir;
        }

        public QueryZnodeDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryZnodeDetailResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
