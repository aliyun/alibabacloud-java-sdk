// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class GetInstanceRecordConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidParamter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Parameter is null or invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Root")
    public GetInstanceRecordConfigResponseBodyRoot root;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceRecordConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceRecordConfigResponseBody self = new GetInstanceRecordConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceRecordConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceRecordConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceRecordConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceRecordConfigResponseBody setRoot(GetInstanceRecordConfigResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public GetInstanceRecordConfigResponseBodyRoot getRoot() {
        return this.root;
    }

    public GetInstanceRecordConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceRecordConfigResponseBodyRoot extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ExpirationDays")
        public Integer expirationDays;

        /**
         * <strong>example:</strong>
         * <p>i-xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>acs:oss:cn-shanghai:123:workbench-record-123-1/record</p>
         */
        @NameInMap("RecordStorageTarget")
        public String recordStorageTarget;

        public static GetInstanceRecordConfigResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceRecordConfigResponseBodyRoot self = new GetInstanceRecordConfigResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public GetInstanceRecordConfigResponseBodyRoot setExpirationDays(Integer expirationDays) {
            this.expirationDays = expirationDays;
            return this;
        }
        public Integer getExpirationDays() {
            return this.expirationDays;
        }

        public GetInstanceRecordConfigResponseBodyRoot setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceRecordConfigResponseBodyRoot setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetInstanceRecordConfigResponseBodyRoot setRecordStorageTarget(String recordStorageTarget) {
            this.recordStorageTarget = recordStorageTarget;
            return this;
        }
        public String getRecordStorageTarget() {
            return this.recordStorageTarget;
        }

    }

}
