// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class UploadWatermarkLogRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Data")
    public String data;

    @NameInMap("Nonce")
    public String nonce;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("Time")
    public String time;

    public static UploadWatermarkLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadWatermarkLogRequest self = new UploadWatermarkLogRequest();
        return TeaModel.build(map, self);
    }

    public UploadWatermarkLogRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UploadWatermarkLogRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadWatermarkLogRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public UploadWatermarkLogRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public UploadWatermarkLogRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
