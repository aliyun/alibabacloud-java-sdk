// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ChangeResourceManagerResourceGroupResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the resource group was successfully modified.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ChangeResourceManagerResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceManagerResourceGroupResponseBody self = new ChangeResourceManagerResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeResourceManagerResourceGroupResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ChangeResourceManagerResourceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ChangeResourceManagerResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeResourceManagerResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
