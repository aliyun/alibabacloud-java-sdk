// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ReinstallCollectorRequest extends TeaModel {
    /**
     * <p>The request body parameters. For more information, see the Request body section in this topic.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Indicates whether the shipper is installed. Valid values:</p>
     * <br>
     * <p>*   true: The shipper is installed.</p>
     * <p>*   false: The shipper fails to be installed.</p>
     */
    @NameInMap("body")
    public String body;

    public static ReinstallCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinstallCollectorRequest self = new ReinstallCollectorRequest();
        return TeaModel.build(map, self);
    }

    public ReinstallCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReinstallCollectorRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
