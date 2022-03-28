// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRecordingStorageSettingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListRecordingStorageSettingsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListRecordingStorageSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingStorageSettingsResponseBody self = new ListRecordingStorageSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecordingStorageSettingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRecordingStorageSettingsResponseBody setData(java.util.List<ListRecordingStorageSettingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRecordingStorageSettingsResponseBodyData> getData() {
        return this.data;
    }

    public ListRecordingStorageSettingsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRecordingStorageSettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecordingStorageSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRecordingStorageSettingsResponseBodyData extends TeaModel {
        @NameInMap("CustomOssBucket")
        public String customOssBucket;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MaxStorageSize")
        public Integer maxStorageSize;

        @NameInMap("MaxStorageTtl")
        public Integer maxStorageTtl;

        @NameInMap("MixedRecordFormat")
        public String mixedRecordFormat;

        @NameInMap("MkvRecordEnabled")
        public Boolean mkvRecordEnabled;

        public static ListRecordingStorageSettingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingStorageSettingsResponseBodyData self = new ListRecordingStorageSettingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRecordingStorageSettingsResponseBodyData setCustomOssBucket(String customOssBucket) {
            this.customOssBucket = customOssBucket;
            return this;
        }
        public String getCustomOssBucket() {
            return this.customOssBucket;
        }

        public ListRecordingStorageSettingsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRecordingStorageSettingsResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListRecordingStorageSettingsResponseBodyData setMaxStorageSize(Integer maxStorageSize) {
            this.maxStorageSize = maxStorageSize;
            return this;
        }
        public Integer getMaxStorageSize() {
            return this.maxStorageSize;
        }

        public ListRecordingStorageSettingsResponseBodyData setMaxStorageTtl(Integer maxStorageTtl) {
            this.maxStorageTtl = maxStorageTtl;
            return this;
        }
        public Integer getMaxStorageTtl() {
            return this.maxStorageTtl;
        }

        public ListRecordingStorageSettingsResponseBodyData setMixedRecordFormat(String mixedRecordFormat) {
            this.mixedRecordFormat = mixedRecordFormat;
            return this;
        }
        public String getMixedRecordFormat() {
            return this.mixedRecordFormat;
        }

        public ListRecordingStorageSettingsResponseBodyData setMkvRecordEnabled(Boolean mkvRecordEnabled) {
            this.mkvRecordEnabled = mkvRecordEnabled;
            return this;
        }
        public Boolean getMkvRecordEnabled() {
            return this.mkvRecordEnabled;
        }

    }

}
