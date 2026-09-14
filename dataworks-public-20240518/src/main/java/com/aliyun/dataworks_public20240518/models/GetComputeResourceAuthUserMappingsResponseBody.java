// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetComputeResourceAuthUserMappingsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetComputeResourceAuthUserMappingsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetComputeResourceAuthUserMappingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResourceAuthUserMappingsResponseBody self = new GetComputeResourceAuthUserMappingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeResourceAuthUserMappingsResponseBody setData(GetComputeResourceAuthUserMappingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetComputeResourceAuthUserMappingsResponseBodyData getData() {
        return this.data;
    }

    public GetComputeResourceAuthUserMappingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetComputeResourceAuthUserMappingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetComputeResourceAuthUserMappingsResponseBodyDataAccounts extends TeaModel {
        /**
         * <p>The Alibaba Cloud UID.</p>
         * 
         * <strong>example:</strong>
         * <p>12747300953xxx62</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username in the target system, such as an LDAP account.</p>
         * 
         * <strong>example:</strong>
         * <p>jsmitxxxx</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetComputeResourceAuthUserMappingsResponseBodyDataAccounts build(java.util.Map<String, ?> map) throws Exception {
            GetComputeResourceAuthUserMappingsResponseBodyDataAccounts self = new GetComputeResourceAuthUserMappingsResponseBodyDataAccounts();
            return TeaModel.build(map, self);
        }

        public GetComputeResourceAuthUserMappingsResponseBodyDataAccounts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetComputeResourceAuthUserMappingsResponseBodyDataAccounts setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetComputeResourceAuthUserMappingsResponseBodyData extends TeaModel {
        /**
         * <p>The list of mapped account information.</p>
         */
        @NameInMap("Accounts")
        public java.util.List<GetComputeResourceAuthUserMappingsResponseBodyDataAccounts> accounts;

        /**
         * <p>The authentication type, such as LDAP.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        @NameInMap("HadoopAuthType")
        public String hadoopAuthType;

        public static GetComputeResourceAuthUserMappingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComputeResourceAuthUserMappingsResponseBodyData self = new GetComputeResourceAuthUserMappingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComputeResourceAuthUserMappingsResponseBodyData setAccounts(java.util.List<GetComputeResourceAuthUserMappingsResponseBodyDataAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<GetComputeResourceAuthUserMappingsResponseBodyDataAccounts> getAccounts() {
            return this.accounts;
        }

        public GetComputeResourceAuthUserMappingsResponseBodyData setHadoopAuthType(String hadoopAuthType) {
            this.hadoopAuthType = hadoopAuthType;
            return this;
        }
        public String getHadoopAuthType() {
            return this.hadoopAuthType;
        }

    }

}
