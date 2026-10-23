// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAliwsDictRequest extends TeaModel {
    /**
     * <p>The file name, source, and OSS file information of the AliNLP word segmentation dictionary.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;deploy_0.txt&quot;,&quot;ossObject&quot;:{&quot;bucketName&quot;:&quot;search-cloud-test-cn-****&quot;,&quot;key&quot;:&quot;user_dict/dict_0.txt&quot;},&quot;sourceType&quot;:&quot;OSS&quot;,&quot;type&quot;:&quot;ALI_WS&quot;},{&quot;name&quot;:&quot;aliws_ext_dict.txt&quot;,&quot;sourceType&quot;:&quot;ORIGIN&quot;,&quot;type&quot;:&quot;ALI_WS&quot;}]</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateAliwsDictRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliwsDictRequest self = new UpdateAliwsDictRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAliwsDictRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateAliwsDictRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
