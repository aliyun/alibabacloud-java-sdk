// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByProjectIdResponseBody extends TeaModel {
    @NameInMap("DatasetUploadInfoResponseList")
    public java.util.List<DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList> datasetUploadInfoResponseList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DatasetUploadFindByProjectIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByProjectIdResponseBody self = new DatasetUploadFindByProjectIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByProjectIdResponseBody setDatasetUploadInfoResponseList(java.util.List<DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList> datasetUploadInfoResponseList) {
        this.datasetUploadInfoResponseList = datasetUploadInfoResponseList;
        return this;
    }
    public java.util.List<DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList> getDatasetUploadInfoResponseList() {
        return this.datasetUploadInfoResponseList;
    }

    public DatasetUploadFindByProjectIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList extends TeaModel {
        @NameInMap("DatasetId")
        public Long datasetId;

        @NameInMap("DatasetOssKey")
        public String datasetOssKey;

        @NameInMap("DatasetUploadId")
        public Long datasetUploadId;

        @NameInMap("DeviceKey")
        public String deviceKey;

        @NameInMap("ExtInfo")
        public String extInfo;

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

        public static DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList build(java.util.Map<String, ?> map) throws Exception {
            DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList self = new DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList();
            return TeaModel.build(map, self);
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setDatasetOssKey(String datasetOssKey) {
            this.datasetOssKey = datasetOssKey;
            return this;
        }
        public String getDatasetOssKey() {
            return this.datasetOssKey;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setDatasetUploadId(Long datasetUploadId) {
            this.datasetUploadId = datasetUploadId;
            return this;
        }
        public Long getDatasetUploadId() {
            return this.datasetUploadId;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setDeviceKey(String deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }
        public String getDeviceKey() {
            return this.deviceKey;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public DatasetUploadFindByProjectIdResponseBodyDatasetUploadInfoResponseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
