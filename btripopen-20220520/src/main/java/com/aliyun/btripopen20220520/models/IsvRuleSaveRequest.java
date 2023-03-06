// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IsvRuleSaveRequest extends TeaModel {
    @NameInMap("book_type")
    public String bookType;

    @NameInMap("status")
    public Integer status;

    @NameInMap("user_id")
    public String userId;

    public static IsvRuleSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        IsvRuleSaveRequest self = new IsvRuleSaveRequest();
        return TeaModel.build(map, self);
    }

    public IsvRuleSaveRequest setBookType(String bookType) {
        this.bookType = bookType;
        return this;
    }
    public String getBookType() {
        return this.bookType;
    }

    public IsvRuleSaveRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public IsvRuleSaveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
