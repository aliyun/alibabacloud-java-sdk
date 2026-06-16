// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListRateLimitRulesResult extends TeaModel {
    /**
     * <p>A value of <code>SUCCESS</code> indicates a successful request. If the request fails, an error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Detailed information about the rate limit rules.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListRateLimitRulesOutput data;

    /**
     * <p>The unique request ID, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRateLimitRulesResult build(java.util.Map<String, ?> map) throws Exception {
        ListRateLimitRulesResult self = new ListRateLimitRulesResult();
        return TeaModel.build(map, self);
    }

    public ListRateLimitRulesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRateLimitRulesResult setData(ListRateLimitRulesOutput data) {
        this.data = data;
        return this;
    }
    public ListRateLimitRulesOutput getData() {
        return this.data;
    }

    public ListRateLimitRulesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
