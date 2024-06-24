// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TripTaskQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module。</p>
     */
    @NameInMap("module")
    public TripTaskQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>2FB0D7A8-BA41-5D04-BEFC-CADA5481AC53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TripTaskQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TripTaskQueryResponseBody self = new TripTaskQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TripTaskQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TripTaskQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TripTaskQueryResponseBody setModule(TripTaskQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TripTaskQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TripTaskQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TripTaskQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TripTaskQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TripTaskQueryResponseBodyModuleRecordTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("actioner")
        public String actioner;

        @NameInMap("attributes")
        public String attributes;

        /**
         * <strong>example:</strong>
         * <p>1525104000</p>
         */
        @NameInMap("gmt_create")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1525104000</p>
         */
        @NameInMap("gmt_finished")
        public Long gmtFinished;

        /**
         * <strong>example:</strong>
         * <p>34360</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>575003</p>
         */
        @NameInMap("node_id")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>agree</p>
         */
        @NameInMap("out_result")
        public String outResult;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static TripTaskQueryResponseBodyModuleRecordTasks build(java.util.Map<String, ?> map) throws Exception {
            TripTaskQueryResponseBodyModuleRecordTasks self = new TripTaskQueryResponseBodyModuleRecordTasks();
            return TeaModel.build(map, self);
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setActioner(String actioner) {
            this.actioner = actioner;
            return this;
        }
        public String getActioner() {
            return this.actioner;
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setGmtFinished(Long gmtFinished) {
            this.gmtFinished = gmtFinished;
            return this;
        }
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setOutResult(String outResult) {
            this.outResult = outResult;
            return this;
        }
        public String getOutResult() {
            return this.outResult;
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TripTaskQueryResponseBodyModuleRecordTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class TripTaskQueryResponseBodyModuleRunningTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("actioner")
        public String actioner;

        @NameInMap("attributes")
        public String attributes;

        /**
         * <strong>example:</strong>
         * <p>1525104000</p>
         */
        @NameInMap("gmt_create")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1525104000</p>
         */
        @NameInMap("gmt_finished")
        public Long gmtFinished;

        /**
         * <strong>example:</strong>
         * <p>34360</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>575003</p>
         */
        @NameInMap("node_id")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>agree</p>
         */
        @NameInMap("out_result")
        public String outResult;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static TripTaskQueryResponseBodyModuleRunningTasks build(java.util.Map<String, ?> map) throws Exception {
            TripTaskQueryResponseBodyModuleRunningTasks self = new TripTaskQueryResponseBodyModuleRunningTasks();
            return TeaModel.build(map, self);
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setActioner(String actioner) {
            this.actioner = actioner;
            return this;
        }
        public String getActioner() {
            return this.actioner;
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setGmtFinished(Long gmtFinished) {
            this.gmtFinished = gmtFinished;
            return this;
        }
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setOutResult(String outResult) {
            this.outResult = outResult;
            return this;
        }
        public String getOutResult() {
            return this.outResult;
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TripTaskQueryResponseBodyModuleRunningTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class TripTaskQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("needRefresh")
        public Boolean needRefresh;

        @NameInMap("record_tasks")
        public java.util.List<TripTaskQueryResponseBodyModuleRecordTasks> recordTasks;

        @NameInMap("running_tasks")
        public java.util.List<TripTaskQueryResponseBodyModuleRunningTasks> runningTasks;

        public static TripTaskQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TripTaskQueryResponseBodyModule self = new TripTaskQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TripTaskQueryResponseBodyModule setNeedRefresh(Boolean needRefresh) {
            this.needRefresh = needRefresh;
            return this;
        }
        public Boolean getNeedRefresh() {
            return this.needRefresh;
        }

        public TripTaskQueryResponseBodyModule setRecordTasks(java.util.List<TripTaskQueryResponseBodyModuleRecordTasks> recordTasks) {
            this.recordTasks = recordTasks;
            return this;
        }
        public java.util.List<TripTaskQueryResponseBodyModuleRecordTasks> getRecordTasks() {
            return this.recordTasks;
        }

        public TripTaskQueryResponseBodyModule setRunningTasks(java.util.List<TripTaskQueryResponseBodyModuleRunningTasks> runningTasks) {
            this.runningTasks = runningTasks;
            return this;
        }
        public java.util.List<TripTaskQueryResponseBodyModuleRunningTasks> getRunningTasks() {
            return this.runningTasks;
        }

    }

}
