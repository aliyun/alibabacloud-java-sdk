// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeScopeUsersResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeScopeUsersResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>云code。  取值：</p>
         * <ul>
         * <li>qcloud：腾讯云</li>
         * <li>hcloud：华为云</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qcloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>An array consisting of the domain names that are protected by the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[123.com, 456.com]</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-tl123ast****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>多云用户ID。</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
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

        public DescribeScopeUsersResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
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

        public DescribeScopeUsersResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
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
