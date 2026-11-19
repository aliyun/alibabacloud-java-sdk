// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ReleaseExpiredPrepaidInstanceResponseBody extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> The field is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>deprecated</p>
     */
    @NameInMap("Class")
    public String _class;

    /**
     * <p>The error code returned when the call fails. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ReleaseExpiredPrepaidInstanceResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReleaseExpiredPrepaidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseExpiredPrepaidInstanceResponseBody self = new ReleaseExpiredPrepaidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseExpiredPrepaidInstanceResponseBody set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public ReleaseExpiredPrepaidInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReleaseExpiredPrepaidInstanceResponseBody setData(ReleaseExpiredPrepaidInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReleaseExpiredPrepaidInstanceResponseBodyData getData() {
        return this.data;
    }

    public ReleaseExpiredPrepaidInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseExpiredPrepaidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseExpiredPrepaidInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults self = new ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults();
            return TeaModel.build(map, self);
        }

        public ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ReleaseExpiredPrepaidInstanceResponseBodyData extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> The field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The list of instance results.</p>
         */
        @NameInMap("InstanceResults")
        public java.util.List<ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults> instanceResults;

        /**
         * <p>Indicates whether the release operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReleaseResult")
        public Boolean releaseResult;

        public static ReleaseExpiredPrepaidInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReleaseExpiredPrepaidInstanceResponseBodyData self = new ReleaseExpiredPrepaidInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReleaseExpiredPrepaidInstanceResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ReleaseExpiredPrepaidInstanceResponseBodyData setInstanceResults(java.util.List<ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults> instanceResults) {
            this.instanceResults = instanceResults;
            return this;
        }
        public java.util.List<ReleaseExpiredPrepaidInstanceResponseBodyDataInstanceResults> getInstanceResults() {
            return this.instanceResults;
        }

        public ReleaseExpiredPrepaidInstanceResponseBodyData setReleaseResult(Boolean releaseResult) {
            this.releaseResult = releaseResult;
            return this;
        }
        public Boolean getReleaseResult() {
            return this.releaseResult;
        }

    }

}
