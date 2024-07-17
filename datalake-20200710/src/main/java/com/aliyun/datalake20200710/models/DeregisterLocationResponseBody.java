// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeregisterLocationResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeregisterLocationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>E47920CD-BAE6-1305-88DF-FBDD3D300845</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeregisterLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeregisterLocationResponseBody self = new DeregisterLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeregisterLocationResponseBody setData(DeregisterLocationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeregisterLocationResponseBodyData getData() {
        return this.data;
    }

    public DeregisterLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeregisterLocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeregisterLocationResponseBodyData extends TeaModel {
        /**
         * <p>Location ID</p>
         * 
         * <strong>example:</strong>
         * <p>LOC-AB8FBC17F95A4AF5</p>
         */
        @NameInMap("LocationId")
        public String locationId;

        @NameInMap("StorageCollectTaskOperationResultList")
        public java.util.List<StorageCollectTaskOperationResult> storageCollectTaskOperationResultList;

        public static DeregisterLocationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeregisterLocationResponseBodyData self = new DeregisterLocationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeregisterLocationResponseBodyData setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public DeregisterLocationResponseBodyData setStorageCollectTaskOperationResultList(java.util.List<StorageCollectTaskOperationResult> storageCollectTaskOperationResultList) {
            this.storageCollectTaskOperationResultList = storageCollectTaskOperationResultList;
            return this;
        }
        public java.util.List<StorageCollectTaskOperationResult> getStorageCollectTaskOperationResultList() {
            return this.storageCollectTaskOperationResultList;
        }

    }

}
