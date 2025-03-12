// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateTextLabelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;tag\&quot;: \&quot;tag1\&quot;, \&quot;Emotion\&quot;: \&quot;1\&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>ABCDEFGH-1234-5678-90AB-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Tokens")
    public String tokens;

    public static CreateTextLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTextLabelResponseBody self = new CreateTextLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTextLabelResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateTextLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTextLabelResponseBody setTokens(String tokens) {
        this.tokens = tokens;
        return this;
    }
    public String getTokens() {
        return this.tokens;
    }

}
