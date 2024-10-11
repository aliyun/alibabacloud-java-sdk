// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListNodeDownStreamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NodeInfoList")
    public java.util.List<ListNodeDownStreamResponseBodyNodeInfoList> nodeInfoList;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListNodeDownStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDownStreamResponseBody self = new ListNodeDownStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeDownStreamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNodeDownStreamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodeDownStreamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNodeDownStreamResponseBody setNodeInfoList(java.util.List<ListNodeDownStreamResponseBodyNodeInfoList> nodeInfoList) {
        this.nodeInfoList = nodeInfoList;
        return this;
    }
    public java.util.List<ListNodeDownStreamResponseBodyNodeInfoList> getNodeInfoList() {
        return this.nodeInfoList;
    }

    public ListNodeDownStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeDownStreamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodeDownStreamResponseBodyNodeInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <strong>example:</strong>
         * <p>n_2423351</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNodeDownStreamResponseBodyNodeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDownStreamResponseBodyNodeInfoList self = new ListNodeDownStreamResponseBodyNodeInfoList();
            return TeaModel.build(map, self);
        }

        public ListNodeDownStreamResponseBodyNodeInfoList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ListNodeDownStreamResponseBodyNodeInfoList setFieldIdList(java.util.List<String> fieldIdList) {
            this.fieldIdList = fieldIdList;
            return this;
        }
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        public ListNodeDownStreamResponseBodyNodeInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodeDownStreamResponseBodyNodeInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodeDownStreamResponseBodyNodeInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
