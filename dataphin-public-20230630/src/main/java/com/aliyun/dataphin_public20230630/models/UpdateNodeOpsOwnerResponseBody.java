// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateNodeOpsOwnerResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of per-node operation results.</p>
     */
    @NameInMap("Data")
    public java.util.List<UpdateNodeOpsOwnerResponseBodyData> data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateNodeOpsOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOpsOwnerResponseBody self = new UpdateNodeOpsOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOpsOwnerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateNodeOpsOwnerResponseBody setData(java.util.List<UpdateNodeOpsOwnerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateNodeOpsOwnerResponseBodyData> getData() {
        return this.data;
    }

    public UpdateNodeOpsOwnerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateNodeOpsOwnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNodeOpsOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNodeOpsOwnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateNodeOpsOwnerResponseBodyData extends TeaModel {
        /**
         * <p>The failure reason. This value is empty if the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The node ID. This corresponds to the Id in the NodeIdList request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>n_8198365584737107968</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_node</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node source type.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("NodeFromType")
        public String nodeFromType;

        /**
         * <p>The change result status for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateNodeOpsOwnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodeOpsOwnerResponseBodyData self = new UpdateNodeOpsOwnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateNodeOpsOwnerResponseBodyData setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public UpdateNodeOpsOwnerResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateNodeOpsOwnerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateNodeOpsOwnerResponseBodyData setNodeFromType(String nodeFromType) {
            this.nodeFromType = nodeFromType;
            return this;
        }
        public String getNodeFromType() {
            return this.nodeFromType;
        }

        public UpdateNodeOpsOwnerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
