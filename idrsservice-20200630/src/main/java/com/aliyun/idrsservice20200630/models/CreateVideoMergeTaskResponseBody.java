// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateVideoMergeTaskResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Status")
    public Boolean status;

    public static CreateVideoMergeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoMergeTaskResponseBody self = new CreateVideoMergeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoMergeTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVideoMergeTaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateVideoMergeTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVideoMergeTaskResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
