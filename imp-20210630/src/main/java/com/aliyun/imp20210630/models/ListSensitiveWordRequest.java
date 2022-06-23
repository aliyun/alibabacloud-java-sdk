// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListSensitiveWordRequest extends TeaModel {
    // 弹幕发送者的用户ID，最大长度不超过32个字节。
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSensitiveWordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveWordRequest self = new ListSensitiveWordRequest();
        return TeaModel.build(map, self);
    }

    public ListSensitiveWordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListSensitiveWordRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListSensitiveWordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
