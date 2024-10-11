// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetNodeUpDownStreamResponseBody extends TeaModel {
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

    @NameInMap("NodeDagInfo")
    public GetNodeUpDownStreamResponseBodyNodeDagInfo nodeDagInfo;

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

    public static GetNodeUpDownStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeUpDownStreamResponseBody self = new GetNodeUpDownStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeUpDownStreamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNodeUpDownStreamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeUpDownStreamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNodeUpDownStreamResponseBody setNodeDagInfo(GetNodeUpDownStreamResponseBodyNodeDagInfo nodeDagInfo) {
        this.nodeDagInfo = nodeDagInfo;
        return this;
    }
    public GetNodeUpDownStreamResponseBodyNodeDagInfo getNodeDagInfo() {
        return this.nodeDagInfo;
    }

    public GetNodeUpDownStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeUpDownStreamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList extends TeaModel {
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <strong>example:</strong>
         * <p>n_123456</p>
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
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList build(java.util.Map<String, ?> map) throws Exception {
            GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList self = new GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList();
            return TeaModel.build(map, self);
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList setFieldIdList(java.util.List<String> fieldIdList) {
            this.fieldIdList = fieldIdList;
            return this;
        }
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList extends TeaModel {
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <strong>example:</strong>
         * <p>n_123456</p>
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
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList build(java.util.Map<String, ?> map) throws Exception {
            GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList self = new GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList();
            return TeaModel.build(map, self);
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList setFieldIdList(java.util.List<String> fieldIdList) {
            this.fieldIdList = fieldIdList;
            return this;
        }
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList extends TeaModel {
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <strong>example:</strong>
         * <p>n_123456</p>
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
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList build(java.util.Map<String, ?> map) throws Exception {
            GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList self = new GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList();
            return TeaModel.build(map, self);
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList setFieldIdList(java.util.List<String> fieldIdList) {
            this.fieldIdList = fieldIdList;
            return this;
        }
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetNodeUpDownStreamResponseBodyNodeDagInfo extends TeaModel {
        @NameInMap("DownStreamNodeList")
        public java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList> downStreamNodeList;

        @NameInMap("StartNodeList")
        public java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList> startNodeList;

        @NameInMap("UpStreamNodeList")
        public java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList> upStreamNodeList;

        public static GetNodeUpDownStreamResponseBodyNodeDagInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNodeUpDownStreamResponseBodyNodeDagInfo self = new GetNodeUpDownStreamResponseBodyNodeDagInfo();
            return TeaModel.build(map, self);
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfo setDownStreamNodeList(java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList> downStreamNodeList) {
            this.downStreamNodeList = downStreamNodeList;
            return this;
        }
        public java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoDownStreamNodeList> getDownStreamNodeList() {
            return this.downStreamNodeList;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfo setStartNodeList(java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList> startNodeList) {
            this.startNodeList = startNodeList;
            return this;
        }
        public java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoStartNodeList> getStartNodeList() {
            return this.startNodeList;
        }

        public GetNodeUpDownStreamResponseBodyNodeDagInfo setUpStreamNodeList(java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList> upStreamNodeList) {
            this.upStreamNodeList = upStreamNodeList;
            return this;
        }
        public java.util.List<GetNodeUpDownStreamResponseBodyNodeDagInfoUpStreamNodeList> getUpStreamNodeList() {
            return this.upStreamNodeList;
        }

    }

}
