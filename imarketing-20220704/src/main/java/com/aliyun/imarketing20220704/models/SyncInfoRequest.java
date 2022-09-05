// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class SyncInfoRequest extends TeaModel {
    @NameInMap("AccountNo")
    public String accountNo;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ChainValue")
    public String chainValue;

    @NameInMap("ComponentIdList")
    public String componentIdList;

    @NameInMap("CreateUser")
    public String createUser;

    @NameInMap("Id")
    public Integer id;

    @NameInMap("MainId")
    public Long mainId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextChainValue")
    public String nextChainValue;

    @NameInMap("OssFileUrl")
    public String ossFileUrl;

    @NameInMap("PageId")
    public String pageId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("UpdateUser")
    public String updateUser;

    @NameInMap("Url")
    public String url;

    @NameInMap("UrlType")
    public Integer urlType;

    public static SyncInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInfoRequest self = new SyncInfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncInfoRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public SyncInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SyncInfoRequest setChainValue(String chainValue) {
        this.chainValue = chainValue;
        return this;
    }
    public String getChainValue() {
        return this.chainValue;
    }

    public SyncInfoRequest setComponentIdList(String componentIdList) {
        this.componentIdList = componentIdList;
        return this;
    }
    public String getComponentIdList() {
        return this.componentIdList;
    }

    public SyncInfoRequest setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }
    public String getCreateUser() {
        return this.createUser;
    }

    public SyncInfoRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public SyncInfoRequest setMainId(Long mainId) {
        this.mainId = mainId;
        return this;
    }
    public Long getMainId() {
        return this.mainId;
    }

    public SyncInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SyncInfoRequest setNextChainValue(String nextChainValue) {
        this.nextChainValue = nextChainValue;
        return this;
    }
    public String getNextChainValue() {
        return this.nextChainValue;
    }

    public SyncInfoRequest setOssFileUrl(String ossFileUrl) {
        this.ossFileUrl = ossFileUrl;
        return this;
    }
    public String getOssFileUrl() {
        return this.ossFileUrl;
    }

    public SyncInfoRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public SyncInfoRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SyncInfoRequest setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

    public SyncInfoRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SyncInfoRequest setUrlType(Integer urlType) {
        this.urlType = urlType;
        return this;
    }
    public Integer getUrlType() {
        return this.urlType;
    }

}
