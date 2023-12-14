// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeScopeUsersResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeScopeUsersResponseBodyData> data;

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
        /**
         * <p>The ID of the security information and event management (SIEM) user.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>An array consisting of the domain names that are protected by the WAF instance.</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The username.</p>
         */
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
