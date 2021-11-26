// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAccountAuthorityResponseBody extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AllowDatabases")
    public java.util.List<String> allowDatabases;

    @NameInMap("AllowDictionaries")
    public java.util.List<String> allowDictionaries;

    @NameInMap("DdlAuthority")
    public Boolean ddlAuthority;

    @NameInMap("DmlAuthority")
    public String dmlAuthority;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalDatabases")
    public java.util.List<String> totalDatabases;

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
