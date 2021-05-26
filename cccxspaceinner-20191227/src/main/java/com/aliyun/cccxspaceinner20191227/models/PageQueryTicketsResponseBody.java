// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class PageQueryTicketsResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("Data")
    public String data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static PageQueryTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQueryTicketsResponseBody self = new PageQueryTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQueryTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageQueryTicketsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PageQueryTicketsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQueryTicketsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
