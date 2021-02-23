// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddImageSyncResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AddImageSyncResponseBodyData> data;

    public static AddImageSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageSyncResponseBody self = new AddImageSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddImageSyncResponseBody setData(java.util.List<AddImageSyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddImageSyncResponseBodyData> getData() {
        return this.data;
    }

    public static class AddImageSyncResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("dataId")
        public String dataId;

        public static AddImageSyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddImageSyncResponseBodyData self = new AddImageSyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddImageSyncResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public AddImageSyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
