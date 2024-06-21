// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeLogstoreResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetRetcodeLogstoreResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRetcodeLogstoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeLogstoreResponseBody self = new GetRetcodeLogstoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRetcodeLogstoreResponseBody setData(GetRetcodeLogstoreResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRetcodeLogstoreResponseBodyData getData() {
        return this.data;
    }

    public GetRetcodeLogstoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>log-test-220431</p>
         */
        @NameInMap("Logstore")
        public String logstore;

        /**
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig self = new GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig();
            return TeaModel.build(map, self);
        }

        public GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetRetcodeLogstoreResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>retcode app or task can not be found!</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("RetcodeSLSConfig")
        public GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig retcodeSLSConfig;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetRetcodeLogstoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRetcodeLogstoreResponseBodyData self = new GetRetcodeLogstoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRetcodeLogstoreResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRetcodeLogstoreResponseBodyData setRetcodeSLSConfig(GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig retcodeSLSConfig) {
            this.retcodeSLSConfig = retcodeSLSConfig;
            return this;
        }
        public GetRetcodeLogstoreResponseBodyDataRetcodeSLSConfig getRetcodeSLSConfig() {
            return this.retcodeSLSConfig;
        }

        public GetRetcodeLogstoreResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
