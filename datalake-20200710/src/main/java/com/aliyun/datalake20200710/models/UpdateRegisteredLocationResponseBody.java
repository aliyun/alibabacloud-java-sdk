// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateRegisteredLocationResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public UpdateRegisteredLocationResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8030C902-C25B-1839-867D-E6F70A5B9810</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Location ID</p>
         * 
         * <strong>example:</strong>
         * <p>LOC-AB8FBC17F95A4AF5</p>
         */
        @NameInMap("LocationId")
        public String locationId;

        /**
         * <p>Modify the result list of a collection task</p>
         */
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
