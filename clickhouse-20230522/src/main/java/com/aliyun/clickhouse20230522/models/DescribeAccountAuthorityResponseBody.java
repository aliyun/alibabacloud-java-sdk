// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeAccountAuthorityResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAccountAuthorityResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAuthorityResponseBody self = new DescribeAccountAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAuthorityResponseBody setData(DescribeAccountAuthorityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAccountAuthorityResponseBodyData getData() {
        return this.data;
    }

    public DescribeAccountAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountAuthorityResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("AllowDatabases")
        public java.util.List<String> allowDatabases;

        @NameInMap("AllowDictionaries")
        public java.util.List<String> allowDictionaries;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DdlAuthority")
        public Boolean ddlAuthority;

        @NameInMap("DmlAuthority")
        public Integer dmlAuthority;

        @NameInMap("TotalDatabases")
        public java.util.List<String> totalDatabases;

        @NameInMap("TotalDictionaries")
        public java.util.List<String> totalDictionaries;

        public static DescribeAccountAuthorityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAuthorityResponseBodyData self = new DescribeAccountAuthorityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAuthorityResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeAccountAuthorityResponseBodyData setAllowDatabases(java.util.List<String> allowDatabases) {
            this.allowDatabases = allowDatabases;
            return this;
        }
        public java.util.List<String> getAllowDatabases() {
            return this.allowDatabases;
        }

        public DescribeAccountAuthorityResponseBodyData setAllowDictionaries(java.util.List<String> allowDictionaries) {
            this.allowDictionaries = allowDictionaries;
            return this;
        }
        public java.util.List<String> getAllowDictionaries() {
            return this.allowDictionaries;
        }

        public DescribeAccountAuthorityResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeAccountAuthorityResponseBodyData setDdlAuthority(Boolean ddlAuthority) {
            this.ddlAuthority = ddlAuthority;
            return this;
        }
        public Boolean getDdlAuthority() {
            return this.ddlAuthority;
        }

        public DescribeAccountAuthorityResponseBodyData setDmlAuthority(Integer dmlAuthority) {
            this.dmlAuthority = dmlAuthority;
            return this;
        }
        public Integer getDmlAuthority() {
            return this.dmlAuthority;
        }

        public DescribeAccountAuthorityResponseBodyData setTotalDatabases(java.util.List<String> totalDatabases) {
            this.totalDatabases = totalDatabases;
            return this;
        }
        public java.util.List<String> getTotalDatabases() {
            return this.totalDatabases;
        }

        public DescribeAccountAuthorityResponseBodyData setTotalDictionaries(java.util.List<String> totalDictionaries) {
            this.totalDictionaries = totalDictionaries;
            return this;
        }
        public java.util.List<String> getTotalDictionaries() {
            return this.totalDictionaries;
        }

    }

}
