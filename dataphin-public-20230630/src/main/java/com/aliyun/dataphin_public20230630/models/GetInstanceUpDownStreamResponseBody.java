// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceUpDownStreamResponseBody extends TeaModel {
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

    @NameInMap("InstanceDagInfo")
    public GetInstanceUpDownStreamResponseBodyInstanceDagInfo instanceDagInfo;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

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

    public static GetInstanceUpDownStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUpDownStreamResponseBody self = new GetInstanceUpDownStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceUpDownStreamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceUpDownStreamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceUpDownStreamResponseBody setInstanceDagInfo(GetInstanceUpDownStreamResponseBodyInstanceDagInfo instanceDagInfo) {
        this.instanceDagInfo = instanceDagInfo;
        return this;
    }
    public GetInstanceUpDownStreamResponseBodyInstanceDagInfo getInstanceDagInfo() {
        return this.instanceDagInfo;
    }

    public GetInstanceUpDownStreamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceUpDownStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceUpDownStreamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList extends TeaModel {
        @NameInMap("FieldInstanceIdList")
        public java.util.List<String> fieldInstanceIdList;

        /**
         * <strong>example:</strong>
         * <p>t_1234567</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>n_1234567</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList self = new GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList();
            return TeaModel.build(map, self);
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList setFieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
            this.fieldInstanceIdList = fieldInstanceIdList;
            return this;
        }
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList extends TeaModel {
        @NameInMap("FieldInstanceIdList")
        public java.util.List<String> fieldInstanceIdList;

        /**
         * <strong>example:</strong>
         * <p>t_1234567</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>n_1234567</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList self = new GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList();
            return TeaModel.build(map, self);
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList setFieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
            this.fieldInstanceIdList = fieldInstanceIdList;
            return this;
        }
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList extends TeaModel {
        @NameInMap("FieldInstanceIdList")
        public java.util.List<String> fieldInstanceIdList;

        /**
         * <strong>example:</strong>
         * <p>t_1234567</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>n_1234567</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList self = new GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList();
            return TeaModel.build(map, self);
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList setFieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
            this.fieldInstanceIdList = fieldInstanceIdList;
            return this;
        }
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class GetInstanceUpDownStreamResponseBodyInstanceDagInfo extends TeaModel {
        @NameInMap("DownInstanceList")
        public java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList> downInstanceList;

        @NameInMap("StartInstanceList")
        public java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList> startInstanceList;

        @NameInMap("UpInstanceList")
        public java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList> upInstanceList;

        public static GetInstanceUpDownStreamResponseBodyInstanceDagInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceUpDownStreamResponseBodyInstanceDagInfo self = new GetInstanceUpDownStreamResponseBodyInstanceDagInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfo setDownInstanceList(java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList> downInstanceList) {
            this.downInstanceList = downInstanceList;
            return this;
        }
        public java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoDownInstanceList> getDownInstanceList() {
            return this.downInstanceList;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfo setStartInstanceList(java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList> startInstanceList) {
            this.startInstanceList = startInstanceList;
            return this;
        }
        public java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoStartInstanceList> getStartInstanceList() {
            return this.startInstanceList;
        }

        public GetInstanceUpDownStreamResponseBodyInstanceDagInfo setUpInstanceList(java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList> upInstanceList) {
            this.upInstanceList = upInstanceList;
            return this;
        }
        public java.util.List<GetInstanceUpDownStreamResponseBodyInstanceDagInfoUpInstanceList> getUpInstanceList() {
            return this.upInstanceList;
        }

    }

}
