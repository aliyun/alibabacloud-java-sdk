// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZnodeChildrenResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListZnodeChildrenResponseBodyData> data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListZnodeChildrenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListZnodeChildrenResponseBody self = new ListZnodeChildrenResponseBody();
        return TeaModel.build(map, self);
    }

    public ListZnodeChildrenResponseBody setData(java.util.List<ListZnodeChildrenResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListZnodeChildrenResponseBodyData> getData() {
        return this.data;
    }

    public ListZnodeChildrenResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListZnodeChildrenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListZnodeChildrenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListZnodeChildrenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListZnodeChildrenResponseBodyData extends TeaModel {
        /**
         * <p>The data of the node.</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>Indicates whether the node information was returned. Valid values:</p>
         * <br>
         * <p>*   `true`: The node information was returned.</p>
         * <p>*   `false`: The node information failed to be returned.</p>
         */
        @NameInMap("Dir")
        public Boolean dir;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path of the node.</p>
         */
        @NameInMap("Path")
        public String path;

        public static ListZnodeChildrenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListZnodeChildrenResponseBodyData self = new ListZnodeChildrenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListZnodeChildrenResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListZnodeChildrenResponseBodyData setDir(Boolean dir) {
            this.dir = dir;
            return this;
        }
        public Boolean getDir() {
            return this.dir;
        }

        public ListZnodeChildrenResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListZnodeChildrenResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
