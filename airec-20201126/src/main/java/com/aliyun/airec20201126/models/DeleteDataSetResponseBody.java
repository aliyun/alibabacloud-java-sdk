// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteDataSetResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details about the dataset.</p>
     */
    @NameInMap("result")
    public DeleteDataSetResponseBodyResult result;

    public static DeleteDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSetResponseBody self = new DeleteDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDataSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataSetResponseBody setResult(DeleteDataSetResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteDataSetResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteDataSetResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the data source was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1544112000000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the data source was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1544112000000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The state for the dataset of the current version. Example: Importing. The value indicates that the dataset of the current version is being imported.</p>
         * 
         * <strong>example:</strong>
         * <p>Importing</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The version number of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>20181023214546</p>
         */
        @NameInMap("versionId")
        public String versionId;

        public static DeleteDataSetResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataSetResponseBodyResult self = new DeleteDataSetResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteDataSetResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteDataSetResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DeleteDataSetResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteDataSetResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DeleteDataSetResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
