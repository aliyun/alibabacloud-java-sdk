// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmCallBackRequest extends TeaModel {
    // 模型文件
    @NameInMap("FileUrl")
    public String fileUrl;

    // 请求编号
    @NameInMap("RequestNumber")
    public String requestNumber;

    public static AlgorithmCallBackRequest build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmCallBackRequest self = new AlgorithmCallBackRequest();
        return TeaModel.build(map, self);
    }

    public AlgorithmCallBackRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AlgorithmCallBackRequest setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
        return this;
    }
    public String getRequestNumber() {
        return this.requestNumber;
    }

}
