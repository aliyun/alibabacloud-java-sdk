// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetImageSyncResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetImageSyncResponseBodyData> data;

    public static GetImageSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageSyncResponseBody self = new GetImageSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageSyncResponseBody setData(java.util.List<GetImageSyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetImageSyncResponseBodyData> getData() {
        return this.data;
    }

    public static class GetImageSyncResponseBodyData extends TeaModel {
        @NameInMap("dataId")
        public String dataId;

        @NameInMap("WatermarkId")
        public String watermarkId;

        @NameInMap("MetaFileUrl")
        public String metaFileUrl;

        public static GetImageSyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageSyncResponseBodyData self = new GetImageSyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageSyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetImageSyncResponseBodyData setWatermarkId(String watermarkId) {
            this.watermarkId = watermarkId;
            return this;
        }
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public GetImageSyncResponseBodyData setMetaFileUrl(String metaFileUrl) {
            this.metaFileUrl = metaFileUrl;
            return this;
        }
        public String getMetaFileUrl() {
            return this.metaFileUrl;
        }

    }

}
