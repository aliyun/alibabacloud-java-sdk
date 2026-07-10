// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeAccountAuthorityResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeAccountAuthorityResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC911****</p>
     */
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
        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>A list of authorized databases.</p>
         */
        @NameInMap("AllowDatabases")
        public java.util.List<String> allowDatabases;

        /**
         * <p>A list of authorized dictionaries.</p>
         */
        @NameInMap("AllowDictionaries")
        public java.util.List<String> allowDictionaries;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>Indicates whether DDL permissions are granted to the database account. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: DDL operations are allowed.</p>
         * </li>
         * <li><p><strong>false</strong>: DDL operations are prohibited.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DdlAuthority")
        public Boolean ddlAuthority;

        /**
         * <p>The DML permissions that are granted to the database account. Valid values:</p>
         * <ul>
         * <li><p>0: Read, write, and change settings queries are allowed.</p>
         * </li>
         * <li><p>1: Only read data queries are allowed.</p>
         * </li>
         * <li><p>2: Read data and change settings queries are allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DmlAuthority")
        public Integer dmlAuthority;

        /**
         * <p>A list of all databases.</p>
         */
        @NameInMap("TotalDatabases")
        public java.util.List<String> totalDatabases;

        /**
         * <p>The database.</p>
         */
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
