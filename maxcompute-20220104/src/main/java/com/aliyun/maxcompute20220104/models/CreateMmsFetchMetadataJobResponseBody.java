// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsFetchMetadataJobResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateMmsFetchMetadataJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CC4D05E8-0613-5A8E-9339-A0EBD097A69E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMmsFetchMetadataJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsFetchMetadataJobResponseBody self = new CreateMmsFetchMetadataJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMmsFetchMetadataJobResponseBody setData(CreateMmsFetchMetadataJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMmsFetchMetadataJobResponseBodyData getData() {
        return this.data;
    }

    public CreateMmsFetchMetadataJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMmsFetchMetadataJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000002</p>
         */
        @NameInMap("scanId")
        public Long scanId;

        public static CreateMmsFetchMetadataJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMmsFetchMetadataJobResponseBodyData self = new CreateMmsFetchMetadataJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMmsFetchMetadataJobResponseBodyData setScanId(Long scanId) {
            this.scanId = scanId;
            return this;
        }
        public Long getScanId() {
            return this.scanId;
        }

    }

}
