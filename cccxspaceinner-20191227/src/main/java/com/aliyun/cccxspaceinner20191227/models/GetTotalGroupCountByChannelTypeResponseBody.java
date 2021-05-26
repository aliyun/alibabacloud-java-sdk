// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTotalGroupCountByChannelTypeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public Integer data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetTotalGroupCountByChannelTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTotalGroupCountByChannelTypeResponseBody self = new GetTotalGroupCountByChannelTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTotalGroupCountByChannelTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTotalGroupCountByChannelTypeResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public GetTotalGroupCountByChannelTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTotalGroupCountByChannelTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
