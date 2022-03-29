// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetWatermarkAppInfoRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Nonce")
    public String nonce;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("Time")
    public String time;

    public static GetWatermarkAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkAppInfoRequest self = new GetWatermarkAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetWatermarkAppInfoRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public GetWatermarkAppInfoRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public GetWatermarkAppInfoRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public GetWatermarkAppInfoRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
