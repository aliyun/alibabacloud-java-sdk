// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class AttachKVCacheStoreResponseBody extends TeaModel {
    /**
     * <p>The list of mount results.</p>
     */
    @NameInMap("AttachResults")
    public java.util.List<AttachKVCacheStoreResponseBodyAttachResults> attachResults;

    /**
     * <p>The request ID. A request ID is returned regardless of whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>F7BEF1E2-7E56-5BF1-8E36-77A51C5812F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachKVCacheStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachKVCacheStoreResponseBody self = new AttachKVCacheStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachKVCacheStoreResponseBody setAttachResults(java.util.List<AttachKVCacheStoreResponseBodyAttachResults> attachResults) {
        this.attachResults = attachResults;
        return this;
    }
    public java.util.List<AttachKVCacheStoreResponseBodyAttachResults> getAttachResults() {
        return this.attachResults;
    }

    public AttachKVCacheStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AttachKVCacheStoreResponseBodyAttachResults extends TeaModel {
        /**
         * <p>The error code returned when the operation fails. This value is null when the operation succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidStatus.OperationDenied</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the operation fails. This value is null when the operation succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>The operation is not allowed for instance in ATTACHED status.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>KVCacheStore KvcsId</p>
         * 
         * <strong>example:</strong>
         * <p>kvcs-xxxxx</p>
         */
        @NameInMap("KvcsId")
        public String kvcsId;

        /**
         * <p>The operation result. Valid values:</p>
         * <ul>
         * <li>ATTACHING: The request has been accepted and the asynchronous mount is in progress.</li>
         * <li>ATTACHED: The resource is already mounted (idempotent).</li>
         * <li>Success: The synchronous verification passed and the asynchronous operation is complete.</li>
         * <li>Failed: The operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ATTACHING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VSC ID on the compute side.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-001</p>
         */
        @NameInMap("VscId")
        public String vscId;

        public static AttachKVCacheStoreResponseBodyAttachResults build(java.util.Map<String, ?> map) throws Exception {
            AttachKVCacheStoreResponseBodyAttachResults self = new AttachKVCacheStoreResponseBodyAttachResults();
            return TeaModel.build(map, self);
        }

        public AttachKVCacheStoreResponseBodyAttachResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AttachKVCacheStoreResponseBodyAttachResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AttachKVCacheStoreResponseBodyAttachResults setKvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }
        public String getKvcsId() {
            return this.kvcsId;
        }

        public AttachKVCacheStoreResponseBodyAttachResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AttachKVCacheStoreResponseBodyAttachResults setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

    }

}
