// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeWafScopeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeWafScopeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Aliuid")
        public Long aliuid;

        @NameInMap("Domains")
        public java.util.List<String> domains;

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
