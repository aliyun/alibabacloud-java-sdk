// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSynonymsDictsRequest extends TeaModel {
    /**
     * <p>The file name, source, and OSS file information of the synonym dictionary.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;SYSTEM_STOPWORD.txt&quot;,&quot;sourceType&quot;:&quot;ORIGIN&quot;,&quot;type&quot;:&quot;SYNONYMS&quot;}]</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique across different requests. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateSynonymsDictsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSynonymsDictsRequest self = new UpdateSynonymsDictsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSynonymsDictsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateSynonymsDictsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
