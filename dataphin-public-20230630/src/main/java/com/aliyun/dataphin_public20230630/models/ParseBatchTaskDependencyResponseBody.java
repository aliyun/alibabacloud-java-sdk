// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ParseBatchTaskDependencyResponseBody extends TeaModel {
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

    @NameInMap("ParseResult")
    public ParseBatchTaskDependencyResponseBodyParseResult parseResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ParseBatchTaskDependencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ParseBatchTaskDependencyResponseBody self = new ParseBatchTaskDependencyResponseBody();
        return TeaModel.build(map, self);
    }

    public ParseBatchTaskDependencyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ParseBatchTaskDependencyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ParseBatchTaskDependencyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ParseBatchTaskDependencyResponseBody setParseResult(ParseBatchTaskDependencyResponseBodyParseResult parseResult) {
        this.parseResult = parseResult;
        return this;
    }
    public ParseBatchTaskDependencyResponseBodyParseResult getParseResult() {
        return this.parseResult;
    }

    public ParseBatchTaskDependencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ParseBatchTaskDependencyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList extends TeaModel {
        @NameInMap("FieldList")
        public java.util.List<String> fieldList;

        /**
         * <strong>example:</strong>
         * <p>n_11013121</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>test11</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>t_test</p>
         */
        @NameInMap("OutputName")
        public String outputName;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>201122301</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>t_test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList self = new ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList();
            return TeaModel.build(map, self);
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList setFieldList(java.util.List<String> fieldList) {
            this.fieldList = fieldList;
            return this;
        }
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ParseBatchTaskDependencyResponseBodyParseResultDependNodeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("NodeIoType")
        public String nodeIoType;

        @NameInMap("ScheduleNodeInfoList")
        public java.util.List<ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList> scheduleNodeInfoList;

        public static ParseBatchTaskDependencyResponseBodyParseResultDependNodeList build(java.util.Map<String, ?> map) throws Exception {
            ParseBatchTaskDependencyResponseBodyParseResultDependNodeList self = new ParseBatchTaskDependencyResponseBodyParseResultDependNodeList();
            return TeaModel.build(map, self);
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeList setNodeIoType(String nodeIoType) {
            this.nodeIoType = nodeIoType;
            return this;
        }
        public String getNodeIoType() {
            return this.nodeIoType;
        }

        public ParseBatchTaskDependencyResponseBodyParseResultDependNodeList setScheduleNodeInfoList(java.util.List<ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList> scheduleNodeInfoList) {
            this.scheduleNodeInfoList = scheduleNodeInfoList;
            return this;
        }
        public java.util.List<ParseBatchTaskDependencyResponseBodyParseResultDependNodeListScheduleNodeInfoList> getScheduleNodeInfoList() {
            return this.scheduleNodeInfoList;
        }

    }

    public static class ParseBatchTaskDependencyResponseBodyParseResult extends TeaModel {
        @NameInMap("DependNodeList")
        public java.util.List<ParseBatchTaskDependencyResponseBodyParseResultDependNodeList> dependNodeList;

        public static ParseBatchTaskDependencyResponseBodyParseResult build(java.util.Map<String, ?> map) throws Exception {
            ParseBatchTaskDependencyResponseBodyParseResult self = new ParseBatchTaskDependencyResponseBodyParseResult();
            return TeaModel.build(map, self);
        }

        public ParseBatchTaskDependencyResponseBodyParseResult setDependNodeList(java.util.List<ParseBatchTaskDependencyResponseBodyParseResultDependNodeList> dependNodeList) {
            this.dependNodeList = dependNodeList;
            return this;
        }
        public java.util.List<ParseBatchTaskDependencyResponseBodyParseResultDependNodeList> getDependNodeList() {
            return this.dependNodeList;
        }

    }

}
