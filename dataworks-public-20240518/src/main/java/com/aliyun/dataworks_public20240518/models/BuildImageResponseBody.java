// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BuildImageResponseBody extends TeaModel {
    /**
     * <p>The result of the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public BuildImageResponseBodyData data;

    /**
     * <p>The request ID, which is used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BuildImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuildImageResponseBody self = new BuildImageResponseBody();
        return TeaModel.build(map, self);
    }

    public BuildImageResponseBody setData(BuildImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BuildImageResponseBodyData getData() {
        return this.data;
    }

    public BuildImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuildImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BuildImageResponseBodyData extends TeaModel {
        /**
         * <p>The image build execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>Indicates whether the build was triggered successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static BuildImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BuildImageResponseBodyData self = new BuildImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BuildImageResponseBodyData setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public BuildImageResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
