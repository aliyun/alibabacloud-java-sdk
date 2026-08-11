// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetLogSyncToSLSResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetLogSyncToSLSResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLogSyncToSLSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogSyncToSLSResponseBody self = new GetLogSyncToSLSResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogSyncToSLSResponseBody setData(GetLogSyncToSLSResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLogSyncToSLSResponseBodyData getData() {
        return this.data;
    }

    public GetLogSyncToSLSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLogSyncToSLSResponseBodyData extends TeaModel {
        /**
         * <p>The log synchronization status. Valid values:</p>
         * <ul>
         * <li>on: Synchronization is enabled.</li>
         * <li>off: Synchronization is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>adbmysql-audit-log</p>
         */
        @NameInMap("TargetLogStore")
        public String targetLogStore;

        /**
         * <p>The Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>log-service-****-cn-shenzhen</p>
         */
        @NameInMap("TargetProject")
        public String targetProject;

        public static GetLogSyncToSLSResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLogSyncToSLSResponseBodyData self = new GetLogSyncToSLSResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLogSyncToSLSResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLogSyncToSLSResponseBodyData setTargetLogStore(String targetLogStore) {
            this.targetLogStore = targetLogStore;
            return this;
        }
        public String getTargetLogStore() {
            return this.targetLogStore;
        }

        public GetLogSyncToSLSResponseBodyData setTargetProject(String targetProject) {
            this.targetProject = targetProject;
            return this;
        }
        public String getTargetProject() {
            return this.targetProject;
        }

    }

}
