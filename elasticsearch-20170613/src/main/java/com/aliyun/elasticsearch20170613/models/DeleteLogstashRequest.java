// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteLogstashRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The type of the release operation. Valid values:</p>
     * <ul>
     * <li>immediate: The cluster is immediately deleted when it is released. After the cluster is deleted, the data stored in the cluster is deleted, and the system removes the cluster from the Logstash cluster list.</li>
     * <li>protective: The cluster is released 24 hours later. During the period of 24 hours, you can still find the cluster in the Logstash cluster list, and <a href="https://help.aliyun.com/document_detail/202205.html">restore the cluster</a> or <a href="https://help.aliyun.com/document_detail/160591.html">immediately release the cluster</a>. After 24 hours elapse, the data stored in the cluster is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>protective</p>
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
