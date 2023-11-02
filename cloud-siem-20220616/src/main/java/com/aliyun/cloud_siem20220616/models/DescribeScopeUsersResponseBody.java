// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeScopeUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeScopeUsersResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeScopeUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScopeUsersResponseBody self = new DescribeScopeUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScopeUsersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeScopeUsersResponseBody setData(java.util.List<DescribeScopeUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeScopeUsersResponseBodyData> getData() {
        return this.data;
    }

    public DescribeScopeUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeScopeUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScopeUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeScopeUsersResponseBodyData extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Domains")
        public java.util.List<String> domains;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("UserName")
        public String userName;

        public static DescribeScopeUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScopeUsersResponseBodyData self = new DescribeScopeUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeScopeUsersResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeScopeUsersResponseBodyData setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public DescribeScopeUsersResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeScopeUsersResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
