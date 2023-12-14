// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeWafScopeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeWafScopeResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeWafScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafScopeResponseBody self = new DescribeWafScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWafScopeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeWafScopeResponseBody setData(java.util.List<DescribeWafScopeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeWafScopeResponseBodyData> getData() {
        return this.data;
    }

    public DescribeWafScopeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWafScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWafScopeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeWafScopeResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account in SIEM.</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The domain names that are protected by the WAF instance.</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The ID of the WAF instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeWafScopeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWafScopeResponseBodyData self = new DescribeWafScopeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWafScopeResponseBodyData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeWafScopeResponseBodyData setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public DescribeWafScopeResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
