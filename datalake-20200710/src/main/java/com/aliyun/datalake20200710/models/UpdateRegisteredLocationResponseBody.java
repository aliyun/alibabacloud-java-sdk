// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateRegisteredLocationResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateRegisteredLocationResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateRegisteredLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegisteredLocationResponseBody self = new UpdateRegisteredLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRegisteredLocationResponseBody setData(UpdateRegisteredLocationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRegisteredLocationResponseBodyData getData() {
        return this.data;
    }

    public UpdateRegisteredLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRegisteredLocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRegisteredLocationResponseBodyData extends TeaModel {
        @NameInMap("LocationId")
        public String locationId;

        @NameInMap("StorageCollectTaskOperationResultList")
        public java.util.List<StorageCollectTaskOperationResult> storageCollectTaskOperationResultList;

        public static UpdateRegisteredLocationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRegisteredLocationResponseBodyData self = new UpdateRegisteredLocationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRegisteredLocationResponseBodyData setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public UpdateRegisteredLocationResponseBodyData setStorageCollectTaskOperationResultList(java.util.List<StorageCollectTaskOperationResult> storageCollectTaskOperationResultList) {
            this.storageCollectTaskOperationResultList = storageCollectTaskOperationResultList;
            return this;
        }
        public java.util.List<StorageCollectTaskOperationResult> getStorageCollectTaskOperationResultList() {
            return this.storageCollectTaskOperationResultList;
        }

    }

}
