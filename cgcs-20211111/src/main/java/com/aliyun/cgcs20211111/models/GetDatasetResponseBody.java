// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetDatasetResponseBody extends TeaModel {
    // 应用id
    @NameInMap("CustomParam")
    public String customParam;

    // 自定义会话id
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("DatasetSize")
    public Long datasetSize;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static GetDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResponseBody self = new GetDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetResponseBody setCustomParam(String customParam) {
        this.customParam = customParam;
        return this;
    }
    public String getCustomParam() {
        return this.customParam;
    }

    public GetDatasetResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetDatasetResponseBody setDatasetSize(Long datasetSize) {
        this.datasetSize = datasetSize;
        return this;
    }
    public Long getDatasetSize() {
        return this.datasetSize;
    }

    public GetDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
