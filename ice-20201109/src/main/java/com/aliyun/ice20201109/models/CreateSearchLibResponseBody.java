// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchLibResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchLibName")
    public String searchLibName;

    @NameInMap("Success")
    public String success;

    public static CreateSearchLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchLibResponseBody self = new CreateSearchLibResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSearchLibResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSearchLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSearchLibResponseBody setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public CreateSearchLibResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
