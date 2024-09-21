// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class IsCompletedResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public IsCompletedResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static IsCompletedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IsCompletedResponseBody self = new IsCompletedResponseBody();
        return TeaModel.build(map, self);
    }

    public IsCompletedResponseBody setData(IsCompletedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IsCompletedResponseBodyData getData() {
        return this.data;
    }

    public IsCompletedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class IsCompletedResponseBodyData extends TeaModel {
        /**
         * <p>Modified time in milliseconds, e.g. 1711438780000.</p>
         * 
         * <strong>example:</strong>
         * <p>1711438780000</p>
         */
        @NameInMap("modifiedTime")
        public Long modifiedTime;

        /**
         * <p>The unique key of this generation task.</p>
         * 
         * <strong>example:</strong>
         * <p>550c2b7b-f2e0-4176-ab0a-53ea4b355721</p>
         */
        @NameInMap("taskKey")
        public String taskKey;

        /**
         * <p>Unused temporarily.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("taskShortResult")
        public String taskShortResult;

        /**
         * <p>The status of the report generation task. The possible values are <code>running</code>, <code>success</code>, and <code>error</code>, which mean generating, generating succeeded, and generating failed, respectively. If you encounter a result generation failure, check the model, correct the model, and then generate the result again.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static IsCompletedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IsCompletedResponseBodyData self = new IsCompletedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IsCompletedResponseBodyData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public IsCompletedResponseBodyData setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

        public IsCompletedResponseBodyData setTaskShortResult(String taskShortResult) {
            this.taskShortResult = taskShortResult;
            return this;
        }
        public String getTaskShortResult() {
            return this.taskShortResult;
        }

        public IsCompletedResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
