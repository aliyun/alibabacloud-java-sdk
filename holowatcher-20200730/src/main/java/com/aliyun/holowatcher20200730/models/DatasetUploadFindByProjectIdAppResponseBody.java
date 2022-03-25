// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByProjectIdAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DatasetUploadInfoResponseList")
    public java.util.List<DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList> datasetUploadInfoResponseList;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DatasetUploadFindByProjectIdAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByProjectIdAppResponseBody self = new DatasetUploadFindByProjectIdAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByProjectIdAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DatasetUploadFindByProjectIdAppResponseBody setDatasetUploadInfoResponseList(java.util.List<DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList> datasetUploadInfoResponseList) {
        this.datasetUploadInfoResponseList = datasetUploadInfoResponseList;
        return this;
    }
    public java.util.List<DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList> getDatasetUploadInfoResponseList() {
        return this.datasetUploadInfoResponseList;
    }

    public DatasetUploadFindByProjectIdAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DatasetUploadFindByProjectIdAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList extends TeaModel {
        @NameInMap("DatasetId")
        public Long datasetId;

        @NameInMap("DatasetUploadId")
        public Long datasetUploadId;

        @NameInMap("DeviceKey")
        public String deviceKey;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("Status")
        public String status;

        public static DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList build(java.util.Map<String, ?> map) throws Exception {
            DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList self = new DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList();
            return TeaModel.build(map, self);
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setDatasetUploadId(Long datasetUploadId) {
            this.datasetUploadId = datasetUploadId;
            return this;
        }
        public Long getDatasetUploadId() {
            return this.datasetUploadId;
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setDeviceKey(String deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }
        public String getDeviceKey() {
            return this.deviceKey;
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public DatasetUploadFindByProjectIdAppResponseBodyDatasetUploadInfoResponseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
