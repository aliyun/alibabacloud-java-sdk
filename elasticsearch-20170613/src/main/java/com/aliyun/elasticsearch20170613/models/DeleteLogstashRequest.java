// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteLogstashRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The type of the release operation. Valid values:</p>
     * <br>
     * <p>*   immediate: The cluster is immediately deleted when it is released. After the cluster is deleted, the data stored in the cluster is deleted, and the system removes the cluster from the Logstash cluster list.</p>
     * <p>*   protective: The cluster is released 24 hours later. During the period of 24 hours, you can still find the cluster in the Logstash cluster list, and [restore the cluster](~~202205~~) or [immediately release the cluster](~~160591~~). After 24 hours elapse, the data stored in the cluster is deleted.</p>
     */
    @NameInMap("deleteType")
    public String deleteType;

    public static DeleteLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogstashRequest self = new DeleteLogstashRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteLogstashRequest setDeleteType(String deleteType) {
        this.deleteType = deleteType;
        return this;
    }
    public String getDeleteType() {
        return this.deleteType;
    }

}
