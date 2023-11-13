// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpgradeAddonReleaseResponseBody extends TeaModel {
    /**
     * <p>The status code. 200 indicates success.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Return a message.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The information returned when the request parameter is incorrect.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpgradeAddonReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAddonReleaseResponseBody self = new UpgradeAddonReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeAddonReleaseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpgradeAddonReleaseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpgradeAddonReleaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeAddonReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeAddonReleaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
