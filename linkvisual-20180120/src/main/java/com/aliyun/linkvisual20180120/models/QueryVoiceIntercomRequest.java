// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVoiceIntercomRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryVoiceIntercomRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceIntercomRequest self = new QueryVoiceIntercomRequest();
        return TeaModel.build(map, self);
    }

    public QueryVoiceIntercomRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryVoiceIntercomRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryVoiceIntercomRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryVoiceIntercomRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
