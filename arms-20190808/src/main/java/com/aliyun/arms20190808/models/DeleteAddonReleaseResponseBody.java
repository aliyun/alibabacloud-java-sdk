// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAddonReleaseResponseBody extends TeaModel {
    /**
     * <p>Status code: 200 indicates success.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Return a message.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the alert rule was deleted. Valid values:</p>
     * <br>
     * <p>*   `true`: The alert rule was deleted.</p>
     * <p>*   `false`: The alert rule failed to be deleted.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAddonReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAddonReleaseResponseBody self = new DeleteAddonReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAddonReleaseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteAddonReleaseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteAddonReleaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAddonReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAddonReleaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
