// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The release type. Valid values:</p>
     * <ul>
     * <li>immediate: The instance is immediately deleted. After deletion, the system permanently clears all data, and the instance no longer appears in the instance list.</li>
     * <li>protective: The instance is frozen for 24 hours before the data is permanently cleared. During this period, the instance still appears in the instance list, and you can choose to <a href="https://help.aliyun.com/document_detail/202195.html">restore the instance</a> or <a href="https://help.aliyun.com/document_detail/202195.html">immediately release it</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>protective</p>
     */
    @NameInMap("deleteType")
    public String deleteType;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteInstanceRequest setDeleteType(String deleteType) {
        this.deleteType = deleteType;
        return this;
    }
    public String getDeleteType() {
        return this.deleteType;
    }

}
