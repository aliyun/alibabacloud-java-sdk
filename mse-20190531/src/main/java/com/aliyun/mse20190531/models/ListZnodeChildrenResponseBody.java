// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZnodeChildrenResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public java.util.List<ListZnodeChildrenResponseBodyData> data;

    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
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
        // The data of the node.
        @NameInMap("Data")
        public String data;

        // Indicates whether the node information was returned. Valid values:
        // 
        // *   `true`: The node information was returned.
        // *   `false`: The node information failed to be returned.
        @NameInMap("Dir")
        public Boolean dir;

        // The name of the node.
        @NameInMap("Name")
        public String name;

        // The path of the node.
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
