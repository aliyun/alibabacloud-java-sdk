// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class DetachKVCacheStoreResponseBody extends TeaModel {
    /**
     * <p>The list of unmount results.</p>
     */
    @NameInMap("DetachResults")
    public java.util.List<DetachKVCacheStoreResponseBodyDetachResults> detachResults;

    /**
     * <p>The request ID. A request ID is returned regardless of whether the API call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>B127704C-ECB1-5B0A-AA9C-8F394A6F179F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachKVCacheStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachKVCacheStoreResponseBody self = new DetachKVCacheStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachKVCacheStoreResponseBody setDetachResults(java.util.List<DetachKVCacheStoreResponseBodyDetachResults> detachResults) {
        this.detachResults = detachResults;
        return this;
    }
    public java.util.List<DetachKVCacheStoreResponseBodyDetachResults> getDetachResults() {
        return this.detachResults;
    }

    public DetachKVCacheStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachKVCacheStoreResponseBodyDetachResults extends TeaModel {
        /**
         * <p>The error code when the operation fails. This value is null when the operation succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>KVCacheInstance.NotAttached</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message when the operation fails. This value is null when the operation succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>The KVCacheInstance is not in ATTACHED status.</p>
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
         * <li>DETACHING: The request has been accepted and the asynchronous unmount is in progress. This value is also returned for idempotent calls.</li>
         * <li>Success: The synchronous validation passed and the asynchronous operation completed.</li>
         * <li>Failed: The operation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DETACHING</p>
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

        public static DetachKVCacheStoreResponseBodyDetachResults build(java.util.Map<String, ?> map) throws Exception {
            DetachKVCacheStoreResponseBodyDetachResults self = new DetachKVCacheStoreResponseBodyDetachResults();
            return TeaModel.build(map, self);
        }

        public DetachKVCacheStoreResponseBodyDetachResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DetachKVCacheStoreResponseBodyDetachResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DetachKVCacheStoreResponseBodyDetachResults setKvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }
        public String getKvcsId() {
            return this.kvcsId;
        }

        public DetachKVCacheStoreResponseBodyDetachResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DetachKVCacheStoreResponseBodyDetachResults setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

    }

}
