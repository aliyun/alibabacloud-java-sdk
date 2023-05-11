// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRuleBlackListResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **EnableMetricRuleBlackList**.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The number of blacklist policies that are enabled or disabled.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnableMetricRuleBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRuleBlackListResponseBody self = new EnableMetricRuleBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableMetricRuleBlackListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableMetricRuleBlackListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public EnableMetricRuleBlackListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableMetricRuleBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableMetricRuleBlackListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
