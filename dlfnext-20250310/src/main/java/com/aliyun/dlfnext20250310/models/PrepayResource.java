// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class PrepayResource extends TeaModel {
    @NameInMap("catalogId")
    public String catalogId;

    @NameInMap("catalogName")
    public String catalogName;

    @NameInMap("cu")
    public Integer cu;

    @NameInMap("expireTime")
    public Long expireTime;

    @NameInMap("gmtCreate")
    public Long gmtCreate;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("instanceStatus")
    public String instanceStatus;

    public static PrepayResource build(java.util.Map<String, ?> map) throws Exception {
        PrepayResource self = new PrepayResource();
        return TeaModel.build(map, self);
    }

    public PrepayResource setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public PrepayResource setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public PrepayResource setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public PrepayResource setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public PrepayResource setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public PrepayResource setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PrepayResource setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

}
