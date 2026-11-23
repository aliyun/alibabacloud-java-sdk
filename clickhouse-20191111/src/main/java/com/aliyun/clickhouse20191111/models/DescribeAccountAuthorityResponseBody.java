// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAccountAuthorityResponseBody extends TeaModel {
    /**
     * <p>The database account.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The list of authorized databases.</p>
     */
    @NameInMap("AllowDatabases")
    public java.util.List<String> allowDatabases;

    /**
     * <p>The list of authorized dictionaries.</p>
     */
    @NameInMap("AllowDictionaries")
    public java.util.List<String> allowDictionaries;

    /**
     * <p>Indicates whether the account has DDL permissions. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: DDL is allowed.</li>
     * <li><strong>false</strong>: DDL is not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DdlAuthority")
    public Boolean ddlAuthority;

    /**
     * <p>Indicates whether the account has DML permissions. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: Read, write, and settings permissions.</li>
     * <li><strong>readOnly,modify</strong>: Read and settings permissions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("DmlAuthority")
    public String dmlAuthority;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of all databases.</p>
     */
    @NameInMap("TotalDatabases")
    public java.util.List<String> totalDatabases;

    /**
     * <p>The list of all dictionaries.</p>
     */
    @NameInMap("TotalDictionaries")
    public java.util.List<String> totalDictionaries;

    public static DescribeAccountAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAuthorityResponseBody self = new DescribeAccountAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAuthorityResponseBody setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAccountAuthorityResponseBody setAllowDatabases(java.util.List<String> allowDatabases) {
        this.allowDatabases = allowDatabases;
        return this;
    }
    public java.util.List<String> getAllowDatabases() {
        return this.allowDatabases;
    }

    public DescribeAccountAuthorityResponseBody setAllowDictionaries(java.util.List<String> allowDictionaries) {
        this.allowDictionaries = allowDictionaries;
        return this;
    }
    public java.util.List<String> getAllowDictionaries() {
        return this.allowDictionaries;
    }

    public DescribeAccountAuthorityResponseBody setDdlAuthority(Boolean ddlAuthority) {
        this.ddlAuthority = ddlAuthority;
        return this;
    }
    public Boolean getDdlAuthority() {
        return this.ddlAuthority;
    }

    public DescribeAccountAuthorityResponseBody setDmlAuthority(String dmlAuthority) {
        this.dmlAuthority = dmlAuthority;
        return this;
    }
    public String getDmlAuthority() {
        return this.dmlAuthority;
    }

    public DescribeAccountAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountAuthorityResponseBody setTotalDatabases(java.util.List<String> totalDatabases) {
        this.totalDatabases = totalDatabases;
        return this;
    }
    public java.util.List<String> getTotalDatabases() {
        return this.totalDatabases;
    }

    public DescribeAccountAuthorityResponseBody setTotalDictionaries(java.util.List<String> totalDictionaries) {
        this.totalDictionaries = totalDictionaries;
        return this;
    }
    public java.util.List<String> getTotalDictionaries() {
        return this.totalDictionaries;
    }

}
