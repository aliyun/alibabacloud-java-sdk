// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAccountAuthorityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("DmlAuthority")
    @Validation(required = true)
    public String dmlAuthority;

    @NameInMap("DdlAuthority")
    @Validation(required = true)
    public Boolean ddlAuthority;

    @NameInMap("AllowDatabases")
    @Validation(required = true)
    public java.util.List<String> allowDatabases;

    @NameInMap("TotalDatabases")
    @Validation(required = true)
    public java.util.List<String> totalDatabases;

    @NameInMap("AllowDictionaries")
    @Validation(required = true)
    public java.util.List<String> allowDictionaries;

    @NameInMap("TotalDictionaries")
    @Validation(required = true)
    public java.util.List<String> totalDictionaries;

    public static DescribeAccountAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAuthorityResponse self = new DescribeAccountAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAuthorityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountAuthorityResponse setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAccountAuthorityResponse setDmlAuthority(String dmlAuthority) {
        this.dmlAuthority = dmlAuthority;
        return this;
    }
    public String getDmlAuthority() {
        return this.dmlAuthority;
    }

    public DescribeAccountAuthorityResponse setDdlAuthority(Boolean ddlAuthority) {
        this.ddlAuthority = ddlAuthority;
        return this;
    }
    public Boolean getDdlAuthority() {
        return this.ddlAuthority;
    }

    public DescribeAccountAuthorityResponse setAllowDatabases(java.util.List<String> allowDatabases) {
        this.allowDatabases = allowDatabases;
        return this;
    }
    public java.util.List<String> getAllowDatabases() {
        return this.allowDatabases;
    }

    public DescribeAccountAuthorityResponse setTotalDatabases(java.util.List<String> totalDatabases) {
        this.totalDatabases = totalDatabases;
        return this;
    }
    public java.util.List<String> getTotalDatabases() {
        return this.totalDatabases;
    }

    public DescribeAccountAuthorityResponse setAllowDictionaries(java.util.List<String> allowDictionaries) {
        this.allowDictionaries = allowDictionaries;
        return this;
    }
    public java.util.List<String> getAllowDictionaries() {
        return this.allowDictionaries;
    }

    public DescribeAccountAuthorityResponse setTotalDictionaries(java.util.List<String> totalDictionaries) {
        this.totalDictionaries = totalDictionaries;
        return this;
    }
    public java.util.List<String> getTotalDictionaries() {
        return this.totalDictionaries;
    }

}
