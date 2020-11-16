// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Order")
    public String order;

    public static DescribeLiveSnapshotConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotConfigRequest self = new DescribeLiveSnapshotConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveSnapshotConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveSnapshotConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveSnapshotConfigRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveSnapshotConfigRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveSnapshotConfigRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
