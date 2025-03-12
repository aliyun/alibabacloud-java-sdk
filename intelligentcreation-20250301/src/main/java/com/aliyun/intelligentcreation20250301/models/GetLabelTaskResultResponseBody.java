// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class GetLabelTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABCDEFGH-1234-5678-90AB-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://bucket.oss.cn-zhangjiakou.aliyuncs.com/key">http://bucket.oss.cn-zhangjiakou.aliyuncs.com/key</a></p>
     */
    @NameInMap("ResultDataUrl")
    public String resultDataUrl;

    /**
     * <strong>example:</strong>
     * <p>IN_PROGRESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Tokens")
    public String tokens;

    public static GetLabelTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLabelTaskResultResponseBody self = new GetLabelTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLabelTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLabelTaskResultResponseBody setResultDataUrl(String resultDataUrl) {
        this.resultDataUrl = resultDataUrl;
        return this;
    }
    public String getResultDataUrl() {
        return this.resultDataUrl;
    }

    public GetLabelTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLabelTaskResultResponseBody setTokens(String tokens) {
        this.tokens = tokens;
        return this;
    }
    public String getTokens() {
        return this.tokens;
    }

}
