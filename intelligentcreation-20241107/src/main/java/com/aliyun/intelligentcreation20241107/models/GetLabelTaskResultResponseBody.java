// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20241107.models;

import com.aliyun.tea.*;

public class GetLabelTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D5798660-1531-5D12-9C20-16FEE9D22351</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://yic-pre.oss-cn-hangzhou.aliyuncs.com/ai_tag_algo_log/1539704706413278/829593441691238400/merge_label_final_result?Expires=1732083305&OSSAccessKeyId=LTAI5tPHLyFPhh4UoRias4Zg&Signature=Am3cBxlc6hYFKtdGlw9o1R26Vsk%3D">https://yic-pre.oss-cn-hangzhou.aliyuncs.com/ai_tag_algo_log/1539704706413278/829593441691238400/merge_label_final_result?Expires=1732083305&amp;OSSAccessKeyId=LTAI5tPHLyFPhh4UoRias4Zg&amp;Signature=Am3cBxlc6hYFKtdGlw9o1R26Vsk%3D</a></p>
     */
    @NameInMap("resultDataUrl")
    public String resultDataUrl;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>20023</p>
     */
    @NameInMap("tokens")
    public Long tokens;

    public static GetLabelTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLabelTaskResultResponseBody self = new GetLabelTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLabelTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public GetLabelTaskResultResponseBody setTokens(Long tokens) {
        this.tokens = tokens;
        return this;
    }
    public Long getTokens() {
        return this.tokens;
    }

}
