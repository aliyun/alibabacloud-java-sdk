// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServersRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerIds")
    public String serverIds;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static DescribeServersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServersRequest self = new DescribeServersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeServersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeServersRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeServersRequest setServerIds(String serverIds) {
        this.serverIds = serverIds;
        return this;
    }
    public String getServerIds() {
        return this.serverIds;
    }

    public DescribeServersRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
